package Desafios.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    @Override
    public void MostrarInformacoes(){
        System.out.println("Nome: " +  nome +
                "\nidade: " + idade +
                "\nmissao: " + missao +
                "\nstatus: " + statusMissao +
                "\ndificuldade: " + NivelDificuldade +
                "\nhabilidade especial: " + habilidadeEspecial);
    }
}
