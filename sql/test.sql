-- ----------------------------
--  Table structure for `user_test`
-- ----------------------------
DROP TABLE IF EXISTS `user_test`;
CREATE TABLE `user_test` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `age` int(10) NOT NULL,
  `create_time` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `user_test`
-- ----------------------------
BEGIN;
INSERT INTO `user_test` VALUES ('1', 'xiufeng.wang', '38', '111'), ('2', 'xiufeng.wang', '38', '222'), ('5', 'xiufeng.wang', '38', '3334444');
COMMIT;
