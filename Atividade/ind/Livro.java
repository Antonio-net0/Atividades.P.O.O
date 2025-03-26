package Atividade.ind;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas( int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int npagina) {
        if(isAberto()){
            if(this.getTotPaginas() >= npagina){
               this.setPagAtual(npagina);
               System.out.println("Aqui está a página " + npagina);
            } else {
                System.out.println(" Mais páginas do que o livro possui " );
            }
        }else{
            System.out.println("Antes, você precisa abrir o livro para que você consiga visualizar o que há na página solicitada");
        }
    }

    @Override
    public void avancarPago() {
        if(isAberto()){
            this.setPagAtual(this.getPagAtual()+ 1 );
        }
    }

    @Override
    public void voltarPag() {
            if(isAberto()){
                this.setPagAtual(this.getPagAtual() - 1 );
            }
    }

    @Override
    public String detalhes() {
        return "Livro "  +
                "titulo='" + titulo + "\n" +
                ", autor='" + autor +  "\n" +
                ", totPaginas=" + totPaginas + "\n" +
                ", pagAtual=" + pagAtual +  "\n" +
                ", aberto=" + aberto +  "\n" +
                ", leitor=" + getLeitor().getNome() + "\n " +
                ", leitor=" + getLeitor().getSexo() + "\n " +
                ", leitor=" + getLeitor().getIdade() ;
    }
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo (titulo);
        this.setAutor (autor);
        this.setTotPaginas(totPaginas);
        this.setLeitor(leitor);
        this.setPagAtual(0);
        this.setAberto(false);
    }
}

