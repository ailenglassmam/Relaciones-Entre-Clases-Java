package Services;

import Entities.Revolver;
import java.util.Objects;

public class ServiceRevolver {

    //Método llenar revolver. Define aleatoriamente, la posición del cargador actual y del cargador con agua
    public void llenarRevolver(Revolver revolver1) {
        System.out.println("El revolver se ha cargado. Que inicie el juego.");
        //le defino el valor a cada posición de forma aleatoria entre 1 y 10 inclusive
        revolver1.setPosicionActual((int) Math.floor(Math.random() * 6 + 1));
        revolver1.setPosicionAgua((int) Math.floor(Math.random() * 6 + 1));

//        System.out.println(revolver1.getPosicionActual());
//        System.out.println(revolver1.getPosicionAgua());
    }

    boolean mojar(Revolver revolver1) {
        if (Objects.equals(revolver1.getPosicionActual(), revolver1.getPosicionAgua())) {
            return true;
        } else {
            return false;
        }
    }

    Integer siguienteChorro(Revolver revolver1) {
        int posicionActual = revolver1.getPosicionActual();
        int siguientePosicion = (posicionActual % 6) + 1; // Calcula la siguiente posición circularmente

        revolver1.setPosicionActual(siguientePosicion);
        return revolver1.getPosicionActual();
//        System.out.println(revolver1.getPosicionActual());
//        System.out.println(revolver1.getPosicionAgua());
    }
}
