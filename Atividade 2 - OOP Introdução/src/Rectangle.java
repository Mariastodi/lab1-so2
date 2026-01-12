/**
 * Classe Rectangle
 * Representa um retângulo com base e altura
 */
public class Rectangle implements Shape {
    protected double base;
    protected double altura;
    
    /**
     * Construtor da classe Rectangle
     * @param base base do retângulo
     * @param altura altura do retângulo
     */
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Calcula a área do retângulo
     * @return área = base * altura
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    /**
     * Calcula o perímetro do retângulo
     * @return perímetro = 2 * (base + altura)
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    /**
     * Retorna string formatada com nome, área e perímetro
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("Retângulo, área: %.0f perímetro: %.0f", 
                           calcularArea(), calcularPerimetro());
    }
    
    // Getters e Setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
