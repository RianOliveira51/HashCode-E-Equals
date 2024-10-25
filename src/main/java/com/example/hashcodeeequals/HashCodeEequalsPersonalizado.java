package com.example.hashcodeeequals;

import com.example.hashcodeeequals.entities.Client;

public class HashCodeEequalsPersonalizado {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alex@gmail.com");
        Client c3 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //Comparando 1 objeto name e email do C1 com o C2 - falso
        System.out.println(c1.equals(c2));
        //Comparando 1 objeto name e email do C1 com o C3 - verdadeiro
        System.out.println(c1.equals(c3));
        //False pois tem posições de memoria diferentes, etnaõ a referencia de memoria é diferente, instanciamos em objetos diferentes
        System.out.println(c1 == c3);
        //True0 pois o compilador dá uma tratamento especial, quando não criado um objeto da forma comum (new)
        System.out.println(s1 == s2);
    }
}
