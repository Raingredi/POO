
/**
 * Classe Retângulo que calcula a área e o perímetro recebendo a base e altura e seguindo a interfarse FormaGeométrica
 * 
 * @author Raingredi 
 * @version 1.0
 */
public class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
