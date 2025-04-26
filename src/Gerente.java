public class Gerente extends Funcionario {
    private double bonusExtra;

    public Gerente(String nome, double salario, double bonusExtra){
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }
    @Override
    public double calcularBonus(){
        return ((getSalario() * 10) / 100) + (getSalario() * bonusExtra) / 100 ;
    }
}
