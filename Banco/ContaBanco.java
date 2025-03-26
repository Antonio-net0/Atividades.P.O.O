package Banco;

public class ContaBanco {
    private double saque;
    public int numConta;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    protected String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String dono;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco() {
        this.setSaldo(0.0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (getTipo(). equals("CC")){
            this.setSaldo(50.0);
        }else if(getTipo() .equals("CP")){
            this.setSaldo(150.0);
        }
        System.out.println("Conta aberta");
    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            setStatus(false);
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser finalizada pois há saldo. Retiri-o");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta devedora. Pague débito ao banco");
        }
    }
    public void depositar(double v ){
        if (isStatus ()){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito de " + v + " reais, ficando: " + getSaldo() + "Dono: " + this.getDono());
        } else{
            System.out.println(" Não pode fazer depósito");
        }
    }

    public void sacar(double S) {
        if (isStatus()){
            if (getSaldo() < S) {
                System.out.println("Sem saque");
            }else {
                setSaldo(getSaldo() - S);
                System.out.println("Saque de " + S + " reais, ficando: " + getSaldo() + " Dono: " + this.getDono());
            }
        }else{
            System.out.println("Crie uma conta! ");
        }
    }

    public void pagarMensalidade() {
        if(isStatus()) {
            if (getTipo().equals("CP")) {
                this.setSaldo(getSaldo() - 20);
                System.out.println("Mensalidade paga. Saldo de agora: " + getSaldo());
            } else if (getTipo().equals("CC")) {
                this.setSaldo(getSaldo() - 12);
                System.out.println("Mensalidade paga. Saldo de agora: " + getSaldo());
            }
            System.out.println("Mensalidade paga por: " + this.getDono());
        }else{
            System.out.println(" Sem conta, sem mensalidade ");
        }
    }
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

}
//conta corrente: +50 reais 12 reais de taxa
//conta poulpança;+150 reais 20 reais de mensalidade