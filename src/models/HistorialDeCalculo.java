package models;

import enums.TipoCriterio;

import java.util.Date;

public class HistorialDeCalculo {
    private String administrador;
    private Date fecha;
    private TipoCriterio criterio;

    public HistorialDeCalculo(String administrador, Date fecha, TipoCriterio criterio) {
        this.administrador = administrador;
        this.fecha = fecha;
        this.criterio = criterio;
    }

    @Override
    public String toString() {
        return "Administrador: " + this.administrador + "\n" +
                "Fecha: " + this.fecha + "\n" +
                "Criterio: " + this.criterio;
    }
}
