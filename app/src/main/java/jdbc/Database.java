package jdbc;

import access_DB.Access_Data_DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Database INSTANCE = new Database();

    private Connection connection;

    public Database () {
        try {
            Access_Data_DB ad = new Access_Data_DB();
            try {
                connection = DriverManager.getConnection(
                        ad.getString(Access_Data_DB.DB_CONNECTION_URL),
                        ad.getString(Access_Data_DB.DB_CONNECTION_USER),
                        ad.getString(Access_Data_DB.DB_CONNECTION_PASSWORD));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Database getInstance() {
        return INSTANCE;
    }

    public Connection getConnection () {
        return connection;
    }

    public void close () {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
