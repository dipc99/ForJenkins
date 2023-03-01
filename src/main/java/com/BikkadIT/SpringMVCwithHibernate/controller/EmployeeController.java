package com.BikkadIT.SpringMVCwithHibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.SpringMVCwithHibernate.model.Employee;
import com.BikkadIT.SpringMVCwithHibernate.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService ;

	@GetMapping("/preRegister")
	public String preRegister() {
		
		
		return "empReg";
		
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee emp, Model model) {
		int empID = employeeService.saveEmployee(emp);
		model.addAttribute("EMPID", empID);
		return "userSuccess";
		
	}
}
