package ListaExerciciosBasicos;
/*
Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões
ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la
 calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float hp, lp;
        float ha, la;
        float qauantidadeAzulejo = 0;
        float areaParede = 0;

        float Ap, Aa;

        System.out.println("Qual é a altura da parede: ");
        hp = Float.parseFloat(scan.next());

        System.out.println("Qual é a largura da parede: ");
        lp = Float.parseFloat(scan.next());

        System.out.println("Qual é a altura do azulejo: ");
        ha = Float.parseFloat(scan.next());

        System.out.println("Qual é a largura do azulejo: ");
        la = Float.parseFloat(scan.next());

        Ap = hp*lp;
        System.out.println(" A aréa da parede é: " + Ap);

        Aa = ha*la;
        System.out.println("A aréa do azulejo é: " + Aa);

        System.out.println("A quantidade de azulejos para preencher a parede é de: " + Ap/Aa);

    }

}
