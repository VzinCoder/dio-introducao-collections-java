import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> compras;

    public CarrinhoCompras(){
        this.compras = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco,int quantidade){
        compras.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> comprasRemover = new ArrayList<>();

        if(compras.isEmpty()){
            System.out.println("Carrinho de compras vazio!");
            return;
        }

        for (Item item : compras) {
            if(item.getNome().equalsIgnoreCase(nome)){
                comprasRemover.add(item);
            }
        }

        compras.removeAll(comprasRemover);
    }

    public double calcularValorTotal(){
        double total = 0;

        if(compras.isEmpty()){
            System.out.println("Carrinho de compras vazio!");
            return total;
        }
   
        for (Item item : compras) {
            total+= item.getQuantidade()*item.getPreco();
        }

        return total;
    }

    public void exibirItens(){
        if(compras.isEmpty()){
            System.out.println("Carrinho de compras vazio!");
            return;
        }

        System.out.println(compras);
    }
}
