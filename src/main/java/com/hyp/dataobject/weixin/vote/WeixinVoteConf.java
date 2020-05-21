package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "weixin_vote_conf")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinVoteConf {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 对应的投票基础表的ID
     */
    @Column(name = "active_vote_base_id")
    private Integer activeVoteBaseId;

    /**
     * 对应的音乐ID 音乐配置表中配置
     */
    @Column(name = "active_conf_music_id")
    private Integer activeConfMusicId;

    /**
     * 是否可以重复投票 0默认不开启 1开启
     */
    @Column(name = "active_conf_repeat_vote")
    private Integer activeConfRepeatVote;

    /**
     * 投票类型限制例如1天1票 投票类型配置表中设置
     */
    @Column(name = "active_conf_vote_type")
    private Integer activeConfVoteType;

    /**
     * 是否开启用户自己上传作品 0 默认不开启 1 开启
     */
    @Column(name = "active_conf_sign_up")
    private Integer activeConfSignUp;

    /**
     * 活动是否需要验证码 0默认不开启 1 开启
     */
    @Column(name = "active_conf_verify")
    private Integer activeConfVerify;

    /**
     * 投票数是否需要隐藏 0默认不开启 1开启
     */
    @Column(name = "active_conf_num_hide")
    private Integer activeConfNumHide;

    /**
     * 投票用户是否需要隐藏 0默认不开启 1开启
     */
    @Column(name = "active_conf_user_hide")
    private Integer activeConfUserHide;

    /**
     * 投票排名是否隐藏 0默认不开启 1开启
     */
    @Column(name = "active_conf_rank_hide")
    private Integer activeConfRankHide;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后一次的修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 用于分享的图片
     */
    @Column(name = "active_conf_share_img")
    private String activeConfShareImg;

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
     * 获取对应的投票基础表的ID
     *
     * @return active_vote_base_id - 对应的投票基础表的ID
     */
    public Integer getActiveVoteBaseId() {
        return activeVoteBaseId;
    }

    /**
     * 设置对应的投票基础表的ID
     *
     * @param activeVoteBaseId 对应的投票基础表的ID
     */
    public void setActiveVoteBaseId(Integer activeVoteBaseId) {
        this.activeVoteBaseId = activeVoteBaseId;
    }

    /**
     * 获取对应的音乐ID 音乐配置表中配置
     *
     * @return active_conf_music_id - 对应的音乐ID 音乐配置表中配置
     */
    public Integer getActiveConfMusicId() {
        return activeConfMusicId;
    }

    /**
     * 设置对应的音乐ID 音乐配置表中配置
     *
     * @param activeConfMusicId 对应的音乐ID 音乐配置表中配置
     */
    public void setActiveConfMusicId(Integer activeConfMusicId) {
        this.activeConfMusicId = activeConfMusicId;
    }

    /**
     * 获取是否可以重复投票 0默认不开启 1开启
     *
     * @return active_conf_repeat_vote - 是否可以重复投票 0默认不开启 1开启
     */
    public Integer getActiveConfRepeatVote() {
        return activeConfRepeatVote;
    }

    /**
     * 设置是否可以重复投票 0默认不开启 1开启
     *
     * @param activeConfRepeatVote 是否可以重复投票 0默认不开启 1开启
     */
    public void setActiveConfRepeatVote(Integer activeConfRepeatVote) {
        this.activeConfRepeatVote = activeConfRepeatVote;
    }

    /**
     * 获取投票类型限制例如1天1票 投票类型配置表中设置
     *
     * @return active_conf_vote_type - 投票类型限制例如1天1票 投票类型配置表中设置
     */
    public Integer getActiveConfVoteType() {
        return activeConfVoteType;
    }

    /**
     * 设置投票类型限制例如1天1票 投票类型配置表中设置
     *
     * @param activeConfVoteType 投票类型限制例如1天1票 投票类型配置表中设置
     */
    public void setActiveConfVoteType(Integer activeConfVoteType) {
        this.activeConfVoteType = activeConfVoteType;
    }

    /**
     * 获取是否开启用户自己上传作品 0 默认不开启 1 开启
     *
     * @return active_conf_sign_up - 是否开启用户自己上传作品 0 默认不开启 1 开启
     */
    public Integer getActiveConfSignUp() {
        return activeConfSignUp;
    }

    /**
     * 设置是否开启用户自己上传作品 0 默认不开启 1 开启
     *
     * @param activeConfSignUp 是否开启用户自己上传作品 0 默认不开启 1 开启
     */
    public void setActiveConfSignUp(Integer activeConfSignUp) {
        this.activeConfSignUp = activeConfSignUp;
    }

    /**
     * 获取活动是否需要验证码 0默认不开启 1 开启
     *
     * @return active_conf_verify - 活动是否需要验证码 0默认不开启 1 开启
     */
    public Integer getActiveConfVerify() {
        return activeConfVerify;
    }

    /**
     * 设置活动是否需要验证码 0默认不开启 1 开启
     *
     * @param activeConfVerify 活动是否需要验证码 0默认不开启 1 开启
     */
    public void setActiveConfVerify(Integer activeConfVerify) {
        this.activeConfVerify = activeConfVerify;
    }

    /**
     * 获取投票数是否需要隐藏 0默认不开启 1开启
     *
     * @return active_conf_num_hide - 投票数是否需要隐藏 0默认不开启 1开启
     */
    public Integer getActiveConfNumHide() {
        return activeConfNumHide;
    }

    /**
     * 设置投票数是否需要隐藏 0默认不开启 1开启
     *
     * @param activeConfNumHide 投票数是否需要隐藏 0默认不开启 1开启
     */
    public void setActiveConfNumHide(Integer activeConfNumHide) {
        this.activeConfNumHide = activeConfNumHide;
    }

    /**
     * 获取投票用户是否需要隐藏 0默认不开启 1开启
     *
     * @return active_conf_user_hide - 投票用户是否需要隐藏 0默认不开启 1开启
     */
    public Integer getActiveConfUserHide() {
        return activeConfUserHide;
    }

    /**
     * 设置投票用户是否需要隐藏 0默认不开启 1开启
     *
     * @param activeConfUserHide 投票用户是否需要隐藏 0默认不开启 1开启
     */
    public void setActiveConfUserHide(Integer activeConfUserHide) {
        this.activeConfUserHide = activeConfUserHide;
    }

    /**
     * 获取投票排名是否隐藏 0默认不开启 1开启
     *
     * @return active_conf_rank_hide - 投票排名是否隐藏 0默认不开启 1开启
     */
    public Integer getActiveConfRankHide() {
        return activeConfRankHide;
    }

    /**
     * 设置投票排名是否隐藏 0默认不开启 1开启
     *
     * @param activeConfRankHide 投票排名是否隐藏 0默认不开启 1开启
     */
    public void setActiveConfRankHide(Integer activeConfRankHide) {
        this.activeConfRankHide = activeConfRankHide;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后一次的修改时间
     *
     * @return update_time - 最后一次的修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后一次的修改时间
     *
     * @param updateTime 最后一次的修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取用于分享的图片
     *
     * @return active_conf_share_img - 用于分享的图片
     */
    public String getActiveConfShareImg() {
        return activeConfShareImg;
    }

    /**
     * 设置用于分享的图片
     *
     * @param activeConfShareImg 用于分享的图片
     */
    public void setActiveConfShareImg(String activeConfShareImg) {
        this.activeConfShareImg = activeConfShareImg;
    }
}