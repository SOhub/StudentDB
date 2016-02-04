package com.so.studentDB;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Grade> grades = new ArrayList<Grade>();

	public Student() {
		super();
	}

	public Student(String name) {
		this.name = name;
	}

	/*
	 * @Id
	 * 
	 * @GeneratedValue(generator="increment")
	 * 
	 * @GenericGenerator(name="increment", strategy = "increment")
	 * 
	 * @Column(name="id")
	 */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int i) {
		id = i;
	}

	public void setName(String s) {
		name = s;
	}

	public List<Grade> getStudents() {
		return grades;
	}

	public void setStudents(List<Grade> grades) {
		this.grades = grades;
	}
}
