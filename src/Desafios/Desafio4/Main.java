package Desafios.Desafio4;

public class Main {

    public static void main(String[] args) {

        NinjaBasico ninja1 = new NinjaBasico("Naruto", 19, "Rasengan", TipoHabilidade.NINJUTSU);
        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();

        NinjaAvancado ninja2 = new NinjaAvancado("Sasuke", 19, TipoHabilidade.GENJUTSU, "chidori", "Amaterasu");


        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();

    }
}
