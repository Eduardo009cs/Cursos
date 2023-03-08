package com.company;

public class StringMain {
    public static void main(String[] args) {
        //Clase String

        /*
        * length()
        * startsWith("")
        * endsWith("")
        * indexOf("")
        * subString(1,5)
        * trim("")
        * equals()
        * compareTo
        * */

        String mensaje = " Hola mundo ";

        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();
        String otro = "hola mundo";
        if (mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("Verdadero!!");
        }
    }
}
