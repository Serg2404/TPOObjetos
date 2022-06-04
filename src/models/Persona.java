package models;

import enums.TipoNotificacion;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private TipoNotificacion notificacion;

    public Persona(String nombre, String apellido, Integer dni, TipoNotificacion notificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.notificacion = notificacion;
    }

    public void cambiarNotificacion(TipoNotificacion notificacion) {
        this.notificacion = notificacion;
    }
}
