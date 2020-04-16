package com.hyp.service;

import com.hyp.dataobject.ResourceUrl;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 15:24
 * @Description: TODO
 */
public interface VideoImgService {

    /**
     * 按照时间排序获取所有status为1的内容
     *
     * @return
     */
    List<ResourceUrl> getVideoImgs();


    /**
     * 通过视频ID查询视频信息
     *
     * @param id
     * @return
     */
    ResourceUrl getVideoImgById(Integer id);


    /**
     * 添加观看人数
     *
     * @param id
     * @return
     */
    int addViewNum(Integer id);


}
