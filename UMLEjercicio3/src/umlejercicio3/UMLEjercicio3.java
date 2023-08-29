package umlejercicio3;

import Entities.Baraja;
import Entities.Carta;
import Services.ServiceBaraja;
import java.util.ArrayList;

public class UMLEjercicio3 {

    /**
     * @param args the command line arguments
     *
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta
     * tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo
     * (espadas, bastos, oros y copas). Esta clase debe contener un método
     * toString() que retorne el número de carta y el palo. La baraja estará
     * compuesta por un conjunto de cartas, 40 exactamente.
     */
    public static void main(String[] args) {
    ServiceBaraja nb = new ServiceBaraja();

    System.out.println("Posición inicial de las cartas en el mazo");
    ArrayList<Carta> baraja = nb.crearBaraja(); // Obtener la baraja creada
    System.out.println(baraja);

    System.out.println("MEZCLANDO...");

    System.out.println("Posición actualizada de las cartas en el mazo");
    nb.barajar(baraja); // Mezclar la baraja
    
    
    
    //muestro la primer carta y la siguiente
    nb.siguienteCarta(baraja);

    //muestro la cantidad de cartas disponibles
    nb.cartasDisponibles(baraja);
    
    //muestro las cartas que le toca al usuario
    nb.darCartas(baraja);
    
    //muestro las cartas repartidas en mesa
    nb.cartasMonton(baraja);
    
    //muestro las cartas no repartidas
    nb.mostrarBaraja(baraja);
}
}
