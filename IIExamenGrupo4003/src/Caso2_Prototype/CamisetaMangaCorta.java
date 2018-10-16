/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Prototype;

/**
 *
 * @author mcv26
 */
public class CamisetaMangaCorta extends Camiseta {
    public CamisetaMangaCorta(String nombre,Integer talla, String color, String estampado){
        super(nombre,talla,color,"Larga",estampado);
        
    }
    
    public CamisetaMangaCorta(){
        super();
        setColor("Azul");
        setNombre("Prototipo");
        setManga("Manga Corta");
        setTalla(20);
        setEstampado("Rayas Verticales");
    }
    
    @Override
    public Camiseta clone(){
            return new CamisetaMangaCorta(this.getNombre(),this.getTalla(),this.getColor(),this.getEstampado());
    }
    
    @Override
    public String toString(){
        return "Camiseta Manga Corta {"+super.toString()+"}";
    }
}
