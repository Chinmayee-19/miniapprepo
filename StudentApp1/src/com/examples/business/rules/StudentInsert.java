package com.examples.business.rules;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.examples.business.data.StudentDAO;

public class StudentInsert {
	public static void main(String[] args) throws SQLException  {
	StudentDAO sd=new StudentDAO();
	String data="Insert into Student_Master(Stu_Roll_no,Stu_name,Stu_gender,math_marks,phy_marks,chem_marks,comp_marks,email,city) values(?,?,?,?,?,?,?,?,?)";
	Connection conn=sd.getConnected();
	PreparedStatement s=sd.conn.prepareStatement(data);
	s.setInt(1, Integer.parseInt(args[0]));
	s.setString(2,args[1]);
	s.setString(3,args[2]);
	s.setInt(4, Integer.parseInt(args[3]));
	s.setInt(5, Integer.parseInt(args[4]));
	s.setInt(6, Integer.parseInt(args[5]));
	s.setInt(7,Integer.parseInt(args[6]));
	s.setString(8,args[7]);
	s.setString(9,args[8]);
	s.executeUpdate();
	System.out.println("User updated");
	
}
}
