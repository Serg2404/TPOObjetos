package models;

public abstract class Gasto {
    private Integer monto;
    private String nombre;
    private Expensa expensa;

    public Gasto(Integer monto, String nombre, Expensa expensa) {
        this.monto = monto;
        this.nombre = nombre;
        this.expensa = expensa;
    }
}
