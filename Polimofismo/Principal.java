package Polimofismo;

public class Principal {
    public static void main (String[] agrs){
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru c = new Canguru();
       Cachorro ca = new Cachorro();
       Goldfish g = new Goldfish();
       Arara ar = new Arara();
       ca.locomover();
       c.locomover();
       ca.emitirSom();
       c.emitirSom();
    }
}
