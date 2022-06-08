package ListaExerciciosBasicos;

import java.util.Scanner;

/*
 Escreva um programa que, com base em uma temperatura em graus celsius,
 a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
 seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/
public class Exercicio1 {
    public static void main(String[] args) {

        double C = 1;
        double K, Re, Ra, F;


        K = C + 273.15;
        System.out.println("A temperatura em Kelvin é : " + K);

        Re = C * 0.8;
        System.out.println("A temperatura em Réaumur é : " + Re);

        Ra = C * 1.8 + 32 + 459.67;
        System.out.println("A temperatura em Rankine é : " + Ra);

        F = C * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é : " + F);

        

    }
}
