package Polimorfismopt2;

public class Rodar {
    public static void main (String [] args){
        Cachorro c = new Cachorro();
        c.reagir(false);
        c.reagir("I love my dog");
        c.reagir("Olá");
        c.reagir(8,52.4);
        c.reagir(5, 12);
        c.reagir(23, 56);
    }
}
