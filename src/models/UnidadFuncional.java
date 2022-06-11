package models;

import enums.TipoUnidadFuncional;

import java.util.List;

public class UnidadFuncional {
    private Double porcentajePago;
    private List<Persona> propietarios;
    private List<Persona> inquilinos;
    private List<Factura> facturas;
    private Expensa expensa;
    private Float monto;
    private Float deuda;
    private TipoUnidadFuncional unidadFuncional;

    public UnidadFuncional(Double porcentajePago, TipoUnidadFuncional unidadFuncional) {
        this.porcentajePago = porcentajePago;
        this.unidadFuncional = unidadFuncional;
    }

    public void addPropietario(Persona propietario) {
        this.propietarios.add(propietario);
    }

    public void addInquilino(Persona inquilino) {
        this.propietarios.add(inquilino);
    }

    public void calcularMontoPagar() {
        // TODO
        return;
    }

    public void calcularDeuda() {
        // TODO
        return;
    }
}
