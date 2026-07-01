public class Main {
    public static void main(String[] args) {
        Livro ratatuile = new Livro("ratatuile", "remi", true);
        
        ratatuile.exibirInformacoes();

        ratatuile.emprestar();

        ratatuile.exibirInformacoes();

        ratatuile.emprestar();

        ratatuile.exibirInformacoes();
    }
}
