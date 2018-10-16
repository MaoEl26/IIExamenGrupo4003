/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import caso4.*;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Gerardo Villalobos
 */

public class TestComposite {

    @Test
    public void testComplex() {
        Expresion e =
                new Restador(
                        new Sumador(
                                new Constante(8.0),
                                new Constante(6.0)
                        ),
                        new Sumador(
                                
                                new Multiplicador(new Constante(2.0), new Constante(4.0)),
                                new Constante(7.0)
                        )
                );
        assertEquals(-1, e.calculate(), 0.0);
    }
}