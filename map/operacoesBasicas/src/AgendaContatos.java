import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        if (contatosMap.containsKey(nome)) {
            System.out.println("Nome em uso");
            return;
        }
        contatosMap.put(nome,telefone);
    }

    public void removerContato(String nome) {
        if (contatosMap.isEmpty()) {
            System.out.println("Agenda vazia");
            return;
        }

        Integer telefone = contatosMap.remove(nome);
        if(telefone == null){
            System.out.println("Contato nao encontrado");
        }
    }

    public void exibirContatos() {
        if (contatosMap.isEmpty()) {
            System.out.println("Agenda vazia");
            return;
        }
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (contatosMap.isEmpty()) {
            System.out.println("Agenda vazia");
            return null;
        }

        Integer telefone = contatosMap.get(nome);
        if(telefone == null){
            System.out.println("Contato nao encontrado");
        }

        return telefone;
    }
}
