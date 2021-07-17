package _02_Fundamentos_Desafios;

import java.util.Scanner;

public class Desafio_Conta_Luz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o consumo diário de kw ");
        double diaria = entrada.nextDouble();

        System.out.println("Informe o numero de dias no mês ");
        double diames = entrada.nextDouble();

        double consumo = diaria * diames;
        System.out.printf("Consumo em kw dia corresponde a : %.2f ", consumo);

        //o valor 0.56 é exatamente o valor real do kwh no estado da paraína.
        double valor = consumo * 0.56;
        System.out.printf("\nValor a se pagar pelo consumo de kwh neste mês é : %.2f ", valor);

        entrada.close();
    }
}