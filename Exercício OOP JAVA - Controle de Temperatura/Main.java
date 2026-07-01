public class Main {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado(20);
        arCondicionado.exibirValores();

        arCondicionado.aumentarTemperatura(5);

        arCondicionado.exibirValores();
    }
}
