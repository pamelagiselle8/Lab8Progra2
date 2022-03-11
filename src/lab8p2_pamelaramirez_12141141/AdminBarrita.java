
package lab8p2_pamelaramirez_12141141;

import javax.swing.*;


public class AdminBarrita implements Runnable {
    private JProgressBar barrita;
    private boolean avanza, fin;
    private Carro carrito;
    private int limite;
    
    public AdminBarrita(JProgressBar barra, int pista, Carro carro) {
        barrita = barra;
        barrita.setBackground(carro.getColor());
        avanza = false;
        fin = false;
        carrito = carro;
        limite = pista;
    }

    public JProgressBar getBarrita() {
        return barrita;
    }

    public void setBarrita(JProgressBar barrita) {
        this.barrita = barrita;
    }

    public boolean isAvanza() {
        return avanza;
    }

    public void setAvanza(boolean avanza) {
        this.avanza = avanza;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    @Override
    public void run() {
        while(!fin) {
            if (avanza) {
                barrita.setValue(barrita.getValue() + carrito.recorre());
                carrito.setDistancia(barrita.getValue());
                if (barrita.getValue() == barrita.getMaximum()) {
                    fin = true;
                }
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
                
            }
        }
    }
}
