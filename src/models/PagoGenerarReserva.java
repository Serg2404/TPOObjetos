package models;

public class PagoGenerarReserva extends Criterio {
    private Double margen = 100.0;

    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        return gasto + margen;
    }
}
