package Polimofismo;

public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Mamando ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Som de mamífero ");
    }
}
