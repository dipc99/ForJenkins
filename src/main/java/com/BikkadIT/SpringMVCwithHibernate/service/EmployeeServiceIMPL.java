package com.BikkadIT.SpringMVCwithHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringMVCwithHibernate.dao.EmployeeDaoI;
import com.BikkadIT.SpringMVCwithHibernate.model.Employee;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeDaoI employeeDaoI;

	@Override
	public int saveEmployee(Employee emp) {
		
		int id = employeeDaoI.saveEmployee(emp);
		return id;
	}
}
