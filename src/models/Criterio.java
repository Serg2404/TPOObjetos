package models;
import enums.TipoDeExpensa;

import java.util.List;

public abstract class Criterio {
    public Double obtencionDeSaldo(Consorcio consorcio) {
        return consorcio.getSaldo();
    }

    public Double calculoDeGastos(List<Gasto> gastos, UnidadFuncional unidadFuncional) {
        Double total = 0.0;
        Double valorOrdinario = 0.0;
        Double valorExtraOrdinario = 0.0;

        for (Gasto gasto:
             gastos) {
            if (gasto.getExpensa().getTipoExpensa() == TipoDeExpensa.ORDINARIA)
                valorOrdinario += gasto.getMonto();
            else if (gasto.getExpensa().getTipoExpensa() == TipoDeExpensa.EXTRAORDINARIA)
                valorExtraOrdinario += gasto.getMonto();
            total += gasto.getMonto();
        }

        unidadFuncional.setValorOrdinario(valorOrdinario);
        unidadFuncional.setValorExtraOrdinario(valorExtraOrdinario);
        Double monto = unidadFuncional.calcularMontoPagar(total);
        Double deuda = unidadFuncional.getDeuda();
        return monto + deuda;
    }

    public abstract Double divisionDeExpensas(Double saldo, Double gasto);
}
