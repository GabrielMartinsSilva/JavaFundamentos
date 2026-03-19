package FundamentosDaPOO.PolimorfismoEAbstracao;

public abstract class Ninja implements EstrategiaDebatalhaNinja {
    String nome;
    int idade;
    String missao;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    public void habilidadeEspecial(){
        System.out.println("Habilidade especial generica");
    }

    public void estrategiaDebatalhaNinja(){
        System.out.println("Estrategia de batalha ninja");
    }
}
