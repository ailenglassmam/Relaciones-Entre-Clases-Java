package Entities;

public class Cliente {
    private String nombre;
    private String apellido;
    private Integer documento;
    private String mail;
    private String domicilio;
    private Integer telefono;
    private Vehiculo vehiculoAsegurado;
   
    public Cliente(String nombre, String apellido, Integer documento, String mail, String domicilio, Integer telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public Cliente() {
        vehiculoAsegurado = new Vehiculo();
    }

    /**
     * @return the vehiculoAsegurado
     */
    public Vehiculo getVehiculoAsegurado() {
        return vehiculoAsegurado;
    }

    /**
     * @param vehiculoAsegurado the vehiculoAsegurado to set
     */
    public void setVehiculoAsegurado(Vehiculo vehiculoAsegurado) {
        this.vehiculoAsegurado = vehiculoAsegurado;
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", vehiculoAsegurado=" + vehiculoAsegurado + '}';
    }

}
