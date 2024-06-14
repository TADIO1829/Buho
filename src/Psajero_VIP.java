public class Psajero_VIP extends ServicioVip {
    String Nombre;
    String Cedula;

    public Psajero_VIP(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr, boolean television, boolean dulces, boolean comida, boolean internet, String nombre, String cedula) {
        super(normal, vip, qg, qt, qp, qr, television, dulces, comida, internet);
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
    public void tipovip() {
        super.tipovip();
        System.out.println("Nombre: " + Nombre);
        System.out.println("Cedula: " + Cedula);
    }
}
