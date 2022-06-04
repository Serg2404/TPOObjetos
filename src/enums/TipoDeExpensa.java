package enums;

public enum TipoDeExpensa {
    ORDINARIA,
    EXTRAORDINARIA,
    PARTICULAR,
    RESERVA;

    @Override
    public String toString() {
        return switch (this) {
            case ORDINARIA -> "Ordinaria";
            case EXTRAORDINARIA -> "Extraordinaria";
            case PARTICULAR -> "Gastos particulares";
            case RESERVA ->  "Fondos de reserva";
        };
    }
}
