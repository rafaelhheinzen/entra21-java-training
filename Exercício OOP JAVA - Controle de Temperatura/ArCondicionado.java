public class ArCondicionado {
    int temperaturaAtual;

    public ArCondicionado(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public int aumentarTemperatura(int valor) {

        if (valor < 0) {
            System.out.println("O valor tem que ser um número positivo!");
        }

        int temperatura = this.temperaturaAtual + valor;

        if (temperatura > 30) {
            System.out.println("A temperatura máxima só pode ser 30 graus");
        }

        if (temperatura < 16) {
            System.out.println("A temperatura não pode ser menor que 16 graus");
        }

        return temperatura;
    }

    public int diminuirTemperatura(int valor) {

        if (valor < 0) {
            System.out.println("O valor tem que ser um número positivo!");
        }

        int temperatura = this.temperaturaAtual - valor;

        if (temperatura > 30) {
            System.out.println("A temperatura máxima só pode ser 30 graus");
        }

        if (temperatura < 16) {
            System.out.println("A temperatura não pode ser menor que 16 graus");
        }
        return temperatura;
    }

    void exibirValores() {

        System.out.println("Temperatura atual:" + temperaturaAtual);

    }
}
