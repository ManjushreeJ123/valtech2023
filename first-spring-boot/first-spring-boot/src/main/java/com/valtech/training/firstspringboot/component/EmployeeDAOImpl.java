package com.valtech.training.firstspringboot.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import javax.sql.DataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
 
 
//CRUD
//Create
//read
//update
//delete
 
@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	
	public class EmployeeRowMapper implements RowMapper<Employee> {
 
		@Override
		public Employee mapRow(ResultSet rs,int rowNum) throws SQLException {
			//SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setAge(rs.getInt(3));
			e.setExperience(rs.getInt(4));
			e.setSeniority(rs.getInt(5));
			e.setSalary(rs.getInt(6));
			return e;
		}
 
	}
 
	@Autowired
	private DataSource datasource;
	
	@Override
	public long count()  {
		String countQry = "Select count(id) from Employee";
		return new JdbcTemplate(datasource).queryForObject(countQry,Long.class);
 
	}
 
	@Override
	public void deleteEmployee(int id)  {
		String deleteQry="DELETE FROM EMPLOYEE WHERE ID = ?";
		new JdbcTemplate(datasource).update(deleteQry, id);
		
 
	}
 
	@Override
	public void updateEmployee(Employee emp)  {
		String updateQry="UPDATE EMPLOYEE SET NAME= ? , AGE = ? , EXPERIENCE = ? , SENIORITY = ? ,SALARY = ? WHERE ID = ?";
		new JdbcTemplate(datasource)
		.update(updateQry,emp.getName(),emp.getAge(),emp.getExperience(),emp.getSeniority(),emp.getSalary(),emp.getId());
	}
 
	@Override
	public void createEmployee(Employee emp) {
		String createQry="INSERT INTO EMPLOYEE (NAME,AGE,EXPERIENCE,SENIORITY,SALARY) VALUES (?,?,?,?,?)";
	new JdbcTemplate(datasource).update(createQry,emp.getName(),emp.getAge(),emp.getExperience(),emp.getSeniority(),emp.getSalary());
	}
	
 
 
	@Override
	public List<Employee> getAllEmployees()  {
		String selectAllQry="SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE";
		return new JdbcTemplate(datasource).query(selectAllQry,new EmployeeRowMapper());
		
 
	}
 
	@Override
	public Employee getEmployee(int id)  {
		String selectQry="SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID= ?";
		return new JdbcTemplate(datasource).queryForObject(selectQry,new EmployeeRowMapper());
	}
 
 
	
 
}


