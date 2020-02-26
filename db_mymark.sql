/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : mymark

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 10/01/2020 00:54:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cou_id` int(11) NOT NULL COMMENT '课程号',
  `name` varchar(255) NOT NULL COMMENT '课程名称',
  `tea_id` int(11) NOT NULL COMMENT '教师号',
  PRIMARY KEY (`cou_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

-- ----------------------------
-- Table structure for mark
-- ----------------------------
DROP TABLE IF EXISTS `mark`;
CREATE TABLE `mark` (
  `cou_id` int(11) NOT NULL COMMENT '课程号',
  `class` varchar(255) NOT NULL COMMENT '班级',
  `stu_id` int(11) NOT NULL COMMENT '学号',
  `score` int(255) NOT NULL COMMENT '成绩'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='成绩表';

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `age` int(11) NOT NULL COMMENT '年龄',
  `gender` int(255) NOT NULL COMMENT '性别  0女  1男',
  `grade` int(255) NOT NULL COMMENT '年级',
  `class` varchar(255) NOT NULL COMMENT '班级',
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教师号\n',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `age` int(11) NOT NULL COMMENT '年龄',
  `gender` int(255) NOT NULL COMMENT '性别  0女  1男',
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师表';

SET FOREIGN_KEY_CHECKS = 1;
