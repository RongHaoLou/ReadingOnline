/*
 Navicat Premium Data Transfer

 Source Server         : DB_lz
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : db_reading

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 19/06/2019 21:31:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_author
-- ----------------------------
DROP TABLE IF EXISTS `t_author`;
CREATE TABLE `t_author`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `author_books` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_author
-- ----------------------------
INSERT INTO `t_author` VALUES (1, '顾漫', '无', 5);
INSERT INTO `t_author` VALUES (2, '阿耐', '无', 3);
INSERT INTO `t_author` VALUES (3, '玛利亚·桑波', '无', 2);
INSERT INTO `t_author` VALUES (4, '罗振宇', '无', 1);
INSERT INTO `t_author` VALUES (5, '曹雪芹', '无', 2);
INSERT INTO `t_author` VALUES (6, '戴尔·卡耐基', '无', 3);
INSERT INTO `t_author` VALUES (7, '常书欣', '无', 2);
INSERT INTO `t_author` VALUES (8, '千寻千寻', '无', 3);
INSERT INTO `t_author` VALUES (9, '是枝裕和', '无', 1);
INSERT INTO `t_author` VALUES (10, '徐浪', '无', 2);
INSERT INTO `t_author` VALUES (11, '张海生', '无', 3);
INSERT INTO `t_author` VALUES (12, '江户川乱跑', '无', 2);
INSERT INTO `t_author` VALUES (13, '芙蕖绿波', '无', 2);
INSERT INTO `t_author` VALUES (14, '叶落无心', '无', 2);
INSERT INTO `t_author` VALUES (15, '林奕含', '无', 1);
INSERT INTO `t_author` VALUES (16, '慈怀读书会', '无', 3);
INSERT INTO `t_author` VALUES (17, '列夫', '无', 2);
INSERT INTO `t_author` VALUES (18, '李原', '无', 4);
INSERT INTO `t_author` VALUES (19, '贝晓', '无', 3);
INSERT INTO `t_author` VALUES (20, '颜灼灼', '无', 4);

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_price` double NULL DEFAULT NULL,
  `book_image` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `book_state` tinyint(4) NULL DEFAULT NULL,
  `author_id` int(11) NULL DEFAULT NULL,
  `types_id` int(11) NULL DEFAULT NULL,
  `type_id` int(11) NULL DEFAULT NULL,
  `publish_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (1, '致我们暖暖的小时光', 6.99, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (2, '他来时惊涛骇浪', 4.95, NULL, NULL, NULL, 8, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (3, '东宫', 4.5, NULL, NULL, NULL, 16, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (4, '都挺好', 5.99, NULL, NULL, NULL, 2, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (5, '如果可以这样爱', 9.99, NULL, NULL, NULL, 8, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (6, '暗黑四部曲', 180.29, NULL, NULL, NULL, 15, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (7, '熊镇', 19.99, NULL, NULL, NULL, 20, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (8, '蜜蜂与远行', 19.99, NULL, NULL, NULL, 11, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (9, '伯纳黛特,你要去哪', 24, NULL, NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (10, '实行记录', 19.9, NULL, NULL, NULL, 10, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (11, '法医秦明:天谴者', 19.98, NULL, NULL, NULL, 12, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (12, '回答不了', 30, NULL, NULL, NULL, 8, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (13, '如果东京不快乐', 1.99, NULL, NULL, NULL, 18, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (14, '逻辑思维', 12.6, NULL, NULL, NULL, 4, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (15, '我在未来等你', 12.99, NULL, NULL, NULL, 19, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (16, '小偷家族', 11.25, NULL, NULL, NULL, 9, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (17, '无罪辩护(全三册)', 29, NULL, NULL, NULL, 11, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (18, '尸语者', 19, NULL, NULL, NULL, 17, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (19, '诡案追踪', 10.5, NULL, NULL, NULL, 19, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (20, 'D坂杀人案', 11.4, NULL, NULL, NULL, 11, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (21, '深宫谍影', 9.84, NULL, NULL, NULL, 20, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (22, '潜行迷踪', 9.84, NULL, NULL, NULL, 13, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (23, '他来时惊涛骇浪', 4.95, NULL, NULL, NULL, 16, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (24, '脑洞师', 11.04, NULL, NULL, NULL, 5, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (25, '大约是爱(套装共两册)', 29.9, NULL, NULL, NULL, 7, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (26, '大江大河四部曲', 224, NULL, NULL, NULL, 2, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (27, '知我如你,深情不负', 11, NULL, NULL, NULL, 14, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (28, '余罪:我的刑侦笔记', 154.22, NULL, NULL, NULL, 7, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (29, '人性的弱点大全集', 1, NULL, NULL, NULL, 6, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (30, '独家记忆', 16, NULL, NULL, NULL, 13, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (31, '听说爱情在隔壁', 4.99, NULL, NULL, NULL, 18, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (32, '宫花红(共四册)', 65, NULL, NULL, NULL, 2, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (33, '江山为聘', 49, NULL, NULL, NULL, 19, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (34, '微微一笑很倾城', 2.99, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (35, '房思琪的初恋乐园', 19.98, NULL, NULL, NULL, 6, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (36, '碧云(全两册)', 8.9, NULL, NULL, NULL, 10, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (37, '红楼梦', 0.01, NULL, NULL, NULL, 5, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (38, '墨菲定律', 8, NULL, NULL, NULL, 18, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (39, '口才三绝', 1, NULL, NULL, NULL, 20, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (40, '把生活过成你想要的样子', 7.99, NULL, NULL, NULL, 16, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (41, '杜月笙全传', 4.99, NULL, NULL, NULL, 12, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (42, '白鹿原', 7.2, NULL, NULL, NULL, 14, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (43, '厚黑学(全本)', 16.99, NULL, NULL, NULL, 6, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (44, '人性的弱点', 4, NULL, NULL, NULL, 18, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (45, '明朝那些事:洪武大帝', 9.99, NULL, NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (46, '狼道全集', 5, NULL, NULL, NULL, 17, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (47, '谁动了我的奶酪', 13.2, NULL, NULL, NULL, 20, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (48, '何以笙箫默 ', 2.99, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (49, '杉杉来吃', 3, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (50, '骄阳似我', 12.5, NULL, NULL, NULL, 1, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_chapter
-- ----------------------------
DROP TABLE IF EXISTS `t_chapter`;
CREATE TABLE `t_chapter`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chapter_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_chapter
-- ----------------------------
INSERT INTO `t_chapter` VALUES (1, '第一章', 1);
INSERT INTO `t_chapter` VALUES (2, '第二章', 1);
INSERT INTO `t_chapter` VALUES (3, '第三章', 1);
INSERT INTO `t_chapter` VALUES (4, '第四章', 1);
INSERT INTO `t_chapter` VALUES (5, '第五章', 1);
INSERT INTO `t_chapter` VALUES (6, '第一章', 2);
INSERT INTO `t_chapter` VALUES (7, '第二章', 2);
INSERT INTO `t_chapter` VALUES (8, '第三章', 2);
INSERT INTO `t_chapter` VALUES (9, '第四章', 2);
INSERT INTO `t_chapter` VALUES (10, '第五章', 2);

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_info` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `comment_time` datetime(0) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (1, '这本书不错', '2019-06-19 13:00:00', 1, 1);

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` bigint(20) NULL DEFAULT NULL,
  `buy_time` datetime(0) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, 1, '2019-06-19 21:21:03', 1, 1);
INSERT INTO `t_order` VALUES (2, 1, '2019-06-19 21:21:21', 2, 1);
INSERT INTO `t_order` VALUES (3, 1, '2019-06-19 21:21:49', 3, 1);

-- ----------------------------
-- Table structure for t_publish
-- ----------------------------
DROP TABLE IF EXISTS `t_publish`;
CREATE TABLE `t_publish`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `publish_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publish_ISBN` bigint(20) NULL DEFAULT NULL,
  `copyright` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_publish
-- ----------------------------
INSERT INTO `t_publish` VALUES (1, '长沙大鱼文化传媒有限公司', 9787802288621, '北京记忆坊文化信息咨询有限公司授权');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, 'author');
INSERT INTO `t_role` VALUES (2, 'normal');

-- ----------------------------
-- Table structure for t_section
-- ----------------------------
DROP TABLE IF EXISTS `t_section`;
CREATE TABLE `t_section`  (
  `id` int(11) NULL DEFAULT NULL,
  `section_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `chapter_id` int(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_section
-- ----------------------------
INSERT INTO `t_section` VALUES (1, '第一节', 1);
INSERT INTO `t_section` VALUES (2, '第二节', 1);
INSERT INTO `t_section` VALUES (3, '第三节', 1);
INSERT INTO `t_section` VALUES (4, '第一节', 2);
INSERT INTO `t_section` VALUES (5, '第二节', 2);
INSERT INTO `t_section` VALUES (6, '第三节', 2);
INSERT INTO `t_section` VALUES (7, '第一节', 6);
INSERT INTO `t_section` VALUES (8, '第二节', 6);
INSERT INTO `t_section` VALUES (9, '第三节', 6);
INSERT INTO `t_section` VALUES (10, '第一节', 7);
INSERT INTO `t_section` VALUES (11, '第二节', 7);
INSERT INTO `t_section` VALUES (12, '第三节', 7);

-- ----------------------------
-- Table structure for t_shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_shopping_cart`;
CREATE TABLE `t_shopping_cart`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_shopping_cart
-- ----------------------------
INSERT INTO `t_shopping_cart` VALUES (1, 2, 1);
INSERT INTO `t_shopping_cart` VALUES (2, 2, 3);
INSERT INTO `t_shopping_cart` VALUES (3, 8, 9);
INSERT INTO `t_shopping_cart` VALUES (4, 8, 10);
INSERT INTO `t_shopping_cart` VALUES (7, 9, 15);

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `types_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `type_name`(`type_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES (1, '企业管理', 1);
INSERT INTO `t_type` VALUES (2, '经济金融', 1);
INSERT INTO `t_type` VALUES (3, '市场营销', 1);
INSERT INTO `t_type` VALUES (4, '成功学', 2);
INSERT INTO `t_type` VALUES (5, '演讲口才', 2);
INSERT INTO `t_type` VALUES (6, '人际处事', 2);
INSERT INTO `t_type` VALUES (7, '人物传记', 3);
INSERT INTO `t_type` VALUES (8, '世界史', 3);
INSERT INTO `t_type` VALUES (9, '中国史', 3);
INSERT INTO `t_type` VALUES (10, '软硬件开发', 4);
INSERT INTO `t_type` VALUES (11, '图形图象', 4);
INSERT INTO `t_type` VALUES (12, '网络与通信', 4);
INSERT INTO `t_type` VALUES (13, '两性关系', 5);
INSERT INTO `t_type` VALUES (14, '婚姻家庭', 5);
INSERT INTO `t_type` VALUES (15, '情感恋爱', 5);

-- ----------------------------
-- Table structure for t_types
-- ----------------------------
DROP TABLE IF EXISTS `t_types`;
CREATE TABLE `t_types`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `types_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_types
-- ----------------------------
INSERT INTO `t_types` VALUES (1, '经济管理');
INSERT INTO `t_types` VALUES (2, '成功励志');
INSERT INTO `t_types` VALUES (3, '历史传记');
INSERT INTO `t_types` VALUES (4, '计算机');
INSERT INTO `t_types` VALUES (5, '两性感情');
INSERT INTO `t_types` VALUES (9, 'a');
INSERT INTO `t_types` VALUES (10, 'aaa');
INSERT INTO `t_types` VALUES (11, 'bbb');

-- ----------------------------
-- Table structure for t_unpaid
-- ----------------------------
DROP TABLE IF EXISTS `t_unpaid`;
CREATE TABLE `t_unpaid`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unpaid` bigint(255) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_unpaid
-- ----------------------------
INSERT INTO `t_unpaid` VALUES (1, 1, 1);
INSERT INTO `t_unpaid` VALUES (2, 1, 5);
INSERT INTO `t_unpaid` VALUES (5, 31, 2);
INSERT INTO `t_unpaid` VALUES (6, 8, 9);
INSERT INTO `t_unpaid` VALUES (7, 88, 99);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `createDate` datetime(0) NULL DEFAULT NULL,
  `phoneNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', '123456', '2019-06-19 12:00:00', '11111111111', 1);
INSERT INTO `t_user` VALUES (2, 'zhangsan', '123456', '2019-06-19 13:00:00', '22222222222', 2);
INSERT INTO `t_user` VALUES (3, 'root', '123456', '2019-06-19 13:31:45', '33333333333', 1);
INSERT INTO `t_user` VALUES (4, 'lisi', '123456', '2019-06-19 13:32:16', '44444444444', 2);
INSERT INTO `t_user` VALUES (5, '王八', '123', '2019-06-19 16:24:21', '13011110', 1);
INSERT INTO `t_user` VALUES (6, '王八01', '123', '2019-06-19 16:36:42', '13011110', 1);
INSERT INTO `t_user` VALUES (7, '王八02', '123', '2019-06-19 16:36:42', '13011110', 1);
INSERT INTO `t_user` VALUES (9, '王八01', '123', '2019-06-19 16:37:09', '13011110', 1);
INSERT INTO `t_user` VALUES (10, '王八02', '123', '2019-06-19 16:37:09', '13011110', 1);
INSERT INTO `t_user` VALUES (11, '王八03', '123', '2019-06-19 16:37:09', '13011110', 1);

SET FOREIGN_KEY_CHECKS = 1;
