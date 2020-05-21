package com.hyp.service.impl;

import com.hyp.dataobject.blog.PictureWall;
import com.hyp.mapper.blog.PictureWallMapper;
import com.hyp.service.PictureWallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 16:45
 * @Description: TODO
 */
@Service
public class PictureWallServiceImpl implements PictureWallService {

    @Autowired
    private PictureWallMapper pictureWallMapper;

    @Override
    public List<PictureWall> getPictureWallByPassWord(String passWord) {
        Example example = new Example(PictureWall.class);
        Example.Criteria criteria = example.createCriteria();
        example.orderBy("createTime").desc();
        criteria.andEqualTo("status", 1);
        criteria.andEqualTo("passWord", passWord);

        List<PictureWall> pictureWalls = pictureWallMapper.selectByExample(example);
        if (pictureWalls != null && pictureWalls.size() > 0) {
            return pictureWalls;
        } else {
            return null;
        }
    }
}
