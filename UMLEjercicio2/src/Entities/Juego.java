package Entities;

import java.util.ArrayList;

public class Juego {

    private Revolver vueltaRevolver;
    private ArrayList<Jugador> listadoJugadores;

    public Juego() {
    }

    public Juego(Revolver vueltaRevolver, ArrayList<Jugador> listadoJugadores) {
        this.vueltaRevolver = vueltaRevolver;
        this.listadoJugadores = listadoJugadores;
    }

    public Revolver getVueltaRevolver() {
        return vueltaRevolver;
    }

    public void setVueltaRevolver(Revolver vueltaRevolver) {
        this.vueltaRevolver = vueltaRevolver;
    }

    public ArrayList<Jugador> getListadoJugadores() {
        return listadoJugadores;
    }

    public void setListadoJugadores(ArrayList<Jugador> listadoJugadores) {
        this.listadoJugadores = listadoJugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "vueltaRevolver=" + vueltaRevolver + ", listadoJugadores=" + listadoJugadores + '}';
    }

}
