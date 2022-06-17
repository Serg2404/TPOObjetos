package models;

public class Pago extends Criterio {
    private static Pago pagoSingleton;

    private Pago() {}

    public static Pago getCriterio() {
        if (pagoSingleton == null)
            pagoSingleton = new Pago();
        return pagoSingleton;
    }

    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        return gasto;
    }
}
