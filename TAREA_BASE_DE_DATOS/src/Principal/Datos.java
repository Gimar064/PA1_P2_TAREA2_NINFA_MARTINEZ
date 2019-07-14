package Principal;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Datos {
public static Connection Conexion;     
public static void AbrirConexionDB() {
    String vURL     = "jdbc:derby://localhost:1527/HUMANOS";      //
    String vDriver  = "org.apache.derby.jdbc.ClientDriver";
    String vUsuario = "UTH";
    String vClave   = "UTH";
    try {
    Class.forName(vDriver);  
    Conexion = DriverManager.getConnection(vURL, vUsuario, vClave);
       //JOptionPane.showMessageDialog(null,"Conectado"); 
        System.out.println("conectado");
      }
    catch(Exception e){
     JOptionPane.showMessageDialog(null,"Error:"
             + e.getMessage());
     System.exit(0);
    } //end catch
    }  
public static void CerrarConexion(){
     Conexion = null;
    }


}