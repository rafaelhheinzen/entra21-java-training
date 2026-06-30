import java.util.Scanner;

public class Mercado {
    Scanner input = new Scanner(System.in);

    //Variável para guardar a quantidade de produtos no mercado
    private int produtos;

    // Array para armazenar os produtos do mercado
    Produto[] inventarioMercado = new Produto[10];


    //Função que mostra o menu do sistema
    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Inserir novo produto");
        System.out.println("2. Vizualizar produtos");
        System.out.println("3. Editar um produto existente:");
        System.out.println("4. Deletar um produto:");
    }


    //Função que seleciona a opção do menu
    public void selectOption(int option){
        if(option == 1){
            System.out.println("Inserir novo produto");
            inserirProduto();
        }

        if(option == 2){
            System.out.println("Produtos");
            displayProdutos();
        }

        if(option == 3){
            System.out.println("Editar produto");
            editarProduto();
        }

        if(option == 4){
            System.out.println("Deletar produto");
            deletarProduto();
        }
    }


    public void repetir(){
        showMenu();

        int option = input.nextInt();
        input.nextLine();
        selectOption(option);
    }




    //Função para inserir novo produto
    private void inserirProduto() {
        System.out.println("================================");
        System.out.println("================================");


        System.out.println("Digite o nome do produto:");
        String nome = input.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = input.nextDouble();
        System.out.println("Digite a quantidade em estoque:");
        int estoque = input.nextInt();

        Produto novoProduto = new Produto(nome, preco, estoque);
        inventarioMercado[produtos] = novoProduto;
        produtos++;


        System.out.println("Produto " + novoProduto.getNome() + " adicionado com sucesso!");


        System.out.println("================================");
        System.out.println("================================");
        repetir();
    }


//Função para mostrar os produtos registrados
    private void displayProdutos(){
        System.out.println("================================");
        System.out.println("================================");

        System.out.println("Produtos cadastrados:");
        for (Produto produto : inventarioMercado) {
            if (produto != null) {
                System.out.println(produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println("-----------------------------");
            }
        }
        System.out.println("================================");
        System.out.println("================================");
        repetir();
    }

    private void editarProduto(){
        System.out.println("================================");
        System.out.println("================================");

        System.out.println("Digite o id do produto");
        int id = input.nextInt();
        input.nextLine();

        for(Produto produto : inventarioMercado){
            if (produto != null && id == produto.getId()){
                System.out.println("Produto encontrado: "+produto.getNome());

                System.out.println("Digite novo nome:");
                String nome = input.nextLine();
                produto.setNome(nome);

                System.out.println("Digite novo preço:");
                double preco = input.nextDouble();
                produto.setPreco(preco);

                System.out.println("Digite novo estoque:");
                int estoque = input.nextInt();
                produto.setEstoque(estoque);

                System.out.println("Produto atualizado com sucesso!");
                System.out.println("Produto: "+produto.getNome()+ "; Preço: "+produto.getNome()+"; Estoque: "+produto.getEstoque());
            }
        }
        repetir();
    }

    private void deletarProduto(){
        System.out.println("================================");
        System.out.println("================================");

        System.out.println("Digite o id do produto");
        int id = input.nextInt();
        input.nextLine();

        for(int i = 0; i < inventarioMercado.length; i++){
            Produto produto = inventarioMercado[i];
            if (produto != null && id == produto.getId()){
                System.out.println("Produto encontrado: "+produto.getNome());
                inventarioMercado[i] = null;
                System.out.println("Produto deletado com sucesso!");
            }
        }
        repetir();
    }
}
