package Atividade.ind;

public class ProjectBook {
    public static void main (String[]args){
        Livro[] person = new Livro[3];
        Pessoa[] person2 = new Pessoa[2];
        person2[0] = new Pessoa("Antônio", 18, "Masculino");
        person2[1] = new Pessoa("Maria Clara", 12, "Feminino");

        person[0] = new Livro ("The seven husband of Evelyn Hugo", "Taylor Jenkings", 360, person2[0]);
        person[1] = new Livro("Naruto 14", "Massashi Kishimoto", 203, person2[0]);
        person[2]= new Livro("Naruto 12", "Massashi Kishimoto", 209, person2[1]);

        person[0].abrir();
        person[0].folhear(987);
        System.out.println(person[0].detalhes());
    }
}
