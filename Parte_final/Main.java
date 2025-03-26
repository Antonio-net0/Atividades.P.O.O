package Parte_final;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Video[] c = new Video[3];
        c[0] = new Video("Aula 1 de poo");
        c[1] = new Video(" Aula 12 de PHP ");
        c[2] = new Video("Vou arrasar");
        System.out.println(c[0].toString() );

        Gafanhoto[] g = new Gafanhoto[3];
        g[0]= new Gafanhoto("Neta", 14,"Feminino", 4, "09", 7);
        g[1]= new Gafanhoto("Ana", 45, "Feminino", 45, "4555", 456.5);
        g[2]=new Gafanhoto("Vick", 25, "Masculino", 45, "55966", 56.6);
        System.out.println(g[0].toString());

        System.out.println("VIDEO");
        System.out.println("                                               ");
        System.out.println(c[0].toString());
        System.out.println(c[1].toString());
        System.out.println(c[2].toString());
        System.out.println("                                                ");
        System.out.println("GAFANHOTO");
        System.out.println("                                                      ");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());
        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], c[2]);
        vis[0].avaliar();
        vis[0].avaliar(83.0);
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], c[1]);
        vis[0].avaliar(123.0);
        System.out.println(vis[1].toString());
        System.out.println(vis[0].toString());

        /*Visualizacao[] vis = new Visualizacao[3];
        for(int cont=0; cont<=2; cont++) {
            Random le = new Random();
            int quemAss = le.nextInt(3);
            Random pe = new Random();
            int produz = pe.nextInt(3);
            vis[cont] = new Visualizacao(g[quemAss], c[produz]);
        }
        System.out.println("-------------------------------------------");
        for(int cont=0; cont <=2; cont++){
            System.out.println(vis[cont].toString());
        }*/
    }

}
