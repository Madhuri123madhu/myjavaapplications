package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptions
{
public static void main(String[] args) {
	

	
	//checked Exception:
//	Checked exceptions in Java are exceptions that the compiler requires you to handle explicitly
//	in your code. These exceptions are typically related to external factors that might cause issues
//	during the execution of your program. Here are some common checked exceptions in Java:
	
	
//	1.IoException:
//   This exception is thrown when an input or output operation (e.g., reading or writing to a file) 
//   encounters an issue.
//   Example: java.io.IOException
	
//	 try {
//         // FileReader constructor may throw IOException
//         BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
//         // Read from the file
//     } 
//	 catch (IOException e)
//	 {
//         // Handle or log the exception
//         e.printStackTrace();
//     }
	
	
//	2.FileNotFoundException:
//
//This is a specific type of IOException that occurs when attempting to access a file that does not 
//exist.
//Example: java.io.FileNotFoundException
	
//	try 
//	{
//        // FileReader constructor may throw FileNotFoundException
//        BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
//        // Read from the file
//    }
//	catch (FileNotFoundException e) 
//	{
//        // Handle or log the exception
//        e.printStackTrace();
//    } 
//	catch (IOException e) 
//	{
//        // Handle other IOExceptions
//        e.printStackTrace();
//    }
	
//	3.Sql Exception:SQLException is thrown when an error occurs while accessing a database.
//	 try 
//	 {
//         // JDBC code that may throw SQLException
//         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "user", "password");
//         // Perform database operations
//     } catch (SQLException e) 
//	 {
//         // Handle or log the exception
//         e.printStackTrace();
//     }
	
//	4.ClassNotFoundException:
//  ClassNotFoundException is thrown when trying to load a class dynamically using Class.forName()
//   but the class is not found.
	
//	try 
//	{
//        // Dynamic class loading that may throw ClassNotFoundException
//        Class<?> clazz = Class.forName("com.example.MyClass");
//        // Use the loaded class
//    } 
//	catch (ClassNotFoundException e) 
//	{
//        // Handle or log the exception
//        e.printStackTrace();
//    }
	
	

}
}
