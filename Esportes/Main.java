
/**
 * Classe para aplicar os métodos
 * 
 * @author Raingredi 
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args) {
        Esportes voleibol = new Esportes("Fazer aa bola cair no campo adversário", 6, "08:00");
        
        System.out.println("Descrição do esporte Voleibol:");
        voleibol.descreverEsporte();
        System.out.println();

        Futebol futebol = new Futebol("Marcar gols", 11, "16:00", "Gramado");
        System.out.println("Descrição do jogo de futebol:");
        futebol.descreverEsporte();
        futebol.marcarGol();
    }
}
