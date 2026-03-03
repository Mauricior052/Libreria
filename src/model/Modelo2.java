package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Modelo2 {
    
    private String user, password; 
    private int id;

    public String getUser() {
        return user;
    }public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }public void setId(int id) {
        this.id = id;
    }
    
    
    String url = "jdbc:mysql://localhost:3306/libreria";
    String usr = "root";
    String ctr = "881568";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet resultSet = null;
    
    public boolean Correcto(){
        try {
            conn = DriverManager.getConnection(url, usr, ctr);
            String query = "SELECT * FROM usuario WHERE nombre_usuario = ? AND contraseña = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                do {
                    setId(resultSet.getInt("id"));
                    return true;
                } while (resultSet.next());
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            try {
                if (resultSet != null) { resultSet.close(); }
                if (pstmt != null) { pstmt.close(); }
                if (conn != null) { conn.close(); }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
