/**
 * Classe EquilateralTriangle
 * Representa um triângulo equilátero (todos os lados iguais)
 */
public class EquilateralTriangle extends Triangle {
    
    /**
     * Construtor da classe EquilateralTriangle
     * @param lado1 primeiro lado
     * @param lado2 segundo lado
     * @param lado3 terceiro lado
     */
    public EquilateralTriangle(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }
    
    /**
     * Retorna string formatada com nome, área e perímetro
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("Triângulo equilátero, área: %.3f perímetro: %.0f", 
                           calcularArea(), calcularPerimetro());
    }
}
