package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _4_verificar_num_primo {
    public static void main(String[] args) {
        System.out.println("verificador se o números que\n" +
                "você insere é um número primo");

        int ContadorDivisores = 0;
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                ContadorDivisores++;
            }
        }
        if (ContadorDivisores == 0) {
            System.out.println("\nO número " + a + " é primo");
        } else {
            System.out.println("\nO número " + a + " não é primo");
        }
        System.out.println("Fim");
        entrada.close();
    }
}
