package Heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }
}
