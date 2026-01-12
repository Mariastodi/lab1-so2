/**
 * Classe Main
 * Classe principal para testar as figuras geométricas
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE FIGURAS GEOMÉTRICAS ===\n");
        
        // Teste 1: Círculo
        System.out.println("Teste 1: Círculo");
        Circle circle = new Circle(5);
        System.out.println(circle.toString());
        System.out.println();
        
        // Teste 2: Retângulo
        System.out.println("Teste 2: Retângulo");
        Rectangle rectangle = new Rectangle(15, 7);
        System.out.println(rectangle.toString());
        System.out.println();
        
        // Teste 3: Triângulo Equilátero
        System.out.println("Teste 3: Triângulo Equilátero");
        EquilateralTriangle triangle = new EquilateralTriangle(7, 7, 7);
        System.out.println(triangle.toString());
        System.out.println();
        
        // Teste 4: Quadrado
        System.out.println("Teste 4: Quadrado");
        Square square = new Square(2);
        System.out.println(square.toString());
        System.out.println();
        
        // Testes adicionais: Triângulo Isósceles e Escaleno
        System.out.println("Teste 5: Triângulo Isósceles");
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5, 5, 6);
        System.out.println(isoscelesTriangle.toString());
        System.out.println();
        
        System.out.println("Teste 6: Triângulo Escaleno");
        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(3, 4, 5);
        System.out.println(scaleneTriangle.toString());
        System.out.println();
        
        System.out.println("=== TODOS OS TESTES CONCLUÍDOS ===");
    }
}
