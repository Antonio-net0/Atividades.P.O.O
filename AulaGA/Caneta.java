
    package AulaGA;

    public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;
        void status(){
            System.out.println("modelo: " + this.modelo);
            System.out.println("Uma caneta " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Está tampada? " + this.tampada);
        }
        void tampar(){
            this.tampada = true;
        }
        private void rabiscar(){
            if(this.tampada == true){
                System.out.println("ERRO! não posso rabiscar");
            }else{
                System.out.println("Estou Rabicando");
            }
        }
        void destampar(){
            this.tampada = false;
        }
    }

