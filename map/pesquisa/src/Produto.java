public class Produto {
    private String nome;
    private double preco;
    private int qtd;


    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getQtd() {
        return qtd;
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
    }

    

}