//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowCallbackHandler;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//import com.valtech.training.firstspringboot.component.EmployeeDAOImpl.EmployeeRowMapper;
////CRUD
////create
////read
////update
////delete
//@Component
//public class EmployeeDAOImpl implements EmployeeDAO  {
//	public class EmployeeRowMapper implements RowMapper<Employee>{
////"SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY"
//		@Override
//		public void mapRow(ResultSet rs,int rowNum) throws SQLException {
//		
//			Employee e = new Employee();
//			e.setId(rs.getInt(1));
//			e.setName(rs.getString(2));
//			e.setAge(rs.getInt(3));
//			e.setExperience(rs.getInt(4));
//			e.setSeniority(rs.getInt(5));
//			e.setSalary(rs.getInt(6));
//
//		}
//
//	}
//	@Autowired
//	private DataSource dataSource;
//	
//	public long count() {
//		String countQry = "SELECT COUNT(ID) FROM EMPLOYEE";
//		return new JdbcTemplate(datasource).queryForObject(countQry, Long.class);
//	}
//	}
//	
////	
//@Override
//	public void deleteEmployee(int id) {
//		String deleteQry = "DELETE FROM EMPLOYEE WHERE ID = ?";
//		new JdbcTemplate(datasource).update(deleteQry,id);
//}
////		Connection conn = getConnection();
////		PreparedStatement ps = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
////		ps.setInt(1, id);
////		int rowsUpdated = ps.executeUpdate();
////		System.out.println("Rows Updated "+rowsUpdated);
////		conn.close();
////		
////		
////		
////		
////	}
////	
////	@Override
//public void updateEmployee(Employee emp){//variable
//	String updateQry = "UPDATE EMPLOYEE SET NAME = ?, AGE = ?,EXPERIENCE = ?, SENIORITY = ?, SALARY = ? WHERE ID =?";
//	new JdbcTemplate(datasource).update(createQry,emp.getName(), emp.getAge(),emp.getExperience(),emp.getSeniority(),emp.getSalary())
//}
////		Connection conn = getConnection();
////		PreparedStatement ps = conn.prepareStatement
////				("UPDATE EMPLOYEE SET NAME = ?, AGE = ?,EXPERIENCE = ?, SENIORITY = ?, SALARY = ? WHERE ID =?");
////		populatePreparedStatementfromEmployee(emp, ps);
////		ps.setInt(6,  emp.getId());
////		int rowsUpdated = ps.executeUpdate();
////		System.out.println("Rows Updated "+rowsUpdated);
////		conn.close();
////		
////	}
//	@Override
//	public void createEmployee(Employee emp)throws SQLException {
//		String CREATEQry =INSERT INTO EMPLOYEE (NAME,AGE,EXPERIENCE,SENIORITY,SALARY) VALUES( ?,?,?,?,? )";"
//				new JdbcTemplate(datasource).update(createQry,emp.getName(), emp.getAge(),emp.getExperience(),emp.getSeniority(),emp.getSalary());	
//				
//	}
////		Connection conn = getConnection();
////		PreparedStatement ps = conn.prepareStatement
////				("INSERT INTO EMPLOYEE (NAME,AGE,EXPERIENCE,SENIORITY,SALARY) VALUES( ?,?,?,?,? )");
////		populatePreparedStatementfromEmployee(emp, ps);
////		int rowsUpdated = ps.executeUpdate();
////		System.out.println("Rows Updated "+rowsUpdated);
////		conn.close();
////		
////		
////	}
////
////	private void populatePreparedStatementfromEmployee(Employee emp, PreparedStatement ps) throws SQLException {
////		ps.setString(1,  emp.getName());
////		ps.setInt(2,  emp.getAge());
////		ps.setInt(3,  emp.getExperience());
////		ps.setInt(4,  emp.getSeniority());
////		ps.setInt(5,  emp.getSalary());
////	}
////	
//@Override
//	public List<Employee> getAllEmployees(){
//	String selectAllQry = "SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE";
//	return new JdbcTemplate(datasource).query(selectAllQry, new EmployeeRowMapper());
//	}
//
//
//@Override
//public Employee getEmployee(int id) {
//	String selectQry = "SELECT ID, NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE";
//	return new JdbcTemplate(dataSource).query(selectQry,new EmployeeRowMapper ());
//}
////		Connection conn = getConnection();
////		PreparedStatement ps = conn.prepareStatement("SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE ");
////		ResultSet rs = ps.executeQuery();
////		List<Employee> emps = new ArrayList<>();
////		while(rs.next()) {
////			emps.add(mapRowToEmployee(rs));
////		
////	}
////		conn.close();
////		return emps;
////	}
////	
////	@Override
////	public Employee getEmployee(int id) throws SQLException {
////		Connection conn=getConnection();
////		PreparedStatement ps = conn.prepareStatement("SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID = ?");
////		ps.setInt(1, id);
////		ResultSet rs = ps.executeQuery();
////		if(rs.next()) {
////			Employee e = mapRowToEmployee(rs);
////			conn.close();
////			return e;
////			
////			
////		}else {
////			System.out.println("NO Row with id = "+id+" found...");
////			return null;
////		}
////	}
////
////	private Employee mapRowToEmployee(ResultSet rs) throws SQLException {
////		Employee e = new Employee();
////		e.setId(rs.getInt(1));
////		e.setName(rs.getString(2));
////		e.setAge(rs.getInt(3));
////		e.setExperience(rs.getInt(4));
////		e.setSeniority(rs.getInt(5));
////		e.setSalary(rs.getInt(6));
////		return e;
////	}
////	
////	static {
////		try {
////			Class.forName("com.mysql.jdbc.Driver");
////		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
////		}
////	}
////private Connection getConnection() throws SQLException {
////		return DriverManager.getConnection("jdbc:mysql://localhost:3306/valtech2023?useSSL=false","root","root");//secure software layer
////		
////	}
////	public static void main(String[] args) throws Exception {
////		EmployeeDAO dao = new EmployeeDAOImpl();
//////			System.out.println(dao.getEmployee(1));
//////			System.out.println(dao.getEmployee(2));
////		
//////		
////	//	dao.createEmployee(new Employee("Xyz",35,1,1,20000));
//////		Employee e = dao.getEmployee(3);
//////		e.setSeniority(5);
//////		dao.updateEmployee(e);
////		dao.deleteEmployee(3);
////		System.out.println(dao.getAllEmployees());
////		dao.count();
////		System.out.println();
////	}
//////
//////	public int nextId(int id) throws SQLExpection{
//////		Connection conn=getConnection();
//////		PreparedStatement ps = conn.prepareStatement("SELECT MIN(ID) FROM EMPLOYEE WHERE ID > ?");
//////		ps.setInt(1, id);
//////		ResultSet rs = ps.executeQuery();
//////		if(rs.next()) {
//////			id=rs.getInt(1);
//////			return id;
//////		}
//////		con.close();
//////			
//////		
//////	}
////	
////		public long count() throws SQLException {
////
////			Connection conn=getConnection();
////
////			PreparedStatement ps=conn.prepareStatement("SELECT COUNT(ID) FROM EMPLOYEE");
////
////			ResultSet rs=ps.executeQuery();
////
////			rs.next() ;
////
////				long count=rs.getLong(1);
////
////	           
////System.out.println("count="+count);
////			
////
////		   conn.close();
////
////			return count;
////
////			
////
////		}
////
////		@Override
////		public int firstId() throws SQLException {
////			// TODO Auto-generated method stub
////			return 0;
////		}
////
////		@Override
////		public int lastId() throws SQLException {
////			// TODO Auto-generated method stub
////			return 0;
////		}
////
////		@Override
////		public int nextId(int id) throws SQLException {
////			// TODO Auto-generated method stub
////			return 0;
////		}
////
////		@Override
////		public int priveious(int id) throws SQLException {
////			// TODO Auto-generated method stub
////			return 0;
////		}
////	}
////	


