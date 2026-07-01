public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Ponte para Terabítia", "Katherine Paterson", 1);
        Livro livro2 = new Livro("1984", "George Orwell", 2);
        Usuario usuario = new Usuario("Rafael", 123);


        livro.exibirLivro();
        livro2.exibirLivro();

        livro.emprestarLivro();
        livro2.emprestarLivro();

        livro.exibirLivro();
        livro2.exibirLivro();


    }
}
