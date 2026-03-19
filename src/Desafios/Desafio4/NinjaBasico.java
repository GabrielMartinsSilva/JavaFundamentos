package Desafios.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public void mostrarInformacoes(){
        System.out.println("Ninja basico");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
    public void executarHabilidade(){
        System.out.println("Tipo da habilidade: " + tipoHabilidade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("-----------------------------");
    }

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
}
