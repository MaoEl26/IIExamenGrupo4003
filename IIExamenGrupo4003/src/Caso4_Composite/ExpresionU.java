/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_Composite;

/**
 *
 * @author Gerardo Villalobos
 */
public abstract class ExpresionU implements Expresion {
    protected Expresion right;

    public ExpresionU(Expresion right) {
        this.right = right;
    }
}
