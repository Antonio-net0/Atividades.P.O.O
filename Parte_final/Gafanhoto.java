package Parte_final;

public class Gafanhoto extends Pessoa{
    private String login;
    private double totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, double experiencia, String login, double totAssistido) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){

    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
