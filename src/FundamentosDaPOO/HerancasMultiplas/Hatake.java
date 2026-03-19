package FundamentosDaPOO.HerancasMultiplas;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public Hatake() {
    }

    public Hatake(String nome, int idade) {
        super(nome, idade);
    }

    public void HatakeClan(){
        System.out.println("i'm from hatake clan");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou um hatake e uso sharingan");
    }

    public void anbu(){
        System.out.println("Sou um anbu");
    }
}
