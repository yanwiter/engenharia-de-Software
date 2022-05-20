package fabricaDeBolos;

public class Prestigio extends Bolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(45.56f);
        setTipo("64 ovos");
    }

    @Override
    public void receita() {
       System.out.println("Receita");
    }

    
}
