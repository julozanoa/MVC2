/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Dao;
import vista.Escena1;
import vista.Escena2;

/**
 *
 * @author Estudiante
 */
public class Controlador1 {
    private Escena1 vista;
    private Dao modelo;
    
    public Controlador1() {
      this.vista = new Escena1();
      this.vista.getbSiguiente().setOnAction(new Evento());
    }

    public Escena1 getVista() {
        return vista;
    }

    public void setVista(Escena1 vista) {
        this.vista = vista;
    }
    
    private class Evento 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           String nombre = vista.getTfNombre().getText();
           String apellido = vista.getTfApellido().getText();
           Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador2 controlador = new Controlador2(nombre,apellido);
           Scene escena = controlador.getVista().getScene();
           stage.setTitle("Escena 2");
           stage.setScene(escena);
           stage.show();

//           Controlador2 controlador = new 
//                Controlador2();
//           Scene escena =
//                   controlador.getEscena();
//          
        }
    }
    
    
    
    
}
