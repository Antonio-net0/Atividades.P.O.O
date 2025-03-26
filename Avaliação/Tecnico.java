package br.edu.ifs.academico;

public class Tecnico extends Pessoa {
        private String nivelFormacao;
        public String getNivelFormacao(){
            return nivelFormacao;
        }
        public void setNivelFormacao(String nivelFormacao) {
            this.nivelFormacao = nivelFormacao;
        }
        private String areaAtuacao;
        public String getAreaAtuacao() {
            return areaAtuacao;
        }
        public void setAreaAtuacao(String areaAtuacao) {
            this.areaAtuacao = areaAtuacao;
        }

    public Tecnico(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "areaAtuacao='" + areaAtuacao + '\'' +
                ", nivelFormacao='" + nivelFormacao + '\'' +
                "} " + super.toString();
    }
}

