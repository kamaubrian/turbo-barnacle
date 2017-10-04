package com.src.brian.Model;
import java.sql.*;


public abstract class Base {
    public static String dbUrl ="jdbc:mysql://localhost:3306/Fantastic?useSSL=false?";
    public static String dbUsername ="root";
    public static String dbPassword="wamatu";
    public static String dbDriver="com.mysql.cj.Driver";
    protected  Connection conn = null;

    protected final boolean dbConnect(){
        try{

            Class.forName(dbDriver);
            conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Connection Error"+ex.getMessage());
            return  false;
        }

        return true;
    }



}
