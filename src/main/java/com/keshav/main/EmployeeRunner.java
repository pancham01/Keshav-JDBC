package com.keshav.main;

import java.sql.SQLException;

import com.keshav.dao.EmployeeDao;
import com.keshav.dao.EmployeeDaoImpl;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException  {
		
		EmployeeDao edao = new EmployeeDaoImpl();

		Employee emp = new Employee(14, "Sunny", "female", 67000);
		

		edao.saveEmpByPS(emp);
		
		
		System.out.println("Query executed...............");

	}

}
