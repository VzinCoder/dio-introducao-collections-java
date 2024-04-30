import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() throws Exception {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() throws Exception {

        if (numeros.isEmpty()) {
            throw new Exception("nao tem numeros!");
        }

        int maiorNumero = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() throws Exception {

        if (numeros.isEmpty()) {
            throw new Exception("nao tem numeros!");
        }

        int menorNumero = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() throws Exception{
        if (numeros.isEmpty()) {
            throw new Exception("nao tem numeros!");
        }
        return numeros;
    }
}
