
package lab8p2_pamelaramirez_12141141;

import java.awt.Color;


public class Convertible extends Carro {

    public Convertible(String nombre, int numId, Color color) {
        super(nombre, numId, color);
    }
    
    @Override
    public int recorre() {
        return 20 + r.nextInt(180);
    }
    
}
