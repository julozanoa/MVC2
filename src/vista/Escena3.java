/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
/**
 *
 * @author Estudiante
 */
public class Escena3 implements Vista{
    private Scene escena;
    private Button btVolverInicio;

    public Button getBtVolerInicio() {
        return btVolverInicio;
    }

    public void setBtVolerInicio(Button btVolerInicio) {
        this.btVolverInicio = btVolerInicio;
    }
    
    public Escena3(){
        this.btVolverInicio = new Button("Volver a Inicio");
        VBox layout = new VBox();
        layout.getChildren().add(btVolverInicio);
        this.escena = 
             new Scene(layout, 500, 500);
    }

    @Override
    public Scene getScene() {
        return this.escena;
    }
    
}
