public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Data data = new Data();

        Funcionario funcionario1 = new Funcionario();
        Data data1 = new Data();

        data.setDia(24);
        data.setMes(6);
        data.setAno(1997);
        funcionario.setNome("Caio Henrique Ferreira da Silva");
        funcionario.setDepartamento("Gerente");
        funcionario.setSalario(6000);
        funcionario.setDataEntrada(data);
        funcionario.setRg("39.137.011-x");

        data1.setDia(5);
        data1.setMes(2);
        data1.setAno(1991);
        funcionario1.setNome("Caina Ferreira da Silva");
        funcionario1.setDepartamento("Gestor");
        funcionario1.setSalario(8500.0);
        funcionario1.setDataEntrada(data1);
        funcionario1.setRg("23.015.019-7");

        funcionario.recebeAumento(1500.0);
        System.out.println("Salario atual com aumento funcionario: " + funcionario.getSalario());
        funcionario.calculoGanhoAnual();
        System.out.println("Salario anual funcionario: " + funcionario.getSalario());

        funcionario1.recebeAumento(2000);
        System.out.println("Salario atual com aumento funcionario1: " + funcionario1.getSalario());
        funcionario1.calculoGanhoAnual();
        System.out.println("Salario anual funcionario1: " + funcionario1.getSalario());

        funcionario.mostra();
        funcionario1.mostra();

    }

}
