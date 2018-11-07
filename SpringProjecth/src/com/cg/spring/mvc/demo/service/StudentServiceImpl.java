package com.cg.spring.mvc.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.mvc.repo.StudentRepository;


import com.spring.mvc.demo.Student;
@Service
@Transactional

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;
	
	
	public StudentRepository getRepo() {
		return repo;
	}


	public void setRepo(StudentRepository repo) {
		this.repo = repo;
	}


	@Override
	public Student addstudent(Student student) {
		
		return repo.addstudent(student);
	}


	

	/*@Override
	public List<Student> getStudentList() {
		
		return repo.getStudentList();
	}*/


	

}
