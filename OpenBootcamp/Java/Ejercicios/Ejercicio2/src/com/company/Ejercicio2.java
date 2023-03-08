package com.company;

public class Ejercicio2 {
    public static void main(String[] args) {
        double price = 100d;
        System.out.println("Precio sin iva: " + price);
        double priceIVA = getPriceIVA(price);
        System.out.println("Precio con iva: " + priceIVA );
    }

    static double getPriceIVA(double price){
        return (price * .16) + price;
    }
}
