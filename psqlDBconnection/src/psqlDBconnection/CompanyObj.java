package psqlDBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyObj {
	int id;
	String name;
	int age;
	String address;
	float salary;
	
	public CompanyObj(int id,String name,int age,String address,float salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
		this.salary=salary;
	}
	
	 public String createTable() {
		return "CREATE TABLE " + "Company" + "(ID INT PRIMARY KEY     NOT NULL,"
				+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
				+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";
	}
	public String data() {
		return "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
				+ "VALUES ("+id+", '"+name+"', "+age+", '"+address+"', "+salary+" );";
	}
	public static  String selectQury() {
		return "SELECT * FROM COMPANY;";
	}
	public static void display(ResultSet rs) {
		  try {
			while ( rs.next() ) {
			        int id = rs.getInt("id");
			        String  name = rs.getString("name");
			        int age  = rs.getInt("age");
			        String  address = rs.getString("address");
			        float salary = rs.getFloat("salary");
			        System.out.println( "ID = " + id );
			        System.out.println( "NAME = " + name );
			        System.out.println( "AGE = " + age );
			        System.out.println( "ADDRESS = " + address );
			        System.out.println( "SALARY = " + salary );
			        System.out.println();
			     }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
