package com.qa.student.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	Optional<Student> findByName(String firstName);
}
