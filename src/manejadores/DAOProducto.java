package manejadores;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import manejadores.DataBaseManager;
import objetos.Producto;

public class DAOProducto {
		private static final String INSERT_PRODUCTO = "INSERT INTO PRODUCTOS (ID_PRODUCTO,NOMBRE,PRO_STOCK_TOTAL,PRO_STOCK_MINIMO,PRO_SEGMENTACION,PRO_PESO,ESTIBA,PRO_VOLUMEN,PRECIO,FEC_VENCIMIENTO,FEC_ELABORADO,PRO_LOTE) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
/*
		private static final String ALL_EMPLEADOS = "SELECT * FROM EMPLEADOS";
		private static final String EMPLEADOS_SUCURSAL = "SELECT * FROM EMPLEADOS WHERE ID_SUCURSAL=?";
		private static final String UPDATE_EMPLEADO = "UPDATE EMPLEADOS SET ID_SUCURSAL = ?, CEDULA=?, NOMBRE=?, APELLIDO=?, SUELDO=? WHERE ID_EMPLEADO=?";
		private static final String DELETE_EMPLEADO = "DELETE FROM EMPLEADOS WHERE ID_EMPLEADO=?"; 
		private static final String EMPLEADOS_ID = "SELECT * FROM EMPLEADOS WHERE ID_EMPLEADO=?";    */
		
		public static boolean insert(Producto producto){
			try{
				PreparedStatement statement = DataBaseManager.getConnection().prepareStatement(INSERT_PRODUCTO);
				
				java.sql.Date fechaSQL1 = new java.sql.Date(producto.getFechaVencimiento().getTime());
				java.sql.Date fechaSQL2 = new java.sql.Date(producto.getFechaElaborado().getTime());
				statement.setString(1, producto.getCodigo());
				statement.setString(2, producto.getNombre());
				statement.setString(3, producto.getStockTotal());
				statement.setString(4, producto.getStockMinimo());
				statement.setString(5, producto.getSegmentacion());
				statement.setDouble(6, producto.getPeso());
				statement.setString(7, producto.getTipoestiba());
	//			statement.setBoolean(8, producto.getTipoestiba().isApilable());
				statement.setInt(9, producto.getVolumen());
				statement.setDouble(10, producto.getPrecio());
				statement.setDate(11, fechaSQL1);
				statement.setDate(12, fechaSQL2);
				statement.setString(13,producto.getLote());
				
				int retorno = statement.executeUpdate();
									
				return retorno>0;
				
			}
			catch(SQLException e){
				e.printStackTrace();
				return false;
			}
		}

}
