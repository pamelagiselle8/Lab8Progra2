
package lab8p2_pamelaramirez_12141141;

import java.awt.*;
import java.io.*;
import java.util.*;

public abstract class Carro implements Serializable {
    protected String nombre;
    protected int numId, distancia;
    protected Color color = null;
    protected Random r = new Random();
    
    public abstract int recorre();
    
    public Carro(String nombre, int numId, Color color) {
        this.nombre = nombre;
        this.numId = numId;
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carro{" + "nombre=" + nombre + ", numId=" + numId + ", distancia=" + distancia + ", color=" + color + '}';
    }
}
