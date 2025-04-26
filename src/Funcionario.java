public class Funcionario {
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

    private String nome;
    private double salario;

    public Funcionario(){
        this.nome = "Funcionário";
        this.salario = 0;
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public double calcularBonus(){
        double bonus = 10% salario;
        return bonus;
    }
}
