/**
 * Interface Gráfica (GUI) da Calculadora da área do triângulo
 * 
 * @author Raingredi
 * @version 0.01
 */
public class Triangulo
{
    double base;
    double altura;
    double area;
    
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
        this.area = 0;
    }
    
    /**
     * Construtor para objetos da classe Calculadora da área do triângulo
     */
    public Triangulo(double altura, double base)
    {
        this.altura = altura;  
        this.base = base;
    }

    /**
     * Calcula a área do triângulo
     * 
     * @return     o valor da área do triângulo, dado por: (base x altura)/2
     */
    public double calcular()
    {
        if (this.altura <= 0 || this.base <= 0)
            return 0;
            area = (this.base * this.altura)/2;
        return (area);
    }
    
    /**
     * Interpreta a área do triângulo
     * 
     * @return     interpreta a área do triângulo
     * @see <a href="https://www.todamateria.com.br/area-do-triangulo/">Área do triângulo-Toda matéria</a>
     */
    public String interpretar() {
        String resultado = "";
        double areaTriangulo = this.calcular();
        if (areaTriangulo == 0)
            resultado += "Dados incompletos ou inválidos";
        else 
            resultado += area + " centímetros²";
        return resultado;
    }
}
