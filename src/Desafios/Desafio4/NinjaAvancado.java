package Desafios.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;
    String habilidade;
    String especialidade;

    public NinjaAvancado() {
    }


    public NinjaAvancado(String nome, int idade, TipoHabilidade tipoHabilidade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes(){
        System.out.println("Ninja avançado ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);





    }
    public void executarHabilidade(){

        System.out.println("Tipo da habilidade: " + tipoHabilidade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }
}
