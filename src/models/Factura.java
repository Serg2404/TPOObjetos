package models;

import java.util.Date;

public class Factura {
    private Date fechaIncio;
    private Date fechaVencimiento;
    private Float monto;
    private Boolean pago;
    private Float valorOrdinario;
    private Float valorExtraordinario;

    public Factura(Date fechaIncio, Date fechaVencimiento, Float monto, Boolean pago, Float valorOrdinario, Float valorExtraordinario) {
        this.fechaIncio = fechaIncio;
        this.fechaVencimiento = fechaVencimiento;
        this.monto = monto;
        this.pago = pago;
        this.valorOrdinario = valorOrdinario;
        this.valorExtraordinario = valorExtraordinario;
    }
}
