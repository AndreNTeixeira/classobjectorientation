package livraria;

public class Revista extends ItemBiblioteca {
    public void lerArtigo(){
        System.out.println("Lendo o artigo da revista " + getNome());
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestando a revista " + getNome());
    }
}
