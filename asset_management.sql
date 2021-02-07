/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : asset_management

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2021-01-24 19:39:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news_info
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_info
-- ----------------------------
INSERT INTO `news_info` VALUES ('1', '习近平在十九届中央纪委五次全会上发表重要讲话', 'https://www.chinacourt.org/article/detail/2021/01/id/5776475.shtml');
INSERT INTO `news_info` VALUES ('2', '法官说法第一季:生活中的民法典普法微视频征集', 'https://www.chinacourt.org/article/subjectdetail/id/MzAwNMgtNIABAA.shtml');
INSERT INTO `news_info` VALUES ('3', '全国人大常委会关于设立北京金融法院的决定', 'https://www.chinacourt.org/article/detail/2021/01/id/5776501.shtml');
INSERT INTO `news_info` VALUES ('4', '《关于设立北京金融法院的决定（草案）》的说明', 'https://www.chinacourt.org/article/detail/2021/01/id/5776480.shtml');
INSERT INTO `news_info` VALUES ('5', '为国家现代化建设营造良好金融法治环境', 'https://www.chinacourt.org/article/detail/2021/01/id/5774705.shtml');

-- ----------------------------
-- Table structure for policy_info
-- ----------------------------
DROP TABLE IF EXISTS `policy_info`;
CREATE TABLE `policy_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of policy_info
-- ----------------------------
INSERT INTO `policy_info` VALUES ('1', '习近平在十九届中央纪委五次全会上发表重要讲话', 'https://www.chinacourt.org/article/detail/2021/01/id/5776475.shtml');
INSERT INTO `policy_info` VALUES ('2', '法官说法第一季:生活中的民法典普法微视频征集', 'https://www.chinacourt.org/article/subjectdetail/id/MzAwNMgtNIABAA.shtml');
INSERT INTO `policy_info` VALUES ('3', '全国人大常委会关于设立北京金融法院的决定', 'https://www.chinacourt.org/article/detail/2021/01/id/5776501.shtml');
INSERT INTO `policy_info` VALUES ('4', '《关于设立北京金融法院的决定（草案）》的说明', 'https://www.chinacourt.org/article/detail/2021/01/id/5776480.shtml');
INSERT INTO `policy_info` VALUES ('5', '为国家现代化建设营造良好金融法治环境', 'https://www.chinacourt.org/article/detail/2021/01/id/5774705.shtml');
INSERT INTO `policy_info` VALUES ('6', '政策6', 'https://p4psearch.1688.com/p4p114/p4psearch/offer2.htm?keywords=%B0%A2%C0%EF%B0%CD%B0%CD%B9%BA%CE%EF%CD%F8&cosite=baidujj&location=landing_t4&trackid=8856883915934503217215&keywordid=95224359953&format=normal&adposition=cl1&pagenum=1&creative=36907476436&matchtype=2&bd_vid=11133353529943451331');

-- ----------------------------
-- Table structure for property_info
-- ----------------------------
DROP TABLE IF EXISTS `property_info`;
CREATE TABLE `property_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `property_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_id` varchar(18) DEFAULT NULL,
  `type_desc_id` varchar(18) DEFAULT NULL,
  `propertytype_id` varchar(18) DEFAULT NULL,
  `property_password` varchar(20) DEFAULT NULL,
  `soft_petname` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `haeres_email` varchar(20) DEFAULT NULL,
  `haeres_phone` varchar(11) DEFAULT NULL,
  `haeres_name` varchar(50) DEFAULT NULL,
  `haeres_id` varchar(18) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of property_info
