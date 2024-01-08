package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entity.Teacher;
import com.springboot.rest.service.TeacherService;

@RestController
public class TeacherController
{
	@Autowired
	TeacherService service;
     
	@PostMapping("/save")
     public  Teacher AddTeacher(@RequestBody Teacher teacher)
     {
    	 return service.saveTeacherData(teacher);
     }
	
	@PostMapping("/saveAll")
    public  List<Teacher> addAllTeacher(@RequestBody List<Teacher> teachers)
    {
   	 return service.SaveAllTeacher(teachers);
    }
	
	@GetMapping("/getAll")
	public List<Teacher> getAllteacher()
	{
		return service.getTeacherAll();
		
	}
	@GetMapping("/getAll/{id}")
	public Teacher getId(@PathVariable int id)
	{
		return service.getByIdTeacher(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Teacher deleteById(@PathVariable int id)
	{
		 return service.deleteTeacherById(id);
	}
	
	@PutMapping("/update")
	public Teacher updateByIdTeacher(@RequestBody Teacher teacher )
	{
		return service.updateTeacher(teacher);
	}
	
	

}
