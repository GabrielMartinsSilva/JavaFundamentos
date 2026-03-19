package Desafios.Desafio3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String NivelDificuldade;
    String statusMissao;

    public void MostrarInformacoes(){
        System.out.println("Nome: " +  nome +
                "\nidade: " + idade +
                "\nmissao: " + missao +
                "\nstatus: " + statusMissao +
                "\ndificuldade: \n" + NivelDificuldade);
    }

}
