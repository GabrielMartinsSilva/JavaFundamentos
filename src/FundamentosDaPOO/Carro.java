package FundamentosDaPOO;

public class Carro {

    String nome;
    String motor;
    String tipoMotor;
    String tracao;
    int potencia;

    public void AtivarNitro(){
        System.out.println("nitro ativado");
    }

    public String PotenciaMax (int potenciaMaxima){

        return "Falta "+ (potenciaMaxima - potencia) +" cavalos para atingir a potencia maxima";
    }

}
