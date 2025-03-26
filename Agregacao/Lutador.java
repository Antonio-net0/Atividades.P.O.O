package Agregacao;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    String getCategoria() {
        return categoria;
    }
    private void setCategoria(){
        if(peso<52.2) {
            this.categoria = "Inválido";
        }else if(peso<=70.3){
            this.categoria = "Leve";
        }else if (peso <= 83.9){
            this.categoria = "Médio";
        }else if (peso<= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura ");
        System.out.println("Pesado: " + this.getPeso() +  "kg");
        System.out.println("Ganhou: " +  this.getVitorias() );
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());

    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso categoria " + this.getCategoria());
        System.out.println("V: " + this.getVitorias() + " | " + "D:" + this.getDerrotas() + " | " + " E: " + this.getEmpates());

    }
    public void ganharLuta(){
       this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() +1 );
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
}
//tem que remover o parâmetro de setCategoria(), pois esteria como inativo pq o usuario so vai ser usado internamnete. Como vais er usado atraves do peso, então coloco dentro do setPeso(); (o método peso chama a categoria). Já que a ativação está
