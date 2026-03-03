package proyectofinal;

import controller.Controlador2;
import model.Modelo2;
import view.Login;


public class ProyectoFinal {

    public static void main(String[] args) {
        
        Modelo2 mod = new Modelo2();
        Login vis = new Login();
        Controlador2 con = new Controlador2(vis, mod);
        
        vis.setVisible(true);
        
        
    }
    
}
