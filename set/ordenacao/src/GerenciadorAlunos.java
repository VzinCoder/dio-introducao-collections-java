import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        Aluno aluno = new Aluno(nome, matricula, media);
        alunos.add(aluno);
    }

    public void removerAluno(long matricula) {
        if (alunos.isEmpty()) {
            System.out.println("Nao tem alunos cadastrados");
            return;
        }

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                return;
            }
        }

        System.out.println("Aluno nao encontrado");
    }

    public void exibirAlunosPorNome(){
        if (alunos.isEmpty()) {
            System.out.println("Nao tem alunos cadastrados");
            return;
        }

        Set<Aluno> alunosOrdenados = new TreeSet<>(alunos);
        System.out.println(alunosOrdenados);
    }

    public void exibirAlunosPorNota(){
        if (alunos.isEmpty()) {
            System.out.println("Nao tem alunos cadastrados");
            return;
        }

        Set<Aluno> alunosOrdenados = new TreeSet<>(new CompararAlunoNota());
        alunosOrdenados.addAll(alunos);
        System.out.println(alunosOrdenados);
    }

    public void exibirAlunos(){
        if (alunos.isEmpty()) {
            System.out.println("Nao tem alunos cadastrados");
            return;
        }
        System.out.println(alunos);
    }


}
