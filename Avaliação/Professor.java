package br.edu.ifs.academico;
     public class Professor extends Pessoa {
        private String diploma;

        public String getDiploma() {
            return diploma;
        }
        public void setDiploma(String diploma){
            this.diploma = diploma;
        }

         public Professor(String nome) {
             super(nome);
         }

         @Override
         public String toString() {
             return "Professor{" +
                     "diploma='" + diploma + '\'' +
                     "} " + super.toString();
         }
     }