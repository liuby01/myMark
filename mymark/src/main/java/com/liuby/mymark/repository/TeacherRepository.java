package com.liuby.mymark.repository;

import com.liuby.mymark.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author Liuby
 * @date 2020-2-25 21:07
 */

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    Teacher findByTeaId(Integer teaId);
    Teacher getByTeaIdAndPwd (Integer teaId, String pwd);

}
