package com.example;

public class Product {
private String id;
private String name;
private double price;
private int stock;
 

// constructor 

public Product (){

}
// metodo getter 

public String getId(){
    return id;
}
public String getName(){
    return name;
}
public double getPrice(){
    return price;
}
public int getStock(){
    return stock;
}

// metodo setter 

public void setId(String id){
    this.Id = Id;
}
public void setname(String name){
    this.name = name;

}
public void setPrice(double price){
    if (price>=0){
        this.price = price;
    }else{
        system.out.println("el precio no puede ser negativo");
    }
   
}
public void setStock (int stock){
    if(stock >=0){
       this.stock = stock; 
    }else{
        system.out.println("el stock no puede ser negativo");
    }
    

// to string 
@Override
 public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }


}
