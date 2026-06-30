    public class Produto {

        private static int contadorId = 1;

        private String nome;
        private double preco;
        private int estoque;
        private int id;

        // Getters
        public String getNome() {
            return this.nome;
        }

        public double getPreco() {
            return this.preco;
        }

        public int getEstoque() {
            return this.estoque;
        }

        public int getId(){
            return this.id;
        }

        //Setters
        void setNome(String nome){
            this.nome = nome;
        }

        void setPreco(double preco){
            this.preco = preco;
        }

        void setEstoque(int estoque){
            this.estoque = estoque;
        }





        Produto(String nome, double preco, int estoque) {
            this.id = contadorId;
            contadorId++;

            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }
    }
