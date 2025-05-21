/*
  3. Escrever um algoritmo que lê:
  - a porcentagem do IPI a ser acrescido no valor das peças
  - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
  - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
  O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
  Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1).
*/

import java.util.Scanner;

public class Exercício3 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Cadastro de peças automotivas.");
				
		System.out.print("Insira o valor da 1° peça:");
		double ValorPeca1 = sc.nextDouble();
		System.out.print("Insira a quantidade desejada:");
		int QuantPeca1 = sc.nextInt();

		System.out.print("Insira o valor da 2° peça:");
		double ValorPeca2 = sc.nextDouble();
		System.out.print("Insira a quantidade desejada:");
		int QuantPeca2 = sc.nextInt();

		System.out.println("Digite valor do imposto IPI a ser acrescentado (0-30%)");
		double IPI = sc.nextDouble();
		if(IPI > 0 && IPI < 30) {
			double Formula = (ValorPeca1*QuantPeca1 + ValorPeca2*QuantPeca2)*(IPI/100+1);
			System.out.println(+Formula);			
		}else {			
			System.out.println("Valor da IPI precisa ser válido.");
		}		
		sc.close();
    }   
}