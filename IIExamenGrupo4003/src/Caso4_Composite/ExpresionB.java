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
public abstract class ExpresionB extends ExpresionU {

    protected Expresion left;

    public ExpresionB(Expresion left, Expresion right) {
        super(right);
        this.left = left;
    }
}