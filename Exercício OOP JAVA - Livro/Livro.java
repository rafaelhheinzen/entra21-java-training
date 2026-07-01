public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    void emprestar(){
        if(this.disponivel == false){
            System.out.println("Esse livro já está sendo empresatado!");
        }else{
            this.disponivel = false;
        }

    }
    
    void devolver(){
        if(this.disponivel == true){
            System.out.println("Esse livro já foi devolvido!");
        }else{
            this.disponivel = true;
        }

    }
    
    void exibirInformacoes(){
        System.out.println("");
        System.out.println("");
        System.out.println("Nome do livro: "+this.titulo);
        System.out.println("Nome do autor: "+this.autor);
        System.err.println("Está disponível? -> "+this.disponivel);
    }


}
