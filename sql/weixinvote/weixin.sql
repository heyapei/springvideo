/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : weixin

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 21/05/2020 22:51:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for weixin_music
-- ----------------------------
DROP TABLE IF EXISTS `weixin_music`;
CREATE TABLE `weixin_music`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `music_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '音乐类型',
  `status` int(11) NOT NULL DEFAULT 0 COMMENT '状态值 0正常 1下线',
  `music_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '音乐地址',
  `apply_type` int(11) NOT NULL DEFAULT 0 COMMENT '音乐适用方向 0适用于任何方向',
  `music_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '未知' COMMENT '名字',
  `music_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '没有描述' COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '音乐内容' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_base
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_base`;
CREATE TABLE `weixin_vote_base`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `active_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '封面图片',
  `active_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '活动名称',
  `active_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '活动描述',
  `active_desc_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '活动描述图片',
  `active_reward` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '活动奖励',
  `active_reward_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '活动奖励图片',
  `active_start_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '活动开始时间',
  `active_end_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '活动结束时间',
  `active_public` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否公开到首页 0默认不公开 1公开',
  `active_show_order` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '活动展示优先级 数值越高 优先级越高 默认为0 默认展示',
  `status` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '0 待审核 1上线  2未开始 3已结束',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '活动创建时间',
  `update_time` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '最后的更新时间',
  `create_sys_user_id` int(11) UNSIGNED NOT NULL COMMENT '活动创建人Id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投票内容基础信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_conf
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_conf`;
CREATE TABLE `weixin_vote_conf`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `active_vote_base_id` int(11) UNSIGNED NOT NULL COMMENT '对应的投票基础表的ID',
  `active_conf_music_id` int(11) UNSIGNED NOT NULL COMMENT '对应的音乐ID 音乐配置表中配置',
  `active_conf_share_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用于分享的图片',
  `active_conf_repeat_vote` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否可以重复投票 0默认不开启 1开启',
  `active_conf_vote_type` int(11) UNSIGNED NOT NULL COMMENT '投票类型限制例如1天1票 投票类型配置表中设置',
  `active_conf_sign_up` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否开启用户自己上传作品 0 默认不开启 1 开启',
  `active_conf_verify` int(11) UNSIGNED NOT NULL COMMENT '活动是否需要验证码 0默认不开启 1 开启',
  `active_conf_num_hide` int(11) UNSIGNED NOT NULL COMMENT '投票数是否需要隐藏 0默认不开启 1开启',
  `active_conf_user_hide` int(11) UNSIGNED NOT NULL COMMENT '投票用户是否需要隐藏 0默认不开启 1开启',
  `active_conf_rank_hide` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '投票排名是否隐藏 0默认不开启 1开启',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '最后一次的修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投票内容配置信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_sys_user`;
CREATE TABLE `weixin_vote_sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '人员类型 0 普通管理员 1 系统管理员 可扩展',
  `open_id` varbinary(255) NOT NULL DEFAULT '' COMMENT '用户的微信openId',
  `create_date` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投票系统管理员（包括普通管理员（投票活动创建者）和系统管理员）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_ticket
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_ticket`;
CREATE TABLE `weixin_vote_ticket`  (
  `id` int(11) UNSIGNED NOT NULL,
  `active_vote_base_id` int(11) UNSIGNED NOT NULL COMMENT '投票是在某个活动',
  `active_vote_work_id` int(11) UNSIGNED NOT NULL COMMENT '投票是在某个作品',
  `create_user_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '创建人的IP地址（创建人即投票用户）',
  `create_user_id` int(11) UNSIGNED NOT NULL COMMENT '创建人ID',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '投票时间',
  `status` int(11) UNSIGNED NOT NULL COMMENT '默认为0起作用 1不起作用',
  `update_time` datetime(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '对于活动内容的投票详情信息（对某个内容的头片信息）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_user
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_user`;
CREATE TABLE `weixin_vote_user`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户微信中的唯一标识',
  `avatar_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '头像地址',
  `nick_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '昵称',
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '性别',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '城市',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '省份',
  `country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '城市',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投票人员的信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weixin_vote_work
-- ----------------------------
DROP TABLE IF EXISTS `weixin_vote_work`;
CREATE TABLE `weixin_vote_work`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `vote_work_user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品人姓名',
  `vote_work_user_id` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '作品人用户Id',
  `vote_work_user_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品人手机号',
  `vote_work_user_weixin` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品人微信号',
  `vote_work_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品描述',
  `vote_work_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品名称',
  `vote_work_img` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作品图片',
  `vote_work_video_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '作品视频文件Id',
  `vote_work_create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '作品创建时间',
  `active_vote_base_id` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '作品所属活动的ID',
  `vote_work_status` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '作品的状态 0默认等待审核 1上线 2下线',
  `vote_work_show_order` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '作品的展示排序',
  `vote_work_count_num` int(11) UNSIGNED NOT NULL DEFAULT 0 COMMENT '作品被投票次数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投票活动的作品内容' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
