/**
 * Classe Circle
 * Representa um círculo com raio
 */
public class Circle implements Shape {
    private double raio;
    
    /**
     * Construtor da classe Circle
     * @param raio raio do círculo
     */
    public Circle(double raio) {
        this.raio = raio;
    }
    
    /**
     * Calcula a área do círculo
     * @return área = π * r²
     */
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    /**
     * Calcula o perímetro (circunferência) do círculo
     * @return perímetro = 2 * π * r
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    /**
     * Retorna string formatada com nome, área e perímetro
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("Círculo, área: %.3f perímetro: %.4f", 
                           calcularArea(), calcularPerimetro());
    }
    
    // Getters e Setters
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
