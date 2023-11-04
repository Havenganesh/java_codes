package psqlDBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	static Connection c = null;
	static Statement stmnt = null;

	public static void main(String args[]) {
		createConnection();
//		CompanyObj cmpny=new CompanyObj(2, "soly", 26, "mosco", 18000.0f);
//		objTableCreate(cmpny.createTable());
//		objInsert(cmpny.data());

		String query=CompanyObj.selectQury();
		ResultSet rslt= readObj(query);
		CompanyObj.display(rslt);
		

		
	}

	static void createConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "password");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		try {
			stmnt = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void createTable(String tablename) {
		try {
			String query = "CREATE TABLE " + tablename + "(ID INT PRIMARY KEY     NOT NULL,"
					+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
					+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";
			stmnt.execute(query);
			stmnt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static void execute(String query) {
		try {
			stmnt.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void insertValues() {
		try {
			String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
					+ "VALUES (11, 'Paul', 32, 'California', 20000.00 );";
			stmnt.executeUpdate(sql);

			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (22, 'Allen', 25, 'Texas', 15000.00 );";
			stmnt.executeUpdate(sql);

			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (31, 'Teddy', 23, 'Norway', 20000.00 );";
			stmnt.executeUpdate(sql);

			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (41, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
			stmnt.executeUpdate(sql);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	static void objInsert(String sql) {
		try {
			stmnt.executeUpdate(sql);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	static ResultSet readObj(String query) {
		ResultSet rs=null;
		try {
			 rs = stmnt.executeQuery( query );     
		}catch (Exception e) {
		System.out.println(e);
		}
		return rs;
	}
	
	static void objTableCreate(String query) {
		try {
			stmnt.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
