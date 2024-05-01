import java.util.Comparator;

public class Produto {
    private String nome;
    private long cod;
    private double preco;
    private int qtd;

    public Produto(String nome, long cod, double preco, int qtd) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }
   

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", qtd=" + qtd + "]";
    }


}


class ComparatorProdutosNome implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {

        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }

}


class ComparatorProdutosPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
