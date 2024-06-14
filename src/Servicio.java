public class Servicio extends Ruta {
    String Asiento;
    String Ubicacion;
    boolean Maletaextra;

    public Servicio() {
    }

    public Servicio(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr, String ubicacion, String asiento, boolean maletaextra) {
        super(normal, vip, qg, qt, qp, qr);
        Ubicacion = ubicacion;
        Asiento = asiento;
        Maletaextra = maletaextra;
    }

    public String getAsiento() {
        return Asiento;
    }

    public void setAsiento(String asiento) {
        Asiento = asiento;
    }

    public boolean isMaletaextra() {
        return Maletaextra;
    }

    public void setMaletaextra(boolean maletaextra) {
        Maletaextra = maletaextra;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    @Override
    public void tipo() {
        super.tipo();
        System.out.println("Asiento: " + Asiento);
        System.out.println("Ubicacion: " + Ubicacion);
        System.out.println("Maletaextra: " + Maletaextra);
    }
}

