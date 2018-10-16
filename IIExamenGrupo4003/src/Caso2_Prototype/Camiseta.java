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
public abstract class Camiseta implements IPrototype{
    private String nombre;
    private Integer talla;
    private String color;
    private String manga;
    private String estampado;

    protected Camiseta (String nombre,Integer talla, String color, String manga, String estampado){
            this.nombre = nombre;
            this.talla = talla;
            this.color = color;
            this.manga = manga;
            this.estampado = estampado;
    }
    
    protected Camiseta(){
        
    }
    @Override
    public IPrototype clone(){
                try {
            return (IPrototype) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString(){
        return "Camiseta { Nombre = "+nombre+", manga = "+manga+", color = "+
                color+", talla = "+talla+", estampado = "+estampado+"}";
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the talla
     */
    public Integer getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the manga
     */
    public String getManga() {
        return manga;
    }

    /**
     * @param manga the manga to set
     */
    public void setManga(String manga) {
        this.manga = manga;
    }

    /**
     * @return the estampado
     */
    public String getEstampado() {
        return estampado;
    }

    /**
     * @param estampado the estampado to set
     */
    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }
}
