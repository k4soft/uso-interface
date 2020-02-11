package terminaltransporte;

public enum TipoDocumentoIdentidad {

    CEDULA_CIUDADANIA(1,"cédula ciudadania","CC"),
    CEDULA_EXTRANGERIA(2,"cédula Extrangería","CE"),
    PASAPORTE(3,"Pasaporte","P");

    private int id;
    private String nombre;
    private String sigla;

    TipoDocumentoIdentidad(int id, String nombre, String sigla) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSigla() {
        return sigla;
    }
}
