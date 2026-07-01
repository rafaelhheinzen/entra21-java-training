public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("1203cx", "F-1100", 1979, false);

        veiculo.exibirVeiculo();
        veiculo.alugarVeiculo();
        veiculo.exibirVeiculo();
        veiculo.alugarVeiculo();
        veiculo.devolverVeiculo();
        veiculo.exibirVeiculo();


    }
}
