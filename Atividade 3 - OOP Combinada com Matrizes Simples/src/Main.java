import java.util.List;

/**
 * Classe Main
 * Classe principal para testar as funcionalidades da Universidade
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE: UNIVERSIDADE JALA ===\n");
        
        // Criar instância da universidade
        Universidade universidade = new Universidade();
        
        // Adicionar alunos conforme exemplo
        System.out.println("1. Adicionando alunos à universidade:");
        universidade.addAluno(new Aluno("Gery", 1, new String[]{"induction"}));
        universidade.addAluno(new Aluno("Luis", 2, new String[]{"science"}));
        universidade.addAluno(new Aluno("Raul", 2, new String[]{"maths", "science"}));
        universidade.addAluno(new Aluno("Liz", 3, new String[]{"science"}));
        System.out.println("   Alunos adicionados com sucesso!\n");
        
        // Atribuir novo curso a um aluno
        System.out.println("2. Atribuindo curso 'DataBase I' ao aluno no índice 3:");
        universidade.atribuirCursoAoAluno(3, "DataBase I");
        System.out.println("   Curso adicionado!\n");
        
        // Promover nota de um aluno
        System.out.println("3. Promovendo nota do aluno no índice 0 (Gery) de 1 para 2:");
        universidade.promoverNotaDoAluno(0, 2);
        System.out.println("   Nota promovida!\n");
        
        // Filtrar alunos de um curso
        System.out.println("4. Filtrando alunos do curso 'science':");
        List<String> alunosScience = universidade.filter("science");
        System.out.println("   Alunos do curso 'science': " + alunosScience);
        System.out.println("   Resultado esperado: [Luis, Raul, Liz]\n");
        
        // Listar todos os alunos
        System.out.println("5. Listando todos os alunos:");
        universidade.imprimirTodosAlunos();
        System.out.println();
        
        // Testes adicionais
        System.out.println("=== TESTES ADICIONAIS ===\n");
        
        System.out.println("6. Filtrando alunos do curso 'maths':");
        List<String> alunosMaths = universidade.filter("maths");
        System.out.println("   Alunos do curso 'maths': " + alunosMaths + "\n");
        
        System.out.println("7. Filtrando alunos do curso 'induction':");
        List<String> alunosInduction = universidade.filter("induction");
        System.out.println("   Alunos do curso 'induction': " + alunosInduction + "\n");
        
        System.out.println("8. Total de alunos na universidade: " + universidade.getNumeroDeAlunos());
        
        System.out.println("\n=== TODOS OS TESTES CONCLUÍDOS ===");
    }
}
