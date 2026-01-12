import java.util.ArrayList;
import java.util.List;

/**
 * Classe Universidade
 * Representa uma universidade com uma lista de alunos
 */
public class Universidade {
    private List<Aluno> alunos;
    
    /**
     * Construtor da classe Universidade
     */
    public Universidade() {
        this.alunos = new ArrayList<>();
    }
    
    /**
     * Adiciona um novo aluno à lista de alunos
     * @param aluno aluno a ser adicionado
     */
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    /**
     * Atribui um novo curso a um aluno específico
     * @param indice índice do aluno na lista (baseado em 0)
     * @param curso nome do curso a ser adicionado
     */
    public void atribuirCursoAoAluno(int indice, String curso) {
        if (indice >= 0 && indice < alunos.size()) {
            alunos.get(indice).addCurso(curso);
        } else {
            System.out.println("Índice inválido: " + indice);
        }
    }
    
    /**
     * Promove a nota de um aluno específico
     * @param indice índice do aluno na lista (baseado em 0)
     * @param novaNota nova nota do aluno
     */
    public void promoverNotaDoAluno(int indice, int novaNota) {
        if (indice >= 0 && indice < alunos.size()) {
            alunos.get(indice).setNota(novaNota);
        } else {
            System.out.println("Índice inválido: " + indice);
        }
    }
    
    /**
     * Filtra alunos que estão matriculados em um curso específico
     * @param nomeCurso nome do curso
     * @return lista de nomes dos alunos do curso
     */
    public List<String> filter(String nomeCurso) {
        List<String> alunosDoCurso = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.temCurso(nomeCurso)) {
                alunosDoCurso.add(aluno.getNome());
            }
        }
        return alunosDoCurso;
    }
    
    /**
     * Lista todos os alunos no formato especificado
     * Formato: Nome: [nome], Nota: [nota], Curso: [curso1], [curso2], ...
     * @return lista de strings formatadas
     */
    public List<String> listarTodosAlunos() {
        List<String> lista = new ArrayList<>();
        for (Aluno aluno : alunos) {
            lista.add(aluno.toString());
        }
        return lista;
    }
    
    /**
     * Imprime todos os alunos no console
     */
    public void imprimirTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
    
    /**
     * Retorna o número de alunos na universidade
     * @return número de alunos
     */
    public int getNumeroDeAlunos() {
        return alunos.size();
    }
    
    /**
     * Retorna um aluno específico pelo índice
     * @param indice índice do aluno
     * @return aluno ou null se índice inválido
     */
    public Aluno getAluno(int indice) {
        if (indice >= 0 && indice < alunos.size()) {
            return alunos.get(indice);
        }
        return null;
    }
    
    // Getter e Setter
    
    /**
     * Retorna a lista de alunos
     * @return lista de alunos (cópia para manter encapsulamento)
     */
    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }
}
