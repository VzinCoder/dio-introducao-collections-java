import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) throws Exception {
        if (livros.isEmpty()) {
            throw new Exception("Sem livros no catalogo!");
        }

        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal) throws Exception{
        if (livros.isEmpty()) {
            throw new Exception("Sem livros no catalogo!");
        }

        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) throws Exception{
        if (livros.isEmpty()) {
            throw new Exception("Sem livros no catalogo!");
        }

        Livro livroEncontrado = null;
        for (Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroEncontrado = livro;
            }
        }

        return livroEncontrado;
    }
}
