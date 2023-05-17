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
        this.Idade = Idade;
        this.Estado = Estado;
        this.Caloria = Caloria;
        this.Forca = Forca;
        System.out.println("o " + Nome + " nasceu");
    }

    public void morrer() {
        
    }
    public void Comer() {
        
    }
    public void Correr() {
        
    }
    public void Dormir() {
        
    }
}
