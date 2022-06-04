package models;

public class GastoRecurrente extends Gasto {
    private Integer recurrencia;

    public GastoRecurrente(Integer monto, String nombre, Expensa expensa, Integer recurrencia) {
        super(monto, nombre, expensa);
        this.recurrencia = recurrencia;
    }
}
