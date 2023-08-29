package com.entity;

import java.util.List;

import org.hibernate.Session;

import com.provider.FactoryProvider;

public class Display {
	
	public List<Student> getStudent(){
		
		Session s = FactoryProvider.getFactory().openSession();
		List<Student> employees = s.createQuery("FROM Student",Student.class).list();
//		System.out.print(employees.get(1));
		return employees;
	}

}
