package com.keshav.main;

import java.sql.SQLException;

import com.keshav.dao.EmployeeDao;
import com.keshav.dao.EmployeeDaoImpl;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException  {
		
		EmployeeDao edao = new EmployeeDaoImpl();

		Employee emp = new Employee(4, "Sunny", "female", 67000);
		
//		edao.saveEmp(emp);
//		edao.updateEmp(emp);
		
		edao.deleteEmpById(13);
		

		System.out.println("Query executed...............");

	}

}
