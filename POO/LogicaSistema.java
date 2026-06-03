import java.util.Scanner;

public class Acoes {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Olá! Para continuar, digite seu Nome, Idade e três Salários que recebe: ");
        System.out.println("Nome: ");
        funcionario.setNome(scanner.nextLine()); //Define com Set o valor da variável privada "nome" da classe Funcionario

        System.out.println("Idade: ");
        funcionario.setIdade(scanner.nextInt()); //Define com Set o valor da variável privada "idade" da classe Funcionario


        double[] salario = new double[3];
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salario " + (i + 1) + ": ");
            salario[i] = scanner.nextDouble();
        }
        funcionario.setSalario(salario); //Define com Set o valor da variável privada "salario" da classe Funcionario


        Metodos metodos = new Metodos(); //Declara uma variável de referência do tipo Metodos e instancia um objeto dessa classe
        metodos.impressaoDados(funcionario.getNome(), funcionario.getIdade(), funcionario.getSalario()); //Chama o método que imprime nome, idade e salários do funcionário

        metodos.mediaSalario(funcionario.getSalario()); //Chama o método que calcula e exibe a média salarial
    }
}
