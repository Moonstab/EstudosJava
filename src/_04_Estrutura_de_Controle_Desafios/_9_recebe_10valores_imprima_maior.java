package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _9_recebe_10valores_imprima_maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int contador = 0;

        do {
            System.out.println("\nDigite um número ");
            int valor = entrada.nextInt();

            if (valor > maior) {
                maior = valor;
            }

            contador++;
        } while (contador != 10);

        System.out.printf("O maior número inserido foi : %d", maior);
        entrada.close();
    }
}
