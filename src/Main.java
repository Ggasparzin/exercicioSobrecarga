public class Main {
    public static void main(String[] args) {
    Funcionario thiago = new Funcionario("Thiago", 1987.32);
    Gerente fabricio = new Gerente("Fabrício", 2970, 20);

        System.out.println(thiago.exibirDados());

        System.out.println(fabricio.exibirDados());

    }
}