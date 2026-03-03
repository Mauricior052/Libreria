package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Modelo;
import view.Libro;
import view.Tabla;
import view.Vista;

public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;
    private Tabla tabla;
    private Libro libro;
    private String user;
    private int userId;

    public Controlador(Vista vista, Tabla tabla, Libro libro, Modelo modelo, String user, int userId){
        this.vista = vista;
        this.modelo = modelo;
        this.tabla = tabla;
        this.user = user;
        this.userId = userId;
        this.libro = libro;
        this.vista.btSi.addActionListener(this);
        this.vista.btSi1.addActionListener(this);
        this.vista.btSi3.addActionListener(this);
        this.vista.btSi4.addActionListener(this);
        this.vista.btSi6.addActionListener(this);
        this.vista.btInsertar6.addActionListener(this);
        this.vista.btAgregar.addActionListener(this);
        this.vista.btEditar.addActionListener(this);
        this.libro.btAceptar.addActionListener(this);
        this.vista.btForeign.addActionListener(this);
        this.vista.btForeign3.addActionListener(this);
        this.libro.btForeign4.addActionListener(this);
        this.vista.btEliminar.addActionListener(this);
        this.vista.btEliminar1.addActionListener(this);
        this.vista.btEliminar3.addActionListener(this);
        this.vista.btEliminar4.addActionListener(this);
        this.vista.btEliminar6.addActionListener(this);
        this.vista.btQuitar.addActionListener(this);
    }
    
    public void iniciar_vista(){
        vista.setTitle("Libreria");
        vista.setLocationRelativeTo(null);
        //vista.tabbed.setSelectedIndex(4);
        vista.Configurar();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ventana;
        if (e.getSource() == vista.btSi) {
            ventana = "libro";
            modelo.setCampo2(vista.titulotxt.getText());
            modelo.setCampo3(vista.generotxt.getText());
            modelo.setCampo4(vista.añotxt.getText());
            modelo.setCampo5(vista.autortxt.getText());
            modelo.setCampo6(vista.editorialtxt.getText());
                switch (vista.accion) {
                    case 1: //Insertar
                        if (vista.titulotxt.getText().equals("") || vista.generotxt.getText().equals("") || vista.añotxt.getText().equals("") || vista.autortxt.getText().equals("") || vista.editorialtxt.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Completa todos los campos");
                        }else{
                            modelo.Autoincrement(ventana);
                            modelo.Insertar();
                            if (modelo.isExito()) {
                                JOptionPane.showMessageDialog(null, "Fue insertado con exito");
                                vista.LimpiarTxtf();
                                vista.DesTextf();
                                vista.Deshabilitar();
                            }
                        }
                        break;
                    case 2: //Buscar
                        if (vista.idtxt.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Ingesa un ID");
                        }else{
                            modelo.setId(Integer.parseInt(vista.idtxt.getText()));
                            modelo.textf[0] = vista.titulotxt;
                            modelo.textf[1] = vista.generotxt;
                            modelo.textf[2] = vista.añotxt;
                            modelo.textf[3] = vista.editorialtxt;
                            modelo.textf[4] = vista.autortxt;
                            modelo.Buscar(ventana);
                            vista.Deshabilitar();
                            vista.DesTextf();
                        }
                        break;
                    case 3: //Modificar
                        if (vista.titulotxt.getText().equals("") || vista.generotxt.getText().equals("") || vista.añotxt.getText().equals("") || vista.autortxt.getText().equals("") || vista.editorialtxt.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Completa todos los campos");
                        }else{
                            modelo.Modificar();
                            if (modelo.isExito()) {
                                JOptionPane.showMessageDialog(null, "Fue modificado con exito");
                                vista.LimpiarTxtf();
                                vista.DesTextf();
                                vista.Deshabilitar();
                            }
                        }
                        break;
                    case 5: //Mostrar
                        tabla.setVisible(true);
                        modelo.ActualizarTabla(tabla.jtable, ventana);
                        tabla.lblTitulo.setText(ventana.toUpperCase());
                        break;
                }
            } //Libro
        else if (e.getSource() == vista.btSi1) { //Editorial
            ventana = "editorial";
            modelo.setCampo2(vista.nombretxt.getText());
            modelo.setCampo3(vista.teltxt.getText());
            switch (vista.accion) {
                case 1: //Insertar
                    if (vista.nombretxt.getText().equals("") || vista.teltxt.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.Autoincrement(ventana);
                        modelo.Insertar1();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue insertado con exito");
                            vista.LimpiarTxtf1();
                            vista.DesTextf1();
                            vista.Deshabilitar1();
                        }
                    }
                    break;
                case 2: //Buscar
                    if (vista.idtxt1.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingesa un ID");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt1.getText()));
                        modelo.textf[0] = vista.nombretxt;
                        modelo.textf[1] = vista.teltxt;
                        modelo.Buscar(ventana);
                        vista.DesTextf1();
                        vista.Deshabilitar1();
                    }
                    break;
                case 3: //Modificar
                    if (vista.nombretxt.getText().equals("") || vista.teltxt.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.Modificar1();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue modificado con exito");
                            vista.LimpiarTxtf1();
                            vista.DesTextf1();
                            vista.Deshabilitar1();
                        }
                    }
                    break;
                case 5: //Mostrar
                    tabla.setVisible(true);
                    modelo.ActualizarTabla(tabla.jtable, ventana);
                    tabla.lblTitulo.setText(ventana.toUpperCase());
                    break;
            }
        } //Editorial
        else if (e.getSource() == vista.btSi3) { //Empleado
            ventana = "empleado";
            modelo.setCampo2(vista.nombretxt3.getText());
            modelo.setCampo3(vista.ap_pat3.getText());
            modelo.setCampo4(vista.ap_mat3.getText());
            modelo.setCampo5(vista.contr3.getText());
            modelo.setCampo6(vista.puesto3.getText());
            modelo.setCampo7(vista.usertxt.getText());
            modelo.setCampo8(String.valueOf(vista.passtxt.getPassword()));
            
            switch (vista.accion) {
                case 1: //Insertar
                    if (modelo.getCampo2().equals("")|| modelo.getCampo3().equals("")|| modelo.getCampo4().equals("")|| modelo.getCampo5().equals("")|| modelo.getCampo6().equals("")|| modelo.getCampo7().equals("")|| modelo.getCampo8().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else if (modelo.Encontrado2("usuario")) {
                        JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya existe");
                    }else{
                        modelo.Autoincrement("persona");
                        modelo.Autoincrement("empleado");
                        modelo.Autoincrement("usuario");
                        modelo.Insertar3();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue insertado con exito");
                            vista.LimpiarTxtf3();
                            vista.DesTextf3();
                            vista.Deshabilitar3();
                        }
                    }
                    break;
                case 2: //Buscar
                    if (vista.idtxt3.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingesa un ID");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt3.getText()));
                        modelo.textf[0] = vista.nombretxt3;
                        modelo.textf[1] = vista.ap_pat3;
                        modelo.textf[2] = vista.ap_mat3;
                        modelo.textf[3] = vista.contr3;
                        modelo.textf[4] = vista.puesto3;
                        modelo.textf[5] = vista.usertxt;
                        modelo.textf[6] = vista.passtxt;
                        modelo.Buscar3();
                        vista.DesTextf3();
                        vista.Deshabilitar3();
                    }
                    break;
                case 3: //Modificar
                    if (modelo.getCampo2().equals("")|| modelo.getCampo3().equals("")|| modelo.getCampo4().equals("")|| modelo.getCampo5().equals("")|| modelo.getCampo6().equals("")|| modelo.getCampo7().equals("")|| modelo.getCampo8().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else if (modelo.Encontrado2("usuario")) {
                        modelo.setId(Integer.parseInt(vista.idtxt3.getText()));
                        JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya existe");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt3.getText()));
                        modelo.Modificar3();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue modificado con exito");
                            vista.LimpiarTxtf3();
                            vista.DesTextf3();
                            vista.Deshabilitar3();
                        }
                    }
                    break;
                case 5: //Mostrar
                    tabla.setVisible(true);
                    modelo.ActualizarTabla3(tabla.jtable);
                    tabla.lblTitulo.setText(ventana.toUpperCase());
                    break;
            }
        } //Empleado
        else if (e.getSource() == vista.btSi4) { //Cliente
            ventana = "cliente";
            modelo.setCampo2(vista.nombretxt4.getText());
            modelo.setCampo3(vista.ap_pat4.getText());
            modelo.setCampo4(vista.ap_mat4.getText());
            modelo.setCampo5(vista.tel4.getText());
            modelo.setCampo6(vista.direccion.getText());
            switch (vista.accion) {
                case 1: //Insertar
                    if (vista.nombretxt4.getText().equals("") || vista.ap_pat4.getText().equals("") || vista.ap_mat4.getText().equals("") || vista.tel4.getText().equals("") || vista.direccion.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.Autoincrement("persona");
                        modelo.Autoincrement("cliente");
                        modelo.Insertar4();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue insertado con exito");
                            vista.LimpiarTxtf4();
                            vista.DesTextf4();
                            vista.Deshabilitar4();
                        }
                    }
                    break;
                case 2: //Buscar
                    if (vista.idtxt4.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingesa un ID");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt4.getText()));
                        modelo.textf[0] = vista.nombretxt4;
                        modelo.textf[1] = vista.ap_pat4;
                        modelo.textf[2] = vista.ap_mat4;
                        modelo.textf[3] = vista.tel4;
                        modelo.textf[4] = vista.direccion;
                        modelo.Buscar4();
                        vista.DesTextf4();
                        vista.Deshabilitar4();
                    }
                    break;
                case 3: //Modificar
                    if (vista.nombretxt4.getText().equals("") || vista.ap_pat4.getText().equals("") || vista.ap_mat4.getText().equals("") || vista.tel4.getText().equals("") || vista.direccion.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt4.getText()));
                        modelo.Modificar4();
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue modificado con exito");
                            vista.LimpiarTxtf4();
                            vista.DesTextf4();
                            vista.Deshabilitar4();
                        }
                    }
                    break;
                case 5: //Mostrar
                    tabla.setVisible(true);
                    modelo.ActualizarTabla4(tabla.jtable);
                    tabla.lblTitulo.setText(ventana.toUpperCase());
                    break;
            }
        } //Cliente
        else if (e.getSource() == vista.btSi6) { //Venta
            ventana = "venta";
            modelo.setCampo2(vista.fechatxt6.getText());
            modelo.setCampo3(vista.clientetxt.getText());
            switch (vista.accion) {
                case 1: //Insertar
                    if (vista.clientetxt.getText().equals("") || vista.spinner.getText().equals("") || vista.spinner.getText().equals("0")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.Autoincrement(ventana);
                        if(modelo.isExito() == true) modelo.Insertar6(userId);
                        modelo.Insertar8(vista.venta_libro);
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue insertado con exito");
                            vista.LimpiarTxtf6();
                            vista.DesTextf6();
                            vista.Deshabilitar6();
                        }
                    }
                    break;
                case 2: //Buscar
                    if (vista.idtxt6.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Ingesa un ID");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt6.getText()));
                        modelo.textf[0] = vista.fechatxt6;
                        modelo.textf[1] = vista.usuariotxt6;
                        modelo.textf[2] = vista.clientetxt;
                        modelo.setId(Integer.parseInt(vista.idtxt6.getText()));
                        modelo.Buscar(ventana);
                        modelo.Buscar8(vista.venta_libro, vista.spinner);
                        vista.DesTextf6();
                        vista.Deshabilitar6();
                        if (!modelo.isExito()) { vista.LimpiarTxtf6(); }
                    }
                    break;
                case 3: //Modificar
                    if (vista.clientetxt.getText().equals("") || vista.spinner.getText().equals("") || vista.spinner.getText().equals("0")) {
                        JOptionPane.showMessageDialog(null, "Completa todos los campos");
                    }else{
                        modelo.setId(Integer.parseInt(vista.idtxt6.getText()));
                        modelo.Modificar6();
                        if(modelo.isExito()){
                            modelo.Eliminar8();
                            modelo.Insertar8(vista.venta_libro);
                        }
                        if (modelo.isExito()) {
                            JOptionPane.showMessageDialog(null, "Fue modificado con exito");
                            vista.LimpiarTxtf6();
                            vista.DesTextf6();
                            vista.Deshabilitar6();
                        }
                    }
                    break;
                case 5: //Mostrar
                    tabla.setVisible(true);
                    modelo.ActualizarTabla6(tabla.jtable);
                    tabla.lblTitulo.setText(ventana.toUpperCase());
                    break;
            }
        } //Venta
        else if (e.getSource() == libro.btAceptar){
            ventana = "venta_libro";
            if (libro.libro.getText().equals("") || libro.cantidad.getText().equals("") || libro.precio.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Completa todos los campos");
            }else{
                try{
                    modelo.setCampo3(libro.libro.getText());
                    if (modelo.Encontrado(Integer.parseInt(modelo.getCampo3()),"libro")) {
                        modelo.setCampo2(libro.venta.getText());
                        modelo.setCantidad(new BigDecimal(libro.cantidad.getText()));
                        modelo.setPrecio(new BigDecimal(libro.precio.getText()));
                        modelo.Autoincrement(ventana);
                        modelo.IntoTable(vista.venta_libro, ventana);
                        if (modelo.isExito()) {
                            vista.spinner.setText(String.valueOf(modelo.getId()));
                            libro.Limpiar();
                            libro.dispose();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La clave foranea "+modelo.getCampo3()+" no existe");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "El formato de numeros es incorrecto");
                }
            }
        }
        else if (e.getSource() == vista.btAgregar) {
            modelo.setExito(false);
            libro.setVisible(true);
            libro.venta.setText(vista.idtxt6.getText());
            libro.libro.setText("");
            libro.cantidad.setText("");
            libro.precio.setText("");
        }
        else if (e.getSource() == vista.btEditar) {
            modelo.setRow(vista.venta_libro.getSelectedRow());
            if (modelo.getRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla");
            }else{
                modelo.setExito(true);
                libro.setVisible(true);
                libro.venta.setText(vista.idtxt6.getText());
                libro.libro.setText(String.valueOf(vista.venta_libro.getValueAt(modelo.getRow(), 1)));
                libro.cantidad.setText(String.valueOf(vista.venta_libro.getValueAt(modelo.getRow(), 2)));
                libro.precio.setText(String.valueOf(vista.venta_libro.getValueAt(modelo.getRow(), 3)));
            }
            
        }
        else if (e.getSource() == vista.btQuitar) {
            modelo.setRow(vista.venta_libro.getSelectedRow());
            if (modelo.getRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla");
            }else{
                DefaultTableModel model = (DefaultTableModel) vista.venta_libro.getModel();
                model.removeRow(modelo.getRow());
                vista.spinner.setText(String.valueOf(model.getRowCount()));
            }
            
        }
        else if (e.getSource() == vista.btInsertar6) {
            vista.clientetxt.setText("");
            vista.spinner.setText("");
            DefaultTableModel model = (DefaultTableModel) vista.venta_libro.getModel();
            model.setRowCount(0);
            modelo.textf[0] = vista.idtxt6;
            modelo.textf[1] = vista.usuariotxt6;
            modelo.textf[2] = vista.fechatxt6;
            modelo.DatosDefault(user);
            //vista.usuariotxt6.setText(user);
        }
        else if (e.getSource() == vista.btForeign){
            ventana = "editorial";
            tabla.setVisible(true);
            modelo.ActualizarTabla(tabla.jtable, ventana);
            tabla.lblTitulo.setText(ventana.toUpperCase());
        }
        else if (e.getSource() == vista.btForeign3){
            ventana = "cliente";
            tabla.setVisible(true);
            modelo.ActualizarTabla4(tabla.jtable);
            tabla.lblTitulo.setText(ventana.toUpperCase());
        }
        else if (e.getSource() == libro.btForeign4){
            ventana = "libro";
            tabla.setVisible(true);
            modelo.ActualizarTabla(tabla.jtable, ventana);
            tabla.lblTitulo.setText(ventana.toUpperCase());
        }
        else if (e.getSource() == vista.btEliminar) {
            if (vista.idtxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            }else{
                ventana = "libro";
                modelo.setId(Integer.parseInt(vista.idtxt.getText()));
                modelo.Eliminar(ventana);
                vista.LimpiarTxtf();
                vista.DesTextf();
                vista.Deshabilitar();
            }
        }
        else if (e.getSource() == vista.btEliminar1) {
            if (vista.idtxt1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            }else{
                ventana = "editorial";
                modelo.setId(Integer.parseInt(vista.idtxt1.getText()));
                modelo.Eliminar(ventana);
                vista.LimpiarTxtf1();
                vista.DesTextf1();
                vista.Deshabilitar1();
            }
        }
        else if (e.getSource() == vista.btEliminar3) {
            if (vista.idtxt3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            }else{
                modelo.setId(Integer.parseInt(vista.idtxt3.getText()));
                modelo.Eliminar3();
                vista.LimpiarTxtf3();
                vista.DesTextf3();
                vista.Deshabilitar3();
            }
        }
        else if (e.getSource() == vista.btEliminar4) {
            if (vista.idtxt4.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            }else{
                modelo.setId(Integer.parseInt(vista.idtxt4.getText()));
                modelo.Eliminar4();
                vista.LimpiarTxtf4();
                vista.DesTextf4();
                vista.Deshabilitar4();
            }
        }
        else if (e.getSource() == vista.btEliminar6) {
            if (vista.idtxt6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            }else{
                ventana = "venta";
                modelo.setId(Integer.parseInt(vista.idtxt6.getText()));
                //modelo.setCampo2(vista.venta.getText());
                modelo.Eliminar8();
                modelo.Eliminar(ventana);
                vista.LimpiarTxtf6();
                vista.DesTextf6();
                vista.Deshabilitar6();
            }
        }
    }
}
