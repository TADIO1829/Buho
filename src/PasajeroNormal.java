public class PasajeroNormal extends Servicio{
    String Nombre;
    String Cedula;

    public PasajeroNormal(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr, String ubicacion, String asiento, boolean maletaextra, String nombre, String cedula) {
        super(normal, vip, qg, qt, qp, qr, ubicacion, asiento, maletaextra);
        Nombre = nombre;
        Cedula = cedula;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public void tipo() {
        super.tipo();
        System.out.println("Nombre: " + Nombre);
        System.out.println("Cedula: " + Cedula);
    }
}
