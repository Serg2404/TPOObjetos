package enums;

public enum TipoUnidadFuncional {
    DEPARTAMENTO,
    COCHERA;

    @Override
    public String toString() {
        return switch (this) {
            case DEPARTAMENTO -> "Departamento";
            case COCHERA -> "Cochera";
        };
    }
}
