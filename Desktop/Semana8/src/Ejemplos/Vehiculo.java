/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author C25209
 */
public interface Vehiculo {
    public String matricula = "";
    public float velMax =0;
    public void arrancar();
    public void detener();
    default void claxom(){
        System.out.println("Sonando claxon");
    }
}
