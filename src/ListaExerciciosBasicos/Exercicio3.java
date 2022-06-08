package ListaExerciciosBasicos;
/*
 Criar um programa que calcule a média de salários de uma empresa
 pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int funcionario;
        Float salario = null;
        Float media;


        System.out.println("Digite o número de funcionários na empresa: ");
        funcionario = Integer.parseInt(scan.next());

        int i;
        float soma = 0;
        for (i = 1; i <= funcionario; i++) {
            System.out.println(" Informe o salário do funcionário: " );
            salario = scan.nextFloat();

            soma = soma + salario;
        }
         media = soma/funcionario;
        System.out.println(" A média salarial dessa empresa é: " + media );
    }

}
