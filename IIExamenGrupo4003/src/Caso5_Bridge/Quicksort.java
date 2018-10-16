/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso5_Bridge;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Quicksort extends AbstractMetodos{

    public Quicksort(IOrdenamientos iordenamientos) {
        super(iordenamientos);
    }

    @Override
    public void algoritmo(ArrayList<Integer> lista) {
        System.out.println("Aqui se hace un quicksort");
    }
    
}
