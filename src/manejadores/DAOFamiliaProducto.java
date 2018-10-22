package manejadores;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import manejadores.DataBaseManager;
import objetos.FamiliaProducto;

public class DAOFamiliaProducto {
	private static final String INSERT_FAMILIA_PRODUCTO = "INSERT INTO FAMILIAS(ID_FAMILIA,NOMBRE,FAM_DESCRIPCION,FAM_INCOMPATI) values (?,?, ?, ?)";
	/*private static final String UPDATE_FAMILIA_PRODUCTO = "UPDATE EMPLEADOS SET ID_SUCURSAL = ?, CEDULA=?, NOMBRE=?, APELLIDO=?, SUELDO=? WHERE ID_EMPLEADO=?";
	private static final String DELETE_FAMILIA_PRODUCTO = "DELETE FROM EMPLEADOS WHERE ID_EMPLEADO=?"; */
	public static boolean insert(FamiliaProducto familiaProducto){
		try{
			PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(INSERT_FAMILIA_PRODUCTO);
			statement.setString(1, familiaProducto.getCodigo());
			statement.setString(2, familiaProducto.getNombre());
	
			statement.setString(3, familiaProducto.getDescripcion());
			statement.setString(4, familiaProducto.getIncompatible());
		
			int retorno = statement.executeUpdate();
								
			return retorno>0;
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
}

