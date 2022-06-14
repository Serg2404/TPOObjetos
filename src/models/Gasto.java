package models;

public abstract class Gasto {
    private Double monto;
    private String nombre;
    private Expensa expensa;

    public Expensa getExpensa() {
        return expensa;
    }

    public Double getMonto() {
        return monto;
    }

    public Gasto(Double monto, String nombre, Expensa expensa) {
        this.monto = monto;
        this.nombre = nombre;
        this.expensa = expensa;
    }
}
