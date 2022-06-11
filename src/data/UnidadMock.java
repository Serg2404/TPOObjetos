package data;


import enums.TipoUnidadFuncional;
import models.UnidadFuncional;

import java.util.ArrayList;
import java.util.List;

public class UnidadMock {
    public static List<UnidadFuncional> unidadesMock(){
        List<UnidadFuncional> unidades = new ArrayList<UnidadFuncional>();

        UnidadFuncional unidad =
                new UnidadFuncional(0.2,
                        TipoUnidadFuncional.COCHERA);
        unidades.add(unidad);

        UnidadFuncional unidad2 =
                new UnidadFuncional(0.3,
                        TipoUnidadFuncional.DEPARTAMENTO);
        unidades.add(unidad2);

        return unidades;
    }
}
