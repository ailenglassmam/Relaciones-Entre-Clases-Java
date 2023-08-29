package Entities;

public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;
    private Integer cantidadJugadores;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, boolean mojado, Integer cantidadJugadores) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Jugador(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(Integer cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + ", cantidadJugadores=" + cantidadJugadores + '}';
    }

}
