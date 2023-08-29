package Services;

import Entities.Juego;
import Entities.Jugador;
import Entities.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceJuego {
    
    Juego ng;

    public void llenarJuego(ArrayList<Jugador> listadoJugadores, Revolver revolver1) {
        ng = new Juego();
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos jugadores participarán? Máximo, 6 jugadores.");
        int cantidadJugadores = leer.nextInt();

        //hago un control de jugadores
        if (cantidadJugadores > 6) {
            System.out.println("Lo siento. El máximo permitido es de 6 jugadores.");
        }

        //limpiar buffer para evitar problemas
        leer.nextLine();

        //por cada participante, le asigno un lugar en la arrayList. Para poder luego de cada disparo del revolver, identificar quien pierde
        System.out.println("Ingrese el nombre de cada participante en el orden en que jugarán.");
        for (int i = 0; i < cantidadJugadores; i++) {
            //por cada jugador, creo una instancia
            Jugador jugador = new Jugador();
            jugador.setId(i + 1);
            System.out.print("Jugador " + (i + 1) + ": ");
            jugador.setNombre(leer.nextLine());
            //Paso los datos del jugador creado a la lista
            listadoJugadores.add(jugador);
        }
        
        ng.setListadoJugadores(listadoJugadores);
    }
    
    /*
    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. 
    Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente 
    jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar 
    que jugador se mojó.
    */
    
    public void ronda() {
        //instancio el service del jugador
        ServiceJugador nj = new ServiceJugador();
        //foreach para recorrer el listado de jugadores
        for (Jugador jugador : ng.getListadoJugadores()) {
            //imprimo nombre jugador actual
            System.out.println(jugador.getNombre());
            //llamo al metodo de disparo. Me trae si el jugador se mojo o no
            if(nj.disparo(ng.getVueltaRevolver(), jugador)){
                break;
            } else {
                System.out.println("El que sigue");
            }
        }
        //el ciclo finaliza
    }

}
