package sistemasdejogo;

public class Tabuleiro extends Jogo {

    public String nome;

    public Tabuleiro(String nome) {
        this.nome = nome;
    }



    public void jogar(){
        System.out.println("Estou jogando " + getNome());
    }

    @Override
    public void iniciar() {
        System.out.println("Estou arrumando o tabuleiro");

    }
}
