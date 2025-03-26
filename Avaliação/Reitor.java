package br.edu.ifs.academico;


public class Reitor extends Professor{
    private int dataPosse;

    public int getDataPosse() {
        return dataPosse;
    }

    public void setDataPosse(int dataPosse) {
        this.dataPosse = dataPosse;
    }
    private int dataExoneracao;
    public int getDataExoneracao() {
        return dataExoneracao;
    }

    public void setDataExoneracao(int dataExoneracao) {
        this.dataExoneracao = dataExoneracao;
    }
    private int quantidadeVotos;
    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public Reitor(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Reitor{" +
                "dataExoneracao=" + dataExoneracao +
                ", dataPosse=" + dataPosse +
                ", quantidadeVotos=" + quantidadeVotos +
                "} " + super.toString();
    }
}