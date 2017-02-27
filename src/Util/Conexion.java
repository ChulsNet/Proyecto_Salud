package Util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Miguel
 */
public class Conexion {
    public Connection conectar(){
        Connection cn = null;
        /*String bdName = "BDSalud";
        String user = "sa";
        String pass = "insidecore5";*/
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-LME5OOJ:1433;databaseName=BDSalud;user=sa;password=insidecore5"; 
            cn = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
}
