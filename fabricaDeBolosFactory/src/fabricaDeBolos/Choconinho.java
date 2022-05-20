package fabricaDeBolos;

public class Choconinho extends Bolo{

    public Choconinho() {
        setNome("Choconinho");
        setPreco(10.0f);
        setTipo("5 ovos");
    }
    
    @Override
        public void receita() {
            System.out.println("Receita");
        }
    
}
