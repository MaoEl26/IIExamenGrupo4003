
package Caso5_Bridge;


import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Bubblesort extends AbstractMetodos{

    public Bubblesort(IOrdenamientos iordenamientos) {
        super(iordenamientos);
    }

    @Override
    public void algoritmo(ArrayList<Integer> lista) {
        System.out.println("Aqui se hace un bubblesort");
    }
    
}
