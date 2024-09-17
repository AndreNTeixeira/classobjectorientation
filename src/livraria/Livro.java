package livraria;

public class Livro extends ItemBiblioteca {

    public void lerLivro(){
        System.out.println("Estou lendo o Livro " + getNome());
    }

    @Override
    public void emprestar() {
        System.out.println("Emprestando o Livro " + getNome());
    }
}
