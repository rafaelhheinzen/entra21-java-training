public class Lampada {
    boolean Ligada;

    public Lampada(boolean Ligada){
        this.Ligada = Ligada;
    }

    void ligar(){
        if(this.Ligada == true){
            System.out.println("A lâmpada já está ligada!");
        }else{
            this.Ligada = true;
        }
    }

    void desligar(){
        if(this.Ligada == false){
            System.out.println("A lâmpada já está desligada!");
        }else{
            this.Ligada = false;
        }
    }

    void mostrarEstado(){
        if(this.Ligada == true){
        System.out.println("");
        System.out.println("A lâmpada está ligada!");
        System.out.println("");
        }else{
        System.out.println("");
        System.out.println("A lâmpada está desligada!");
        System.out.println("");
        }

    }
}
