
package lab8p2_pamelaramirez_12141141;

import java.awt.Color;


public class McQueen extends Carro {

    public McQueen(String nombre, int numId, Color color) {
        super(nombre, numId, color);
    }

    @Override
    public int recorre() {
        return 30 + r.nextInt(160);
    }
    
}
