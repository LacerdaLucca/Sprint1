import java.text.DecimalFormat;

public interface Cadastro {
    public static void cadastroSalario() {
        int quantFunc = 0;
        double salario = 0.0, bonus = 0.0, salLiq = 0.0;
        String nome = "";
        System.out.println("Quantos funcionarios serao cadastrados?");
        quantFunc = Entradas.readInt();
        Funcionario[] listaFuncionario = new Funcionario[quantFunc];
        for (int i = 0; i < quantFunc; i++) {
            System.out.println("Escreva o nome do funcionario");
            nome = Entradas.readString();
            System.out.println("Escreva o seu salario");
            salario = Entradas.readDouble();
            listaFuncionario[i] = new Funcionario(nome,salario);
        }
        for (int i = 0; i < quantFunc; i++) {
            nome = listaFuncionario[i].getNome();
            salario = listaFuncionario[i].getSalario();
            bonus = listaFuncionario[i].getBonus();
            salLiq = salario+bonus;
            System.out.println("Funcionario: " + nome +
                    "\nSalario: " + salario +
                    "\nBonus: " + bonus +
                    "\nSalario Liquido: "+ salLiq +
                    "\n");
        }
    }
}
