package models;

import enums.TipoNotificacion;

public class Administrador extends Persona {
    private Consorcio consorcio;

    public Administrador(String nombre, String apellido, Integer dni, TipoNotificacion tipoNotificacion, Consorcio consorcio) {
        super(nombre, apellido, dni, tipoNotificacion);
        this.consorcio = consorcio;
    }

    public void addGasto(Gasto gasto) {
        this.consorcio.addGasto(gasto);
    }
}
