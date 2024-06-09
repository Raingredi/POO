/**
 * Classe para descrever o esporte Futebol
 * @author Raingredi 
 * @version 1.0
 */
public class Futebol extends Esportes
{
    private String tipoCampo;
    private int numGols = 0;

    public Futebol(String objetivo, int minJogadores, String inicioJogo, String tipoCampo) {
        super(objetivo, minJogadores, inicioJogo);
        this.tipoCampo = tipoCampo;
    }

    // Método para descrever o futebol reescrito
    @Override
    public void descreverEsporte() {
        super.descreverEsporte();
        System.out.println("Tipo de campo: " + tipoCampo);
    }

    public void marcarGol() {
        numGols++;
        System.out.println("Gooool!");
    }
}
