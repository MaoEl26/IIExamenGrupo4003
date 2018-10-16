
package Caso5_Bridge;

import java.util.ArrayList;

public class Insertsort extends AbstractMetodos{

    public Insertsort(IOrdenamientos iordenamientos) {
        super(iordenamientos);
    }

    @Override
    public void algoritmo(ArrayList<Integer> lista) {
        System.out.println("Aqui se hace un insertsort");
    }
    
}