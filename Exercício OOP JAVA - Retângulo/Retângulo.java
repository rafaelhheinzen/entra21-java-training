public class Retângulo {
    double altura;
    double largura;

    public Retângulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        double area = this.largura * this.altura;
        return area;
    }

    public double calcularPerimetro(){
        double somaDasBases = this.largura * 2;
        double somaDasLaterais = this.altura * 2;
        double resultado = somaDasBases + somaDasLaterais;
        return resultado;
    }

    void exibirInformacoes(){
        System.out.println("");
        System.out.println("Largura: "+this.largura);
        System.out.println("Altura: "+this.altura);
        System.out.println("");

        System.out.println("");
        System.out.println("Valor Área: "+calcularArea());
        System.out.println("Valor do Perímetro: "+calcularPerimetro());
        System.out.println("");
    }
}
