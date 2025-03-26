package br.edu.ifs.academico;

public class Psicologo extends Pessoa{
        private int numeroCRP;
        public int getNumeroCRP() {
            return numeroCRP;
        }

        public void setNumeroCRP(int numeroCRP) {
            this.numeroCRP = numeroCRP;
        }
        private String classe;
        public String getClasse() {
            return classe;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }
        private String especialidade;
        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }

    public Psicologo(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "classe='" + classe + '\'' +
                ", numeroCRP=" + numeroCRP +
                ", especialidade='" + especialidade + '\'' +
                "} " + super.toString();
    }
}
