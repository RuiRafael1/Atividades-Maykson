/*
  1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
  meses e dias e mostre-a expressa em dias. Leve em consideração o
  ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias).
*/

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Acumulador =0;   
    
        System.out.println("Calculadora de anos,meses e dias, retornando a soma dos valores em dias.");
               
                System.out.println("Quantos dias quer adicionar para a soma?");
                int dia = sc.nextInt(); 
                System.out.println("Quantos meses quer inserir para a soma?");
                int mes = sc.nextInt();    
                System.out.println("Quantos anos quer adicionar para a soma?");
                int ano = sc.nextInt();
                Acumulador =+ (mes*30) + (ano*365) + dia;  
                System.out.println("Resultado: "+Acumulador+" dias");          
        sc.close();
    }
}