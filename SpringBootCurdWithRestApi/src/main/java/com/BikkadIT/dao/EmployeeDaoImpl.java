package com.BikkadIT.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDaoI {
	@Autowired
	private SessionFactory sf;

	@Override
	public Employee saveEmpDao(Employee employee) {
		System.out.println("persistance Layer");
		System.out.println(employee);
		Session session = sf.openSession();
		session.beginTransaction();
		Employee id = (Employee) session.save(employee);
		System.out.println(id);
		session.getTransaction().commit();
		return id;

	}

	@Override
	public List<Employee> getAllEmployeeDao(List<Employee> employee) {
        Session session = sf.openSession();
        String hql="from Employee";
        Query query = session.createQuery(hql);
        List resultList = query.getResultList();
         return resultList;
	}

	@Override
	public List<Employee> LoginCheck(Integer id, String name) {
		Session session = sf.openSession();
		String hql="from Employee";
		Query query = session.createQuery(hql);
		List<Employee> emp=query.getResultList();
		
		for(Employee emp1:emp) {
			if((emp1.getEmpId()==id) && (emp1.getEmpName().equals(name))) {
				return emp;
			}
		}
		
		return null;
		
	}
}
	
