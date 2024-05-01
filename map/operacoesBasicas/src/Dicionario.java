import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        if (palavrasMap.containsKey(palavra)) {
            System.out.println("Palvra em uso");
            return;
        }
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (palavrasMap.isEmpty()) {
            System.out.println("Nao tem palavras cadastradas");
            return;
        }

        boolean palavraEncontrada = palavrasMap.remove(palavra) != null ? true : false;

        if (!palavraEncontrada) {
            System.out.println("palavra nao encontrada");
        }
    }

    public void exibirPalavras() {
        if (palavrasMap.isEmpty()) {
            System.out.println("Nao tem palavras cadastradas");
            return;
        }
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        if (palavrasMap.isEmpty()) {
            System.out.println("Nao tem palavras cadastradas");
            return null;
        }

        String definicaoEncontrada = palavrasMap.remove(palavra);

        if (definicaoEncontrada == null) {
            System.out.println("palavra nao encontrada");
        }

        return definicaoEncontrada;
    }
}
