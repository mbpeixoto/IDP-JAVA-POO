import java.util.ArrayList;
import java.util.List;
public class Turma {

    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirTurma() {
        System.out.println("Turma de " + disciplina.getNome() + " com o professor " + professor.getNome() + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getCurso() + ")");
        }
        System.out.println();
    }
}
