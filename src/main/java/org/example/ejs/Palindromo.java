package org.example.ejs;

import java.util.Scanner;

public class Palindromo {

    public void palindromo(Scanner teclado){
        int inicio = 0;
        boolean error = false;
        System.out.println("Escriba una palabra: ");
        String palabra = teclado.next();
        int fin = palabra.length()-1;


        while ((inicio<fin) && (!error)){

            if (palabra.charAt(inicio)==palabra.charAt(fin)){
                inicio++;
                fin--;
            } else {
                error = true;
            }
        }
        if(!error){
            System.out.println(palabra+" es un palíndromo");
        }else{
            System.out.println(palabra+" no es palíndromo");
        }

    }
}
