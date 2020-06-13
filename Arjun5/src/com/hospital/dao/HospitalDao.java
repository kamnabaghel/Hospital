package com.hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalDao {
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	 public static boolean validate(String name, String pass) {        
	        boolean status = false;
	        //Connection con = null;
	        PreparedStatement pst = null;
	        ResultSet rs = null;

	        
	        try {
	          
	        	Connection con=getCon();
				PreparedStatement ps=con.prepareStatement("select * from users where name=? and password=?");
	                    
	            ps.setString(1, name);
	            ps.setString(2, pass);

	            rs = ps.executeQuery();
	            status = rs.next();

	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	          
	            if (pst != null) {
	                try {
	                    pst.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return status;
	    }

}
