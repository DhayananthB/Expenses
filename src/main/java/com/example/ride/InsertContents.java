package com.example.ride;
import java.sql.*;

public class InsertContents{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/expenses";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Example: Insert values into a table named 'budget' in the 'expenses' database
            String insertQuery = "INSERT INTO budget VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                // Set values for each parameter in the prepared statement
                preparedStatement.setInt(1, 3000);
                preparedStatement.setString(2, "February");
                preparedStatement.setDouble(3, 40000);

                // Execute the query
                int rowsAffected = preparedStatement.executeUpdate();

                System.out.println(rowsAffected + " row(s) affected");
            }
            // Create a statement
//            Statement statement = connection.createStatement();
//
//            // Execute a SELECT query
//            String selectQuery = "SELECT * FROM transaction";
//            ResultSet resultSet = statement.executeQuery(selectQuery);
//
//            // Process the results
//            while (resultSet.next()) {
//                // Retrieve values from the result set
//                int tid = resultSet.getInt("tid");
//                String dateOfTrans = resultSet.getString("DateofTrans");
//                double amount = resultSet.getDouble("Amount");
//                String type = resultSet.getString("type");
//
//                // Process the data as needed
//                System.out.println("TID: " + tid + ", Date: " + dateOfTrans + ", Amount: " + amount + ", Type: " + type);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
