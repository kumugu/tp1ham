 package db;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;

 public class DatabaseConnector {
     private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
     private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
     private static final String USER = "basic";
     private static final String PASSWORD = "1234";

     static {
         try {
             // JDBC 드라이버 로드 (오라클 JDBC 드라이버)
             Class.forName(DRIVER);
         } catch (ClassNotFoundException e) {
             System.err.println("Oracle JDBC Driver not found.");
             e.printStackTrace();
         }
     }

     public static Connection getConnection() {
         try {
             // 데이터베이스 연결
             return DriverManager.getConnection(URL, USER, PASSWORD);
         } catch (SQLException e) {
             System.err.println("Connection failed: " + e.getMessage());
             throw new RuntimeException(e);
         }
     }
 }
