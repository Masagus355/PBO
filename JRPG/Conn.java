package JRPG;

import java.sql.*;

public class Conn {
    private static final String URL = "jdbc:mysql://localhost:3306/a112214355";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection connection;

    public Conn() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertScore(int score) throws SQLException {
        String query = "INSERT INTO player (score) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, score);
            preparedStatement.executeUpdate();
        }
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public static void main(String[] args) {
        try {
            Conn conn = new Conn();
            conn.insertScore(100); // Example to insert a score
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
