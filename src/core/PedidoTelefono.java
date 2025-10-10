/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class PedidoTelefono extends Pedido{
    private String numero;

    public PedidoTelefono(Cliente cliente, String numero , ArrayList<Item> items) {
        super(cliente, items);
        this.numero = numero;
    }
    
}
