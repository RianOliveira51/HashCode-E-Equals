package com.example.hashcodeeequals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HashcodeEequalsApplication {

    public static void main(String[] args) {
        //Equals - Return true ou false
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        //hashCode
        String c = "Maria";
        String d = "Aleex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

}
