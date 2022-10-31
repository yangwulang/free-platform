-- ----------------------------
-- Table structure for book_category
-- ----------------------------
DROP TABLE IF EXISTS `book_category`;
CREATE TABLE `book_category`
(
    `id`            varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '书籍分类id',
    `category_name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '分类名称',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book_chapter
-- ----------------------------
DROP TABLE IF EXISTS `book_chapter`;
CREATE TABLE `book_chapter`
(
    `id`            varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '章节id',
    `chapter_title` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '章节标题',
    `book_id`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL DEFAULT NULL COMMENT '书籍id',
    `from_path`     varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '来源',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `fk_book_info_id_for_chapter_book_id` (`book_id`) USING BTREE,
    CONSTRAINT `fk_book_info_id_for_chapter_book_id` FOREIGN KEY (`book_id`) REFERENCES `book_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '书籍章节'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info`
(
    `id`            varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '小说信息主键',
    `book_name`     varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '小说名称',
    `author`        varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL COMMENT '小说作者',
    `describe`      varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '描述',
    `status`        varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL DEFAULT NULL COMMENT '状态 （连载，完结）',
    `book_img_path` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL COMMENT '小说图片地址',
    `category`      varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL COMMENT '小说分类',
    `book_from`     varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '小说来源',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '书籍信息'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for chapter_content
-- ----------------------------
DROP TABLE IF EXISTS `chapter_content`;
CREATE TABLE `chapter_content`
(
    `id`              varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '书籍内容id',
    `chapter_id`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '章节id',
    `chapter_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci    NULL COMMENT '章节内容',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `fk_chapter_id_to_content_id` (`chapter_id`) USING BTREE,
    CONSTRAINT `fk_chapter_id_to_content_id` FOREIGN KEY (`chapter_id`) REFERENCES `book_chapter` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '章节内容'
  ROW_FORMAT = Dynamic;
