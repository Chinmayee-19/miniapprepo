package com.examples.business.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
public Connection conn;
    private Statement stmt;
    private static final String uname="root";
    private static final String password="root123";

    private static final String driver="com.mysql.jdbc.Driver";
    private static final String dburl="jdbc:mysql://localhost/pwcdb";

    public StudentDAO()
    {
      try
      {
         Class.forName(driver);
         conn=DriverManager.getConnection(dburl,uname,password);
         stmt=conn.createStatement();
      }catch(Exception e)
      {
    	  System.out.println("<StudentDAO>Exception ="+e);
      }
    }
      public ArrayList fetchStudentData()
      {
    	  ResultSet rs = null;
    	  ArrayList list = null;
    	  Student stud = null;
    	  try
    	  {
    		  rs = stmt.executeQuery("select Stu_roll_no,Stu_name,Stu_gender,math_marks,phy_marks,chem_marks,comp_marks,email,city from Student_Master");
    		  list = new ArrayList();
    		  while(rs.next())
    		  {
    			  stud = new Student();
    			  stud.setRollNo(rs.getInt("Stu_roll_no"));
    			  stud.setName(rs.getString("Stu_name"));
    			  stud.setGender(rs.getString("Stu_gender"));
    			  stud.setMaths(rs.getInt("math_marks"));
    			  
    			  stud.setPhysics(rs.getInt("phy_marks"));
    			  stud.setChemistry(rs.getInt("chem_marks"));
    			  stud.setCompscience(rs.getInt("comp_marks"));
    			  stud.setEmail(rs.getString("email"));
    			  stud.setCity(rs.getString("city"));
    			  list.add(stud);
    		  }
    		  
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("<fetchStudentData>Exception ="+e);
    	  }
    	  return list;
      }
	public Connection getConnected() {
		// TODO Auto-generated method stub
		return conn;
	}
	

   

}
