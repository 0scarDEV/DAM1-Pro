package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class VerificarUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre de usuario
        System.out.print("Ingrese el nombre de usuario a verificar: ");
        String username = scanner.nextLine();

        // Intentar establecer la conexión y verificar el usuario
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://" + Conexion.HOST + "/" + Conexion.DATABASE,
                    Conexion.USER,
                    Conexion.PASSWORD
            );

            if (verificarUsuario(connection, username)) {
                System.out.println("El usuario '" + username + "' existe en la tabla 'user'.");
                mostrarEmail(connection, username);
            } else {
                System.out.println("El usuario '" + username + "' no existe en la tabla 'user'.");
            }

            mostrarTodosLosEmails(connection);
            connection.close(); // Cerrar la conexión después de su uso
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean verificarUsuario(Connection connection, String username) throws SQLException {
        String query = "SELECT * FROM user WHERE username = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); // Devuelve true si hay al menos una fila
        }
    }
    private static void mostrarEmail(Connection connection, String username) throws SQLException {
        String query = "SELECT email FROM user WHERE username = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String email = resultSet.getString("email");
                System.out.println("El correo electrónico para el usuario '" + username + "' es: " + email);
            }
        }
    }
    private static void mostrarTodosLosEmails(Connection connection) throws SQLException {
        System.out.println("\nCorreos electrónicos de todos los usuarios:");

        String query = "SELECT username, email FROM user";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                System.out.println("Usuario: " + username + ", Correo electrónico: " + email);
            }
        }
    }
}