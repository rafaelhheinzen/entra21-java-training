public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    void aumentarSalario(double percentual){
        this.salario = this.salario*percentual;
    }

    public double calcularSalarioAnual(){
        double salarioAnual = this.salario*12;

        return salarioAnual;
    }

    void exibirDados(){
        System.out.println("");
        System.out.println("");
        System.out.println("Nome do funcionário: "+getNome());
        System.out.println("Salário mensal: "+getSalario());
        System.out.println("Salário anual: "+calcularSalarioAnual());
        System.out.println("");
        System.out.println("");
    }
}
