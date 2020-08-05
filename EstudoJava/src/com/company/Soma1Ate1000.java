package com.company;

public class Soma1Ate1000 {

    public static void main(String[] args) {

        int soma = 0;
        for (int contador = 1; contador <= 1000; contador++) {
            soma = soma + contador;

            System.out.println("Contador: " + contador + " soma: " + soma);
        }
    }
}
