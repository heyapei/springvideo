

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for picture_wall
-- ----------------------------
DROP TABLE IF EXISTS `picture_wall`;
CREATE TABLE `picture_wall`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pass_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '000000',
  `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '何亚培',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无标题',
  `explain_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无备注',
  `status` int(255) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
