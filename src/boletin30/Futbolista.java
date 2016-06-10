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
public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;
    
   public Futbolista(int id,int dorsal, String demarcacion, int edad, String nombre, String apellido) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
   }

    public void entrevista() {
        
    }

    @Override
    public String toString() {
        return "Futbolista :" + super.toString()+"dorsal = " + dorsal+ "demarcacion = " +demarcacion; 
    }
    @Override
    public void JugarPartido(){
        System.out.println("juega el jugador");
    }

    @Override
    public void Concentrarse() {
         System.out.println("realiza concentraciones el jugador");
    }

    @Override
    public void Viajar() {
        System.out.println("viaja el jugador");
    }

    @Override
    public void Entrenar() {
         System.out.println("Entrena el jugador");
    }

}
