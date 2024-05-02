public class App {
    public static void main(String[] args) throws Exception {
        //testeEstoqueProdutos();
        testeContagemPalavras();
    }

    public static void testeContagemPalavras(){
        ContagemPalavras palavras  = new ContagemPalavras();

        palavras.adicionarPalavra("oi", 10);
        palavras.adicionarPalavra("teste", 1);
        palavras.adicionarPalavra("teste", 2);
        palavras.adicionarPalavra("teste2", 2);

        palavras.exibirContagem();
        palavras.removerPalavra("teste2");
        palavras.exibirContagem();
        System.out.println(palavras.encontrarPalavraMaisFrequente());
    }

    public static void testeEstoqueProdutos() {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(0, "caneta", 100, 2);
        produtos.adicionarProduto(1, "caderno", 50, 10);
        produtos.adicionarProduto(4, "cadernoTeste", 100, 5);
        produtos.adicionarProduto(2, "borracha", 200, 1.5);
        produtos.adicionarProduto(3, "corretivo", 200, 1.8);
        produtos.adicionarProduto(3, "régua", 30, 3);
        produtos.adicionarProduto(4, "lápis", 150, 1);
        produtos.adicionarProduto(5, "tesoura", 20, 5.5);
        produtos.adicionarProduto(6, "cola", 20, 2);
        produtos.adicionarProduto(7, "marcador", 20, 3.75);
        produtos.adicionarProduto(8, "apontador", 20, 1.25);
        produtos.adicionarProduto(9, "grampeador", 20, 8);


        produtos.exibirProdutos();

        System.out.println(produtos.calcularValorTotalEstoque());

        System.out.println(produtos.obterProdutoMaisCaro());
        System.out.println(produtos.obterProdutoMaisBarato());
        System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
