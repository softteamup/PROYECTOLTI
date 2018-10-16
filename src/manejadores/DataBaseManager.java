package manejadores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
	
	private static 	Connection databaseConnection;
	
	private static String	CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String	USUARIO	= "PROYECTOLTI";
	private static String	CLAVE =	"PROYECTOLTI";
	
	static{
		try{
			databaseConnection = DriverManager.getConnection(CONNECTION_STRING,USUARIO,CLAVE);
		}
		
		catch	(SQLException e){
			System.out.println("Error creando la conexión a la base de datos");
			e.printStackTrace();
		}
		}
	public static Connection getConnection(){
		return databaseConnection;
	}
	

}
