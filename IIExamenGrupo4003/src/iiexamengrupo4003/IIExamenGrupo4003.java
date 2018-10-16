/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo4003;

import Caso2_Prototype.Camiseta;
import Caso2_Prototype.cache;

/**
 *
 * @author mcv26
 */
public class IIExamenGrupo4003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cache prototipos  = new cache();
        try {
            Camiseta unaCamisa = (Camiseta) prototipos.getPrototipo("MangaLarga");
            System.out.println("La Camisa Prototipada es " + unaCamisa);
            
        } catch (CloneNotSupportedException ex) {
            System.out.println("Problema generado clon de la camisa solicitada");
        }
    }
    
}
