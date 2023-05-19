public class AnimalClass {

    public String Nome;
    public String Classe;
    public String Familia;
    public int Idade;
    public boolean Estado;
    public int Caloria;
    public int Forca;
    
    public static void main(String[] args) {
        
    }
    
    

    public AnimalClass(String Nome, String Classe,String Familia,int Idade, boolean Estado, int Caloria, int Forca) {
        this.Nome = Nome;
        this.Classe = Classe;
        this.Familia = Familia;
        this.Idade = 0;
        this.Estado = true;
        this.Caloria = 10;
        this.Forca = 10;
        System.out.println("o " + Nome + " nasceu");
    }

    public void Morrer() {
        this.Estado = false;
        this.Forca = 0;
        System.out.println(this.Nome + " tá Morto");
    }
    public void Comer() {
       if (this.Estado & (this.Forca>=10)){
          this.Caloria += 20;
          this.Forca -= 10;
        } else if(!(this.Estado)){
            System.out.println("morto não come");
        } else {
            System.out.println("animal fraco tem que dormir");
        }
    }
    public void Correr() {
        if (this.Estado & (this.Forca>=10) & (this.Caloria>10)){
           this.Caloria -= 10;
           this.Forca -= 10;
        }else if(!(this.Estado)){
            System.out.println("animal morto não corre");
        }else if (this.Caloria<10){
            System.out.println("animal magro, tem que comer");
        }else {
            System.out.println("exausto, precisa dormir");
        }
        
    }
    public void Dormir() {
        if ((this.Estado) & (this.Caloria>=5)){
            this.Caloria -= 5;
            this.Forca += 20;
        }else if (!(this.Estado)){
            System.out.println(this.Nome + " morto, já está dormindo eternamente");
        }else {
            System.out.println("coma antes de dormir");
        }
        
    }
}
