package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "weixin_vote_ticket")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinVoteTicket {
    @Id
    private Integer id;

    /**
     * 投票是在某个活动
     */
    @Column(name = "active_vote_base_id")
    private Integer activeVoteBaseId;

    /**
     * 投票是在某个作品
     */
    @Column(name = "active_vote_work_id")
    private Integer activeVoteWorkId;

    /**
     * 创建人的IP地址（创建人即投票用户）
     */
    @Column(name = "create_user_ip")
    private String createUserIp;

    /**
     * 创建人ID
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 投票时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 默认为0起作用 1不起作用
     */
    private Integer status;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取投票是在某个活动
     *
     * @return active_vote_base_id - 投票是在某个活动
     */
    public Integer getActiveVoteBaseId() {
        return activeVoteBaseId;
    }

    /**
     * 设置投票是在某个活动
     *
     * @param activeVoteBaseId 投票是在某个活动
     */
    public void setActiveVoteBaseId(Integer activeVoteBaseId) {
        this.activeVoteBaseId = activeVoteBaseId;
    }

    /**
     * 获取投票是在某个作品
     *
     * @return active_vote_work_id - 投票是在某个作品
     */
    public Integer getActiveVoteWorkId() {
        return activeVoteWorkId;
    }

    /**
     * 设置投票是在某个作品
     *
     * @param activeVoteWorkId 投票是在某个作品
     */
    public void setActiveVoteWorkId(Integer activeVoteWorkId) {
        this.activeVoteWorkId = activeVoteWorkId;
    }

    /**
     * 获取创建人的IP地址（创建人即投票用户）
     *
     * @return create_user_ip - 创建人的IP地址（创建人即投票用户）
     */
    public String getCreateUserIp() {
        return createUserIp;
    }

    /**
     * 设置创建人的IP地址（创建人即投票用户）
     *
     * @param createUserIp 创建人的IP地址（创建人即投票用户）
     */
    public void setCreateUserIp(String createUserIp) {
        this.createUserIp = createUserIp;
    }

    /**
     * 获取创建人ID
     *
     * @return create_user_id - 创建人ID
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人ID
     *
     * @param createUserId 创建人ID
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取投票时间
     *
     * @return create_time - 投票时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置投票时间
     *
     * @param createTime 投票时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取默认为0起作用 1不起作用
     *
     * @return status - 默认为0起作用 1不起作用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置默认为0起作用 1不起作用
     *
     * @param status 默认为0起作用 1不起作用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}