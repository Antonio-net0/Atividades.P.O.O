package br.edu.ifs.academico;
    public class Pedagogo extends Pessoa {
        private int anoFormacao;

        public int getAnoFormacao() {
            return anoFormacao;
        }

        public void setAnoFormacao(int anoFormacao) {
            this.anoFormacao = anoFormacao;
        }
        private String experiencia;
        public String getExperiencia() {
            return experiencia;
        }

        public void setExperiencia(String experiencia) {
            this.experiencia = experiencia;
        }

        public Pedagogo(String nome) {
            super(nome);
        }

        @Override
        public String toString() {
            return "Pedagogo{" +
                    "anoFormacao=" + anoFormacao +
                    ", experiencia='" + experiencia + '\'' +
                    "} " + super.toString();
        }
    }

