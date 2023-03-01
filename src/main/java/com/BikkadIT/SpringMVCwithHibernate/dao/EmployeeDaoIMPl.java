package com.BikkadIT.SpringMVCwithHibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringMVCwithHibernate.model.Employee;

@Repository
public class EmployeeDaoIMPl implements EmployeeDaoI {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public int saveEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		int save = (int) session.save(emp);
		session.getTransaction().commit();
	//	session.close();
		return save;
	}

	

}
