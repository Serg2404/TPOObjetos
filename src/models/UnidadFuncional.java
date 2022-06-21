package models;

import enums.TipoUnidadFuncional;
import notifications.Notificacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnidadFuncional {
    private Double porcentajePago;
    private List<Persona> propietarios = new ArrayList<Persona>();
    private List<Persona> inquilinos = new ArrayList<Persona>();
    private List<Factura> facturas = new ArrayList<Factura>();
    private Double valorOrdinario;
    private Double valorExtraOrdinario;
    private Double deuda = 0.0;
    private TipoUnidadFuncional unidadFuncional;

    public Double getDeuda() {
        return this.deuda;
    }

    public List<Factura> getFacturas() {
        return this.facturas;
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
        this.inquilinos.add(inquilino);
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
        }
        this.deuda = deuda;
        return deuda;
    }

    public void pagarFactura(Date fechaAPagar) {
        Date todayDate = new Date();
        Factura facturaAPagar = this.facturas.stream().filter(factura -> fechaAPagar.equals(factura.getFechaIncio())).findFirst().orElse(null);
        if(todayDate.after(facturaAPagar.getFechaVencimiento())) {
            System.out.println("la factura ya vencio y no puede ser pagada");
        }
        else{
            facturaAPagar.pagar();
        }
    }
}
