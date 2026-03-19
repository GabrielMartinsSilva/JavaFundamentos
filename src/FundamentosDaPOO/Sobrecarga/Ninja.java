package FundamentosDaPOO.Sobrecarga;

public abstract class Ninja implements NivelNinja {

    String nome;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // sobrecarga do construtor

    public Ninja(String nome, int idade, int numeroDemissoesConcluidas, NivelNinja rank) {
        this(nome,idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }
}
