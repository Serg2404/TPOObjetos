package models;

import enums.TipoCriterio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consorcio {
    private Persona administrador;
    private List<UnidadFuncional> unidadesFuncionales;
    private CuentaBancaria cuentaBancaria;
    private List<Gasto> gastos = new ArrayList<Gasto>();
    private List<HistorialDeCalculo> historialDeCalculos = new ArrayList<HistorialDeCalculo>();
    private Criterio criterio;
    private TipoCriterio criterioSeleccionado;

    public Consorcio(Persona administrador, List<UnidadFuncional> unidades, CuentaBancaria cuenta) {
        this.administrador = administrador;
        this.unidadesFuncionales = unidades;
        this.cuentaBancaria = cuenta;
    }

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

    public List<HistorialDeCalculo> obtenerHistorico(){
        return this.historialDeCalculos;
    }

    public void cambiarCriterio(TipoCriterio criterio) {
        this.criterioSeleccionado = criterio;

        if (criterio == TipoCriterio.PAGOGASTO)
            this.criterio = Pago.getCriterio();
        else if (criterio == TipoCriterio.PAGOCONRESERVA)
            this.criterio = PagoConReserva.getCriterio();
        else
            this.criterio = PagoGenerarReserva.getCriterio();
    }

    public Double getSaldo() {
        Date date = new Date();
        return this.cuentaBancaria.getSaldoActual("12323", "323", date);
    }

    public void setSaldo(double monto) {
        this.cuentaBancaria.setSaldoActual(monto);
    }

    public void descontarSaldo(Double monto) {
        this.cuentaBancaria.descontarSaldo(monto);
    }
}
