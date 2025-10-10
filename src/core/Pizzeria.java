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
public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    public Item getItem(int i){
        return this.items.get(i);
    }
    public Cliente getCliente(int i){
        return this.clientes.get(i);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public int calcProdMasVendidoCliente(int i){
        int Lasagna = 0;
        int Pizza = 0;
        int Calzone = 0;
        int Pasta = 0;
        int Ravioli = 0;
        for(Pedido pedido : this.pedidos){
            if(pedido.getCliente()==this.clientes.get(i)){

                for(Item ite: pedido.getItems()){
                    for(int j=0;j<=this.items.size()-1;j++){

                        if(ite == this.items.get(j)){
                            switch (j){
                                case 0:
                                    Lasagna +=1;
                                    break;
                                case 1:
                                    Pizza +=1;
                                    break;
                                case 2:
                                    Calzone +=1;
                                    break;
                                case 3:
                                    Pasta += 1;
                                    break;
                                case 4:
                                    Ravioli +=1;
                                    break;
                            }

                        }
                    }
                }
            }
        }
        
        int mayor = 0;
        int id = -1;
        if(Lasagna > mayor){
            mayor = Lasagna;
            id = 0;
        }
        if(Pizza > mayor){
            mayor = Pizza;
            id = 1;
        }
        if(Calzone > mayor){
            mayor = Calzone;
            id = 2;
        }
        if(Pasta > mayor){
            mayor = Pasta;
            id = 3;
        }
        if(Ravioli > mayor){
            mayor = Ravioli;
            id = 4;
        }
        switch (id){
            case 0:
                System.out.println(Lasagna);
                System.out.println(id);
                break;
            case 1:
                System.out.println(Pizza);
                System.out.println(id);
                break;
            case 2:
                System.out.println(Calzone);
                System.out.println(id);
                break;
            case 3:
                System.out.println(Pizza);
                System.out.println(id);
                break;
            case 4:
                System.out.println(Ravioli);
                System.out.println(id);
                break;
        }
        return id;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int Lasagna = 0;
//        int Pizza = 0;
//        int Calzone = 0;
//        int Pasta = 0;
//        int Ravioli = 0;
//        System.out.println("24");
//        for(Pedido pedido: this.clientes.get(i).getPedidos()){
//            System.out.println("12");
//            for(Item ite: pedido.getItems()){
//                for(int j=0;j<=this.items.size()-1;j++){
//                    System.out.println("1");
//                    if(ite == this.items.get(j)){
//                        switch (j){
//                            case 0:
//                                Lasagna +=1;
//                                break;
//                            case 1:
//                                Pizza +=1;
//                                break;
//                            case 2:
//                                Calzone +=1;
//                                break;
//                            case 3:
//                                Pasta += 1;
//                                break;
//                            case 4:
//                                Ravioli +=1;
//                                break;
//                        }
//                        System.out.println("e");
//                    }
//                }
//            }
//        }
//        int mayor = 0;
//        int id = -1;
//        if(Lasagna > mayor){
//            mayor = Lasagna;
//            id = 0;
//        }
//        if(Pizza > mayor){
//            mayor = Pizza;
//            id = 1;
//        }
//        if(Calzone > mayor){
//            mayor = Calzone;
//            id = 2;
//        }
//        if(Pasta > mayor){
//            mayor = Pasta;
//            id = 3;
//        }
//        if(Ravioli > mayor){
//            mayor = Ravioli;
//            id = 4;
//        }
//        return id;
    }
}
