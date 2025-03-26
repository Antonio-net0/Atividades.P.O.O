package Agregacao;

public class Principal {
    public static void main(String[] args){
        Lutador[] L = new Lutador [5];
        L[0]= new Lutador (" Pretty Boy ", " França ", 31, 1.75, 68.9, 11, 2, 1);
        L[1]= new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        L[3]= new Lutador("Dead Code", "Autrália", 28, 1.93, 81.6, 13, 0, 2);
        L[4]= new Lutador("Uforcobol", "Brasil", 37, 1.70, 119.3, 5, 4,3 );
        Luta desaf = new Luta();
        desaf.marcarLuta(L[2], L[3]);
        desaf.luta();
        System.out.println("----------------------------------------");
        for(int cont = 0; cont<5; cont++){
            L[cont].status();
            System.out.println("-----------------------------------------");
        }
    }
}
