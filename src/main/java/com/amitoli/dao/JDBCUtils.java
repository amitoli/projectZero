package com.amitoli.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtils {
    private static final String USERNAME = "SMS124";
    private static final String PASSWORD = "SMS124";
    private static final String URL = "jdbc:oracle:thin:@whf00cdc.in.oracle.com:1521/FCISBATPDB";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return connection;
    }

  /*  public static void main(String[] args) throws  SQLException{
        Connection connection = getConnection();
        System.out.println(connection.isValid(1));
        String insert = "INSERT INTO EMPLOYEE(name,employeeid,gender) VALUES('Tom Hanks','1996','Male')";
        PreparedStatement psmt = null;
        psmt = connection.prepareStatement(insert);
        psmt.executeUpdate();

        psmt.close();
        connection.close();
    }*/
}
