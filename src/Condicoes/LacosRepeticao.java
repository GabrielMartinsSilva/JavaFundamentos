package Condicoes;

public class LacosRepeticao {

    public static void main(String[] args) {
        /*
        int velocidadeMax = 200;

        while(velocidade<=velocidadeMax){
            System.out.println(velocidade);
            velocidade +=40;
        }*/

        for (int velocidade = 0; velocidade < 200; velocidade++) {
            velocidade+= 40;
            System.out.println(velocidade);
        }
        System.out.println("Atingida a velocidade maxima de 200 km/h");
    }
}
