package Banco;

public class Mostrador {
    public static void main (String[] args){
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Jubileu");
        c1.setNumConta(11111);
        c1.abrirConta("CC");
        c1.depositar(1000);
        c1.sacar(230.90);
        c1.pagarMensalidade();


        ContaBanco c2 = new ContaBanco();
        c2.setDono("Jubileu");
        c2.setNumConta(98711);
        c2.abrirConta("CP");
        c2.depositar(17340);
        c2.sacar(2.90);
        c2.pagarMensalidade();

        c1.estadoAtual();
        c2.estadoAtual();

    }
}
