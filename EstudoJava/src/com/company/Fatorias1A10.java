package com.company;

public class Fatorias1A10 {

    public static void main(String[] args) {

        int fatorial = 1; // inicializando variavel com o fatorial de 0
        for (int contador = 1; contador <= 10; contador = contador + 1) {

            fatorial = contador * fatorial;
            System.out.println(fatorial);
        }
    }
}


