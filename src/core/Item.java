/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Esteban
 */
public class Item {
    private long id;
    private String nombre;
    private float valor;

    public Item(String nombre, float valor) {
        
        this.nombre = nombre;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }
    
}
