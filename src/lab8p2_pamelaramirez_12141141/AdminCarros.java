
package lab8p2_pamelaramirez_12141141;

import java.io.*;
import java.util.*;


public class AdminCarros {
    private ArrayList <Carro> carros = new ArrayList();
    private File archivo = null;
    
    public AdminCarros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    // Metodos de administracion
    
    public void agregarCarro(Carro carro) {
        carros.add(carro);
    }
    
    public boolean idValido(int id) {
        boolean valido = true;
        for (Carro carro : carros) {
            if (carro.getNumId() == id) {
                valido = false;
            }
        }
        return valido;
    }
    
    public void cargarArchivo() {
        try {            
            carros = new ArrayList();
            Carro carrito;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((carrito = (Carro) objeto.readObject()) != null) {
                        carros.add(carrito);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carro carro: carros) {
                bw.writeObject(carro);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
