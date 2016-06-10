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
public class Masajista extends SeleccionFutbol{
String titulacion;
int aniosExperiencia;
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void Concentrarse() {
        System.out.println("realiza concentraciones el Masajista");
    }

    @Override
    public void Viajar() {
      System.out.println("viaja el masajista");
    }

    @Override
    public void Entrenar() {
         System.out.println("No entrena el Masajista");
    }

    @Override
    public void JugarPartido() {
         System.out.println("no juega partidor el masajista");
    }
    
    public void DarMasajes(){
     System.out.println("Da masajes el masajista");
    }

    @Override
    public String toString() {
        return super.toString() + "titulación = "+titulacion+"años de experiencia = "+aniosExperiencia; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
