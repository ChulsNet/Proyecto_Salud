package Util;

import java.sql.Connection;

public class Test_Conexion {
    
    public static void main(String[] args) {
        try {
            Connection cn = new Conexion().conectar();
            if (cn != null)
                System.out.println("Conexión Exitosa :D");
            else
                System.out.println("Error D:");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