-- ----------------------------
INSERT INTO `property_info` VALUES ('1', '00000001', 'a', '8', '2', '1234565', '王大锤', '2021-01-22 13:21:07', '2021-01-24 18:20:26', '314566778@163.com', '13189545668', '王大锤', '440916198503213258', '节拍器');
INSERT INTO `property_info` VALUES ('3', '00000003', 'a', '18', '3', '123456', '王锤锤', '2021-01-22 13:21:11', '2021-01-24 17:15:00', '314566778@163.com', '12345678910', '王锤锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('4', '00000004', 'a', '2', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:03', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('5', '00000005', 'a', '3', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:03', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('6', '00000006', 'a', '4', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:04', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('7', '00000007', 'a', '5', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:06', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('8', '00000008', 'a', '6', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:06', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('9', '00000009', 'a', '1', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:09', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('10', '00000010', 'a', '2', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:10', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('11', '00000011', 'a', '3', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:11', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('12', '00000012', 'a', '4', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:12', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('13', '00000013', 'a', '5', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:13', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('14', '00000014', 'a', '6', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:13', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('15', '00000015', 'a', '1', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:14', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('16', '00000016', 'a', '2', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:15', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('17', '00000017', 'a', '3', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:15', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('18', '00000018', 'a', '4', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:16', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('19', '00000019', 'a', '5', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:17', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', 'aa');
INSERT INTO `property_info` VALUES ('20', '00000020', 'a', '6', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:17', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('21', '00000021', 'a', '1', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:18', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('22', '00000022', 'a', '2', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:18', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('23', '00000023', 'a', '3', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:19', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('24', '00000024', 'a', '4', '1', '123456', '王大锤', '2021-01-22 13:21:11', '2021-01-24 17:15:19', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('25', '00000025', 'a', '5', '1', '123456', '王大锤', '2021-01-22 13:21:07', '2021-01-24 17:15:20', '314566778@163.com', '12345678910', '王大锤', '440945198602301564', '节拍器');
INSERT INTO `property_info` VALUES ('28', 'a', 'a', '7', '2', 'a', 'a', '2021-01-24 00:00:00', '2021-01-24 17:14:39', 'a', 'a', 'a', 'a', '<p>a</p>');
INSERT INTO `property_info` VALUES ('30', 'aaa', 'a', '8', '2', 'aaa', 'aaa', '2021-01-24 14:00:45', '2021-01-24 17:14:43', 'aaa', 'a', 'aa', 'aa', '<p>a</p>');

-- ----------------------------
-- Table structure for property_type
-- ----------------------------
DROP TABLE IF EXISTS `property_type`;
CREATE TABLE `property_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `property_typeid` varchar(10) DEFAULT NULL,
  `property_typename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of property_type
-- ----------------------------
INSERT INTO `property_type` VALUES ('1', '1', '微信');
INSERT INTO `property_type` VALUES ('2', '1', 'qq');
INSERT INTO `property_type` VALUES ('3', '1', 'soul');
INSERT INTO `property_type` VALUES ('4', '1', 'telegram');
INSERT INTO `property_type` VALUES ('5', '1', 'facebook');
INSERT INTO `property_type` VALUES ('6', '1', 'Twitter');
INSERT INTO `property_type` VALUES ('7', '2', '支付宝');
INSERT INTO `property_type` VALUES ('8', '2', '白条');
INSERT INTO `property_type` VALUES ('9', '2', '百度金融');
INSERT INTO `property_type` VALUES ('10', '2', '借贷宝');
INSERT INTO `property_type` VALUES ('18', '3', '网易游戏');
INSERT INTO `property_type` VALUES ('19', '3', '腾讯游戏');
INSERT INTO `property_type` VALUES ('20', '3', '360游戏');

-- ----------------------------
-- Table structure for rule_info
-- ----------------------------
DROP TABLE IF EXISTS `rule_info`;
CREATE TABLE `rule_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rule_info
-- ----------------------------
INSERT INTO `rule_info` VALUES ('1', '习近平在十九届中央纪委五次全会上发表重要讲话', 'https://www.chinacourt.org/article/detail/2021/01/id/5776475.shtml');
INSERT INTO `rule_info` VALUES ('2', '法官说法第一季:生活中的民法典普法微视频征集', 'https://www.chinacourt.org/article/subjectdetail/id/MzAwNMgtNIABAA.shtml');
INSERT INTO `rule_info` VALUES ('3', '全国人大常委会关于设立北京金融法院的决定', 'https://www.chinacourt.org/article/detail/2021/01/id/5776501.shtml');
INSERT INTO `rule_info` VALUES ('4', '《关于设立北京金融法院的决定（草案）》的说明', 'https://www.chinacourt.org/article/detail/2021/01/id/5776480.shtml');
INSERT INTO `rule_info` VALUES ('5', '为国家现代化建设营造良好金融法治环境', 'https://www.chinacourt.org/article/detail/2021/01/id/5774705.shtml');
INSERT INTO `rule_info` VALUES ('6', '法规6', 'https://p4psearch.1688.com/p4p114/p4psearch/offer2.htm?keywords=%B0%A2%C0%EF%B0%CD%B0%CD%B9%BA%CE%EF%CD%F8&cosite=baidujj&location=landing_t4&trackid=8856883915934503217215&keywordid=95224359953&format=normal&adposition=cl1&pagenum=1&creative=36907476436&matchtype=2&bd_vid=11133353529943451331');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_age` int DEFAULT NULL,
  `user_birthday` datetime DEFAULT NULL,
  `user_sex` varchar(2) DEFAULT NULL,
  `user_phone` varchar(11) DEFAULT NULL,
  `user_natpl` varchar(8) DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `emg_contact` varchar(50) DEFAULT NULL,
  `emg_ctemail` varchar(50) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('a', 'a', '王大锤', '39', '2021-01-06 00:00:00', '0', '13118566471', '广东', '西路', '986745622@qq.com', '小锤', '986745622@qq.com', '<p>东奔西走111</p>');
INSERT INTO `user_info` VALUES ('b', 'b', '王小锤', '40', '2021-01-22 09:06:34', '1', '1321856647', '北京', '东路', '986745622@qq.com', '大锤', '986745622@qq.com', '东奔西走');
