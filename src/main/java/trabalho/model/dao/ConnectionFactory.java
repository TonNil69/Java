package trabalho.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by rodrigo on 04/05/17.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/controle_de_estoque", "postgres", "1096"); //1096
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
