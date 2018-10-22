

import objetos.Producto;
import objetos.Tipoestiba;
import manejadores.DAOProducto;

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

	//	Tipoestiba estiba1 = new Tipoestiba("");
		Producto producto1 = new Producto("2", "", "","", "", 4,"estiba1" , 3, 4, null, null, "");
		DAOProducto.insert(producto1);
		
		
	}
	


	/*public static void testConsulta1(Connection connection){
		
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
*/
		
		
	}



	
	
	


