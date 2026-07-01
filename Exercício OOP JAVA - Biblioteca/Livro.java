public class Livro {
    String titulo;
    String autor;
    int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    int emprestarLivro() {
        this.quantidadeDisponivel = this.quantidadeDisponivel - 1;
        return this.quantidadeDisponivel;
    }

    int devolverLivro() {
        this.quantidadeDisponivel = this.quantidadeDisponivel + 1;
        return this.quantidadeDisponivel;
    }

    void exibirLivro() {

        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Quantidade disponível: " + this.quantidadeDisponivel);

    }
}
