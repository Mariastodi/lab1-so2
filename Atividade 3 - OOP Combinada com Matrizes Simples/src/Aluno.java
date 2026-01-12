import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe Aluno
 * Representa um aluno com nome, nota e lista de cursos
 */
public class Aluno {
    private String nome;
    private int nota;
    private List<String> cursos;
    
    /**
     * Construtor da classe Aluno
     * @param nome nome do aluno
     * @param nota nota do aluno
     * @param cursos array de cursos atribuídos ao aluno
     */
    public Aluno(String nome, int nota, String[] cursos) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new ArrayList<>(Arrays.asList(cursos));
    }
    
    /**
     * Construtor alternativo sem cursos
     * @param nome nome do aluno
     * @param nota nota do aluno
     */
    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new ArrayList<>();
    }
    
    /**
     * Adiciona um novo curso à lista de cursos do aluno
     * @param curso nome do curso a ser adicionado
     */
    public void addCurso(String curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
    
    /**
     * Verifica se o aluno está matriculado em um curso específico
     * @param curso nome do curso
     * @return true se o aluno está no curso, false caso contrário
     */
    public boolean temCurso(String curso) {
        return cursos.contains(curso);
    }
    
    /**
     * Retorna uma representação em string do aluno
     * Formato: Nome: [nome], Nota: [nota], Curso: [curso1], [curso2], ...
     * @return string formatada
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append(", Nota: ").append(nota);
        sb.append(", Curso: ");
        
        if (cursos.isEmpty()) {
            sb.append("nenhum");
        } else {
            for (int i = 0; i < cursos.size(); i++) {
                sb.append(cursos.get(i));
                if (i < cursos.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        
        return sb.toString();
    }
    
    // Getters e Setters
    
    /**
     * Retorna o nome do aluno
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Define o nome do aluno
     * @param nome novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Retorna a nota do aluno
     * @return nota do aluno
     */
    public int getNota() {
        return nota;
    }
    
    /**
     * Define a nota do aluno (promover nota)
     * @param nota nova nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    /**
     * Retorna a lista de cursos do aluno
     * @return lista de cursos
     */
    public List<String> getCursos() {
        return new ArrayList<>(cursos); // Retorna cópia para manter encapsulamento
    }
    
    /**
     * Define a lista de cursos do aluno
     * @param cursos nova lista de cursos
     */
    public void setCursos(List<String> cursos) {
        this.cursos = new ArrayList<>(cursos);
    }
}
