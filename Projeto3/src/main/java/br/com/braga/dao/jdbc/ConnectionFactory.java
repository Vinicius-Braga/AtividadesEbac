package br.com.braga.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    private ConnectionFactory(Connection connection) {

    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = initConection();
            return connection;
        } else if (connection.isClosed()) {
            connection = initConection();
            return connection;
        } else {
            return connection;
        }
    }

    private static Connection initConection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "senha");
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }
}
