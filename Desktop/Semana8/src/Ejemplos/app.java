/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author C25209
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo toyota = new automovil();
        //toyota.arrancar();
        
        Vehiculo nissan= new automovil();
        Vehiculo hino = new Camion();
        
        Arrancador.arrancarMotor(nissan);
        Arrancador.arrancarMotor(hino);
        Smartphone honor = new Smartphone();
        honor.obtenerCoordenadasAprox();
    }
    
}
