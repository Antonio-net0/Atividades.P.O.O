package Her.pt2;

public class Bolsista extends Aluno{
    private double bolsa;
    public void renovarBolsa(){

    }
    @Override
    public void pagarMensalidade(){
        System.out.println( this.getNome() + " ALuno bolsista ");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
