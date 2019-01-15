/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-14 22:47:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `about_me`
-- ----------------------------
DROP TABLE IF EXISTS `about_me`;
CREATE TABLE `about_me` (
  `id` int(2) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `thumbnail` int(11) NOT NULL COMMENT '缩略图',
  `content` text NOT NULL COMMENT '主要内容(html)',
  `sketch` varchar(120) NOT NULL COMMENT '简述(纯文本)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of about_me
-- ----------------------------

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `article_classification_id` int(11) NOT NULL COMMENT '文章分类id',
  `title` varchar(30) NOT NULL COMMENT '文章标题',
  `content` text NOT NULL COMMENT '文章内容',
  `sketch` varchar(120) NOT NULL COMMENT '文章简述',
  `author` int(11) NOT NULL COMMENT '文章作者用户id',
  `create_time` datetime NOT NULL COMMENT '发布时间',
  `read_num` int(11) NOT NULL COMMENT '阅读数',
  `good_num` int(11) NOT NULL COMMENT '点赞数',
  `order` int(3) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for `article_classification`
-- ----------------------------
DROP TABLE IF EXISTS `article_classification`;
CREATE TABLE `article_classification` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `classification_name` varchar(10) NOT NULL COMMENT '分类名称',
  `order` int(3) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_classification
-- ----------------------------

-- ----------------------------
-- Table structure for `authority`
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `option` varchar(20) NOT NULL COMMENT '权限取值',
  `describe` varchar(50) NOT NULL COMMENT '权限描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluate`
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(10) NOT NULL COMMENT '评价人姓名',
  `create_time` datetime NOT NULL COMMENT '评价时间',
  `content` varchar(200) NOT NULL COMMENT '评价内容',
  `evaluate_type` int(2) NOT NULL COMMENT '评价类型(0:相册1:文章)',
  `answer_content` varchar(500) DEFAULT NULL COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluate
-- ----------------------------

-- ----------------------------
-- Table structure for `label`
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(16) NOT NULL COMMENT '标签名称',
  `order` int(3) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of label
-- ----------------------------

-- ----------------------------
-- Table structure for `label_article`
-- ----------------------------
DROP TABLE IF EXISTS `label_article`;
CREATE TABLE `label_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `label_id` int(11) NOT NULL COMMENT '标签id',
  `article_id` int(11) NOT NULL COMMENT '文章id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of label_article
-- ----------------------------

-- ----------------------------
-- Table structure for `leaving_message`
-- ----------------------------
DROP TABLE IF EXISTS `leaving_message`;
CREATE TABLE `leaving_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(10) NOT NULL COMMENT '留言人名称',
  `email` varchar(30) NOT NULL COMMENT '联系邮箱',
  `create_time` datetime NOT NULL COMMENT '留言时间',
  `content` varchar(200) NOT NULL COMMENT '留言内容',
  `answer_content` varchar(500) DEFAULT NULL COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leaving_message
-- ----------------------------

-- ----------------------------
-- Table structure for `photo`
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `album` int(11) NOT NULL COMMENT '所属套图id',
  `describe` varchar(20) NOT NULL COMMENT '图片描述',
  `upfile_id` int(11) NOT NULL COMMENT '上传文件id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of photo
-- ----------------------------

-- ----------------------------
-- Table structure for `photo_album`
-- ----------------------------
DROP TABLE IF EXISTS `photo_album`;
CREATE TABLE `photo_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(20) NOT NULL COMMENT '套图标题',
  `describe` varchar(60) NOT NULL COMMENT '套图简述',
  `thumbnail` int(11) NOT NULL COMMENT '缩略图',
  `content` text NOT NULL COMMENT '内容全文(html)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of photo_album
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `option` varchar(20) NOT NULL COMMENT '角色取值',
  `describe` varchar(50) NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `role_authority`
-- ----------------------------
DROP TABLE IF EXISTS `role_authority`;
CREATE TABLE `role_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `authority_id` int(11) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_authority
-- ----------------------------

-- ----------------------------
-- Table structure for `upfile`
-- ----------------------------
DROP TABLE IF EXISTS `upfile`;
CREATE TABLE `upfile` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `file_path` varchar(200) NOT NULL COMMENT '存储路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of upfile
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `login_name` varchar(20) NOT NULL COMMENT '登陆名',
  `password` varchar(30) NOT NULL COMMENT '密码',
  `user_name` varchar(6) NOT NULL COMMENT '用户名',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
