package manejadores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


import manejadores.DataBaseManager;
import objetos.Ciudad;

public class DAOCiudad {
	
	private static final String ALL_CIUDADES = "SELECT * FROM CIUDADES";
	private static final String INSERT_CIUDADES = "INSERT INTO CIUDADES (ID_CIUDAD,NOMBRE) values (?,?)";
//	private static final String UPDATE_EMPLEADO = "UPDATE CIUDADES SET ID_CIUDAD = ?, CEDULA=?, NOMBRE=?, APELLIDO=?, SUELDO=? WHERE ID_EMPLEADO=?";
//	private static final String DELETE_EMPLEADO = "DELETE FROM EMPLEADOS WHERE ID_EMPLEADO=?"; 
//	private static final String EMPLEADOS_ID = "SELECT * FROM EMPLEADOS WHERE ID_EMPLEADO=?";
	
	//Empleado pasado por parámetro
	public static boolean insert(Ciudad ciudad){
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(INSERT_CIUDADES);
			statement.setString(1, ciudad.getCodigo());
			statement.setString(4, ciudad.getNombre());
			
			int retorno = statement.executeUpdate();
								
			return retorno>0;
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	

	//Obtiene todos los empleados almacenados
	/*public static LinkedList<Ciudad> findAll(){
		LinkedList<Ciudad> ciudades = new LinkedList<>();
		
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(ALL_CIUDADES);
									
			ResultSet resultado = statement.executeQuery();
			
			while (resultado.next()){
				
				Ciudad ciudad = getCiudadFromResultSet(resultado);				
				ciudades.add(ciudad);				
			}
			return ciudades;
		}
		catch(SQLException e){
			e.printStackTrace();
			return null; 
		}*/
		
		
	}
	



