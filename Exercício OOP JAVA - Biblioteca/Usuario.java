public class Usuario {
    String nome;
    int matricula;

    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    void exibirUsuario(){
        System.out.println("Nome do usuário: "+this.nome);
        System.out.println("Matrícula: "+this.matricula);
    }
}
