package _07_Classe_Método_2_Desafio;


public class Teste {
    public static void main(String[] args) {
        Jogo j1 = new Jogo("Cyberpunk 2077", 75, 200);

        Jogo j2 = new Jogo("Red Dead Redemption 2", 125, 200);

        Conta moonstab = new Conta("Moonstab", 0);

        System.out.println(moonstab.contaGeral());

        System.out.println(j1.jogoApresenta());
        moonstab.instalar(j1);
        System.out.println(moonstab.contaGeral());


        System.out.println(j2.jogoApresenta());
        moonstab.instalar(j2);
        System.out.println(moonstab.contaGeral());
    }
}
