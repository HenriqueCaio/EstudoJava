public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Caio Henrique Ferreira da Silva";
        funcionario.departamento = "Gerente";
        funcionario.salario = 6000.0;
        funcionario.dataEntrada = "24/06/1997";
        funcionario.rg = "39.137.011-X";

        funcionario.recebeAumento(1500.0);
        System.out.println(funcionario.salario);

        funcionario.calculoGanhoAnual();
        System.out.println(funcionario.salario);
    }
}
