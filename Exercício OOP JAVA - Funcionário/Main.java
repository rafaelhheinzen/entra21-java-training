public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rafael", 16478);
        funcionario.exibirDados();

        funcionario.aumentarSalario(1.1345);
        funcionario.exibirDados();
    }
}
