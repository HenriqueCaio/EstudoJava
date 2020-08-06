public class Funcionario {

    // atributos da classe funcionario
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;

    // metodo recebe aumento
    public void recebeAumento(double valor) {
        salario = salario + valor;
    }

    // metodo calculo ganho anual
    public void calculoGanhoAnual() {
        salario = salario * 12;
    }

    // metodo para mostrar todos os atributos do funcionario
    public void mostra() {
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Departamento do funcionario: " + departamento);
        System.out.println("Salario do funcionario: " + salario);
        System.out.println("Data de entrada no banco: " + dataEntrada.dia + "-" + dataEntrada.mes + "-" + dataEntrada.ano);
        System.out.println("Rg do funcionario: " + rg);
    }
}
