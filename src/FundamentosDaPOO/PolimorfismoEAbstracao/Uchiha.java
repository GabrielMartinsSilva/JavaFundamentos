package FundamentosDaPOO.PolimorfismoEAbstracao;

public class Uchiha extends Ninja {


    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String missao) {
        super(nome, idade, missao);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Habilidade especial chidori");
    }

    @Override
    public void estrategiaDebatalhaNinja() {
        System.out.println("Estrategia uchiha de batalha");
    }
}
