package Entities;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;

    //el usuario se VINCULA a UNA SOLA mascota. Esta es una asociación simple 1:1.
//    private Perro perro;
    //el usuario se VINCULA a NINGUNA, UNA o VARIAS mascotas. 
    private List<Perro> perrosAdoptados = new ArrayList<>();

    public void agregarPerroAdoptado(Perro perro) {
        perrosAdoptados.add(perro);
    }

    public List<Perro> getPerrosAdoptados() {
        return perrosAdoptados;
    }

    public void setPerrosAdoptados(List<Perro> perrosAdoptados) {
        this.perrosAdoptados = perrosAdoptados;
    }

    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, List<Perro> perrosAdoptados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perrosAdoptados = perrosAdoptados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    

    @Override
    public String toString() {
        return "Persona_e1{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perrosAdoptados + '}';
    }
}
