package br.edu.ifs.academico;

public class Pessoa {
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        private String localNascimento;

        public String getLocalNascimento() {
            return localNascimento;
        }

        public void setLocalNascimento(String localNascimento) {
            this.localNascimento = localNascimento;
        }

        private double dataNascimento;

        public double getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(double dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        private char sexo;

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            if (sexo == 'M' || sexo == 'F' || sexo == 'O') {
                this.sexo = sexo;
            }else{
                System.out.println("Apenas aceito Masculino [ M ] ou Feminino [ F ] ou outro [O] ");
            }
        }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", localNascimento='" + localNascimento + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                '}';
    }
}
