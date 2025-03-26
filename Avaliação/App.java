package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
        public static void main(String[] args){
            ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            ArrayList<Professor> professores = new ArrayList<Professor>();
            ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
            ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
            ArrayList<Pedagogo> pedagogos = new ArrayList<Pedagogo>();
            ArrayList<Reitor> reitor = new ArrayList<Reitor>();
            Menu menu = new Menu();
            Scanner leia = new Scanner(System.in);
            menu.imprimir();
            int opcao = leia.nextInt();
            String nome;
            double dataNas;
            char sexo;
            while(opcao!=0){
                switch(opcao){
                    case 1:
                        System.out.println("cadastrar alunos");
                        System.out.println("Nome do aluno: ");
                        nome = leia.next();
                        Aluno aluno = new Aluno(nome);
                        System.out.println("Insira data de nascimento: ");
                        dataNas = leia.nextDouble();
                        aluno.setDataNascimento(dataNas);
                        System.out.println("Insira notas (1 e 2): ");
                        double nota = leia.nextDouble();
                        double nota2 = leia.nextDouble();
                        aluno.setNota1(nota);
                        aluno.setNota2(nota2);
                        System.out.println("Digite sexo:");
                        sexo = leia.next().charAt(0);
                        aluno.setSexo(sexo);
                        alunos.add(aluno);
                        break;
                    case 2:
                        System.out.println("Listar aluno");
                        System.out.println(alunos);
                        break;
                    case 3:
                        System.out.println("cadastrar professor");
                        System.out.println("Insira seu nome: ");
                        nome = leia.next();
                        Professor prof = new Professor(nome);
                        System.out.println("Insira data de nascimento");
                        dataNas = leia.nextDouble();
                        prof.setDataNascimento(dataNas);
                        System.out.println("Insira sexo:");
                        sexo = leia.next().charAt(0);
                        prof.setSexo(sexo);
                        System.out.println("Insira diploma: ");
                        String diploma = leia.next();
                        prof.setDiploma(diploma);
                        professores.add(prof);
                        break;
                    case 4:
                        System.out.println("Listar professores");
                        System.out.println(professores);
                        break;
                    case 5:
                        System.out.println("cadastrar tecnico");
                        System.out.println("Insira seu nome: ");
                        nome = leia.next();
                        Tecnico tec = new Tecnico(nome);
                        System.out.println("Insira data de nascimento");
                        dataNas = leia.nextDouble();
                        tec.setDataNascimento(dataNas);
                        System.out.println("Insira sexo:");
                        sexo = leia.next().charAt(0);
                        tec.setSexo(sexo);
                        tecnicos.add(tec);
                        break;
                    case 6:
                        System.out.println("Listar tecnicos");
                        System.out.println(tecnicos);

                        break;
                    case 7:
                        System.out.println("cadastrar pedagogo");
                        System.out.println("Insira seu nome: ");
                        nome = leia.next();
                        Pedagogo ped = new Pedagogo(nome);
                        System.out.println("Insira data de nascimento");
                        dataNas = leia.nextDouble();
                        ped.setDataNascimento(dataNas);
                        System.out.println("Insira sexo:");
                        sexo = leia.next().charAt(0);
                        ped.setSexo(sexo);
                        System.out.println("Insira ano de formação e tempo de experiência na área, respectivamnete:");
                        int formacaoAno= leia.nextInt();
                        ped.setAnoFormacao(formacaoAno);
                        String expec = leia.next();
                        ped.setExperiencia(expec);
                        pedagogos.add(ped);
                        break;
                    case 8:
                        System.out.println("Listar pedagogo");
                        System.out.println(pedagogos);
                        break;
                    case 9:
                        System.out.println("cadastrar psicólogo");
                        System.out.println("Insira seu nome: ");
                        nome = leia.next();
                        Psicologo psi = new Psicologo(nome);
                        System.out.println("Insira data de nascimento");
                        dataNas = leia.nextDouble();
                        psi.setDataNascimento(dataNas);
                        System.out.println("Insira sexo:");
                        sexo = leia.next().charAt(0);
                        psi.setSexo(sexo);
                        System.out.println("Insira número CRP e sua especialidade: ");
                        int crp= leia.nextInt();
                        String esp = leia.next();
                        psi.setNumeroCRP(crp);
                        psi.setEspecialidade(esp);
                        psicologos.add(psi);
                        break;
                    case 10:
                        System.out.println("Listar  psicologo");
                        System.out.println(psicologos);
                        break;
                    case 11:
                        System.out.println("Cadastrar reitor");
                        System.out.println("Insira seu nome: ");
                        nome = leia.next();
                        Reitor rei = new Reitor(nome);
                        System.out.println("Insira data de nascimento");
                        dataNas = leia.nextDouble();
                        rei.setDataNascimento(dataNas);
                        System.out.println("Insira sexo:");
                        sexo = leia.next().charAt(0);
                        rei.setSexo(sexo);
                        System.out.println("Insira quantidade de votos que obteve para ser elegido, data de posse e data de exoneração, respectivamente: ");
                        int votos = leia.nextInt();
                        int posse = leia.nextInt();
                        int exo = leia.nextInt();
                        rei.setQuantidadeVotos(votos);
                        rei.setDataPosse(posse);
                        rei.setDataExoneracao(exo);
                        reitor.add(rei);
                        break;
                    case 12:
                        System.out.println("Listar reitor");
                        System.out.println(reitor);
                        break;
                }
                menu.imprimir();
                opcao = leia.nextInt();
            }
        }
    }
