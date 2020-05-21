package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "weixin_vote_sys_user")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinVoteSysUser {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 人员类型 0 普通管理员 1 系统管理员 可扩展
     */
    private Integer type;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 用户的微信openId
     */
    @Column(name = "open_id")
    private byte[] openId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取人员类型 0 普通管理员 1 系统管理员 可扩展
     *
     * @return type - 人员类型 0 普通管理员 1 系统管理员 可扩展
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置人员类型 0 普通管理员 1 系统管理员 可扩展
     *
     * @param type 人员类型 0 普通管理员 1 系统管理员 可扩展
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取用户的微信openId
     *
     * @return open_id - 用户的微信openId
     */
    public byte[] getOpenId() {
        return openId;
    }

    /**
     * 设置用户的微信openId
     *
     * @param openId 用户的微信openId
     */
    public void setOpenId(byte[] openId) {
        this.openId = openId;
    }
}