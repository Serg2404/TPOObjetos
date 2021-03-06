package models;

import java.util.Date;

public class Factura {

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void pagar() {
        this.pago = Boolean.TRUE;
    }
    private Date fechaIncio;
    private Date fechaVencimiento;
    private Double monto;
    private Boolean pago;
    private Double valorOrdinario;
    private Double valorExtraordinario;

    public Double getMonto() {
        return monto;
    }

    public Boolean getPago() {
        return pago;
    }

    public Factura(Date fechaIncio, Date fechaVencimiento, Double monto, Boolean pago, Double valorOrdinario, Double valorExtraordinario) {
        this.fechaIncio = fechaIncio;
        this.fechaVencimiento = fechaVencimiento;
        this.monto = monto;
        this.pago = pago;
        this.valorOrdinario = valorOrdinario;
        this.valorExtraordinario = valorExtraordinario;
    }

    public String toString() {
        return "Fecha inicio: " + this.fechaIncio + "\n" +
                "Fecha vencimiento: " + this.fechaVencimiento + "\n" +
                "Monto: " + this.monto + "\n" +
                "Pagada?: " + this.pago + "\n" +
                "Valor ordinario: " + this.valorOrdinario + "\n" +
                "Valor extraordinario: " + this.valorExtraordinario + "\n";
    }
}
