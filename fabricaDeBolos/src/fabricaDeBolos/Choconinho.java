package fabricaDeBolos;

public class Choconinho extends Bolo{

    public Choconinho() {
        setNome("Choconinho");
        setPreco(20.76f);
        setTipo("50 ovos");
    }
    
    @Override
        public void receita() {
            System.out.println("Receita");
        }
    
}
