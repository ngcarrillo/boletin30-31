/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author Nuria
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SeleccionFutbol> seleccion = new ArrayList();

        Futbolista futbolista = new Futbolista(1, 5, "delantero", 20, "juan", "perez");
        //futbolista.Concentrarse();
        //futbolista.Entrenar();
        //futbolista.JugarPartido();
        //futbolista.Viajar();
        // futbolista.entrevista();
        //System.out.println(futbolista.toString());

        Masajista masajista = new Masajista(2, "pablo", "gonzalez", 20, "fisioterapeuta", 2);
        // masajista.Concentrarse();
        // masajista.Entrenar();
        //masajista.JugarPartido();
        // masajista.Viajar();
        // masajista.DarMasajes();
        System.out.println(masajista.toString());

        Entrenador entrenador = new Entrenador(3, "luis", "garcia", 40, 505);
        // entrenador.Concentrarse();
        //entrenador.Entrenar();
        //entrenador.JugarPartido();
        //entrenador.Viajar();
        //entrenador.PlanificarEntrenamientos();
        // System.out.println(entrenador.toString());

        Seleccionador seleccionador = new Seleccionador(4, "Andres", "rodriguez", 45);
       //  seleccionador.Concentrarse();
        // seleccionador.Entrenar();
        // seleccionador.JugarPartido();
        //seleccionador.Viajar();
        //seleccionador.SeleccionarJugadores();
        //System.out.println(seleccionador.toString());

        seleccion.add(entrenador);
        seleccion.add(masajista);
        seleccion.add(futbolista);
        seleccion.add(seleccionador );

        for (int i = 0; i < seleccion.size(); i++) {
            System.out.println(seleccion.get(i).toString());
        }

    }
}
