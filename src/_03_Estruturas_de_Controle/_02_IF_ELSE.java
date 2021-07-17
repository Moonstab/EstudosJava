package _03_Estruturas_de_Controle;

import javax.swing.*;

public class _02_IF_ELSE {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um numero: ");

        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else System.out.println("O número " + numero + " é ímpar");
    }
}