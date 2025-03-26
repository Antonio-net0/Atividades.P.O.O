package Heranca;

import java.util.Scanner;

public class Pprincipal {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno("Antônio", 18, 'M', 23093, " Sistemas de Informação ");
        Professor p3 = new Professor("Osmar", 23,'M' ,"Arquitetura de computadores", 12983);
        Funcionario p4 = new Funcionario();
        double valor;
        for( int cont=0; cont<=3; cont++){
           System.out.println("Insira valor do acrescimo: ");
           valor = ler.nextDouble();
           p3.receberSalario(valor);
           p3.mostrar();
        }
    }
}
