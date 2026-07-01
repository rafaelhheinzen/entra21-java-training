public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public double nota1() {
        return this.nota1;
    }

    public double nota2() {
        return this.nota2;
    }
}
