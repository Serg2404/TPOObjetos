package data;

import enums.TipoNotificacion;
import models.Persona;

public class PersonaMock {
    public static Persona adminMock(){
        Persona personaMock =
                new Persona("Administrador",
                        "Admin",
                        23434534,
                        TipoNotificacion.EMAIL);

        return personaMock;
    }
}
