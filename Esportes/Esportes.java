/**
 * Classe para descrever esportes
 * @author Raingredi 
 * @version 1.0
 */
public class Esportes
{
    protected String objetivo;
    protected int minJogadores;
    protected String inicioJogo;   
     
    public Esportes(String objetivo, int minJogadores, String inicioJogo) {
        this.objetivo = objetivo;
        this.minJogadores = minJogadores;
        this.inicioJogo = inicioJogo;
    }
    
    public void descreverEsporte() {
        System.out.println("Objetivo do esporte: " + objetivo);
        System.out.println("Número mínimo de jogadores: " + minJogadores);
        System.out.println("Horário de início do jogo: " + inicioJogo);
    }
    
    public void praticar() {
        System.out.println("Praticando o esporte.");
    }
    
    
    
}
