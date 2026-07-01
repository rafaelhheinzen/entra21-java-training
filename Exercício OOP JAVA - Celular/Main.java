public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", 100);
        celular.mostrarBateria();
        celular.carregar(100);
        celular.usar(50);
        celular.mostrarBateria();
    }
}
