package Atividade.ind;

public interface Publicacao{
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int npagina);
    public abstract void avancarPago();
    public abstract void voltarPag();
    String detalhes();
}
