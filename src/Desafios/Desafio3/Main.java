package Desafios.Desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int MAX =2;
        int opcao= 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        Uchiha[] ninjas = new Uchiha[MAX];


        while (opcao !=4) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar habilidade especial");
            System.out.println("4. Sair");
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
                        String nome = scanner.nextLine();
                        System.out.println("Digite a idade");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite o nome da missao ");
                        String missao = scanner.nextLine();
                        System.out.println("Digite a dificuldade da missao");
                        String NivelDificuldade = scanner.nextLine();
                        System.out.println("Qual é o status da missao?");
                        String statusMissao = scanner.nextLine();
                        System.out.println("Qual é a habilidade especial?");
                        String habilidadeEspecial = scanner.nextLine();
                        Uchiha Novo  = new Uchiha();
                        Novo.nome = nome;
                        Novo.idade = idade;
                        Novo.missao = missao;
                        Novo.NivelDificuldade = NivelDificuldade;
                        Novo.statusMissao  = statusMissao;
                        Novo.habilidadeEspecial = habilidadeEspecial;
                        ninjas[contador] = Novo;
                        contador++;


                    } else {
                        System.out.println("Numero maximo de ninjas cadastrados !");
                    }

                    break;

                case 2:
                    System.out.println("Listar ninjas");
                    for (Uchiha ninja : ninjas) {
                        if(ninja != null) {
                            ninja.MostrarInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Atualizar habilidade especial");
                    int count = 0;
                    int op = 0;
                    String habilidadeNova;
                    for (Uchiha ninja : ninjas) {
                        if(ninja != null) {
                            System.out.println("Ninja "+ count + "-" + ninja.nome);
                            count ++;
                        }
                    }
                    System.out.println("Qual ninja deseja atualizar a habilidade especial?");
                    int opHabilidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Qual a nova habilidade?");
                    habilidadeNova = scanner.nextLine();
                    ninjas[opHabilidade].habilidadeEspecial = habilidadeNova;
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Escolha entre as opções 1 a 3");
            }


        }
        scanner.close();
    }



    }

