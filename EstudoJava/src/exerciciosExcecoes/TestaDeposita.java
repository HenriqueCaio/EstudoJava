package exerciciosExcecoes;

public class TestaDeposita {
    public static void main(String[] args) {

        ContaPoupanca cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e) {

            System.out.println("Voce tentou depositar um valor invalido ");
        }
    }
}