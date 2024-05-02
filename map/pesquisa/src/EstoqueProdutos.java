import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco) {
        if (!produtosMap.containsKey(cod)) {
            Produto produto = new Produto(nome, preco, qtd);
            produto = produtosMap.put(cod, produto);
            return;
        }
        System.out.println("Ja tem um produto com esse codigo no estoque");
    }

    public void exibirProdutos() {
        if (!produtosMap.isEmpty()) {
            System.out.println(produtosMap);
            return;
        }

        System.out.println("Nao tem produtos no estoque");
    }

    public Double calcularValorTotalEstoque() {
        double resultado = 0;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                resultado += p.getPreco() * p.getQtd();
            }
            return resultado;
        }

        System.out.println("Nao tem produtos no estoque");
        return resultado;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (produtoMaisCaro == null) {
                    produtoMaisCaro = p;
                    continue;
                }

                if (p.getPreco() > produtoMaisCaro.getPreco()) {
                    produtoMaisCaro = p;
                }
            }
            return produtoMaisCaro;
        }

        System.out.println("Nao tem produtos no estoque");
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (produtoMaisBarato == null) {
                    produtoMaisBarato = p;
                    continue;
                }

                if (p.getPreco() < produtoMaisBarato.getPreco()) {
                    produtoMaisBarato = p;
                }
            }
            return produtoMaisBarato;
        }

        System.out.println("Nao tem produtos no estoque");
        return produtoMaisBarato;
    }



    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produto = null;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (produto == null) {
                    produto = p;
                    continue;
                }

                if (isMaiorQuantidadeValorTotal(p, produto)) {
                    produto = p;
                }
            }
            return produto;
        }
        System.out.println("Nao tem produtos no estoque");
        return produto;
    }
 
    private boolean isMaiorQuantidadeValorTotal(Produto p1, Produto p2) {
        double totalProduto1 = p1.getPreco() * p1.getQtd();
        double totalProduto2 = p2.getPreco() * p2.getQtd();
        boolean isMaiorValorTotal = totalProduto1 > totalProduto2 ;
        boolean isMesmoValorTotal = totalProduto1  == totalProduto2;
        boolean isMaiorQuantidade = p1.getQtd() > p2.getQtd();

        
        if(isMaiorValorTotal || isMesmoValorTotal && isMaiorQuantidade){
            return true;
        }
        
        return false;
    }
    
}
