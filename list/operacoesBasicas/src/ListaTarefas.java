import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(tarefa);
            }
        }

        tarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obterDescricaoTarefas() {
        if (!tarefas.isEmpty()) {
            System.out.println(tarefas);
            return;
        }

        System.out.println("A lista está vazia!");
    }

}
