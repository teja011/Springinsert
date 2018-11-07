 package com.cg.spring.mvc.repo;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.spring.mvc.demo.Student;
@Repository
public class StudentRepositoryimpl implements StudentRepository {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Student addstudent(Student student) {
		
		manager.persist(student);
		manager.flush();
		
		return student;
	}

	

	/*@Override
	public List<Student> getStudentList() {
		String str="select student from Student student";
		TypedQuery<Student> query=manager.createQuery(str, Student.class);
		List<Student> list= query.getResultList();
		return list;
	}*/

	



	
}
