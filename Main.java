import java.util.Scanner;

public class Main {
    
    /**
     * Exercício I - Seleção de Quadrante
     * Determina em qual quadrante se encontra um ponto (x, y)
     * Quadrante 1: x < 0, y > 0
     * Quadrante 2: x > 0, y > 0
     * Quadrante 3: x < 0, y < 0
     * Quadrante 4: x > 0, y < 0
     */
    public static int determinarQuadrante(int x, int y) {
        if (x > 0 && y > 0) {
            return 2;
        } else if (x < 0 && y > 0) {
            return 1;
        } else if (x < 0 && y < 0) {
            return 3;
        } else { // x > 0 && y < 0
            return 4;
        }
    }
    
    /**
     * Exercício II - Último Dígito Fatorial
     * Calcula o último dígito de N!
     * Para N >= 5, o último dígito é sempre 0
     */
    public static int ultimoDigitoFatorial(int n) {
        if (n >= 5) {
            return 0;
        }
        
        // Calcular fatorial para n < 5
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        
        return fatorial % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EXERCÍCIO I - SELEÇÃO DE QUADRANTE ===");
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        
        int quadrante = determinarQuadrante(x, y);
        System.out.println(quadrante);
        
        System.out.println("\n=== EXERCÍCIO II - ÚLTIMO DÍGITO FATORIAL ===");
        System.out.print("Digite o número de casos de teste (T): ");
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            System.out.print("Digite o valor de N: ");
            int n = scanner.nextInt();
            int ultimoDigito = ultimoDigitoFatorial(n);
            System.out.println(ultimoDigito);
        }
        
        scanner.close();
    }
}
