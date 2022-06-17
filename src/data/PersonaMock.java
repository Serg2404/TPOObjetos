package data;

import enums.TipoNotificacion;
import models.Administrador;
import models.Persona;

public class PersonaMock {
    public static Persona adminMock(){
        Administrador personaMock =
                new Administrador("Administrador",
                        "Admin",
                        23434534,
                        TipoNotificacion.EMAIL);

        return personaMock;
    }
}
