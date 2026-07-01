import java.util.Scanner;

public class Banco {
    Scanner input = new Scanner(System.in);

    private Conta contaLogada; 

    public void showInitialMenu() {
        System.out.println("====================");
        System.out.println("====Banco online====");
        System.out.println("====================");
        System.out.println("========Menu========");
        System.out.println("1. Criar conta");
        System.out.println("====================");
    }

    public void selectOption(int option) {
        if (option == 1) {
            System.out.println("Criar conta");

            System.out.println("Digite o número do titular:");
            int numero = input.nextInt();
            input.nextLine();
            System.out.println("Digite o nome do titular");
            String nome = input.nextLine();
            System.out.println("Digite o saldo inicial");
            
            // NOTE: If Conta class expects 'int saldo', change this to input.nextInt()
            double saldo = input.nextDouble(); 

            // FIX 2: Save it to our class variable instead of a local variable
            this.contaLogada = new Conta(numero, nome, (int)saldo); 

            System.out.println("\n====================");
            System.out.println("Conta criada com sucesso!");
            System.out.println("====================");
            System.out.println("Detalhes da conta criada:");
            System.out.println("====================");
            System.out.println("Nome: " + contaLogada.getTitular());
            System.out.println("Número: " + contaLogada.getNumero());
            System.out.println("Saldo inicial: " + contaLogada.getSaldo());
            System.out.println("====================");
        }
    }

    public void login() {
        showInitialMenu();
        int option = input.nextInt();
        input.nextLine();
        selectOption(option);
        
        // After creating an account, route them into the main banking loop
        repeat(); 
    }

    public void showMenu() {
        System.out.println("====================");
        System.out.println("===Área do Cliente==");
        System.out.println("====================");
        System.out.println("1. Fazer depósito");
        System.out.println("2. Fazer saque");
        System.out.println("3. Verificar saldo");
        System.out.println("4. Ver detalhes da conta");
        System.out.println("5. Sair");
        System.out.println("====================");
    }

    public void selectOptionMenu(int option){

        if (contaLogada == null) {
            System.out.println("Erro: Nenhuma conta ativa encontrada!");
            return;
        }

        if (option == 1) {
            System.out.println("====Fazer Depósito====");
            System.out.println("Digite o valor do depósito:");
            double valor = input.nextDouble();

            contaLogada.deposito(valor); 
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("=====================");
        }

        if (option == 2){
            System.out.println("====Fazer Saque====");
            System.out.println("Digite o valor do saque:");
            double valor = input.nextDouble();

            contaLogada.saque(valor);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("=====================");
        }

        if (option == 3){
            System.out.println("====Ver saldo====");

            double saldo = contaLogada.getSaldo(); 
            System.out.println(saldo);
            System.out.println("=====================");
        }

        if (option == 4){
            System.out.println("====Ver conta====");

            int numero = contaLogada.getNumero();
            double saldo = contaLogada.getSaldo();
            String titular = contaLogada.getTitular(); 
            System.out.println("Numero:"+numero);
            System.out.println("Saldo:"+saldo);
            System.out.println("Titular:"+titular);

            System.out.println("=====================");
        }

    }

    public void repeat() {
        int option = 0;
        while(option != 5){
        showMenu();
        option = input.nextInt();
        input.nextLine();
        selectOptionMenu(option);
        }

    }
}
