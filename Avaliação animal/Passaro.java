package Avaliacao.p.o.o;

public class Passaro extends Animal{

    private String tipoDeVoo;
    public String getTipoDeVoo() {
        return tipoDeVoo;
    }
    public void setTipoDeVoo(String tipoDeVoo) {
        this.tipoDeVoo = tipoDeVoo;
    }

    private double tamanhoAsas;
    public double getTamanhoAsas() {
        return tamanhoAsas;
    }

    public void setTamanhoAsas(double tamanhoAsas) {
        this.tamanhoAsas = tamanhoAsas;
    }

    private String corDasPenas;
    public String getCorDasPenas() {
        return corDasPenas;
    }
    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

    private  boolean canSing;
    public boolean isCanSing() {
        return canSing;
    }
    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    private double velocidadeVoo;
    public double getVelocidadeVoo() {
        return velocidadeVoo;
    }

    public void setVelocidadeVoo(double velocidadeVoo) {
        this.velocidadeVoo = velocidadeVoo;
    }
}
