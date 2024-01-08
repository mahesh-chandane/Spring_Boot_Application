package com.springboot.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{

//	void findAll(List<Teacher> teachers);

}
