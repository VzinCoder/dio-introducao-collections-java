import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas(){
        palavrasSet = new HashSet<>();
    }


    public void adiconarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        for (String p : palavrasSet) {
            if(p.equals(palavra)){
                palavrasSet.remove(palavra);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
}
