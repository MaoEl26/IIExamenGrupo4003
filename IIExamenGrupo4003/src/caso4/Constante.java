/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso4;

/**
 *
 * @author Gerardo Villalobos
 */
public class Constante implements Expresion {

    double value;

    public Constante(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
