import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        // testeAgendaEventos();
        testeLivrariaOnline();
    }

    public static void testeLivrariaOnline() {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("link1", "1984", "George Orwell", 100d);
        livrariaOnline.adicionarLivro("link2", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("link3", "Caixa de Pássaros - Bird Box: Não Abra os Olhos",
                "Josh Malerman", 19.99d);
                livrariaOnline.adicionarLivro("link4", "Teste",
                "Josh Malerman", 19.99d);


        livrariaOnline.exibirLivros();
        System.out.println("------------");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println("------------");
        livrariaOnline.removerLivro("A Revolução dos Bichos");
        livrariaOnline.exibirLivros();
        System.out.println("------------");

        livrariaOnline.exibirLivrosOrdenadosPorAutor();

       System.out.println("Livros de Josh Malerman"+ livrariaOnline.pesquisarLivrosPorAutor("Josh Malerman"));

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());


        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());


    }

    public static void testeAgendaEventos() {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
                "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação",
                "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software",
                "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação",
                "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial",
                "Discussão sobre IA avançada");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
