package com.hyp.service;

import com.hyp.dataobject.blog.PictureWall;

import java.util.List;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 16:44
 * @Description: TODO
 */
public interface PictureWallService {

    /**
     * 通过passWord查询图片信息 按照日期倒叙
     *
     * @param passWord
     * @return
     */
    List<PictureWall> getPictureWallByPassWord(String passWord);
}
