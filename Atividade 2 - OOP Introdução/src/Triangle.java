/**
 * Classe abstrata Triangle
 * Representa um triângulo com três lados
 */
public abstract class Triangle implements Shape {
    protected double lado1;
    protected double lado2;
    protected double lado3;
    
    /**
     * Construtor da classe Triangle
     * @param lado1 primeiro lado
     * @param lado2 segundo lado
     * @param lado3 terceiro lado
     */
    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Calcula o perímetro do triângulo
     * @return perímetro = lado1 + lado2 + lado3
     */
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    /**
     * Calcula a área do triângulo usando a fórmula de Heron
     * @return área do triângulo
     */
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2.0; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    // Getters e Setters
    public double getLado1() {
        return lado1;
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
