public class App {
    public static void main(String[] args) throws Exception {
        //testeAgendaContato();
        testeDicionario();
    }

    public static void testeDicionario(){
        Dicionario dicionario = new Dicionario();


        dicionario.adicionarPalavra("apple", "a fruit");
        dicionario.adicionarPalavra("banana", "another fruit");
        dicionario.adicionarPalavra("apple", "duplicate word"); 

        dicionario.exibirPalavras();

        dicionario.removerPalavra("apple");
        
        dicionario.exibirPalavras();
        
        System.out.println(dicionario.pesquisarPorPalavra("apple"));
        System.out.println(dicionario.pesquisarPorPalavra("banana"));

        
        
    }

    public static void testeAgendaContato(){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("vinicius", 994);
        agenda.adicionarContato("julio", 993);
        agenda.adicionarContato("klebin", 992);
        agenda.adicionarContato("klebin", 991);

        agenda.exibirContatos();
        agenda.removerContato("julio");
        agenda.pesquisarPorNome("julio");
        System.out.println(agenda.pesquisarPorNome("klebin"));
        agenda.exibirContatos();
    }
}
