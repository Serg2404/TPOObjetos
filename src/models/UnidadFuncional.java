package models;

import enums.TipoUnidadFuncional;
import notifications.Notificacion;

import java.util.Date;
import java.util.List;

public class UnidadFuncional {
    private Double porcentajePago;
    private List<Persona> propietarios;
    private List<Persona> inquilinos;
    private List<Factura> facturas;
    private Expensa expensa;
    private Double valorOrdinario;
    private Double valorExtraOrdinario;
    private Double deuda;
    private TipoUnidadFuncional unidadFuncional;

    public Double getDeuda() {
        return deuda;
    }

    public void setValorOrdinario(Double valorOrdinario) {
        this.valorOrdinario = valorOrdinario;
    }

    public void setValorExtraOrdinario(Double valorExtraOrdinario) {
        this.valorExtraOrdinario = valorExtraOrdinario;
    }

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

    public void generarFactura(Double total) {
        Factura factura = new Factura(
                new Date(),
                new Date(),
                total,
                Boolean.FALSE,
                this.valorOrdinario,
                this.valorExtraOrdinario
        );
        this.facturas.add(factura);
        this.notificarInteresados(this.generarNotificacionMensual());
    }

    public void notificarInteresados(Notificacion notificacion) {
        for (Persona interesado:
             this.inquilinos) {
            interesado.notificar(notificacion);
        }
    }

    private Notificacion generarNotificacionMensual() {
        return new Notificacion();
    }

    public Double calcularMontoPagar(Double monto) {
        return monto * this.porcentajePago;
    }

    public Double calcularDeuda() {
        // Revisar calculo
        Double deuda = 0.0;
        for (Factura factura:
             this.facturas) {
            if (!factura.getPago())
                deuda += factura.getMonto();
        };
        this.deuda = deuda;
        return deuda;
    }
}
