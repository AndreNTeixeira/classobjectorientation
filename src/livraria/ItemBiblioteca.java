package livraria;

public class ItemBiblioteca {

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //metodo
    public void emprestar(){
        System.out.println("Emprestando o " + getNome());
    }

    //metodo
    public void devolver(){
        System.out.println("Devolvendo o " + getNome());
    }
}
