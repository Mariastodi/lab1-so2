/**
 * Interface Shape
 * Define os métodos abstratos para cálculo de área e perímetro de figuras geométricas
 */
public interface Shape {
    /**
     * Calcula a área da figura geométrica
     * @return área da figura
     */
    double calcularArea();
    
    /**
     * Calcula o perímetro da figura geométrica
     * @return perímetro da figura
     */
    double calcularPerimetro();
    
    /**
     * Retorna uma string com o nome da figura, área e perímetro
     * @return string formatada
     */
    String toString();
}
