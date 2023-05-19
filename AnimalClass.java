public class AnimalClass {

    public String Nome;
    public String Classe;
    public String Familia;
    public int Idade;
    public boolean Estado;
    public int Caloria;
    public int Forca;

    public void nascer(String Nome, String Classe,String Familia,int Idade, boolean Estado, int Caloria, int Forca) {
        this.Nome = Nome;
        this.Classe = Classe;
        this.Familia = Familia;
        this.Idade = 0;
        this.Estado = true;
        this.Caloria = 10;
        this.Forca = 10;
        System.out.println("o " + Nome + " nasceu");
    }

    public String morrer() {
        this.Estado = false;
        this.Forca = 0;
        return "Morto";
    }
    public void Comer() {
       if (Estado & (Forca>=10)){
          Caloria = Caloria + 20;
          Forca = Forca -10;
        } 
    }
    public void Correr() {
        if (Estado & (Forca>=10) & (Caloria>10)){
           Caloria = Caloria -10;
           Forca = Forca -10;
        }else if(!(Estado)){
            System.out.println("animal morto não corre");
        }else if (Caloria<10){
            System.out.println("animal magro, tem que comer");
        }else{
            
        }
        
    }
    public void Dormir() {
        if (Estado){
            Caloria = Caloria-5;
            Forca = Forca +20;
        }else{
            System.out.println("Animal morto, já está dormindo eternamente");
        }
        
    }
}
