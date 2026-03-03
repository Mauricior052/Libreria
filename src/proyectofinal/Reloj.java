package proyectofinal;

import java.util.Calendar;
import javax.swing.JLabel;

public class Reloj extends Thread {

    private JLabel caja;

    public Reloj(JLabel caja) {
        this.caja = caja;
    }

    public void run() {
        while (true) {
            try {
                Calendar c = Calendar.getInstance();
                int hora = c.get(Calendar.HOUR);
                int minutos = c.get(Calendar.MINUTE);
                int segundos = c.get(Calendar.SECOND);
                //hh:mm:ss
                String tiempo = hora + ":" + minutos + ":" + segundos;
                this.caja.setText(tiempo);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error del sistema");
            }
        }
    }
}
