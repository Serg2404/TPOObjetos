package enums;

public enum TipoCriterio {
    PAGORESERVA,
    PAGOGASTO,
    PAGOCONRESERVA;

    @Override
    public String toString() {
        return switch (this) {
            case PAGORESERVA -> "Pago completo generando reservas";
            case PAGOGASTO -> "Pago completo de gastos";
            case PAGOCONRESERVA -> "Pago de gastos utilizando reservas";
        };
    }
}
