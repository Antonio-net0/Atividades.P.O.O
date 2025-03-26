package Agregacao;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void marcarLuta(Lutador lut1, Lutador lut2 ){
        if((lut1.getCategoria(). equals(lut2.getCategoria())) && (lut1 != lut2)){
               this.setAprovada(true);
               this.setDesafiado(lut1);
               this.setDesafiante(lut2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void luta(){ //alteração para que haja se o peso de ambos for ==, vai ser por sorteio.
        if(this.isAprovada()){
            System.out.println("####Desafiado####");
            desafiado.apresentar();
            System.out.println("####Desafiante####");
            desafiante.apresentar();
            if(desafiante.getDerrotas() == desafiado.getDerrotas()){
                Random desemp = new Random();
                int sort = desemp.nextInt(2);
                switch(sort){
                    case 0://Desafiado ganha
                        System.out.println(" Desafiado " + desafiado.getNome());
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                        
                    case 1://Desafiante ganha
                        System.out.println(" Desafiante " + desafiante.getNome());
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
                }
                }else if(desafiante.getDerrotas() > desafiado.getDerrotas()) {
                   System.out.println("------------------------------------------------------");
                   System.out.println("                                                           ");
                   System.out.println(" Quem ganhou foi: Desafiante " + desafiante.getNome());
                   System.out.println("------------------------------------------------------");
                   System.out.println("                                                           ");
                   desafiante.ganharLuta();
                   desafiado.perderLuta();

                }else {
                    System.out.println("------------------------------------------------------");
                    System.out.println("                                                           ");
                    System.out.println(" Quem ganhou foi: Desafiado " + desafiado.getNome());
                    System.out.println("------------------------------------------------------");
                    System.out.println("                                                           ");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                }
            }else{
                System.out.println(" Sem luta ");
            }
    /*public void luta(){
        if(this.isAprovada()){
            System.out.println("####Desafiado####");
            desafiado.apresentar();
            System.out.println("####Desafiante####");
            desafiante.apresentar();
            Random sorte = new Random();
            int vencedor = sorte.nextInt(3);
            switch(vencedor){
                case 0://Empate
                    System.out.println(" Empate ");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1://Desafiado ganha
                    System.out.println(" Desafiado " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2://Desafiante ganha
                    System.out.println(" Desafiante " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
        }else{
            System.out.println(" Sem luta ");
        }*/

    }
}

//agregação: classe luta tem atributo da classe lutador
//  Lutador é um tipo abstrato de dado
//vitoria atraves de quem ganhou mais, quem ganhou menos, quem tem mais experiencia. coloca sorte para desempatar.
