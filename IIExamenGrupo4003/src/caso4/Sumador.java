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
public class Sumador extends ExpresionB {

    public Sumador(Expresion left, Expresion right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() + right.calculate();
    }
}
