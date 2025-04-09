package sistemasdejogo;

public class Main {
    public static void main(String[] args) {

        //chamando tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro("War");
        tabuleiro.iniciar();
        tabuleiro.jogar();

        System.out.println();

        //chamandovideogame
        Videogame videogame1 = new Videogame();
        videogame1.setNome("God of War");
        videogame1.iniciar();
        videogame1.salvarPartida();


        }
    }

