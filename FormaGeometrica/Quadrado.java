
/**
 * Classe Quadrado que calcula a área recebendo o lado, como o quadrado é um tipo especial de retângulo
 * esta é uma subclasse da classe retângulo
 * 
 * @author Raingredi 
 * @version 1.0
 */
public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getBase();
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
}
