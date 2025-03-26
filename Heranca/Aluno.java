package Heranca;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatric(){

    }
    public Aluno(String n, int i, char s, int mat, String curso) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setMatricula(mat);
        this.setCurso(curso);

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void mostrar(){
        System.out.println("-------------------------\n"+
                this.tString() +'\n'+ this);

    }
}
