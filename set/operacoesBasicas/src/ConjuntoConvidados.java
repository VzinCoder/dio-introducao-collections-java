import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigo) {
        if (convidados.isEmpty()) {
            System.out.println("Nao tem convidados para remover");
            return;
        }

        for (Convidado convidado : convidados) {
            if (convidado.getCodigo() == codigo) {
                convidados.remove(convidado);
                return;
            }
        }

        System.out.println("Convidado nao encontrado para remover");
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirCovidados() {
        if (convidados.isEmpty()) {
            System.out.println("Nao tem convidados para remover");
            return;
        }
        System.out.println(convidados);
    }
}
