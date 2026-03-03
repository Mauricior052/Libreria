package model;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Modelo {

    private int id, lastId, row;
    private String campo2, campo3, campo4, campo5, campo6, campo7, campo8, fecha;
    private BigDecimal precio, cantidad, total;
    private boolean exito = false;

    public Modelo() {
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    public String getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5 = campo5;
    }

    public String getCampo6() {
        return campo6;
    }

    public void setCampo6(String campo6) {
        this.campo6 = campo6;
    }

    public String getCampo7() {
        return campo7;
    }

    public void setCampo7(String campo7) {
        this.campo7 = campo7;
    }

    public String getCampo8() {
        return campo8;
    }

    public void setCampo8(String campo8) {
        this.campo8 = campo8;
    }


    public String getFecha() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha = fechaActual.format(formatter);
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        total = cantidad.multiply(precio);
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void DatosDefault(String user) {
        Autoincrement("venta");
        textf[0].setText(String.valueOf(lastId + 1));
        textf[1].setText(user);
        textf[2].setText(getFecha());
    }

    String url = "jdbc:mysql://localhost:3306/libreria";
    String usuario = "root";
    String contraseña = "881568";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet resultSet = null;
    String[] datos, column;
    public JTextField[] textf = new JTextField[10];
    int n;

    public void Autoincrement(String tabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM " + tabla + " ORDER BY id DESC LIMIT 1";
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                lastId = resultSet.getInt("id");
            } else {
                lastId = 0;
            }
            Statement stmt = conn.createStatement();
            String sqlAutoIncrement = "ALTER TABLE " + tabla + " AUTO_INCREMENT = " + lastId;
            stmt.executeUpdate(sqlAutoIncrement);
        } catch (SQLException e) {
        }
    }
    public void Inicializar(String tabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM " + tabla;
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            n = metaData.getColumnCount();
            datos = new String[n];
            column = new String[n];
            //Obtener nombres de las columnas
            for (int i = 0; i < n; i++) {
                column[i] = metaData.getColumnName(i + 1);
            }

        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }
    public void ActualizarTabla(JTable jtabla, String tabla) {
        try {
            Inicializar(tabla);
            DefaultTableModel model = new DefaultTableModel();

            String query = "SELECT * FROM " + tabla;
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();
            //Obtener nombres de las columnas y agregarlas al JTable
            for (int i = 0; i < n; i++) {
                model.addColumn(column[i]);
            }
            jtabla.setModel(model);
            jtabla.setDefaultEditor(Object.class, null);
            model.setRowCount(0);
            //Llenar filas
            while (resultSet.next()) {
                for (int i = 0; i < n; i++) {
                    if (column[i].equals("año_publicacion")) {
                        datos[i] = String.valueOf(resultSet.getInt(column[i]));
                    } else {
                        datos[i] = resultSet.getString(column[i]);
                    }
                }
                model.addRow(datos);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }

    //Libro
    public void Insertar() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "INSERT INTO libro (titulo, genero, año_publicacion, editorial, autor) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.setString(4, campo6);
            pstmt.setString(5, campo5);
            if (Integer.parseInt(campo4) >= 1901 && Integer.parseInt(campo4) <= 2155 || Integer.parseInt(campo4) == 0) {
                try {
                    pstmt.executeUpdate();
                    exito = true;
                } catch (SQLIntegrityConstraintViolationException ex) {
                    JOptionPane.showMessageDialog(null, "La editorial " + campo6 + " no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El año de publicación está fuera de rango\nDebe ser entre 1901-2155");
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }
    public void Buscar(String tabla) {
        try {
            Inicializar(tabla);
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM " + tabla + " WHERE id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                exito = true;
                for (int i = 1; i < n; i++) {
                    if (column[i].equals("año_publicacion")) {
                        textf[i - 1].setText(String.valueOf(resultSet.getInt(column[i])));
                    } else {
                        textf[i - 1].setText(resultSet.getString(column[i]));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro " + id);

            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }
    public void Modificar() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "UPDATE libro SET titulo = ?, genero = ?, año_publicacion = ?, autor = ?, editorial = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.setString(4, campo5);
            pstmt.setString(5, campo6);
            if (Integer.parseInt(campo4) >= 1901 && Integer.parseInt(campo4) <= 2155 || Integer.parseInt(campo4) == 0) {
                try {
                    try {
                        pstmt.executeUpdate();
                        exito = true;
                    } catch (SQLIntegrityConstraintViolationException ex) {
                        JOptionPane.showMessageDialog(null, "La editorial " + campo6 + " no existe");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El año de publicación está fuera de rango");
            }

        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Eliminar(String tabla) {
        try {
            int filasAfectadas = 0;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "DELETE FROM " + tabla + " WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            try {
                filasAfectadas = pstmt.executeUpdate();
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar porque otras tablas dependen de este registro");
            }
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Fue eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro " + id);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }

    //Editorial
    public void Insertar1() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "INSERT INTO editorial (nombre, telefono) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Modificar1() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "UPDATE editorial SET nombre = ?, telefono = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }

    //Empleado
    public void Insertar3() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "INSERT INTO persona (nombre, ap_pat, ap_mat) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.executeUpdate();

            Autoincrement("persona");
            String sql2 = "INSERT INTO empleado (persona, fecha_contratacion, puesto) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql2);
            pstmt.setInt(1, lastId);
            pstmt.setString(2, campo5);
            pstmt.setString(3, campo6);
            pstmt.executeUpdate();

            Autoincrement("empleado");
            String sql3 = "INSERT INTO usuario (nombre_usuario, contraseña, empleado_id) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql3);
            pstmt.setString(1, campo7);
            pstmt.setString(2, campo8);
            pstmt.setInt(3, lastId);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Buscar3() {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            exito = false;
            String query2 = "SELECT * FROM empleado WHERE id = ?";
            pstmt = conn.prepareStatement(query2);
            pstmt.setInt(1, id);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                exito = true;
                lastId = resultSet.getInt("persona");
                textf[3].setText(resultSet.getString("fecha_contratacion"));
                textf[4].setText(resultSet.getString("puesto"));
            }
            if (exito) {
                String query3 = "SELECT * FROM usuario WHERE empleado_id = ?";
                pstmt = conn.prepareStatement(query3);
                pstmt.setInt(1, id);
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    textf[5].setText(resultSet.getString("nombre_usuario"));
                    textf[6].setText(resultSet.getString("contraseña"));
                    System.out.println("caca");
                }
                String query = "SELECT * FROM persona WHERE id = ?";
                pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, lastId);
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    exito = true;
                    textf[0].setText(resultSet.getString("nombre"));
                    textf[1].setText(resultSet.getString("ap_pat"));
                    textf[2].setText(resultSet.getString("ap_mat"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro " + id);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Modificar3() {
        exito = false;
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql2 = "UPDATE empleado SET fecha_contratacion = ?, puesto = ? WHERE persona = " + id;
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1, campo5);
            pstmt.setString(2, campo6);
            pstmt.executeUpdate();

            String sql3 = "UPDATE usuario SET nombre_usuario = ?, contraseña = ? WHERE empleado_id = " + id;
            pstmt = conn.prepareStatement(sql3);
            pstmt.setString(1, campo7);
            pstmt.setString(2, campo8);
            pstmt.executeUpdate();

            String query2 = "SELECT * FROM empleado WHERE persona = " + id;
            pstmt = conn.prepareStatement(query2);
            resultSet = pstmt.executeQuery();
            if (resultSet.next())  id = resultSet.getInt("persona");

            String sql = "UPDATE persona SET nombre = ?, ap_pat = ?, ap_mat = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Eliminar3() {
        try {

            conn = DriverManager.getConnection(url, usuario, contraseña);
            try {
                String sql = "DELETE FROM usuario WHERE empleado_id = " + id;
                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();

                String query2 = "SELECT * FROM empleado WHERE id = " + id;
                pstmt = conn.prepareStatement(query2);
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    lastId = resultSet.getInt("persona");
                }

                String sql2 = "DELETE FROM empleado WHERE id = " + id;
                pstmt = conn.prepareStatement(sql2);
                pstmt.executeUpdate();

                String sql3 = "DELETE FROM persona WHERE id = " + lastId;
                pstmt = conn.prepareStatement(sql3);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fue eliminado con exito");
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar porque otras tablas dependen de este registro");
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                
            }
        }
    }
    public void ActualizarTabla3(JTable jtabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            DefaultTableModel model = new DefaultTableModel();
            String query = "SELECT\n"
                    + "    e.id AS id,\n"
                    + "    p.nombre AS nombre,\n"
                    + "    p.ap_pat AS ap_pat,\n"
                    + "    p.ap_mat AS ap_mat,\n"
                    + "    e.fecha_contratacion,\n"
                    + "    e.puesto,\n"
                    + "    u.nombre_usuario\n"
                    + "FROM\n"
                    + "    persona p\n"
                    + "JOIN\n"
                    + "    empleado e ON p.id = e.persona\n"
                    + "JOIN\n"
                    + "    usuario u ON e.id = u.empleado_id";
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();
            n = 5;
            column = new String[n];
            datos = new String[n];
            column[0] = "id";
            column[1] = "nombre";
            column[2] = "fecha_contratacion";
            column[3] = "puesto";
            column[4] = "nombre_usuario";
            for (int i = 0; i < n; i++) {
                model.addColumn(column[i]);
            }
            jtabla.setModel(model);
            jtabla.setDefaultEditor(Object.class, null);
            model.setRowCount(0);
            //Llenar filas
            while (resultSet.next()) {
                for (int i = 0; i < n; i++) {
                    if (i == 1) {
                        datos[i] = resultSet.getString(column[i])+" "+resultSet.getString("ap_pat")+" "+resultSet.getString("ap_mat");
                    }else{
                        datos[i] = resultSet.getString(column[i]);
                    }
                }
                model.addRow(datos);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public boolean Encontrado2(String tabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM " + tabla + " WHERE nombre_usuario = ? AND id != ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, campo7);
            pstmt.setInt(2, id);
            resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }

    //Cliente
    public void Insertar4() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "INSERT INTO persona (nombre, ap_pat, ap_mat) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.executeUpdate();

            Autoincrement("persona");
            String sql2 = "INSERT INTO cliente (persona, telefono, direccion) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql2);
            pstmt.setInt(1, lastId);
            pstmt.setString(2, campo5);
            pstmt.setString(3, campo6);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Buscar4() {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            exito = false;
            String query2 = "SELECT * FROM cliente WHERE id = ?";
            pstmt = conn.prepareStatement(query2);
            pstmt.setInt(1, id);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                exito = true;
                lastId = resultSet.getInt("persona");
                textf[3].setText(resultSet.getString("telefono"));
                textf[4].setText(resultSet.getString("direccion"));
            }
            if (exito) {
                String query = "SELECT * FROM persona WHERE id = ?";
                pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, lastId);
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    textf[0].setText(resultSet.getString("nombre"));
                    textf[1].setText(resultSet.getString("ap_pat"));
                    textf[2].setText(resultSet.getString("ap_mat"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro " + id);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Modificar4() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql2 = "UPDATE cliente SET telefono = ?, direccion = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1, campo5);
            pstmt.setString(2, campo6);
            pstmt.executeUpdate();

            String query2 = "SELECT * FROM cliente WHERE id = " + id;
            pstmt = conn.prepareStatement(query2);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("persona");
            }
            String sql = "UPDATE persona SET nombre = ?, ap_pat = ?, ap_mat = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setString(2, campo3);
            pstmt.setString(3, campo4);
            pstmt.executeUpdate();
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void Eliminar4() {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            try {
                String query2 = "SELECT * FROM cliente WHERE id = " + id;
                pstmt = conn.prepareStatement(query2);
                resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    lastId = resultSet.getInt("persona");
                }

                String sql2 = "DELETE FROM cliente WHERE id = " + id;
                pstmt = conn.prepareStatement(sql2);
                pstmt.executeUpdate();

                String sql3 = "DELETE FROM persona WHERE id = " + lastId;
                pstmt = conn.prepareStatement(sql3);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fue eliminado con exito");
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar porque otras tablas dependen de este registro");
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void ActualizarTabla4(JTable jtabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            DefaultTableModel model = new DefaultTableModel();
            jtabla.setModel(model);
            jtabla.setDefaultEditor(Object.class, null);
            model.setRowCount(0);
            n = 4;
            column = new String[n];
            datos = new String[n];
            column[0] = "id";
            column[1] = "nombre";
            column[2] = "telefono";
            column[3] = "direccion";
            for (int i = 0; i < n; i++) {
                model.addColumn(column[i]);
            }
            String query = "SELECT\n"
                    + "    c.id AS id,\n"
                    + "    p.nombre AS nombre,\n"
                    + "    p.ap_pat AS ap_pat,\n"
                    + "    p.ap_mat AS ap_mat,\n"
                    + "    c.telefono AS telefono,\n"
                    + "    c.direccion AS direccion\n"
                    + "FROM\n"
                    + "    persona p\n"
                    + "JOIN\n"
                    + "    cliente c ON p.id = c.persona";
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                for (int i = 0; i < n; i++) {
                    if (i == 1) {
                        datos[i] = resultSet.getString(column[i])+" "+resultSet.getString("ap_pat")+" "+resultSet.getString("ap_mat");
                    }else{
                        datos[i] = resultSet.getString(column[i]);
                    }
                }
                model.addRow(datos);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {}
        }
    }

    //Venta
    public void Insertar6(int userId) {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "INSERT INTO venta (fecha, usuario, cliente) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo2);
            pstmt.setInt(2, userId);
            pstmt.setString(3, campo3);
            try {
                pstmt.executeUpdate();
                exito = true;
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No existe el cliente " + campo3);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void Modificar6() {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "UPDATE venta SET cliente = ? WHERE id = " + id;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, campo3);
            try {
                pstmt.executeUpdate();
                exito = true;
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No existe el cliente " + campo3);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void ActualizarTabla6(JTable jtabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            DefaultTableModel model = new DefaultTableModel();
            jtabla.setModel(model);
            jtabla.setDefaultEditor(Object.class, null);
            model.setRowCount(0);
            n = 4;
            column = new String[n];
            datos = new String[n];
            column[0] = "id";
            column[1] = "fecha";
            column[2] = "usuario";
            column[3] = "cliente";
            for (int i = 0; i < n; i++) {
                model.addColumn(column[i]);
            }
            String query = "SELECT\n"
                    + "    v.id AS id,\n"
                    + "    v.fecha AS fecha,\n"
                    + "    u.nombre_usuario AS usuario,\n"
                    + "    p.nombre AS cliente,\n"
                    + "    p.ap_pat AS ap1,\n" 
                    + "    p.ap_mat AS ap2\n"
                    + "FROM\n"
                    + "    venta v\n"
                    + "JOIN\n"
                    + "    cliente c ON v.cliente = c.id\n"
                    + "JOIN\n"
                    + "    usuario u ON v.usuario = u.id\n"
                    + "JOIN\n"
                    + "    persona p ON c.persona = p.id";
            pstmt = conn.prepareStatement(query);
            resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                for (int i = 0; i < n; i++) {
                    if (i == 3) {
                        datos[i] = resultSet.getString(column[i])+" "+resultSet.getString("ap1")+" "+resultSet.getString("ap2");
                    }else{
                        datos[i] = resultSet.getString(column[i]);
                    }
                }
                model.addRow(datos);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void IntoTable(JTable jtabla, String tabla) {
        DefaultTableModel model = (DefaultTableModel) jtabla.getModel();
        datos = new String[5];
        datos[0] = campo2;
        datos[1] = campo3;
        datos[2] = "" + cantidad;
        datos[3] = "" + precio;
        datos[4] = "" + getTotal();
        if (!exito) {
            model.addRow(datos);
            id = model.getRowCount();
            exito = true;
        } else {
            for (int i = 0; i < 5; i++) {
                model.setValueAt(datos[i], row, i);
            }
        }

    }
    public boolean Encontrado(int libro, String tabla) {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM " + tabla + " WHERE id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, libro);
            resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }

    //Venta_Libro
    public void Insertar8(JTable jtabla) {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            DefaultTableModel model = (DefaultTableModel) jtabla.getModel();

            int rows = model.getRowCount();
            int columns = model.getColumnCount();
            Object data;
            for (int row = 0; row < rows; row++) {
                String sql = "INSERT INTO venta_libro (venta, libro, cantidad, precio, total) VALUES (?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                for (int col = 0; col < columns; col++) {
                    data = model.getValueAt(row, col);
                    pstmt.setString(col + 1, String.valueOf(data));
                }
                pstmt.executeUpdate();
            }
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
    public void Buscar8(JTable jtabla, JLabel lbl) {
        try {
            DefaultTableModel model = (DefaultTableModel) jtabla.getModel();
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String query = "SELECT * FROM venta_libro WHERE venta = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            resultSet = pstmt.executeQuery();
            datos = new String[5];
            column = new String[5];
            column[0] = "venta";
            column[1] = "libro";
            column[2] = "cantidad";
            column[3] = "precio";
            column[4] = "total";
            if (resultSet.next()) {
                exito = true;
                do {
                    for (int i = 0; i < 5; i++) {
                        datos[i] = resultSet.getString(column[i]);
                    }
                    model.addRow(datos);
                } while (resultSet.next());
            }
            lbl.setText(String.valueOf(jtabla.getRowCount()));
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void Modificar8(JTable jtabla) {
        try {
            exito = false;
            conn = DriverManager.getConnection(url, usuario, contraseña);
            DefaultTableModel model = (DefaultTableModel) jtabla.getModel();

            int rows = model.getRowCount();
            int columns = model.getColumnCount();
            Object data;
            for (int row = 0; row < rows; row++) {
                String sql = "UPDATE venta_libro SET venta = ?, libro = ?, cantidad = ?, precio = ?, total = ? WHERE venta = " + id;
                pstmt = conn.prepareStatement(sql);
                for (int col = 0; col < columns; col++) {
                    data = model.getValueAt(row, col);
                    pstmt.setString(col + 1, String.valueOf(data));
                }
                pstmt.executeUpdate();
            }
            exito = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha exedido el limite de caracteres");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) { }
        }
    }
    public void Eliminar8() {
        try {
            conn = DriverManager.getConnection(url, usuario, contraseña);
            String sql = "DELETE FROM venta_libro WHERE venta = " + id;
            pstmt = conn.prepareStatement(sql);
            try {
                pstmt.executeUpdate();
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar porque otras tablas dependen de este registro");
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {}
        }
    }
}
