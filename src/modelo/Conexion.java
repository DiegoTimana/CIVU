package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
 	private final String host = "ec2-54-174-172-218.compute-1.amazonaws.com";
 	private final String database = "daibcuigqa5mst";
 	private final String user = "fktbabssyoupex";
 	private final String password = "493319794c4e48b29c85747bf70fb00e5b69c075509342e52e5c647d7bd40f14";
   
    
    private Connection con = null;
    
    
    // obtiene la conexion la guarda y luego la retorna
    public Connection getConnection(){
        
        try{
            //controlador para realizar la conexion
            //Class.forName("com.postgres.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://"+host+":5432/"+database, user, password);
            
            if(con != null) {
            System.out.println("Conexi�n a base de datos OK");
            }
            
            
        } catch(Exception e) {
        	System.out.println("Error al conectar a la base de datos");
        	e.printStackTrace();
        }//finally {
        	return con;
       // }
            
         
    }
}
