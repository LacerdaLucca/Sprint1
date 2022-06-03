public class Funcionario {
    private String nome;
    private double salario;
    private double bonus;

    public Funcionario(){
        this.nome = "";
        this.salario = 0.0;
        this.bonus = 0.0;
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        setBonus(bonificacao(salario));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double bonificacao(double salario){
        double bonificacao = 0.0;
        if(salario <= 1000){
            bonificacao = salario*0.2;
        }else if(salario <=2000){
            bonificacao = salario*0.1;
        }else{
            bonificacao = -(salario*0.1);
        }
        return bonificacao;
    }
}
