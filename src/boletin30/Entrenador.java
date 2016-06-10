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
public class Entrenador extends SeleccionFutbol {
int idFederacion;
    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void Concentrarse() {
         System.out.println("realiza concentraciones el Entrenador");
    }

    @Override
    public void Viajar() {
         System.out.println("viaja el entrenador");
    }

    @Override
    public void Entrenar() {
        System.out.println("realiza entrenamientos el entrenador");
    }

    @Override
    public void JugarPartido() {
        System.out.println("juega el entrenador");
    }
    
    public void PlanificarEntrenamientos(){
     System.out.println("planifica entreanimientos el entrenador");
    }
}
