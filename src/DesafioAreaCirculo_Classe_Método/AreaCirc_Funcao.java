package DesafioAreaCirculo_Classe_Método;

public class AreaCirc_Funcao {

    double raio;
    public static double pi = 3.14;

    AreaCirc_Funcao(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return pi * raio * raio;
    }
}
//ou return pi * Math.pow(raio, 2)

