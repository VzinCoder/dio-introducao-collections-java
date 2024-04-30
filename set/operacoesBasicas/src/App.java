public class App {
    public static void main(String[] args) throws Exception {
        //testeConjuntoConvidados();
        testesConjuntoPalavrasUnicas();
    }

    public static void testesConjuntoPalavrasUnicas(){
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adiconarPalavra("ABC");
        palavrasUnicas.adiconarPalavra("CAB");
        palavrasUnicas.adiconarPalavra("BCA");
        palavrasUnicas.adiconarPalavra("ABC");

        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println(palavrasUnicas.verificarPalavra("ABC"));
        palavrasUnicas.removerPalavra("ABC");
        palavrasUnicas.exibirPalavrasUnicas();
    }

    public static void testeConjuntoConvidados(){
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("vzin", 1);
        convidados.adicionarConvidado("klebin", 2);
        convidados.adicionarConvidado("maria", 3);
        convidados.adicionarConvidado("cleusa", 4);
        convidados.adicionarConvidado("jubileu", 4);

        convidados.exibirCovidados();
        System.out.println(convidados.contarConvidados());

        System.err.println("--------------");

        convidados.removerConvidadoPorCodigo(4);

        convidados.exibirCovidados();

        System.out.println(convidados.contarConvidados());
    }
}
