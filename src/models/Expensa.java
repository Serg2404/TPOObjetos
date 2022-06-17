package models;

import enums.TipoDeExpensa;

import java.util.Date;

public class Expensa {
    private Double total;
    private Date fecha;
    private TipoDeExpensa tipoExpensa;

    public Double getTotal() {
        return total;
    }

    public TipoDeExpensa getTipoExpensa() {
        return tipoExpensa;
    }

    public Expensa(Double total, Date fecha, TipoDeExpensa tipoExpensa) {
        this.total = total;
        this.fecha = fecha;
        this.tipoExpensa = tipoExpensa;
    }
}
