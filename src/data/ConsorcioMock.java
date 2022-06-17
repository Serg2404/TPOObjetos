package data;

import models.Consorcio;
import models.CuentaBancaria;
import models.Persona;
import models.UnidadFuncional;

import java.util.List;

public class ConsorcioMock {
    public static Consorcio consorcioMock(Persona administrador, List<UnidadFuncional> unidades, CuentaBancaria cuenta) {
        return new Consorcio(
                administrador,
                unidades,
                cuenta
        );
    }
}
