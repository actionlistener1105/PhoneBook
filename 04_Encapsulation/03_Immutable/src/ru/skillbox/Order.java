package ru.skillbox;

public class Order {
    public void addProduct(Product product){
        //add product
        if(product.getPrice() > 50 ){
            product.setPrice(product.getPrice() -25); //скидка
        }
    }
}
