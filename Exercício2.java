/*
  2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
  A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
  Informar um saldo e imprimir o saldo com reajuste de 1%. 
*/

public class Exercício2 {
    public static void main(String[] args) {
        System.out.print("Média dos valores 7,8 e 9: ");
        int media1 = (7 + 8 + 9) / 3;
        System.out.println(media1);

        System.out.print("Média dos valores 4,5 e 6: ");
        int media2 = (4 + 5 + 6) / 3;
        System.out.println(media2);

            double SomaDasMedias = media1 + media2;
        System.out.print("Soma das médias: " + SomaDasMedias+"\n");

            SomaDasMedias /= 2;
        System.out.print("Média das médias: " + SomaDasMedias+"\n");

            SomaDasMedias += SomaDasMedias * 0.01;
        System.out.print("Média das médias com acréscimo de 1%: " + SomaDasMedias);
    }
}