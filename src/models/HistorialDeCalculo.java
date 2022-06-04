package models;

import enums.TipoCriterio;

import java.util.Date;

public class HistorialDeCalculo {
    private Persona administrador;
    private Date fecha;
    private TipoCriterio criterio;

    public HistorialDeCalculo(Persona administrador, Date fecha, TipoCriterio criterio) {
        this.administrador = administrador;
        this.fecha = fecha;
        this.criterio = criterio;
    }
}
