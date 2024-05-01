public class App {
    public static void main(String[] args) throws Exception {
        // testeAgendaContatos();
        testeListaDeTarefas();
    }

    public static void testeListaDeTarefas() {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("comprar refri");
        tarefas.adicionarTarefa("Estudar");
        tarefas.adicionarTarefa("Jogar");

        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("comprar refri");

        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.removerTarefa("comprar refri");

        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Jogar");
        System.out.println(tarefas.obterTarefasConcluidas());
        tarefas.marcarTarefaPendente("Jogar");
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.limparTarefas();

        tarefas.exibirTarefas();

    }

    public static void testeAgendaContatos() {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Vinicius", 123);
        agenda.adicionarContato("Vinicius", 123);
        agenda.adicionarContato("klebin", 123);
        agenda.adicionarContato("cleusa", 123);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("klebin"));

        agenda.atualizarNumeroContato("klebin", 999);

        agenda.exibirContatos();
    }
}
