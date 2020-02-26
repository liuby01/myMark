package com.liuby.mymark.repository;

import com.liuby.mymark.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Liuby
 * @date 2020-2-26 18:16
 */

public interface MarkRepository extends JpaRepository<Mark,Integer> {

    @Query(value = "SELECT c.name AS 课程名, s.name AS 学生姓名, m.score AS 成绩 FROM mark m, course c,student s WHERE m.cou_id = c.cou_id AND m.stu_id = s.stu_id", nativeQuery = true)
    List getAll();

}
