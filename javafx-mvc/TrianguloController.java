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
public class TrianguloController
{
    TrianguloView trianguloView;
    Stage stage;
    Triangulo triangulo;
    public TextField textFieldAltura;
    public TextField textFieldBase;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe TrianguloController
     */
    public TrianguloController()
    {
        this.stage = new Stage();
        this.trianguloView = new TrianguloView();
        this.trianguloView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.trianguloView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double base = Double.parseDouble(textFieldBase.getText());
            Triangulo triangulo = new Triangulo(altura, base);
            this.labelResultado.setText(triangulo.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldBase.setText("");
        labelResultado.setText("");
    }    
}
