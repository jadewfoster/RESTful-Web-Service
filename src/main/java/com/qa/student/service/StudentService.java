package com.qa.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.student.entity.Student;
import com.qa.student.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	StudentRepository stuRepository;

	@Override
	public Student saveStudent(Student student) {
		return stuRepository.save(student);	
	
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		return false;
	}

}