package jdbc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException {
        Connection connection = Database.getInstance().getConnection();

        String sql = Files.readString(Path.of("app\\sql\\init_db.sql"));

        try (Statement st = connection.createStatement()){
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
