package com.liuby.mymark.repository;

import com.liuby.mymark.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

/**
 * @author Liuby
 * @date 2020-2-25 16:49
 */

public interface CourseRepository extends JpaRepository<Course,Integer> {

    @Query(value = "SELECT c.cou_id, c.name AS course, t.name AS teacher FROM course c, teacher t WHERE c.tea_id = t.tea_id", nativeQuery = true)
    List getAll();



}
