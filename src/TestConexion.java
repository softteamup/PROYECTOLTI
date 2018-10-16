

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import objetos.Ciudad;
import manejadores.DataBaseManager;

public class TestConexion {

	public static void main(String[] argv) {
		

		System.out.println("-------- Test de conexion con Oracle DB ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("No tienes el driver en tu build-path?");
			e.printStackTrace();
			return;

		}

		System.out.println("Se encontró el Driver para Oracle DB");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "PROYECTOLTI",
					"PROYECTOLTI");
			

		} catch (SQLException e) {

			System.out.println("Error al conectase!!");
			e.printStackTrace();
			return;

		}

		if (connection == null) {
			
			System.out.println("Error creando la conexión!!");
		}
		
		// Imprime todos los cursos persistidos en la base de datos INSTITUTO
		testConsulta1(connection);
		
		//Imprime todos los cursos correspondiente a la materia de nombre 'Arquitectura de Sistemas' persistidos en la base de datos INSTITUTO

	}
	
	public static void testConsulta1(Connection connection){
		
		System.out.println();
		System.out.println("-------- Consulta de Prueba 1 ------");
		
		try {
			Statement sentencia = connection.createStatement();
			String consulta = "SELECT * FROM CIUDADES";
			System.out.println("Ejecutando: " + consulta);
			ResultSet resultado = sentencia.executeQuery(consulta);
			LinkedList<Ciudad> ciudades = new LinkedList<>();
			
			while (resultado.next()){
				
				String codigo = resultado.getString("ID_CIUDAD");
				String nombre = resultado.getString("Nombre");
				
				Ciudad ciudad = new Ciudad(codigo, nombre);
				ciudades.add(ciudad);
				
			}		
			imprimirCiudades(ciudades);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void imprimirCiudades(LinkedList<Ciudad> ciudades){

		
		
		
		System.out.println();
		System.out.println("Listando Ciudades obtenidas:");
		System.out.println();
		
		
		for (Ciudad c : ciudades){
			
			System.out.println("  Id Curso: " + c.getCodigo());
			System.out.println("  Id Docente: " + c.getNombre());

		}
	}
}


	
	
	


