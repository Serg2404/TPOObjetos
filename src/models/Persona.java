package models;

import enums.TipoNotificacion;
import notifications.Notificacion;
import notifications.Notificador;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private TipoNotificacion tipoNotificacion;

    public Persona(String nombre, String apellido, Integer dni, TipoNotificacion tipoNotificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoNotificacion = tipoNotificacion;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }

    public void cambiarNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public void notificar(Notificacion notificacion) {
        System.out.println("Notificando a: " + toString() + " por medio de " + this.tipoNotificacion);
        Notificador notificador = new Notificador();
        //notificador.enviar(notificacion);
    }
}
