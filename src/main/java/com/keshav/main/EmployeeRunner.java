package com.keshav.main;

import java.sql.SQLException;

import com.keshav.dao.EmployeeDao;
import com.keshav.dao.EmployeeDaoImpl;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException  {
		
		EmployeeDao edao = new EmployeeDaoImpl();

//		Employee emp = new Employee(4, "Sunny", "female", 67000);
		

//		edao.printAllEmps();
		
//		System.out.println(edao.getEmpById(3));
//		System.out.println(edao.getEmpByName("Sunny"));
		
		edao.printEmpByName("Sunny' or '1=1");
		System.out.println("Query executed...............");

	}

}
