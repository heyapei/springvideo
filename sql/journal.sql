
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for journal
-- ----------------------------
DROP TABLE IF EXISTS `journal`;
CREATE TABLE `journal`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '何亚培',
  `journal` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `view_num` int(11) NOT NULL DEFAULT 0,
  `pass_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '000000',
  `status` int(11) NOT NULL DEFAULT 1,
  `explain_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'There is no introduction',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
