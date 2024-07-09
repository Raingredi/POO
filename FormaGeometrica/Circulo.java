
/**
 * Classe Círculo que calcula a área e o perímetro recebendo o raio e seguindo a interfarse FormaGeométrica
 * 
 * @author Raingredi 
 * @version 1.0
 */

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
