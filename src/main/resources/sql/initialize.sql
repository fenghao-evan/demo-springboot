CREATE DATABASE IF NOT EXISTS demo DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

CREATE TABLE If Not Exists `demo` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '唯一标识',
  `year` int NOT NULL COMMENT 'year',
  `create_user` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建人ID',
  `create_time` bigint DEFAULT NULL COMMENT '创建时间',
  `last_update_user` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后更新人',
  `last_update_time` bigint DEFAULT NULL COMMENT '最后更新时间',
  `is_deleted` int DEFAULT '0' COMMENT '0 存在 1 删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='质量目标 config template';