package models;

import enums.TipoDeExpensa;

import java.util.Date;

public class Expensa {
    private Float total;
    private Date fecha;
    private TipoDeExpensa tipoExpensa;

    public TipoDeExpensa getTipoExpensa() {
        return tipoExpensa;
    }

    public Expensa(Date fecha, TipoDeExpensa tipoExpensa) {
        this.fecha = fecha;
        this.tipoExpensa = tipoExpensa;
    }

    public void calcularTotal() {
        // TODO: Calcular total
        return;
    }
}
