package models;

import java.util.Date;

public class CuentaBancaria {
    private Double saldoActual;

    public CuentaBancaria() {}

    public Double getSaldoActual(String cbu, String token, Date fecha) {
        // TODO: No se si hay que hacer algo con cbu, token y fecha.
        return this.saldoActual;
    }

    public void setSaldoActual(Double monto) {
        this.saldoActual = monto;
    }

    public void descontarSaldo(Double monto) {
        this.saldoActual = this.saldoActual - monto;
    }
}
