import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataAccess {
    private String _usuario = "root";      
    private String _pwd = "1234"; 
    private static String _bd = "empresa";  
    static String _url = "jdbc:mysql://localhost:3306/" + _bd;

    Connection conn = null;

    public MyDataAccess() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(_url, _usuario, _pwd);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error en la conexión:........ " + e.getMessage());
        }
    }

    public ResultSet getQuery(String query) {
        ResultSet rs = null;
        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error ejecutando consulta: " + e.getMessage());
        }
        return rs;
    }

    public void setQuery(String query) {
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            System.out.println("Operación realizada con éxito.");
        } catch (SQLException e) {
            System.out.println("Error ejecutando actualización: " + e.getMessage());
        }
    }
}

