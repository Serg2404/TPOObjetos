package data;

import enums.TipoCriterio;
import enums.TipoDeExpensa;
import models.*;

import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Persona administrador = PersonaMock.adminMock();
        List<UnidadFuncional> unidades = UnidadMock.unidadesMock();
        CuentaBancaria cuenta = CuentaMock.cuentaMock();
        Consorcio consorcio = ConsorcioMock.consorcioMock(administrador, unidades, cuenta);

        // El administrador carga gastos (normales y recurrentes)
        cargarGastos(consorcio);

        // El administrador calcula y genera expensas de cada unidad funcional (Tambien genera la notificacion a cada interesado)
        calcularExpensas(consorcio, unidades);

        // Ver las facturas que se generaron
        visualizarFacturas(unidades);
    }

    private static void cargarGastos(Consorcio consorcio) {
        Expensa expensa = new Expensa(120.5, new Date(), TipoDeExpensa.ORDINARIA);
        consorcio.addGasto(new GastoNormal(expensa.getTotal(), "Gasto 1", expensa));

        Expensa expensa2 = new Expensa(50.0, new Date(), TipoDeExpensa.EXTRAORDINARIA);
        consorcio.addGasto(new GastoRecurrente(expensa.getTotal(), "Gasto 1", expensa, 2));
    }

    private static void calcularExpensas(Consorcio consorcio, List<UnidadFuncional> unidades) {
        consorcio.cambiarCriterio(TipoCriterio.PAGOGASTO);
        for (UnidadFuncional unidad: unidades) {
            consorcio.liquidar(unidad);
        }
    }

    private static void visualizarFacturas(List<UnidadFuncional> unidades) {
        for (UnidadFuncional unidad: unidades) {
            for (Factura factura: unidad.getFacturas()) {
                System.out.println(factura.toString());
            }
        }
    }
}
