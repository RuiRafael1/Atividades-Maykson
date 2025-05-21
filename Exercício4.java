/*
  4. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário 
  de um usuário, calcule a quantidade de salários mínimos esse usuário ganha
  e imprima o resultado. (1SM=R$1.509,00). 
*/

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = sc.nextInt();

        salario /= 1509; 

        System.out.printf("Quantidade de salários minímos ganhos: %.2f", salario);
        sc.close();
    }
}