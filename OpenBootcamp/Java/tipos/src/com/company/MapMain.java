package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String,String> personas = new HashMap<>();

        personas.put("12345678H","Nombre Apellido 1");
        personas.put("12345678L","Nombre Apellido 2");
        personas.put("12345678P","Nombre Apellido 3");

        System.out.println(personas);

        for(String key: personas.keySet()){//Nos da todas las llaves de la lista
            System.out.println(key);
        }
        for(String values: personas.values()){//Nos da todas los valores de la lista
            System.out.println(values);
        }

        for(Map.Entry<String,String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
