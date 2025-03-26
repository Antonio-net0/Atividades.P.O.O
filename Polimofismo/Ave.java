package Polimofismo;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void azerNinho(){
        System.out.println("Construiu um ninho ");
    }

    @Override
    public void locomover() {
        System.out.println(" Voando ");
    }

    @Override
    public void emitirSom() {
        System.out.println( " Som de ave ");
    }

    @Override
    public void alimentar() {
        System.out.println(" Comendo frutas ");
    }
}
