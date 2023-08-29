package umlejercicio2;

import Entities.Jugador;
import Entities.Revolver;
import Services.ServiceJuego;
import Services.ServiceJugador;
import Services.ServiceRevolver;
import java.util.ArrayList;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver revolver1 = new Revolver();
        ServiceJuego ns = new ServiceJuego();
        ServiceJugador nj = new ServiceJugador();
        ServiceRevolver nr = new ServiceRevolver();
        ArrayList<Jugador> listadoJugadores = new ArrayList<>();

        ns.llenarJuego(listadoJugadores, revolver1);
        nr.llenarRevolver(revolver1);
//        System.out.println(ns.mojar(revolver1));
//        ns.siguienteChorro(revolver1);
//        System.out.println(ns.mojar(revolver1));
        ns.ronda();
    }

}
