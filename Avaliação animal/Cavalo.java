package Avaliacao.p.o.o;

    public class Cavalo extends Animal {

        private String velocidade;
        public String getVelocidade() {
            return velocidade;
        }

        public void setVelocidade(String velocidade) {
            this.velocidade = velocidade;
        }
        private String raca;
        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }
        private double tamanho;
        public double getTamanho() {
            return tamanho;
        }

        public void setTamanho(double tamanho) {
            this.tamanho = tamanho;
        }

        private String corPelo;
        public String getCorPelo() {
            return corPelo;
        }

        public void setCorPelo(String corPelo) {
            this.corPelo = corPelo;
        }

        private boolean habilidadeCompeticao;
        public boolean isHabilidadeCompeticao() {
            return habilidadeCompeticao;
        }

        public void setHabilidadeCompeticao(boolean habilidadeCompeticao) {
            this.habilidadeCompeticao = habilidadeCompeticao;
        }
    }
