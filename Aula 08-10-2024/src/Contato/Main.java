package Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        //vetor de objetos
        Contato[] agenda = new Contato[5];
        Contato c1 = new Contato("André",869999999);
        //pode ser feito dessa maneira


        agenda[0] = c1;
        agenda[1] = new Contato("Maria",869987789);
        //pode ser feito direto na nomeação
        agenda[2] = new Contato("Whuanderson",86999999);
        agenda[3] = new Contato("Felipe",869451136);
        agenda[4] = new Contato("Naturo", 869854899);

        for (int i = 0; i<agenda.length; i++) {
            System.out.println("Nome do contato: "+agenda[i].getNome());
            System.out.println("Telefone do contato: " +agenda[i].getTelefone());

        }





    }*/

        Scanner scan = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();

        String nome;
        int telefone;
        int opcoes =1;

        System.out.println("Bem vindo a Agenda");
        while(opcoes != 0){
            System.out.println("Qual Opção deseja escolher?");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contato");
            System.out.println("0 - Encerrar");
            opcoes = scan.nextInt();
            scan.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = scan.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = scan.nextInt();
                    Contato contato = new Contato(nome, telefone);
                    minhaAgenda.registrarContato(contato);
                    System.out.println("Contato cadastrado com sucesso!");
                    System.out.println(" ");
                break;

                case 2:
                        minhaAgenda.listarContatos();
                break;

                case 0:
                        System.out.println("Até mais");
                break;

                default:
                    System.out.println("Digite Opção Válida");
            }
        }
    }
}
