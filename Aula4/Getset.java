package Aula4;

public class Getset {
    private float ponta;
    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String modelo;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void status(){
        System.out.println("                      ");
        System.out.println("SOBRE A CANETA");
        System.out.println("MODELO: " + getModelo());
        System.out.println("PONTA " + getPonta());
        System.out.println("Cor: " + getCor());
        System.out.println("Tampada:" + getTampada());
        System.out.println("                       ");
    }
    private String cor;
     public  Getset(String modelo, String cor, float ponta){
        this.tampar();
        this.cor = cor;
         if (modelo .equals("Cis")) {
             this. modelo = modelo;
         }else{
             System.out.println(" se manque ");
         }
        this.ponta = ponta;
    }
    private boolean tampada;
    public void tampar(){
      this.tampada = true;
    }
    public void destampada(){
        this.tampada = false;
    }

}