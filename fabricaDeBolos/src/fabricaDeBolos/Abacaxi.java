package fabricaDeBolos;

public class Abacaxi extends Bolo{      
    
    public Abacaxi() {
        setNome("Abacaxi");
        setPreco(13.34f);
        setTipo("2 ovos");
    }    
    
    @Override
    public void receita() {
        System.out.println("Receita");
    }
    
}
