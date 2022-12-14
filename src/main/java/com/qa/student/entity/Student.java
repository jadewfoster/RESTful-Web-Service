package com.qa.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Student")

public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Student ID")
private long studentId;

@Column(name = "First Name")
private String firstName;

@Column(name = "Last Name")
private String lastName;

@Column(name = "Date of Birth")
private String dateOfBirth;

@Column(name = "Total Marks")
private int totalMarks;

@Column(name = "Percentage Marks")
private double percentageMarks;

public String getfirstName() {
	// TODO Auto-generated method stub
	return null;
}


}
