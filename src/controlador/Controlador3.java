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
import vista.Escena3;

/**
 *
 * @author Estudiante
 */
public class Controlador3 {
    private Escena3 vista;
    private Dao modelo;
    private String nombre;
    private String apellido;
    private String edad;
    private boolean estudio;
    
    public Controlador3(String nombre, String apellido, String edad, boolean estudio) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
      this.estudio = estudio;
      this.vista = new Escena3();
      this.vista.getBtVolerInicio().setOnAction(new Evento());
    }

    public Escena3 getVista() {
        return vista;
    }

    public void setVista(Escena3 vista) {
        this.vista = vista;
    }
    private class Evento implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           Singleton singleton=
                   Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador1 controlador= new Controlador1();
           Scene escena = controlador.getVista().getScene();
           stage.setTitle("Escena 1");
           stage.setScene(escena);
//           Controlador2 controlador = new 
//                Controlador2();
//           Scene escena =
//                   controlador.getEscena();
//          
        }
    }
}
