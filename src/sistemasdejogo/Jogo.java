package sistemasdejogo;

public class Jogo {

    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void iniciar() {
        System.out.println("O jogo esta iniciando");
    }

}
