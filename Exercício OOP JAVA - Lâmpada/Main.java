public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
