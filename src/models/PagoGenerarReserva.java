package models;

public class PagoGenerarReserva extends Criterio {
    private static PagoGenerarReserva pagoSingleton;
    private Double margen = 100.0;

    private PagoGenerarReserva() {}

    public static PagoGenerarReserva getCriterio() {
        if (pagoSingleton == null)
            pagoSingleton = new PagoGenerarReserva();
        return pagoSingleton;
    }
    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        return gasto + margen;
    }
}
