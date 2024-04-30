
public class App {
    public static void main(String[] args) throws Exception {
        //testeListaTarefas();
        testeCarrinhoCompras();

    }

    public static void testeListaTarefas(){
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("comprar suco");
        tarefas.adicionarTarefa("comprar refri");
        tarefas.adicionarTarefa("fazer licao de casa");

        System.out.println(tarefas.obterNumeroTotalTarefas());

        tarefas.removerTarefa("fazer licao de casa");

        tarefas.obterDescricaoTarefas();
        
    }

    public static void testeCarrinhoCompras(){
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("pipoca", 4, 5);
        carrinhoCompras.adicionarItem("creme de leite", 5, 1);
        carrinhoCompras.adicionarItem("manteiga", 3, 2);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("creme de leite");

        carrinhoCompras.exibirItens();

        double precoTotal = carrinhoCompras.calcularValorTotal();
        System.out.println(precoTotal);


    }
}


