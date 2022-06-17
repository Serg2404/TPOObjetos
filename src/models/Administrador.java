package models;

import enums.TipoNotificacion;

public class Administrador extends Persona {
    public Administrador(String nombre, String apellido, Integer dni, TipoNotificacion tipoNotificacion) {
        super(nombre, apellido, dni, tipoNotificacion);
    }
}
