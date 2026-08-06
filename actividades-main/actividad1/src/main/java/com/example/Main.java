package com.example;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product ("0001","gaseosa",1200.0,8);
        Product p2 = new Product ("0002","papitas","2500.0",5);
        Product p3 = new Product ("0003","chicle","500.0",12);
    }

    // cambiar dos objetos 

    p1.setname("empanada");
    p2.setprice(4000.0);

    //imprimiendo con setters 
    System.out.println("Producto 1 -> Nombre: " + p1.getName() + " | name: " + p1.getname());
    System.out.println("Producto 2 -> Nombre: " + p2.getName() + " | price: " + p2.getprice());
}