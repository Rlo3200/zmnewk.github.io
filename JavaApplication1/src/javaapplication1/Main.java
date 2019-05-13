package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
    public static void main(String[] args)
    {
        Connection myconObj=null;
        Statement mystatObj = null;
        ResultSet myresObj = null;
        String query = "Select * from PAYMENT";

        try
        {
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/ISD2", "Tom", "password");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);
            while(myresObj.next())
            {
                 int id = myresObj.getInt("ID");
                 String Cardholdername = myresObj.getString("Cardholdername");
                 int cardnumber = myresObj.getInt("Cardnumber");
                 int CVV = myresObj.getInt("CVV");
                 System.out.println(id + "" + Cardholdername + "" + cardnumber + "" + CVV);
            }
        }
        catch (SQLException e)
                {
                    e.printStackTrace();
                }
    }
}
