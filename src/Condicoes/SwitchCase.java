package Condicoes;


import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println("1 - VTR");
        System.out.println("2 - VECTRA GT");
        System.out.println("3 - UP TSI");

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha seu carro");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("VTR escolhido com sucesso");
                break;
            case 2:
                System.out.println("VECTRA GT escolhido com sucesso");
                break;
            case 3:
                System.out.println("UP TSI escolhido com sucesso");
                break;
            default:
                System.out.println("Escolha entre as opções 1 a 3");
        }




        input.close();

    }
}
