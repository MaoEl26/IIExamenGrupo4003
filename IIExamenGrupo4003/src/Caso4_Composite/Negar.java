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
public class Negar extends ExpresionU {

    public Negar(Expresion right) {
        super(right);
    }

    @Override
    public double calculate() {
        return -right.calculate();
    }
}