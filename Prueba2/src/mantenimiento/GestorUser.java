package mantenimiento;

import bean.Usuario;
import utils.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class GestorUser {
	
	public Usuario obtenerUsuario(Usuario usu) {
		
		Usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		
		try {
			
			con = Conexion.getConexion();
			String sql = "select*from usuario where username = ? and password = ? ";
			pst = con.prepareStatement(sql);
			
			pst.setString(1, usu.getUsername());
			pst.setString(2,usu.getPassword());
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));				
			}
			
			
		}catch(Exception e){
			
			System.out.println("Error al obtener usuario");
		}
		
		return usuario;
	}

}
