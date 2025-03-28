import java.util.Scanner;

public class Atv2_ParImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma, diferenca; 

        System.out.println("Digite 2 números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1 + num2;
        diferenca = num1 - num2;

        if (soma % 2 == 0) {
            System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é um número par.");
        } else {
            System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é um número ímpar.");
        }

        if (diferenca > 0) {
            System.out.println("O resultado da diferença de " + num1 + " - " + num2 + " é um número positivo.");
        } else if (diferenca < 0) {
            System.out.println("O resultado da diferença de " + num1 + " - " + num2 + " é um número negativo.");
        } else if (diferenca == 0) {
            System.out.println("O resultado da diferença de " + num1 + " - " + num2 + " é igual a zero.");
        }

        sc.close();

    }
}