package manejadores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import manejadores.DataBaseManager;
import objetos.Usuario;

public class DAOUsuario {
	
	private static final String INSERT_USUARIOS = "INSERT INTO USUARIOS (ID_USUARIO,NOMBRE,APELLIDO,NOM_ACCESO,CONSTRASENIA,CORREO,ID_PERFIL) values (?,?,?,?,?,?,?)";
	private static final String UPDATE_USUARIOS = "UPDATE USUARIOS SET NOMBRE=?, APELLIDO=?, NOM_ACCESO=?, CONTRASENIA=?,CORREO=?,ID_PERFIL=? WHERE ID_USUARIO=?";
	private static final String DELETE_USUARIOS = "DELETE FROM USUARIOS WHERE ID_USUARIO=?"; 
	
	
	public static boolean insert(Usuario usuario){
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(INSERT_USUARIOS);
			statement.setLong(1, usuario.getIdUsuario());
			statement.setString(2, usuario.getNombre());
			statement.setString(3, usuario.getApellido());
			statement.setString(4, usuario.getNomAcceso());
			statement.setString(5, usuario.getContrasenia());
			statement.setString(6, usuario.getCorreo());
			statement.setLong(7, usuario.getPerfil().getIdPerfil());
			
			int retorno = statement.executeUpdate();					
			return retorno>0;
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}

	}
	public static boolean edit(Usuario usuario){
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(UPDATE_USUARIOS);
			
			statement.setLong(1, usuario.getIdUsuario());
			statement.setString(2, usuario.getNombre());
			statement.setString(3, usuario.getApellido());
			statement.setString(4, usuario.getNomAcceso());
			statement.setString(5, usuario.getContrasenia());
			statement.setString(6, usuario.getCorreo());
			statement.setLong(7, usuario.getPerfil().getIdPerfil());
			
								
			int retorno = statement.executeUpdate();
								
			return retorno>0;
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	public static boolean delete(Usuario usuario){
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(DELETE_USUARIOS);
			statement.setLong(1, usuario.getIdUsuario());
			
			int retorno = statement.executeUpdate();
								
			return retorno>0;
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
}
	
	
	
	
	
