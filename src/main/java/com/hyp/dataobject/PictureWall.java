package com.hyp.dataobject;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "picture_wall")
@Mapper
public class PictureWall {
    @Id
    private Integer id;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private Date createTime;

    private String title;

    @Column(name = "explain_word")
    private String explainWord;

    private Integer status;

}