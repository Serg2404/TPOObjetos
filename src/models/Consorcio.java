package models;

import enums.TipoCriterio;

import java.util.Date;
import java.util.List;

public class Consorcio {
    private Persona administrador;
    private List<UnidadFuncional> unidadesFuncionales;
    private CuentaBancaria cuentaBancaria;
    private List<Gasto> gastos;
    private List<HistorialDeCalculo> historialDeCalculos;
    private Criterio criterio;
    private TipoCriterio criterioSeleccionado;

    public void addGasto(Gasto gasto) {
        this.gastos.add(gasto);
    }

    public void liquidar(UnidadFuncional unidadFuncional) {
        Double saldo = this.criterio.obtencionDeSaldo(this);
        Double gasto = this.criterio.calculoDeGastos(this.gastos, unidadFuncional);
        Double total = this.criterio.divisionDeExpensas(saldo, gasto);
        unidadFuncional.generarFactura(total);
        this.generarHistorico();
    }

    private void generarHistorico() {
        HistorialDeCalculo historico = new HistorialDeCalculo(
            this.administrador.toString(),
            new Date(),
            this.criterioSeleccionado
        );
        this.historialDeCalculos.add(historico);
    }

    public void cambiarCriterio(TipoCriterio criterio) {
        this.criterioSeleccionado = criterio;

        if (criterio == TipoCriterio.PAGOGASTO)
            this.criterio = new Pago();
        else if (criterio == TipoCriterio.PAGOCONRESERVA)
            this.criterio = new PagoConReserva();
        else
            this.criterio = new PagoGenerarReserva();
    }

    public Double getSaldo() {
        Date date = new Date();
        return this.cuentaBancaria.getSaldoActual("12323", "323", date);
    }
}
