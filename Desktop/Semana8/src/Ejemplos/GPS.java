/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author C25209
 */
public interface GPS {
    public void obtenerCoordenadas();
    default public void obtenerCoordenadasAprox(){
        System.out.println("Obteniendo coordenadas aprox por wifi y GMS..");
    }
}
