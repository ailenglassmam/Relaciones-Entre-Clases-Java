package Entities;

public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    private boolean adoptado = false;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio;
    }
}
