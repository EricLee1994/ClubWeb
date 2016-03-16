/*
 Navicat Premium Data Transfer

 Source Server         : eric
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : club

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 09/17/2015 15:14:32 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `act_id` int(255) NOT NULL AUTO_INCREMENT,
  `act_name` varchar(255) DEFAULT NULL,
  `act_place` varchar(255) DEFAULT NULL,
  `act_type` varchar(255) DEFAULT NULL,
  `act_date` datetime DEFAULT NULL,
  `act__content` varchar(255) DEFAULT NULL,
  `act_num` int(255) DEFAULT NULL,
  `act_photo` varchar(255) DEFAULT NULL,
  `act_mem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `admin`
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES ('1', 'admin', '123');
COMMIT;

-- ----------------------------
--  Table structure for `club`
-- ----------------------------
DROP TABLE IF EXISTS `club`;
CREATE TABLE `club` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `clubname` varchar(255) DEFAULT NULL,
  `setuptime` date DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `chrageid` int(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_content` varchar(255) DEFAULT NULL,
  `n_mem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `m_id` int(255) NOT NULL AUTO_INCREMENT,
  `m_xh` int(255) NOT NULL,
  `m_name` varchar(255) NOT NULL,
  `m_pwd` varchar(255) NOT NULL,
  `m_age` int(255) NOT NULL,
  `m_sex` varchar(255) NOT NULL,
  `m_phone` varchar(255) NOT NULL,
  `m__qq` varchar(255) NOT NULL,
  `m_class` varchar(255) NOT NULL,
  `m_skill` varchar(255) NOT NULL,
  `m__bz` varchar(255) NOT NULL,
  `m_act` varchar(255) DEFAULT NULL,
  `m_sz` int(255) DEFAULT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '12130507', '李铮', '123', '20', '男', '18505207665', '843251949', '软件工程3班', '编程', '无', null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
