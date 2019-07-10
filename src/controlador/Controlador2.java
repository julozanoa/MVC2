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
import vista.Escena2;

/**
 *
 * @author Estudiante
 */
public class Controlador2 {
    private Escena2 vista;
    private Dao modelo;
    private String nombre;
    private String apellido;
  
    
    public Controlador2(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.vista = new Escena2();
        this.vista.getBtGuardar().setOnAction(new Evento());
    }

    public Escena2 getVista() {
        return vista;
    }

    public void setVista(Escena2 vista) {
        this.vista = vista;
    }
    
    private class Evento implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            String edad = vista.getTfEdad().getText();
            boolean Bachillerato = vista.getRbBachillerato().isSelected();
            boolean PreGrado = vista.getRbPregrado().isSelected();
            boolean PosGrado = vista.getRbPosgrado().isSelected();
            boolean estudio = true;
            if (Bachillerato == true) {
               estudio = Bachillerato;
           }else if (PreGrado == true) {
               estudio = PreGrado;
           }else if (PosGrado == true) {
               estudio = PosGrado;
           }
           Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controlador3 controlador= new Controlador3(nombre,apellido,edad,estudio);
           Scene escena = controlador.getVista().getScene();
           stage.setTitle("Escena 3");
           stage.setScene(escena);
//           Controlador2 controlador = new 
//                Controlador2();
//           Scene escena =
//                   controlador.getEscena();
//          
        }
    }
}
