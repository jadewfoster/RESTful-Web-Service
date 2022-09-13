package com.qa.student.service;
import java.util.List;

import com.qa.student.entity.Student;
import com.qa.student.exception.StudentAlreadyExistsException;

public interface IStudentService {

		//CRUD operations
		public Student saveStudent(Student student)throws StudentAlreadyExistsException, StudentAlreadyExistsException;
		public List<Student> getAllStudents();
		public Student getStudentById(long studentId);
		public Student updateStudent(Student student);
		public boolean deleteStudent(long studentId);

	}
