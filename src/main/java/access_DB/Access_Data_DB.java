package access_DB;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Access_Data_DB {
    public static final String DB_CONNECTION_URL = "jdbcUrl";
    public static final String DB_CONNECTION_USER = "jdbcUser";
    public static final String DB_CONNECTION_PASSWORD = "jdbcPassword";
    private static final String ACCESS_DATA_FILE = "Access_Data_DB.json";


    private final Map<String, Object> Access_Data;

    public Access_Data_DB () throws IOException {
        this(ACCESS_DATA_FILE);
    }

    public Access_Data_DB (String filename) throws IOException {
        String s = Files.readString(Path.of(filename));

        TypeToken<?> tt = TypeToken.getParameterized(Map.class, String.class, Object.class);
        Access_Data = new Gson().fromJson(s, tt.getType());
    }

    public String getString(String key) {
        return Access_Data.get(key).toString();
    }

    public Object getData (String key) {
        return Access_Data.get(key);
    }

}
