package Avaliacao.p.o.o;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private char genero;

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if (genero == 'F' || genero == 'M') {
            this.genero = genero;

        } else {
                System.out.println("Apenas é aceito gênero feminino ou masculino ");

        }
    }

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
/*public void setGenero(char genero) {
    while(sorte){
        if (genero == 'F' || genero == 'M') {
            this.genero = genero;
            sorte = false;
        } else {
            System.out.println("Apenas é aceito gênero feminino ou masculino, digite novamente: ");
            genero = leia.next().charAt(0);
        }
    }*/
