package utils;

import java.sql.Connection;
import java.sql.DriverManager;






import java.sql.SQLException;

public class Conexion {
	public static Connection getConexion() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/platinum","root","root");
			
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error --> al cargar Driver");
			
			e.printStackTrace();
			
			
		} catch (SQLException e) {
			
			System.out.println("Error --> al conectar con la BD");
			
			e.printStackTrace();
		}		
		
		return con;
	}
}
