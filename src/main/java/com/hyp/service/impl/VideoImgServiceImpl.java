package com.hyp.service.impl;

import com.hyp.dataobject.blog.ResourceUrl;
import com.hyp.mapper.blog.VideoImgMapper;
import com.hyp.service.VideoImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 15:26
 * @Description: TODO
 */
@Service
public class VideoImgServiceImpl implements VideoImgService {


    @Autowired
    private VideoImgMapper videoImgMapper;


    @Override
    public List<ResourceUrl> getVideoImgs() {
        Example example = new Example(ResourceUrl.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createTime").desc();
        criteria.andEqualTo("status", 1);

        List<ResourceUrl> videoImgDOList = videoImgMapper.selectByExample(example);
        if (videoImgDOList != null && videoImgDOList.size() > 0) {
            return videoImgDOList;
        } else {
            return null;
        }
    }

    @Override
    public ResourceUrl getVideoImgById(Integer id) {
        ResourceUrl videoImgDO = videoImgMapper.selectByPrimaryKey(id);
        if (videoImgDO != null) {
            return videoImgDO;
        } else {
            return null;
        }
    }

    @Override
    public int addViewNum(Integer id) {

        ResourceUrl videoImgDO = videoImgMapper.selectByPrimaryKey(id);
        if (videoImgDO == null) {
            return -1;
        }
        Integer viewNum = videoImgDO.getViewNum();
        videoImgDO.setViewNum(viewNum + 1);
        int i = videoImgMapper.updateByPrimaryKey(videoImgDO);
        return i;
    }
}
