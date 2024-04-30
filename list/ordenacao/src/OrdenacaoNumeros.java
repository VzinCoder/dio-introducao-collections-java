import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        numeros = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        if(numeros.isEmpty()){
            System.out.println("Lista de numeros vazia!");
            return null;
        }
        List<Integer> numerosAscendente =  new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        if(numeros.isEmpty()){
            System.out.println("Lista de numeros vazia!");
            return null;
        }
        
        List<Integer> numerosDescendente = new ArrayList<>(numeros);  
        Collections.sort(numerosDescendente,Collections.reverseOrder());
        return numerosDescendente;
    }

    public List<Integer> getNumeros(){
        if(numeros.isEmpty()){
            System.out.println("Lista de numeros vazia!");
            return null;
        }
         return new ArrayList<>(numeros);
    }
}



