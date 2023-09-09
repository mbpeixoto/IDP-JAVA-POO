public class Ensalamento {

    public static void main(String[] args) {
        // Criar alunos
        Aluno[] alunos = {
                new Aluno("Alfredo", "TI"),
                new Aluno("Peterson", "ADM"),
                new Aluno("Wendel", "TI"),
                new Aluno("Ian", "ADM"),
                new Aluno("Debra", "TI"),
                new Aluno("Luana", "ADM"),
                new Aluno("Bruno", "TI"),
                new Aluno("Romeu", "ADM"),
                new Aluno("Julieta", "TI"),
                new Aluno("Maria", "ADM"),
                new Aluno("Capitú", "TI"),
                new Aluno("Bentinho", "ADM"),
                new Aluno("Amélia", "TI")
        };

        // Criar professores
        Professor[] professores = {
                new Professor("Mia", "POO"),
                new Professor("Saulo", "Estrutura de Dados"),
                new Professor("Paula", "BI")
        };

        // Criar cursos
        Curso[] cursos = {
                new Curso("TI"),
                new Curso("ADM")
        };

        // Adicionar disciplinas aos cursos
        cursos[0].addDisciplina(new Disciplina("POO do curso de TI"));
        cursos[0].addDisciplina(new Disciplina("Estrutura de Dados do curso de TI"));
        cursos[1].addDisciplina(new Disciplina("BI do curso de ADM"));

    }
}
