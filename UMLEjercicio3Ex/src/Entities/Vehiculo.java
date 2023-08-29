package Entities;

import java.util.List;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private String numeroMotor;
    private String numeroChasis;
    private String color;
    private List<String> tipologia;
    
    private Cliente propietario;

    public Vehiculo() {
        propietario = new Cliente();
    }

    public Vehiculo(String marca, String modelo, Integer anio, String numeroMotor, String numeroChasis, String color, List<String> tipologia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.tipologia = tipologia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getTipologia() {
        return tipologia;
    }

    public void setTipologia(List<String> tipologia) {
        this.tipologia = tipologia;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", numeroChasis=" + numeroChasis + ", color=" + color + ", tipologia=" + tipologia + ", propietario=" + propietario + '}';
    }
    
}
