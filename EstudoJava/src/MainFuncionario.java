public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Data data = new Data();

        Funcionario funcionario1 = new Funcionario();
        Data data1 = new Data();

        data.dia = 24;
        data.mes = 6;
        data.ano = 1997;
        funcionario.nome = "Caio Henrique Ferreira da Silva";
        funcionario.departamento = "Gerente";
        funcionario.salario = 6000.0;
        funcionario.dataEntrada = data;
        funcionario.rg = "39.137.011-X";

        data1.dia = 5;
        data1.mes = 2;
        data1.ano = 1991;
        funcionario1.nome = "Caina Ferreira da Silva";
        funcionario1.departamento = "Gestor";
        funcionario1.salario = 8500.0;
        funcionario1.dataEntrada = data1;
        funcionario1.rg = "23.015.019-7";

        funcionario.recebeAumento(1500.0);
        System.out.println("Salario atual com aumento funcionario: " + funcionario.salario);
        funcionario.calculoGanhoAnual();
        System.out.println("Salario anual funcionario: " + funcionario.salario);

        funcionario1.recebeAumento(2000);
        System.out.println("Salario atual com aumento funcionario1: " + funcionario1.salario);
        funcionario1.calculoGanhoAnual();
        System.out.println("Salario anual funcionario1: " + funcionario1.salario);

        funcionario.mostra();
        funcionario1.mostra();

    }

}
