public class Conta {

    // atributos da classe conta (variaveis dos tipos int, double e string)
    int numeroConta;
    double saldo;
    double limite;
    String nome;

    // metodo saca
    public void saca(double valor) {
        saldo = saldo - valor;
    }

    // metodo deposita
    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}
