    public class Produto {

        private static int contadorId = 1;

        private String nome;
        private double preco;
        private int estoque;
        private int id;
        private String unidadeMedida;

        // Getters
        public String getNome() {
            return this.nome;
        }

        public String getUnidadeMedida() {
            return this.unidadeMedida;
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

        void setUnidadeMedida(String unidadeMedida){
            this.unidadeMedida = unidadeMedida;
        }



        Produto(String nome, double preco, int estoque, String unidadeMedida) {
            this.id = contadorId;
            contadorId++;

            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
            this.unidadeMedida = unidadeMedida;
        }
    }
