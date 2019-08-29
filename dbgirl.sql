/*
Navicat MySQL Data Transfer

Source Server         : loalhost
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : dbgirl

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-08-29 14:25:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for girl
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of girl
-- ----------------------------
INSERT INTO `girl` VALUES ('46', '18', 'A');
INSERT INTO `girl` VALUES ('47', '28', 'B');

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
-- DROP TABLE IF EXISTS `hibernate_sequence`;
-- CREATE TABLE `hibernate_sequence` (
--   `next_val` bigint(20) DEFAULT NULL
-- ) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('50');
