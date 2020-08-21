package exerciciosExcecoes;

public class ContaPoupanca {
    private double saldo;

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Voce tentou depositar " + "um valor negativo");
        }

        this.saldo += valor - 0.10;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
