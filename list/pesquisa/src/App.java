public class App {
    public static void main(String[] args) throws Exception {
        //testeCatalogoLivros();
        testeSomaNumeros();
    }

    public static void testeSomaNumeros(){
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(50);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(80);

        try {
           int soma = numeros.calcularSoma();
           System.out.println(soma);
           int maiorNumero = numeros.encontrarMaiorNumero();
           System.out.println(maiorNumero);
           int menorNumero = numeros.encontrarMenorNumero();
           System.out.println(menorNumero);
           System.out.println(numeros.exibirNumeros());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void testeCatalogoLivros() {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);

        try {
            System.out.println(catalogo.pesquisarPorAutor("Miguel de Cervantes"));
            System.out.println(catalogo.pesquisarPorIntervaloAnos(1900, 2000));
            System.out.println(catalogo.pesquisarPorTitulo("O Senhor dos Anéis"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
