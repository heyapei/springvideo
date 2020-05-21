package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "weixin_vote_base")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinVoteBase {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 活动名称
     */
    @Column(name = "active_name")
    private String activeName;

    /**
     * 活动描述
     */
    @Column(name = "active_desc")
    private String activeDesc;

    /**
     * 活动奖励
     */
    @Column(name = "active_reward")
    private String activeReward;

    /**
     * 活动开始时间
     */
    @Column(name = "active_start_time")
    private Date activeStartTime;

    /**
     * 活动结束时间
     */
    @Column(name = "active_end_time")
    private Date activeEndTime;

    /**
     * 是否公开到首页 0默认不公开 1公开
     */
    @Column(name = "active_public")
    private Integer activePublic;

    /**
     * 活动展示优先级 数值越高 优先级越高 默认为0 默认展示
     */
    @Column(name = "active_show_order")
    private Integer activeShowOrder;

    /**
     * 0 待审核 1上线  2未开始 3已结束
     */
    private Integer status;

    /**
     * 活动创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后的更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 活动创建人Id
     */
    @Column(name = "create_sys_user_id")
    private Integer createSysUserId;

    /**
     * 封面图片
     */
    @Column(name = "active_img")
    private String activeImg;

    /**
     * 活动描述图片
     */
    @Column(name = "active_desc_img")
    private String activeDescImg;

    /**
     * 活动奖励图片
     */
    @Column(name = "active_reward_img")
    private String activeRewardImg;

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
     * 获取活动名称
     *
     * @return active_name - 活动名称
     */
    public String getActiveName() {
        return activeName;
    }

    /**
     * 设置活动名称
     *
     * @param activeName 活动名称
     */
    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    /**
     * 获取活动描述
     *
     * @return active_desc - 活动描述
     */
    public String getActiveDesc() {
        return activeDesc;
    }

    /**
     * 设置活动描述
     *
     * @param activeDesc 活动描述
     */
    public void setActiveDesc(String activeDesc) {
        this.activeDesc = activeDesc;
    }

    /**
     * 获取活动奖励
     *
     * @return active_reward - 活动奖励
     */
    public String getActiveReward() {
        return activeReward;
    }

    /**
     * 设置活动奖励
     *
     * @param activeReward 活动奖励
     */
    public void setActiveReward(String activeReward) {
        this.activeReward = activeReward;
    }

    /**
     * 获取活动开始时间
     *
     * @return active_start_time - 活动开始时间
     */
    public Date getActiveStartTime() {
        return activeStartTime;
    }

    /**
     * 设置活动开始时间
     *
     * @param activeStartTime 活动开始时间
     */
    public void setActiveStartTime(Date activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    /**
     * 获取活动结束时间
     *
     * @return active_end_time - 活动结束时间
     */
    public Date getActiveEndTime() {
        return activeEndTime;
    }

    /**
     * 设置活动结束时间
     *
     * @param activeEndTime 活动结束时间
     */
    public void setActiveEndTime(Date activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    /**
     * 获取是否公开到首页 0默认不公开 1公开
     *
     * @return active_public - 是否公开到首页 0默认不公开 1公开
     */
    public Integer getActivePublic() {
        return activePublic;
    }

    /**
     * 设置是否公开到首页 0默认不公开 1公开
     *
     * @param activePublic 是否公开到首页 0默认不公开 1公开
     */
    public void setActivePublic(Integer activePublic) {
        this.activePublic = activePublic;
    }

    /**
     * 获取活动展示优先级 数值越高 优先级越高 默认为0 默认展示
     *
     * @return active_show_order - 活动展示优先级 数值越高 优先级越高 默认为0 默认展示
     */
    public Integer getActiveShowOrder() {
        return activeShowOrder;
    }

    /**
     * 设置活动展示优先级 数值越高 优先级越高 默认为0 默认展示
     *
     * @param activeShowOrder 活动展示优先级 数值越高 优先级越高 默认为0 默认展示
     */
    public void setActiveShowOrder(Integer activeShowOrder) {
        this.activeShowOrder = activeShowOrder;
    }

    /**
     * 获取0 待审核 1上线  2未开始 3已结束
     *
     * @return status - 0 待审核 1上线  2未开始 3已结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 待审核 1上线  2未开始 3已结束
     *
     * @param status 0 待审核 1上线  2未开始 3已结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取活动创建时间
     *
     * @return create_time - 活动创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置活动创建时间
     *
     * @param createTime 活动创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后的更新时间
     *
     * @return update_time - 最后的更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后的更新时间
     *
     * @param updateTime 最后的更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取活动创建人Id
     *
     * @return create_sys_user_id - 活动创建人Id
     */
    public Integer getCreateSysUserId() {
        return createSysUserId;
    }

    /**
     * 设置活动创建人Id
     *
     * @param createSysUserId 活动创建人Id
     */
    public void setCreateSysUserId(Integer createSysUserId) {
        this.createSysUserId = createSysUserId;
    }

    /**
     * 获取封面图片
     *
     * @return active_img - 封面图片
     */
    public String getActiveImg() {
        return activeImg;
    }

    /**
     * 设置封面图片
     *
     * @param activeImg 封面图片
     */
    public void setActiveImg(String activeImg) {
        this.activeImg = activeImg;
    }

    /**
     * 获取活动描述图片
     *
     * @return active_desc_img - 活动描述图片
     */
    public String getActiveDescImg() {
        return activeDescImg;
    }

    /**
     * 设置活动描述图片
     *
     * @param activeDescImg 活动描述图片
     */
    public void setActiveDescImg(String activeDescImg) {
        this.activeDescImg = activeDescImg;
    }

    /**
     * 获取活动奖励图片
     *
     * @return active_reward_img - 活动奖励图片
     */
    public String getActiveRewardImg() {
        return activeRewardImg;
    }

    /**
     * 设置活动奖励图片
     *
     * @param activeRewardImg 活动奖励图片
     */
    public void setActiveRewardImg(String activeRewardImg) {
        this.activeRewardImg = activeRewardImg;
    }
}