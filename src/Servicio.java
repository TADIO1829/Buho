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

    @Override
    public void tipo() {
        super.tipo();
        System.out.println("Asiento: " + Asiento);
        System.out.println("Ubicacion: " + Ubicacion);
        System.out.println("Maletaextra: " + Maletaextra);
    }
}

