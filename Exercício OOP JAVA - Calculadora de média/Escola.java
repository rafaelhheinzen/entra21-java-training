public class Escola{

    Aluno aluno = new Aluno("Rafael", 10, 6);

    public double calcularMedia(){
        double nota1 = aluno.nota1();
        double nota2 = aluno.nota2();

        double s1 = nota1 + nota2;
        double s2 = s1/2;

        return s2;
    }

    public void verificarSituacao(){
        double media = calcularMedia();

        if(media >= 7){
            System.out.println("Passou!");
        }else{
            System.out.println("Reprovou!");
        }
    }
}