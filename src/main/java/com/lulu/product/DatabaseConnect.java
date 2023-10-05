package com.lulu.product;
import java.sql.Connection;



import java.sql.DriverManager;

 

import java.sql.ResultSet;

 

import java.sql.Statement;

 

 

 

public class DatabaseConnect {

 

 

 

	public static void main(String[] args) {

 

		// TODO Auto-generated method stub

 

		try {

 

			 Class.forName("com.mysql.cj.jdbc.Driver");

 

	         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lulu",

 

	             "root", "2017soma**&&//9482193");

 

	         Statement statement;

 

	         statement = connection.createStatement();

 

	         ResultSet resultSet;

 

	         resultSet = statement.executeQuery(

 

	             "select * from products");

 

	         int id;

 

	         String name;

	         int cost;

 

	         while (resultSet.next()) {

 

	             id = resultSet.getInt("id");

 

	             name = resultSet.getString("name");

 

	            

 

	             cost = resultSet.getInt("cost");

 

	             System.out.println("id : " + id

 

	                                + " name : " + name  + "id : " + id);

 

	         }

 

 

 

 

 

 

 

 

 

			}catch(Exception E) {

 

 

 

			}

 

 

 

	}

 

 

 

}



