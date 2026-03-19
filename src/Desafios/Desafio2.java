package Desafios;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        int MAX =2;
        int opcao= 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[MAX];


        while (opcao !=3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Digite apenas numeros !");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if(contador < ninjas.length) {
                        System.out.println("Digite o nome do ninja a ser cadastrado ");
                        ninjas[contador] = scanner.nextLine();
                        contador++;
                    } else {
                        System.out.println("Numero maximo de ninjas cadastrados !");
                    }


                   /* for (int contador = 0; contador <ninjas.length ; contador++) {
                        ninjas[contador] = scanner.nextLine();
                    }*/
                    break;

                case 2:
                    System.out.println("Listar ninjas");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Escolha entre as opções 1 a 3");
            }


        }
        scanner.close();
    }
}
