
package Caso5_Bridge;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Descendente implements IOrdenamientos{

    @Override
    public void ordenar(ArrayList<Integer> lista) {
        System.out.println("Aqui se ordena desscendentemente");
    }
    
    
}
