
package Caso5_Bridge;

import java.util.ArrayList;


public abstract class AbstractMetodos {
    
    protected IOrdenamientos iordenamientos;
    
    public AbstractMetodos(IOrdenamientos iordenamientos){
        this.iordenamientos = iordenamientos;
    }
    
    public abstract void algoritmo(ArrayList<Integer> lista);
    
}
