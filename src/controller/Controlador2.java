package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Modelo;
import model.Modelo2;
import proyectofinal.Reloj;
import view.Libro;
import view.Login;
import view.Tabla;
import view.Vista;


public class Controlador2 implements ActionListener{
    
    private Login vista;
    private Modelo2 modelo;
    
    public Controlador2(Login vista, Modelo2 modelo){
        this.vista = vista;
        this.modelo = modelo;
        vista.btEntrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setUser(vista.userTxt.getText());
        modelo.setPassword(String.valueOf(vista.passTxt.getPassword()));
        if (modelo.Correcto()) {
            Modelo mod = new Modelo();
            Vista vis = new Vista();
            Tabla tab = new Tabla();
            Libro aux = new Libro();
            Controlador con = new Controlador(vis, tab, aux, mod, modelo.getUser(), modelo.getId());
            
            con.iniciar_vista();
            vis.setVisible(true);
            vista.dispose();
            
            new Reloj(vis.lbReloj).start();
            new Reloj(vis.lbReloj1).start();
            new Reloj(vis.lbReloj2).start();
            new Reloj(vis.lbReloj3).start();
            new Reloj(vis.lbReloj4).start();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }
}
