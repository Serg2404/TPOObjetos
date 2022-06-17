package models;

public class PagoConReserva extends Criterio {
    private static PagoConReserva pagoSingleton;

    private PagoConReserva() {}

    public static PagoConReserva getCriterio() {
        if (pagoSingleton == null)
            pagoSingleton = new PagoConReserva();
        return pagoSingleton;
    }

    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        if (saldo >= gasto)
            return 0.0;
        return gasto - saldo;
    }
}
