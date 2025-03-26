package Heranca;

public class Professor  extends Pessoa {
    private String especialidade;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void receberSalario(double salario){
        this.setSalario(this.getSalario() + salario );

    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + this.getEspecialidade() + '\'' +
                ", salario=" + this.getSalario() +
                '}';
    }
    public void mostrar(){
        System.out.println("-------------------------\n"+
                this.tString() +'\n'+ this);
    }

    public Professor(String n, int i, char s, String especialidade, double salario) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }
}
