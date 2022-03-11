
package lab8p2_pamelaramirez_12141141;

import java.util.ArrayList;
import javax.swing.*;


public class AdminCarrera extends Thread {
    private ArrayList <AdminBarrita> barritas = new ArrayList();
    private boolean fin;
    private JTable tabla;

    public AdminCarrera() {
        fin = false;
    }

    public ArrayList<AdminBarrita> getBarritas() {
        return barritas;
    }

    public void setBarritas(ArrayList<AdminBarrita> barritas) {
        this.barritas = barritas;
    }
    
    public void pararBarritas() {
        for (AdminBarrita bar : barritas) {
            bar.setFin(fin);
        }
    }
    
    public void pausarBarritas() {
        for (AdminBarrita bar : barritas) {
            bar.setAvanza(false);
        }
    }
    
    public void reanudarBarritas() {
        for (AdminBarrita bar : barritas) {
            bar.setAvanza(true);
        }
    }

    @Override
    public void run() {
        start();
        while(!fin) {
            for (AdminBarrita bar : barritas) {
                
                if (!bar.isFin()) {
                    fin = bar.isFin();
                    pararBarritas();
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {

            }
        }
        
    }

    @Override
    public synchronized void start() {
        for (AdminBarrita bar : barritas) {
            bar.setAvanza(true);
            bar.run();
        }
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException ex) {

        }
    }
    
}
