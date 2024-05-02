import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        if (!livrosMap.containsKey(link)) {
            livrosMap.put(link,new Livro(titulo, autor, preco));
        }
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            String key = entry.getKey();

            if (titulo.equalsIgnoreCase(livro.getTitulo())) {
                chavesRemover.add(key);
            }

        }

        for (String chave : chavesRemover) {
            livrosMap.remove(chave);
        }

    }

    public void exibirLivros() {
        System.out.println(livrosMap);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livrosOrdenadosPorPreco);
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livrosOrdenadosPorAutor);
    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor){
        Map<String,Livro> livrosEncontradosPorAutor = new HashMap<>();
        for (Map.Entry<String,Livro> entry : livrosMap.entrySet()) {
            String keyLivro = entry.getKey();
            Livro livro = entry.getValue();
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontradosPorAutor.put(keyLivro,livro);
            }
        }

        return livrosEncontradosPorAutor;
    }


    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        for (Livro livro: livrosMap.values()) {
            if(livroMaisCaro != null){
                if(livro.getPreco() > livroMaisCaro.getPreco()){
                    livroMaisCaro = livro;
                }
                continue;
            }
            
            livroMaisCaro = livro;
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        for (Livro livro: livrosMap.values()) {
            if(livroMaisBarato != null){
                if(livro.getPreco() < livroMaisBarato.getPreco()){
                    livroMaisBarato = livro;
                }
                continue;
            }
            
            livroMaisBarato = livro;
        }
        return livroMaisBarato;
    }

}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return Double.compare(o1.getValue().getPreco(), o2.getValue().getPreco());
    }

}


class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getAutor().compareToIgnoreCase(o1.getValue().getAutor());
    }

}

