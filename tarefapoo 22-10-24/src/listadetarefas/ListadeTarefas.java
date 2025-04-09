package listadetarefas;

import java.util.ArrayList;

public class ListadeTarefas {
    private ArrayList<Tarefas> tarefas = new ArrayList<>();

    // Adicionar uma tarefa
    public void registrarTarefas(Tarefas novaTarefa) {
        tarefas.add(novaTarefa);
        System.out.println("Tarefa registrada com sucesso!");
    }

    // Listar todas as tarefas
    public void listarTarefas() {
        System.out.println("### LISTA DE TAREFAS ###");
        for (Tarefas tarefa : tarefas) {
            String status = tarefa.isConcluida() ? "Concluída" : "Pendente";
            System.out.println(tarefa.getNome() + " - " + status);
        }
    }

    // Excluir uma tarefa pelo nome
    public void excluirTarefas(String nomeTarefa) {
        Tarefas tarefaARemover = null;
        for (Tarefas tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
                tarefaARemover = tarefa;
                break;
            }
        }
        if (tarefaARemover != null) {
            tarefas.remove(tarefaARemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    // Marcar uma tarefa como concluída
    public void concluirTarefas(String nomeTarefa) {
        for (Tarefas tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
                tarefa.setConcluida(true);
                System.out.println("Tarefa marcada como concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }
}
