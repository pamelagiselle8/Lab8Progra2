
package lab8p2_pamelaramirez_12141141;

import java.awt.Color;

public class Nascar extends Carro {

    public Nascar(String nombre, int numId, Color color) {
        super(nombre, numId, color);
    }

    @Override
    public int recorre() {
        return 40 + r.nextInt(140);
    }
    
}
