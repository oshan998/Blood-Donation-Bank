/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

private final String URL ="jdbc:sqlserver://localhost:1433;databaseName=master;user=newuser;password=12345";
 
 private Connection conn;
 private static DatabaseConnection instance;
 private DatabaseConnection() {
 try {

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 conn = DriverManager.getConnection(URL);
 System.out.println("Database Connected");
 } catch (ClassNotFoundException ex) {
 System.out.println("Class is missing");
 } catch (SQLException ex) {
 System.out.println("Cannot connect");
 }
 }
 
 public static DatabaseConnection getSingleConnection() {
 try{
 if (instance == null) {
 instance = new DatabaseConnection();
 return instance;
 } else if (instance.conn.isClosed()) {
 instance = new DatabaseConnection();
 return instance;
 } else {
 return instance;
 }
 }catch(SQLException ex)
 {
 System.out.println("Something Went wrong with server");
 return null;
 }
 }
 
 public boolean Execute(String query) {
 try {
 Statement st = conn.createStatement();
 int result = st.executeUpdate(query);
 boolean status = (result > 0);
 return status;
 } catch (SQLException ex) {
 System.out.println("Cannot insert");
 return false;
 }
 }
 
 
 

}
   
