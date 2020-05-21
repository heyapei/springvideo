package com.hyp.dataobject.weixin.vote;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "weixin_music")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WeixinMusic {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 音乐类型
     */
    @Column(name = "music_type")
    private String musicType;

    /**
     * 状态值 0正常 1下线
     */
    private Integer status;

    /**
     * 音乐地址
     */
    @Column(name = "music_url")
    private String musicUrl;

    /**
     * 音乐适用方向 0适用于任何方向
     */
    @Column(name = "apply_type")
    private Integer applyType;

    /**
     * 名字
     */
    @Column(name = "music_name")
    private String musicName;

    /**
     * 描述
     */
    @Column(name = "music_desc")
    private String musicDesc;

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
     * 获取音乐类型
     *
     * @return music_type - 音乐类型
     */
    public String getMusicType() {
        return musicType;
    }

    /**
     * 设置音乐类型
     *
     * @param musicType 音乐类型
     */
    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    /**
     * 获取状态值 0正常 1下线
     *
     * @return status - 状态值 0正常 1下线
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态值 0正常 1下线
     *
     * @param status 状态值 0正常 1下线
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取音乐地址
     *
     * @return music_url - 音乐地址
     */
    public String getMusicUrl() {
        return musicUrl;
    }

    /**
     * 设置音乐地址
     *
     * @param musicUrl 音乐地址
     */
    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    /**
     * 获取音乐适用方向 0适用于任何方向
     *
     * @return apply_type - 音乐适用方向 0适用于任何方向
     */
    public Integer getApplyType() {
        return applyType;
    }

    /**
     * 设置音乐适用方向 0适用于任何方向
     *
     * @param applyType 音乐适用方向 0适用于任何方向
     */
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    /**
     * 获取名字
     *
     * @return music_name - 名字
     */
    public String getMusicName() {
        return musicName;
    }

    /**
     * 设置名字
     *
     * @param musicName 名字
     */
    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    /**
     * 获取描述
     *
     * @return music_desc - 描述
     */
    public String getMusicDesc() {
        return musicDesc;
    }

    /**
     * 设置描述
     *
     * @param musicDesc 描述
     */
    public void setMusicDesc(String musicDesc) {
        this.musicDesc = musicDesc;
    }
}