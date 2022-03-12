
package lab8p2_pamelaramirez_12141141;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class AdminBarrita extends Thread {
    private JProgressBar barrita;
    private boolean avanzar, fin;
    private ArrayList<Carro> carros;
    private int limite;
    private JTable tabla;
    
    public AdminBarrita(JProgressBar barra, ArrayList<Carro> carros, JTable tabla) {
        barrita = barra;
        avanzar = true;
        fin = true;
        this.carros = carros;
        this.limite = barra.getMaximum();
        this.tabla = tabla;
    }

    public JProgressBar getBarrita() {
        return barrita;
    }

    public void setBarrita(JProgressBar barrita) {
        this.barrita = barrita;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    
    public void ordenar() {
        Carro[] arreglo = new Carro[carros.size()];
        Carro mayor;
        for (int i = 0; i < carros.size(); i++) {
            arreglo[i] = carros.get(i);
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i].getDistancia() > arreglo[j].getDistancia()) {
                    mayor = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = mayor;
                }
            }
        }
        carros = new ArrayList();
        for (int i = 0; i < arreglo.length; i++) {
            carros.add(arreglo[i]);
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);
        for (Carro carrito : carros) {
            Object[] datos = new Object[3];
            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                datos[0] = carrito.getNumId();
                datos[1] = carrito.getNombre();
                datos[2] = carrito.getDistancia();
                modeloTabla.addRow(datos);
            }
        }
        tabla.setModel(modeloTabla);
    }
    
    @Override
    public void run() {
        while (!fin) {
            if (avanzar) {
                for (Carro car : carros) {
                    car.setDistancia(car.getDistancia() + car.recorre());
                    tabla.setValueAt(car.getDistancia(), carros.indexOf(car), 2);
                }
                
                //ordenar();
                for (Carro car : carros) {
                    if (car.getDistancia() > barrita.getMaximum()) {
                        fin = true;
                        avanzar = false;
                        JOptionPane.showMessageDialog(null, "Ha ganado " + car.getNombre() + "!", "Carrera finalizada", 1);
                        break;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }
        }
    }
}
