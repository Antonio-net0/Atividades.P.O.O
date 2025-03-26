package Avaliacao.p.o.o;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Passaro> passaro = new ArrayList<Passaro>();
        ArrayList<Cao> cao = new ArrayList<Cao>();
        ArrayList<Gato> gato = new ArrayList<Gato>();
        ArrayList<Cavalo> cavalo = new ArrayList<Cavalo>();
        ArrayList<Tubarao> tubarao = new ArrayList<Tubarao>();
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;
        String esp;
        char sexo;
        double peso;
        String raca;
        String cor;
        Menu menu = new Menu();
        menu.imprimir();
        byte opcao = ler.nextByte();
        while(opcao!=0){
            switch(opcao){
                case 1:
                    System.out.println("Cadastrar pássaro: ");
                    Passaro pas = new Passaro();
                    System.out.println("Insira Nome: ");
                    nome = ler.next();
                    pas.setNome(nome);
                    System.out.println("Insira idade:");
                    idade = ler.nextInt();
                    pas.setIdade(idade);
                    System.out.println("Insira espécie: ");
                    esp = ler.next();
                    pas.setEspecie(esp);
                    System.out.println("Insira sexo: ");
                    sexo = ler.next().charAt(0);
                    pas.setGenero(sexo);
                    System.out.println("Insira peso: ");
                    peso = ler.nextDouble();
                    pas.setPeso(peso);
                    System.out.println("Insira tipo de voo, tamanho das asas e cor das penas: ");
                    String voo = ler.next();
                    double asa = ler.nextDouble();
                    cor = ler.next();
                    pas.setTipoDeVoo(voo);
                    pas.setTamanhoAsas(asa);
                    pas.setCorDasPenas(cor);
                    System.out.println("Insira velocidade do voo: ");
                    double vel = ler.nextDouble();
                    pas.setVelocidadeVoo(vel);
                    System.out.println("Insira se canta ou não: ");
                    boolean sing = ler.nextBoolean();
                    pas.setCanSing(sing);
                    passaro.add(pas);
                    break;
                case 2:
                    System.out.println("Listar pássaros: ");

                    break;
                case 3:
                    System.out.println("Cadastrar cão: ");
                    Cao dog = new Cao();
                    System.out.println("Insira Nome: ");
                    nome = ler.next();
                    dog.setNome(nome);
                    System.out.println("Insira idade:");
                    idade = ler.nextInt();
                    dog.setIdade(idade);
                    System.out.println("Insira espécie: ");
                    esp = ler.next();
                    dog.setEspecie(esp);
                    System.out.println("Insira sexo: ");
                    sexo = ler.next().charAt(0);
                    dog.setGenero(sexo);
                    System.out.println("Insira peso: ");
                    peso = ler.nextDouble();
                    dog.setPeso(peso);
                    System.out.println("Insira tamanho e raça ");
                    String tamanho = ler.next();
                    raca = ler.next();
                    dog.setTamanho(tamanho);
                    dog.setRaca(raca);
                    System.out.println("Insira nível de energia do seu cão, se ele é obediente ou não e a habilidade de guarda: ");
                    int energia = ler.nextInt();
                    boolean obdiente = ler.nextBoolean();
                    boolean guarda = ler.nextBoolean();
                    dog.setNivelEnergia(energia);
                    dog.setObediente(obdiente);
                    dog.setHabilidadeGuarda(guarda);
                    cao.add(dog);
                    break;
                case 4:
                    System.out.println("Listar cães: ");

                    break;
                case 5:
                    System.out.println("Cadastrar gato: ");
                    Gato cat = new Gato();
                    System.out.println("Insira Nome: ");
                    nome = ler.next();
                    cat.setNome(nome);
                    System.out.println("Insira idade:");
                    idade = ler.nextInt();
                    cat.setIdade(idade);
                    System.out.println("Insira espécie: ");
                    esp = ler.next();
                    cat.setEspecie(esp);
                    System.out.println("Insira sexo: ");
                    sexo = ler.next().charAt(0);
                    cat.setGenero(sexo);
                    System.out.println("Insira peso: ");
                    peso = ler.nextDouble();
                    cat.setPeso(peso);
                    System.out.println("Insira raça e cor do pelo do gato: ");
                    raca = ler.next();
                    String corPelo = ler.next();
                    cat.setRaca(raca);
                    cat.setCorDoPelo(corPelo);
                    System.out.println("Insira comportamento, habilidade de caça e quantidade de vezes que ronrona: ");
                    String comportamento = ler.next();
                    boolean caca = ler.nextBoolean();
                    int ronronar = ler.nextInt();
                    cat.setComportamento(comportamento);
                    cat.setHabilidadeCaca(caca);
                    cat.setQuantidadeRonronar(ronronar);
                    gato.add(cat);
                    break;
                case 6:
                    System.out.println("Listar gatos: ");

                    break;
                case 7:
                    System.out.println("Cadatrar cavalo");
                    Cavalo horse = new Cavalo();
                    System.out.println("Insira Nome: ");
                    nome = ler.next();
                    horse.setNome(nome);
                    System.out.println("Insira idade:");
                    idade = ler.nextInt();
                    horse.setIdade(idade);
                    System.out.println("Insira espécie: ");
                    esp = ler.next();
                    horse.setEspecie(esp);
                    System.out.println("Insira sexo: ");
                    sexo = ler.next().charAt(0);
                    horse.setGenero(sexo);
                    System.out.println("Insira peso: ");
                    peso = ler.nextDouble();
                    horse.setPeso(peso);
                    System.out.println("Insira raça, velocidade, tamanho e cor do pelo do animal: ");
                    raca = ler.next();
                    String fast = ler.next();
                    double tamanhoCavalo = ler.nextDouble();
                    cor = ler.next();
                    horse.setRaca(raca);
                    horse.setVelocidade(fast);
                    horse.setTamanho(tamanhoCavalo);
                    horse.setCorPelo(cor);
                    System.out.println("Insira se há ou não habilidade de competição");
                    boolean competir = ler.nextBoolean();
                    horse.setHabilidadeCompeticao(competir);
                    cavalo.add(horse);
                    break;
                case 8:
                    System.out.println("Listar cavalos: ");

                    break;
                case 9:
                    System.out.println("Cadatrar tubarão ");
                    Tubarao shark = new Tubarao();
                    System.out.println("Insira Nome: ");
                    nome = ler.next();
                    shark.setNome(nome);
                    System.out.println("Insira idade:");
                    idade = ler.nextInt();
                    shark.setIdade(idade);
                    System.out.println("Insira espécie: ");
                    esp = ler.next();
                    shark.setEspecie(esp);
                    System.out.println("Insira sexo: ");
                    sexo = ler.next().charAt(0);
                    shark.setGenero(sexo);
                    System.out.println("Insira peso: ");
                    peso = ler.nextDouble();
                    shark.setPeso(peso);
                    System.out.println("Insira nível de perigo, risco de extinção e comportamento: ");
                    int nivel = ler.nextInt();
                    int risco = ler.nextInt();
                    String comportamentot = ler.next();
                    shark.setNivelPerigo(nivel);
                    shark.setRiscoExtincao(risco);
                    shark.setComportamento(comportamentot);
                    System.out.println("Inisra raça, força e velocidade: ");
                    raca = ler.next();
                    String forca = ler.next();
                    String velocidade = ler.next();
                    shark.setRaca(raca);
                    shark.setForça(forca);
                    shark.setVelocidade(velocidade);
                    tubarao.add(shark);
                    break;
                case 10:
                    System.out.println("Listar tubarões: ");

                    break;
            }
            menu.imprimir();
            opcao = ler.nextByte();
        }
    }
}