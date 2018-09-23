/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Ingrediente;

/**
 *
 * @author idoia
 */
public class GestionListaEnMemoria {
    
 //  
    
    public static ObservableList<Ingrediente> cargarDatos(){
        
        return FXCollections.observableArrayList(new Ingrediente("1", "Letxuga", "Xabier","Kg","Nevera","10.5"),
            new Ingrediente("2", "Tomate", "Xabier","Kg","Nevera","45.8")
        );
    }         
}
