package models;

public class Pago extends Criterio {
    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        return gasto;
    }
}
