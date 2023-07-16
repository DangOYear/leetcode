package com.saltedfish.database;

/**
 *
 * 182. 查找重复的电子邮箱
 *
 * https://leetcode-cn.com/problems/duplicate-emails/
 * SQL架构
 * 编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
 *
 * 示例：
 *
 * +----+---------+
 * | Id | Email   |
 * +----+---------+
 * | 1  | a@b.com |
 * | 2  | c@d.com |
 * | 3  | a@b.com |
 * +----+---------+
 * 根据以上输入，你的查询应返回以下结果：
 *
 * +---------+
 * | Email   |
 * +---------+
 * | a@b.com |
 * +---------+
 */
SELECT Email
from Person
Group by Email
HAVING count(Email) > 1;
