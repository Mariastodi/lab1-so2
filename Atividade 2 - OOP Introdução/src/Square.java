/**
 * Classe Square
 * Representa um quadrado (retângulo com todos os lados iguais)
 * Herda de Rectangle
 */
public class Square extends Rectangle {
    
    /**
     * Construtor da classe Square
     * @param lado tamanho do lado do quadrado
     */
    public Square(double lado) {
        super(lado, lado); // Chama o construtor da classe pai com lado e lado
    }
    
    /**
     * Retorna string formatada com nome, área e perímetro
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("Quadrado, área: %.0f perímetro: %.0f", 
                           calcularArea(), calcularPerimetro());
    }
}
