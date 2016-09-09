/*
Navicat MySQL Data Transfer

Source Server         : 永恒服务端数据库
Source Server Version : 50150
Source Host           : localhost:3366
Source Database       : al_server_ls

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2016-04-30 17:07:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_data
-- ----------------------------
DROP TABLE IF EXISTS `account_data`;
CREATE TABLE `account_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(65) NOT NULL,
  `activated` tinyint(1) NOT NULL DEFAULT '1',
  `access_level` tinyint(3) NOT NULL DEFAULT '0',
  `membership_exp` bigint(13) NOT NULL DEFAULT '0',
  `old_membership` tinyint(3) NOT NULL DEFAULT '0',
  `last_server` tinyint(3) NOT NULL DEFAULT '-1',
  `last_ip` varchar(20) DEFAULT NULL,
  `last_mac` varchar(20) NOT NULL DEFAULT 'xx-xx-xx-xx-xx-xx',
  `email` varchar(50) DEFAULT NULL,
  `ip_force` varchar(20) DEFAULT NULL,
  `expire` date DEFAULT NULL,
  `toll` bigint(13) NOT NULL DEFAULT '0',
  `code` tinyint(1) NOT NULL DEFAULT '5',
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2278 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_data
-- ----------------------------

-- ----------------------------
-- Table structure for account_rewards
-- ----------------------------
DROP TABLE IF EXISTS `account_rewards`;
CREATE TABLE `account_rewards` (
  `uniqId` int(11) NOT NULL AUTO_INCREMENT,
  `accountId` int(11) NOT NULL,
  `added` varchar(70) NOT NULL DEFAULT '',
  `points` decimal(20,0) NOT NULL DEFAULT '0',
  `received` varchar(70) NOT NULL DEFAULT '0',
  `rewarded` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uniqId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_rewards
-- ----------------------------

-- ----------------------------
-- Table structure for account_time
-- ----------------------------
DROP TABLE IF EXISTS `account_time`;
CREATE TABLE `account_time` (
  `account_id` int(11) NOT NULL,
  `last_active` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `expiration_time` timestamp NULL DEFAULT NULL,
  `session_duration` int(10) DEFAULT '0',
  `accumulated_online` int(10) DEFAULT '0',
  `accumulated_rest` int(10) DEFAULT '0',
  `penalty_end` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_time
-- ----------------------------

-- ----------------------------
-- Table structure for active_code
-- ----------------------------
DROP TABLE IF EXISTS `active_code`;
CREATE TABLE `active_code` (
  `code` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of active_code
-- ----------------------------

-- ----------------------------
-- Table structure for banned_ip
-- ----------------------------
DROP TABLE IF EXISTS `banned_ip`;
CREATE TABLE `banned_ip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mask` varchar(45) NOT NULL,
  `time_end` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mask` (`mask`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banned_ip
-- ----------------------------

-- ----------------------------
-- Table structure for banned_mac
-- ----------------------------
DROP TABLE IF EXISTS `banned_mac`;
CREATE TABLE `banned_mac` (
  `uniId` int(10) NOT NULL AUTO_INCREMENT,
  `address` varchar(20) NOT NULL,
  `time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `details` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`uniId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banned_mac
-- ----------------------------

-- ----------------------------
-- Table structure for gameservers
-- ----------------------------
DROP TABLE IF EXISTS `gameservers`;
CREATE TABLE `gameservers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mask` varchar(45) NOT NULL,
  `password` varchar(65) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gameservers
-- ----------------------------
INSERT INTO `gameservers` VALUES ('1', '*', 'password');

-- ----------------------------
-- Table structure for player_transfers
-- ----------------------------
DROP TABLE IF EXISTS `player_transfers`;
CREATE TABLE `player_transfers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `source_server` tinyint(3) NOT NULL,
  `target_server` tinyint(3) NOT NULL,
  `source_account_id` int(11) NOT NULL,
  `target_account_id` int(11) NOT NULL,
  `player_id` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0',
  `time_added` varchar(100) DEFAULT NULL,
  `time_performed` varchar(100) DEFAULT NULL,
  `time_done` varchar(100) DEFAULT NULL,
  `comment` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of player_transfers
-- ----------------------------

-- ----------------------------
-- Table structure for rechargeable_card
-- ----------------------------
DROP TABLE IF EXISTS `rechargeable_card`;
CREATE TABLE `rechargeable_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_number` varchar(18) NOT NULL,
  `card_password` varchar(18) NOT NULL,
  `num` int(3) NOT NULL,
  `used` int(1) NOT NULL DEFAULT '0',
  `use_account` varchar(18) DEFAULT NULL,
  `use_player_name` varchar(255) DEFAULT NULL,
  `use_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`,`card_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rechargeable_card
-- ----------------------------

-- ----------------------------
-- Table structure for tasks
-- ----------------------------
DROP TABLE IF EXISTS `tasks`;
CREATE TABLE `tasks` (
  `id` int(5) NOT NULL,
  `task` varchar(50) NOT NULL,
  `type` enum('FIXED_IN_TIME') NOT NULL,
  `last_activation` timestamp NOT NULL DEFAULT '2010-01-01 00:00:00',
  `start_time` varchar(8) NOT NULL,
  `delay` int(10) NOT NULL,
  `param` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tasks
-- ----------------------------
