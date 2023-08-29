package Entities;

import java.util.Date;
import java.util.List;

public class Cuota {
    private Integer numeroCuota;
    private Integer montoTotal;
    private boolean cuotaPaga;
    private Date fechaVencimiento;
    private List<String> formaPago; //debito, credito, transferencia, efectivo

    public Cuota() {
    }

    public Cuota(Integer numeroCuota, Integer montoTotal, boolean cuotaPaga, Date fechaVencimiento, List<String> formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.cuotaPaga = cuotaPaga;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public List<String> getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(List<String> formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotal=" + montoTotal + ", cuotaPaga=" + cuotaPaga + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
}
