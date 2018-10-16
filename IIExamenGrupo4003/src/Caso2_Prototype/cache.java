/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Prototype;

import java.util.HashMap;

/**
 *
 * @author mcv26
 */
public class cache {
    private HashMap<String, Camiseta> camisasBase = new HashMap<>();
    
    public cache(){
        String nombre = "IIExamenGrupo4003";
        Integer talla = 22;
        String color = "Negra";
        String estampado = "Logo Toyota Rojo Espalda";
        String color2 = "Blanca";
        String estampado2 = "Logo Corona Toyota Corolla 1978 Azul";
        
        camisasBase.put("MangaCorta", new CamisetaMangaCorta(nombre, talla, color, estampado));
        camisasBase.put("MangaLarga", new CamisetaMangaLarga(nombre, talla, color2, estampado2));
    }
    
    public IPrototype getPrototipo(String tipo)throws CloneNotSupportedException{
        return camisasBase.get(tipo).clone();
    }
}
