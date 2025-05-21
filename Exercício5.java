/*
  5. Desenvolva um algoritmo em Java que leia um número inteiro e imprima
   o seu antecessor e seu sucessor.
*/

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        System.out.println("Antecessor: " + (num - 1));
        
        System.out.println("Sucessor: " + (num + 1));
        sc.close();
    }
}