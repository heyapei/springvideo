package com.hyp.dataobject.blog;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Table(name = "journal")
@Mapper
public class Journal {
    @Id
    private Integer id;

    @Column(name = "create_user")
    private String createUser;

    private String journal;

    @Column(name = "create_time")
    private Date createTime;

    private String title;

    @Column(name = "view_num")
    private Integer viewNum;

    @Column(name = "pass_word")
    private String passWord;

    private Integer status;

    @Column(name = "explain_word")
    private String explainWord;

}