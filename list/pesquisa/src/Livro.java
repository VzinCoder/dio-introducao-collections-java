public class Livro {
    private String titulo;
    private String autor;
    private int ano;


    public Livro(String titulo,String autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Livro {"+"titulo: "+titulo+", autor:"+autor+", ano:"+ano+"}";
    }
}
