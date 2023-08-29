package Services;

import Entities.Jugador;
import Entities.Revolver;

public class ServiceJugador {

    public boolean disparo(Revolver revolver1, Jugador jugador1) {
        ServiceRevolver ns = new ServiceRevolver();
//        ns.siguienteChorro(revolver1);

        if (ns.mojar(revolver1) == true) {
            System.out.println("Jugador eliminado.");
            jugador1.setMojado(true);
            return true;
        } else {
            System.out.println("Sigues en juego.");
            jugador1.setMojado(false);
        }
        
        revolver1.setPosicionActual(ns.siguienteChorro(revolver1));
        return false;
    }
}
