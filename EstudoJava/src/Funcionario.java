public class Funcionario {

    // atributos da classe funcionario
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    // metodo recebe aumento
    public void recebeAumento(double valor) {
        salario = salario + valor;
    }

    // metodo calculo ganho anual
    public void calculoGanhoAnual() {
        salario = salario * 12;

    }

}
