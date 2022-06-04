package models;

import enums.TipoCriterio;
import enums.TipoUnidadFuncional;

import java.util.List;

public class UnidadFuncional {
    private Integer porcentajePago;
    private List<Persona> propietarios;
    private List<Persona> inquilinos;
    private TipoCriterio criterio;
    private List<Factura> facturas;
    private Expensa expensa;
    private Float monto;
    private Float deuda;
    private TipoUnidadFuncional unidadFuncional;

    public void calcularMontoPagar() {
        // TODO
        return;
    }

    public void calcularDeuda() {
        // TODO
        return;
    }
}
