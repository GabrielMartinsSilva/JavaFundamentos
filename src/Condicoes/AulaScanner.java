package Condicoes;

import java.util.Scanner;

public class AulaScanner {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = input.nextLine();


        System.out.println("Idade: ");
        int idade = input.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);




        input.close();

    }
}
