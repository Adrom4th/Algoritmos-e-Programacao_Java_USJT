public class Metodos {
    Funcionario funcionario = new Funcionario(); //Declara uma variável de referência do tipo Funcionario e e instancia um objeto dessa classe

    public void impressaoDados(String nome, int idade, double[] salario) { //Método que imprime valores digitados pelo usuário
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salários: ");
        for (int i = 0; i < salario.length; i++) {
            System.out.println("R$" + salario[i]);
        }
    }

    public void mediaSalario(double[] salario) { //Método que calcula a media salarial do usuário
        double media = 0;
        for (int i = 0; i < salario.length; i++) {
            media += salario[i];
        }
        System.out.println("Média: ");
        System.out.println("R$" + media / salario.length);
    }
}
