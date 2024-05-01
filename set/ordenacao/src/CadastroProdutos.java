import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        produtosSet = new HashSet<>();
    }


    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, cod, preco, quantidade);
        produtosSet.add(produto);
    }

    public void exibirProdutosPorNome(){
        if (produtosSet.isEmpty()) {
            System.out.println("Conjunto vazio");
            return;
        }
        Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorProdutosNome());
        produtosOrdenados.addAll(produtosSet);
        System.out.println(produtosOrdenados);
    }

    public void exibirProdutosPorPreco(){
        if (produtosSet.isEmpty()) {
            System.out.println("Conjunto vazio");
            return;
        }

        Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorProdutosPreco());
        produtosOrdenados.addAll(produtosSet);
        System.out.println(produtosOrdenados);
    }
    
}
