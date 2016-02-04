package com.so.studentDB;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "grade1")
	private Double grade1;
	@Column(name = "grade2")
	private Double grade2;
	@Column(name = "average")
	private Double average;

	@ManyToOne
	private Student student;

	public Grade() {
	}

	public Grade(String name, Student student, Double grade1, Double grade2, Double average) {
		this.name = name;
		this.student = student;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.average = average;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade1() {
		return grade1;
	}

	public void setGrade1(Double grade1) {
		this.grade1 = grade1;
	}

	public Double getGrade2() {
		return grade2;
	}

	public void setGrade2(Double grade2) {
		this.grade2 = grade2;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
