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
public class Principal {
    
    public static void main(String[] args) {
    
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
        
        System.out.println("La expresión da como resultado: " + e.calculate());
    
    }
    
}
