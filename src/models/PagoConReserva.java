package models;

public class PagoConReserva extends Criterio {
    @Override
    public Double divisionDeExpensas(Double saldo, Double gasto) {
        if (saldo >= gasto)
            return 0.0;
        return gasto - saldo;
    }
}
