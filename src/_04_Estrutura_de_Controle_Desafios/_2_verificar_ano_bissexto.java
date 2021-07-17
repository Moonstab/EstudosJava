package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _2_verificar_ano_bissexto {
    public static void main(String[] args) {

        System.out.println("verificador se o ano que\n" +
                "você insere é bissexto");

        Scanner entrada = new Scanner(System.in);
        int ano = entrada.nextInt();

        int bissexto = ano % 4;
        if (bissexto == 0) {
            System.out.println(ano + " é um ano Bissexto");
        } else {
            System.out.println(ano + " não é um ano Bissexto");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}
