/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author C25209
 */
public class automovil implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("arrancando motor del automovil");
    }

    @Override
    public void detener() {
        System.out.println("deteniendo motor del automovil");
    }
    
}
