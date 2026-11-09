import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CodeQLDemo {
    public static void query(Connection connection) throws SQLException {
        String category = System.getenv("CODEQL_DEMO_CATEGORY");

        try (Statement statement = connection.createStatement()) {
            // Intentionally vulnerable: scanning demonstration only.
            statement.executeQuery(
                "SELECT * FROM products WHERE category = '" + category + "'"
            );
        }
    }
}
