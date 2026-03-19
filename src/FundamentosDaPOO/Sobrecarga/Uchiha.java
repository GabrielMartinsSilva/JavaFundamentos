package FundamentosDaPOO.Sobrecarga;

public class Uchiha extends Ninja {

    public Uchiha() {
    }

    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    public Uchiha(String nome, int idade, int numeroDemissoesConcluidas, NivelNinja rank) {
        super(nome, idade, numeroDemissoesConcluidas, rank);
    }

    public void uchihaClan(){
        System.out.println("i'm uchiha clan ");
    }


}
