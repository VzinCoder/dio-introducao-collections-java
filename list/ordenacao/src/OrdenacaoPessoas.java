import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas  {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas(){
        pessoas = new ArrayList<>();
    }


    public void adicionarPessoa(String nome,int idade,double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoas.add(pessoa);
    }


    public List<Pessoa> ordernarPorIdade(){
        if(pessoas.isEmpty()){
            System.out.println("Lista vazia nao foi possivel ordenar!");
            return null;
        }
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        if(pessoas.isEmpty()){
            System.out.println("Lista vazia nao foi possivel ordenar!");
            return null;
        }

        List<Pessoa> pessoasAltura = new ArrayList<>(pessoas);
        pessoasAltura.sort(new ComparatorPorAltura());
        return pessoasAltura;
    }

    public List<Pessoa> getList (){
        return new ArrayList<>(pessoas);
    }
}


