package com.lulu.product;
import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

public class BusinessLogic {

 

	

 

	void createData() throws SQLException {

 

 

 

		Connection connection = ConnectDB.setupConnection();

 

 

 

		String query ="INSERT INTO product  ( id, name,cost) VALUES( ?,?, ?,?)";

 

 

 

//		String query = "insert values into employee(? ,? ,?)  ";

 

 

 

		PreparedStatement myStmt = connection.prepareStatement(query);

 

 

 

		myStmt.setInt(1, 111);

 

 

 

		myStmt.setString(2, "Tshirt");

 

 

 

		myStmt.setInt(3, 400);

 

 

 

		

 

 

 

 

 

 

 

		int success = myStmt.executeUpdate();

 

 

 

		System.out.println("Added Successfully " + success);

 

 

 

     	}

 

 

 

		void readData() throws SQLException {

 

 

 

			Connection connection=ConnectDB.setupConnection();

 

 

 

			

 

 

 

			 java.sql.Statement statement;

 

 

 

			 statement = connection.createStatement();

 

 

 

	         ResultSet resultSet;

 

 

 

	         resultSet = statement.executeQuery(

 

 

 

	             "select * from product  where id>=1");

 

 

 

	         int id;

 

 

 

	         String name;

 

 

 

	         int  cost;

 

 

 

	      

 

 

 

	         while (resultSet.next()) {

 

 

 

	             id = resultSet.getInt("id");

 

 

 

	             name = resultSet.getString("name");

 

 

 

	             cost= resultSet.getInt("cost");

 

 

 

	    

 

 

 

	             System.out.println("id : " + id

 

 

 

	                                + " name : " + name +" cost:"+cost);
	         }
		}

	             void updateData() throws SQLException {

	     			Connection connection = ConnectDB.setupConnection();

	     			String query = "update product set name = ? where id = ? ";

	     			PreparedStatement myStmt = connection.prepareStatement(query);

	     			myStmt.setString(1, "waterBottle");

	     			myStmt.setInt(2, 333);

	     			boolean success = myStmt.execute();

	     			System.out.println("Updated Successfully " + success);

	     			

	     		}

	     		void deleteData() throws SQLException {

	     			Connection connection = ConnectDB.setupConnection();

	     			String query = "delete from product where id = ? ";

	     			PreparedStatement myStmt = connection.prepareStatement(query);

	     			myStmt.setInt(1, 111);

	     			boolean success = myStmt.execute();

	     			System.out.println("Deleted Successfully " + success);

	     			

	     		}

 

 

	               
 

 

 

             }

 

