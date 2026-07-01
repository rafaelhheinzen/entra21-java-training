public class Veiculo {
    String placa;
    String modelo;
    int ano;
    boolean disponivel;

    public Veiculo(String placa, String modelo, int ano, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    void alugarVeiculo() {
        this.disponivel = false;
    }

    void devolverVeiculo() {
        this.disponivel = true;
    }

    void exibirVeiculo() {

        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Disponível: "+this.disponivel);

    }
}
