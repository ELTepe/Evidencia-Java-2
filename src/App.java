import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        MyDataAccess conexion = new MyDataAccess();
        ResultSet resultado;
        resultado = conexion.getQuery("select * from persona");
        try {
            while (resultado.next()){
                String nombres = resultado.getString("nombre");
                System.out.println("nombre: "+nombres);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}