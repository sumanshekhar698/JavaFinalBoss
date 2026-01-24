package dev.codecounty.oops.strings;

public class StringNEWFeatures {

    public static void main(String[] args) {
        // The Old Way
        String sql = "SELECT * FROM users\n" +
                "WHERE id = 10\n" +
                "AND status = 'ACTIVE';";

// The Advanced Way (Text Blocks)
        String sql2 = """
                SELECT * FROM users
                WHERE id = 10
                AND status = 'ACTIVE';
                """;
    }
}
