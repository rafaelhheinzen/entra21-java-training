public class Celular {
    String modelo;
    int bateria;

    public Celular(String modelo, int bateria) {
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public int carregar(int valor) {

        if (valor < 0) {
            System.out.println("O valor tem que ser um número positivo!");
        }

        int bateria = this.bateria + valor;

        if (bateria > 100) {
            System.out.println("A bateria não pode ser superior a 100!");
        }

        return bateria;
    }

    public int usar(int valor) {

        if (valor < 0) {
            System.out.println("O valor tem que ser um número positivo!");
        }

        int bateria = this.bateria - valor;

        if (bateria < 0) {
            bateria = 0;
        }

        return bateria;
    }

    void mostrarBateria() {

        System.out.println("Bateria atual:" + this.bateria);

    }
}
