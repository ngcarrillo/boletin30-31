/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author Nuria
 */
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public void Concentrarse() {
        System.out.println("realiza concentraciones el seleccionador");
    }

    @Override
    public void Viajar() {
        System.out.println("Viaja el seleccionador");
    }

    @Override
    public void Entrenar() {
        System.out.println("Entrena el seleccionador");
    }

    @Override
    public void JugarPartido() {
        System.out.println("Juega el seleccionador");
    }
    
    public void SeleccionarJugadores(){
        System.out.println("Selecciona jugadores el seleccionador");
    }
}
