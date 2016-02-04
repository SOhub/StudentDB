package com.so.studentDB;

import java.util.List;
import org.hibernate.*;

public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Student student = new Student("Ivan");
		session.save(student);

		session.save(new Grade("Math", student, 1.0, 3.0, 2.0));
		session.save(new Grade("History", student, 4.0, 6.0, 5.0));

		session.getTransaction().commit();

		/*
		 * Query q = session.createQuery("From Grades ");
		 * 
		 * List<Grade> resultList = q.list(); System.out.println(
		 * "num of grades:" + resultList.size()); for (Grade next : resultList)
		 * { System.out.println("next grade: " + next); }
		 */
	}
}
