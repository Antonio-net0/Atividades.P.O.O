package Avaliacao.p.o.o;

    public class Gato extends Animal {

        private String raca;
        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }
        private String corDoPelo;
        public String getCorDoPelo() {
            return corDoPelo;
        }

        public void setCorDoPelo(String corDoPelo) {
            this.corDoPelo = corDoPelo;
        }
        private String comportamento;
        public String getComportamento() {
            return comportamento;
        }

        public void setComportamento(String comportamento) {
            this.comportamento = comportamento;
        }
        private boolean habilidadeCaca;
        public boolean isHabilidadeCaca() {
            return habilidadeCaca;
        }
        public void setHabilidadeCaca(boolean habilidadeCaca) {
            this.habilidadeCaca = habilidadeCaca;
        }

        private int quantidadeRonronar;
        public int getQuantidadeRonronar() {
            return quantidadeRonronar;
        }

        public void setQuantidadeRonronar(int quantidadeRonronar) {
            this.quantidadeRonronar = quantidadeRonronar;
        }
    }
