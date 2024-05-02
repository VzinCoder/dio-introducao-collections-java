import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int ContagemPalavras) {
        if(!palavras.containsKey(palavra)){
            palavras.put(palavra, ContagemPalavras);
            return;
        }
        System.out.println("palavra já cadastrada");

    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            boolean removido = palavras.remove(palavra) != null ? true : false;
            if (!removido) {
                System.out.println("Palavra nao encontrada");
            }
            return;
        }
        System.out.println("Nao tem palavras cadastradas");
    }

    public void exibirContagem() {
        System.out.println(palavras);
    }

    public String encontrarPalavraMaisFrequente() {
        if (palavras.isEmpty()) {
            System.out.println("Não há palavras cadastradas");
            return null;
        }
        
        String palavraMaisFrequente = null;
        int contagemPalavraMaisFrequente = Integer.MIN_VALUE;
    
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            int contagemAtual = entry.getValue();
            if (contagemAtual > contagemPalavraMaisFrequente) {
                palavraMaisFrequente = entry.getKey();
                contagemPalavraMaisFrequente = contagemAtual;
            }
        }
    
        if (palavraMaisFrequente == null) {
            System.out.println("Palavra não encontrada");
        }
        
        return palavraMaisFrequente;
    }
}
