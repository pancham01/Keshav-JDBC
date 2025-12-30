package com.keshav.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.keshav.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final String INSERT_QUERY = "INSERT INTO EMPLOYEE (ID,NAME,GENDER,SALARY) VALUES(?,?,?,?)";
	private static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET NAME = ? , GENDER = ? , SALARY = ? WHERE ID = ?";
	private static final String SELECT_QUERY = "SELECT * FROM EMPLOYEE";
	private static final String SELECT_BY_NAME = "SELECT * FROM EMPLOYEE WHERE NAME = '%s'";

	static Connection connection = null;

	static {

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveEmpByPS(Employee e) {

		try (PreparedStatement ps = connection.prepareStatement("INSERT INTO EMPLOYEE (ID,NAME,GENDER,SALARY) VALUES(?,?,?,?)")) {

			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getGender());
			ps.setInt(4, e.getSalary());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}


	@Override
	public void updateEmp(Employee e) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_QUERY);

			ps.setString(1, e.getName());
			ps.setString(2, e.getGender());
			ps.setInt(3, e.getSalary());
			ps.setInt(4, e.getId());
			
			ps.executeUpdate();
			
			
	}


	@Override
	public void deleteEmpById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Employee getEmpById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee getEmpByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void printEmpByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Employee> getAllEmps() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllEmps() throws SQLException {

		Statement statement = connection.createStatement();
//		statement.executeQuery(SELECT_QUERY);
		ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

		while (resultSet.next()) {
			System.out.println("ID = " + resultSet.getInt(1) + "\t NAME = " + resultSet.getString(2) + "\t GENDER = "
					+ resultSet.getString(3) + "\t SALARY = " + resultSet.getInt(4));
		}
		System.err.println(SELECT_QUERY);

	}
}
