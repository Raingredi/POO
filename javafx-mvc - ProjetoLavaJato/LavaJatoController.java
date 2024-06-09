import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author Raingredi
 * @version 0.01
 */
public class LavaJatoController
{
    LavaJatoView LavaJatoView;
    Stage stage;
    LavaJato lavaJato;
    public TextField textFieldCliente;
    public TextField textFieldModelo;
    public Label labelOrcamento;
    
    /**
     * Construtor para objetos da classe LavaJatoController
     */
    public LavaJatoController()
    {
        this.stage = new Stage();
        this.lavaJatoView = new LavaJatoView();
        this.lavaJatoView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.lavaJatoView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoOrcamentoClicado(Event e) {
        try {
            double cliente = Double.parseDouble(textFieldCliente.getText());
            double modelo = Double.parseDouble(textFieldModelo.getText());
            LavaJato lavaJato = new LavaJato(cliente, modelo);
            this.labelOrcamento.setText(lavaJato.interpretar());
        } catch (NumberFormatException exception) {
            labelOrcamento.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldCliente.setText("");
        textFieldModelo.setText("");
        labelResultado.setText("");
    }    
}
