package enums;

public enum TipoNotificacion {
    WHATSAPP,
    EMAIL,
    SMS;

    @Override
    public String toString() {
        return switch (this) {
            case WHATSAPP -> "Whatsapp";
            case EMAIL -> "Correo electrónico";
            case SMS -> "Mensaje de texto";
        };
    }
}
