package Avaliacao.p.o.o;

public class Cao extends Animal {

    private String tamanho;
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    private String raca;
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    private int nivelEnergia;
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }
    private boolean obediente;
    public boolean isObediente() {
        return obediente;
    }

    public void setObediente(boolean obediente) {
        this.obediente = obediente;
    }
    private boolean habilidadeGuarda;
    public boolean isHabilidadeGuarda() {
        return habilidadeGuarda;
    }

    public void setHabilidadeGuarda(boolean habilidadeGuarda) {
        this.habilidadeGuarda = habilidadeGuarda;
    }
}
