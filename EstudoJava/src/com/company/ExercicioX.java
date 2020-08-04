package com.company;

public class ExercicioX {

    public static void main(String[] args) {
        for (int part = 150; part <= 300; part = part + 1) {
            System.out.println(part);
        }

        int soma = 0;
        for (int contador = 1; contador <= 1000; contador++) {
            soma = soma + contador;

            System.out.println("Contador: " + contador + " soma: " + soma);
        }

        for (int contador = 3; contador <= 100; contador++) {
            if (contador % 3 == 0) {
                System.out.println("multiplos de 3: " + contador);
            }
        }

        int fatorial = 1; // inicializando variavel com o fatorial de 0
        for (int contador = 1; contador <= 10; contador = contador + 1) {

            fatorial = contador * fatorial;
            System.out.println(fatorial);
        }
    }
}

