package fabricaDeBolos;

public class Prestigio extends Bolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(15.56f);
        setTipo("4 ovos");
    }

    
    @Override
    public void receita() {
       System.out.println("Receita");
    }

    
}
