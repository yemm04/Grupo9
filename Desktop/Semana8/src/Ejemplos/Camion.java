/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author C25209
 */
public class Camion implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("Arrancando camion");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo camion");
    }
    
}

class Arrancador{
    public static void arrancarMotor(Vehiculo vehiculo){
        vehiculo.arrancar();
    }    
}


