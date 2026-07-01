public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford F-1000", "Ford", 0);


        //DIRIGA O CARRO
        //COMANDOS:
        // exbiriInformacoes()
        // acelerar(velocidade)
        // frear()
        // velocidadeAtual()


        carro.exibirInformacoes();
        carro.acelerar(-100);
        carro.exibirInformacoes();
        carro.frear();
    }
}
