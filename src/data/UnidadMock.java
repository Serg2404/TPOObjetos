package data;


import enums.TipoNotificacion;
import enums.TipoUnidadFuncional;
import models.Persona;
import models.UnidadFuncional;

import java.util.ArrayList;
import java.util.List;

public class UnidadMock {
    public static List<UnidadFuncional> unidadesMock(){
        List<UnidadFuncional> unidades = new ArrayList<UnidadFuncional>();

        UnidadFuncional unidad =
                new UnidadFuncional(0.2,
                        TipoUnidadFuncional.COCHERA);
        Persona interesado = new Persona("Interesado", "uno", 123, TipoNotificacion.EMAIL);
        unidad.addInquilino(interesado);
        unidades.add(unidad);

        UnidadFuncional unidad2 =
                new UnidadFuncional(0.3,
                        TipoUnidadFuncional.DEPARTAMENTO);
        Persona interesado2 = new Persona("Interesado", "dos", 321, TipoNotificacion.SMS);
        unidad2.addInquilino(interesado2);
        unidades.add(unidad2);

        return unidades;
    }
}
