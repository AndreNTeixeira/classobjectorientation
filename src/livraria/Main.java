package livraria;

public class Main {

    public static void main(String[] args) {

        //criando livro
        Livro livro1 = new Livro();
        livro1.setNome("Harry Potter");
        livro1.emprestar();
        livro1.lerLivro();
        livro1.devolver();

        System.out.println();

//criando revista

        Revista revista1 = new Revista();
        revista1.setNome("Capricho");
        revista1.emprestar();
        revista1.lerArtigo();
        revista1.devolver();

    }
}
