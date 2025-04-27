public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){
        this.nome = "Funcionário não cadastrado";
        this.salario = 0;
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    //Getters e Setters:

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

    //Métodos:

    public double calcularBonus(){
        return (salario * 10) / 100;
    }

    public double calcularBonus(double percentualExtra){
        return 10% salario + percentualExtra% salario;
    }

    public String exibirDados(){
        return String.format("Nome do funcionário: %s\nSalário: %.2f\nBônus: %.2f\n", getNome(),  getSalario(), calcularBonus());
    }
}
