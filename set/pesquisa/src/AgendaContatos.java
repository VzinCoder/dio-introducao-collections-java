import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();

        for (Contato c : contatosSet) {
            if (c.getNome().equals(nome)) {
                contatosEncontrados.add(c);
                break;
            }
        }

        return contatosEncontrados;

    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato c : contatosSet) {
            if (c.getNome().equals(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;   
    }

}
