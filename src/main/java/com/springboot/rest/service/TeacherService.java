package com.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.rest.entity.Teacher;
import com.springboot.rest.repository.TeacherRepository;


@Service
public class TeacherService 
{
  @Autowired
	   TeacherRepository repository ;

    public Teacher saveTeacherData(Teacher teacher) {
	
	   return repository.save(teacher);
}
    
    
    public List<Teacher> SaveAllTeacher(List<Teacher> teachers)
    {
    	return repository.saveAll(teachers);
    }
    
    
    public  List<Teacher> getTeacherAll()
    {
    	return  repository.findAll();
			
    }
    
    public Teacher getByIdTeacher(int id)
    {
    	return repository.findById(id).orElse(null);
    }
    
   public Teacher deleteTeacherById(int id)
   {
	   repository.deleteById(id);
	     return null;
   }
   
   public Teacher updateTeacher(Teacher teacher)
   {
	   Teacher t=repository.findById(teacher.getId()).orElse(null);
       t.setName(teacher.getName());
       t.setSalary(teacher.getSalary());
	   return repository.save(t);
   
       
   
   }


	
}
