public class App {
    public static void main(String[] args) throws Exception {
       // testeCadastroProdutos();
       testeGerenciadorAlunos();
    }

    public static void testeCadastroProdutos() {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1, "a", 30, 0);
        produtos.adicionarProduto(2, "b", 20, 0);
        produtos.adicionarProduto(3, "c", 10, 0);

        produtos.exibirProdutosPorNome();
        produtos.exibirProdutosPorPreco();
    }

    public static void testeGerenciadorAlunos() {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Joao", 20, 7);
        alunos.adicionarAluno("Maria", 21, 9);
        alunos.adicionarAluno("Pedro", 19, 6);

        alunos.exibirAlunos();

        alunos.removerAluno(20);
        System.out.println("------------");
        alunos.exibirAlunos();
        System.out.println("------------");
        alunos.exibirAlunosPorNome();
        System.out.println("------------");
        alunos.exibirAlunosPorNota();
    }

}
