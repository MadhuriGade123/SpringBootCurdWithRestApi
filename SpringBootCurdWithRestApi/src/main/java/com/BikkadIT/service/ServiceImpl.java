package com.BikkadIT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.dao.EmployeeDaoI;
import com.BikkadIT.model.Employee;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private EmployeeDaoI empDaoI;

	@Override
	public Employee saveEmp(Employee employee) {
		
		return null;
	}

	@Override
	public List<Employee> saveAllEmp(List<Employee> employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

}