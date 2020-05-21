package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "weixin_vote_work")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinVoteWork {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 作品人姓名
     */
    @Column(name = "vote_work_user_name")
    private String voteWorkUserName;

    /**
     * 作品人用户Id
     */
    @Column(name = "vote_work_user_id")
    private Integer voteWorkUserId;

    /**
     * 作品人手机号
     */
    @Column(name = "vote_work_user_phone")
    private String voteWorkUserPhone;

    /**
     * 作品人微信号
     */
    @Column(name = "vote_work_user_weixin")
    private String voteWorkUserWeixin;

    /**
     * 作品描述
     */
    @Column(name = "vote_work_desc")
    private String voteWorkDesc;

    /**
     * 作品名称
     */
    @Column(name = "vote_work_name")
    private String voteWorkName;

    /**
     * 作品视频文件Id
     */
    @Column(name = "vote_work_video_url")
    private String voteWorkVideoUrl;

    /**
     * 作品创建时间
     */
    @Column(name = "vote_work_create_time")
    private Date voteWorkCreateTime;

    /**
     * 作品所属活动的ID
     */
    @Column(name = "active_vote_base_id")
    private Integer activeVoteBaseId;

    /**
     * 作品的状态 0默认等待审核 1上线 2下线
     */
    @Column(name = "vote_work_status")
    private Integer voteWorkStatus;

    /**
     * 作品的展示排序
     */
    @Column(name = "vote_work_show_order")
    private Integer voteWorkShowOrder;

    /**
     * 作品被投票次数
     */
    @Column(name = "vote_work_count_num")
    private Integer voteWorkCountNum;

    /**
     * 作品图片
     */
    @Column(name = "vote_work_img")
    private String voteWorkImg;

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
     * 获取作品人姓名
     *
     * @return vote_work_user_name - 作品人姓名
     */
    public String getVoteWorkUserName() {
        return voteWorkUserName;
    }

    /**
     * 设置作品人姓名
     *
     * @param voteWorkUserName 作品人姓名
     */
    public void setVoteWorkUserName(String voteWorkUserName) {
        this.voteWorkUserName = voteWorkUserName;
    }

    /**
     * 获取作品人用户Id
     *
     * @return vote_work_user_id - 作品人用户Id
     */
    public Integer getVoteWorkUserId() {
        return voteWorkUserId;
    }

    /**
     * 设置作品人用户Id
     *
     * @param voteWorkUserId 作品人用户Id
     */
    public void setVoteWorkUserId(Integer voteWorkUserId) {
        this.voteWorkUserId = voteWorkUserId;
    }

    /**
     * 获取作品人手机号
     *
     * @return vote_work_user_phone - 作品人手机号
     */
    public String getVoteWorkUserPhone() {
        return voteWorkUserPhone;
    }

    /**
     * 设置作品人手机号
     *
     * @param voteWorkUserPhone 作品人手机号
     */
    public void setVoteWorkUserPhone(String voteWorkUserPhone) {
        this.voteWorkUserPhone = voteWorkUserPhone;
    }

    /**
     * 获取作品人微信号
     *
     * @return vote_work_user_weixin - 作品人微信号
     */
    public String getVoteWorkUserWeixin() {
        return voteWorkUserWeixin;
    }

    /**
     * 设置作品人微信号
     *
     * @param voteWorkUserWeixin 作品人微信号
     */
    public void setVoteWorkUserWeixin(String voteWorkUserWeixin) {
        this.voteWorkUserWeixin = voteWorkUserWeixin;
    }

    /**
     * 获取作品描述
     *
     * @return vote_work_desc - 作品描述
     */
    public String getVoteWorkDesc() {
        return voteWorkDesc;
    }

    /**
     * 设置作品描述
     *
     * @param voteWorkDesc 作品描述
     */
    public void setVoteWorkDesc(String voteWorkDesc) {
        this.voteWorkDesc = voteWorkDesc;
    }

    /**
     * 获取作品名称
     *
     * @return vote_work_name - 作品名称
     */
    public String getVoteWorkName() {
        return voteWorkName;
    }

    /**
     * 设置作品名称
     *
     * @param voteWorkName 作品名称
     */
    public void setVoteWorkName(String voteWorkName) {
        this.voteWorkName = voteWorkName;
    }

    /**
     * 获取作品视频文件Id
     *
     * @return vote_work_video_url - 作品视频文件Id
     */
    public String getVoteWorkVideoUrl() {
        return voteWorkVideoUrl;
    }

    /**
     * 设置作品视频文件Id
     *
     * @param voteWorkVideoUrl 作品视频文件Id
     */
    public void setVoteWorkVideoUrl(String voteWorkVideoUrl) {
        this.voteWorkVideoUrl = voteWorkVideoUrl;
    }

    /**
     * 获取作品创建时间
     *
     * @return vote_work_create_time - 作品创建时间
     */
    public Date getVoteWorkCreateTime() {
        return voteWorkCreateTime;
    }

    /**
     * 设置作品创建时间
     *
     * @param voteWorkCreateTime 作品创建时间
     */
    public void setVoteWorkCreateTime(Date voteWorkCreateTime) {
        this.voteWorkCreateTime = voteWorkCreateTime;
    }

    /**
     * 获取作品所属活动的ID
     *
     * @return active_vote_base_id - 作品所属活动的ID
     */
    public Integer getActiveVoteBaseId() {
        return activeVoteBaseId;
    }

    /**
     * 设置作品所属活动的ID
     *
     * @param activeVoteBaseId 作品所属活动的ID
     */
    public void setActiveVoteBaseId(Integer activeVoteBaseId) {
        this.activeVoteBaseId = activeVoteBaseId;
    }

    /**
     * 获取作品的状态 0默认等待审核 1上线 2下线
     *
     * @return vote_work_status - 作品的状态 0默认等待审核 1上线 2下线
     */
    public Integer getVoteWorkStatus() {
        return voteWorkStatus;
    }

    /**
     * 设置作品的状态 0默认等待审核 1上线 2下线
     *
     * @param voteWorkStatus 作品的状态 0默认等待审核 1上线 2下线
     */
    public void setVoteWorkStatus(Integer voteWorkStatus) {
        this.voteWorkStatus = voteWorkStatus;
    }

    /**
     * 获取作品的展示排序
     *
     * @return vote_work_show_order - 作品的展示排序
     */
    public Integer getVoteWorkShowOrder() {
        return voteWorkShowOrder;
    }

    /**
     * 设置作品的展示排序
     *
     * @param voteWorkShowOrder 作品的展示排序
     */
    public void setVoteWorkShowOrder(Integer voteWorkShowOrder) {
        this.voteWorkShowOrder = voteWorkShowOrder;
    }

    /**
     * 获取作品被投票次数
     *
     * @return vote_work_count_num - 作品被投票次数
     */
    public Integer getVoteWorkCountNum() {
        return voteWorkCountNum;
    }

    /**
     * 设置作品被投票次数
     *
     * @param voteWorkCountNum 作品被投票次数
     */
    public void setVoteWorkCountNum(Integer voteWorkCountNum) {
        this.voteWorkCountNum = voteWorkCountNum;
    }

    /**
     * 获取作品图片
     *
     * @return vote_work_img - 作品图片
     */
    public String getVoteWorkImg() {
        return voteWorkImg;
    }

    /**
     * 设置作品图片
     *
     * @param voteWorkImg 作品图片
     */
    public void setVoteWorkImg(String voteWorkImg) {
        this.voteWorkImg = voteWorkImg;
    }
}