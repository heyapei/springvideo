package com.hyp.dataobject;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/14 15:12
 * @Description: TODO
 */

@Data
@Table(name = "resource_url")
@Mapper
public class ResourceUrl {

    @Id
    private Integer id;
    private String createUser;
    private String url;
    private Integer status;
    private Date createTime;
    private String passWord;
    private String explainWord;
    private String title;
    private String pic;
    @Column(name = "view_num")
    private Integer viewNum;
}
