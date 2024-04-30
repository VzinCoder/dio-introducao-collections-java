

public class App {
    public static void main(String[] args) throws Exception {
        //testeOrdenacaoPessoas();
        testeOrdenacaoNumeros();
    }

    public static void testeOrdenacaoNumeros(){
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(3);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);

        System.out.println(numeros.getNumeros());
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }


    public static  void testeOrdenacaoPessoas(){
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Vinicius", 18, 1.75);
        pessoas.adicionarPessoa("Maria", 25, 1.68);
        pessoas.adicionarPessoa("Joao", 30, 1.80);
        pessoas.adicionarPessoa("Ana", 22, 1.60);
        pessoas.adicionarPessoa("Pedro", 35, 1.70);
        pessoas.adicionarPessoa("Carla", 28, 1.72);
        pessoas.adicionarPessoa("Paulo", 40, 1.78);
        pessoas.adicionarPessoa("Lucia", 20, 1.65);
        pessoas.adicionarPessoa("Felipe", 27, 1.73);
        pessoas.adicionarPessoa("Julia", 32, 1.67);

        System.out.println(pessoas.getList());

        System.out.println(pessoas.ordernarPorIdade());
        
        System.out.println(pessoas.ordenarPorAltura());
        
        
    }
}
