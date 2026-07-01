public class Carro {
    String modelo;
    String marca;
    double velocidadeAtual;

    public Carro(String modelo, String marca, double velocidadeAtual){
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
    }

    void acelerar(int velocidade){
        if(velocidade < 0){
            System.out.println("A velocidade não pode ser negativa!");
        }else{
        this.velocidadeAtual = this.velocidadeAtual+velocidade;
        }
    }

    void frear(){
        this.velocidadeAtual = 0;
    }

    void exibirVelocidade(){
        System.out.println(this.velocidadeAtual);
    }

    void exibirInformacoes(){
        System.out.println("");
        System.out.println("");
        System.out.println("Nome do modelo: "+this.modelo);
        System.out.println("Nome do marca: "+this.marca);
        System.err.println("Velocidade Atual -> "+this.velocidadeAtual);
    }


}
