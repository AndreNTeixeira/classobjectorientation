package listadetarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListadeTarefas minhasTarefas = new ListadeTarefas();

        int opcoes = 1;
        String nome;

        System.out.println("Lista de Tarefas: ");
        while (opcoes != 0) {
            System.out.println("Qual opção deseja realizar?");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Listar Tarefas");
            System.out.println("4 - Concluir Tarefa");
            System.out.println("5 - Encerrar Programa");
            opcoes = scan.nextInt();
            scan.nextLine();  // Consumir o '\n'

            switch (opcoes) {
                case 1:
                    System.out.println("Digite a tarefa:");
                    nome = scan.nextLine();
                    Tarefas novaTarefa = new Tarefas(nome);
                    minhasTarefas.registrarTarefas(novaTarefa);
                    break;

                case 2:
                    System.out.println("Digite o nome da tarefa a ser removida:");
                    nome = scan.nextLine();
                    minhasTarefas.excluirTarefas(nome);
                    break;

                case 3:
                    minhasTarefas.listarTarefas();
                    break;

                case 4:
                    System.out.println("Digite o nome da tarefa a ser concluída:");
                    nome = scan.nextLine();
                    minhasTarefas.concluirTarefas(nome);
                    break;

                case 5:
                    System.out.println("Encerrando programa...");
                    opcoes = 0;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scan.close();
    }
}
