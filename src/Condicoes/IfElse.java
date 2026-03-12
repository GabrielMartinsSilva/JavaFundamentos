package Condicoes;

public class IfElse {
    public static void main(String[] args) {

         /* Pequeno exemplo para criar uma condicional onde
          a pessoa vira um dev acima de 1000 horas de estudo */

        String nome = "Gabriel";
        int idade = 30;
        boolean dev = false;
        int horasDeEstudo = 20;
        int horasRestantes = 0;
        int idadeMinima = 0;


        if (horasDeEstudo > 1001 && idade > 15){
            System.out.println("Virou um dev !");
        }else if(idade<16 && horasDeEstudo < 1001)  {
            horasRestantes = (1001 - horasDeEstudo);
            System.out.println("Voce precisa completar 16 anos e estudar mais " + horasRestantes+ " horas");
        } else if(idade<16 && horasDeEstudo > 1001)  {
            System.out.println("Voce precisa completar 16 anos, porém já possui as horas necessárias ");
        }
        else {
            horasRestantes = (1001 - horasDeEstudo);
            System.out.println("Voce precisa de mais "+ horasRestantes+" horas de estudo");
        }











    }
}
