public abstract class Pessoa {

    public int idade;
    public String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public abstract void info();

    public int retornaIdade(){
        return 10;
    }
}
