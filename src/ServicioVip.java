public class ServicioVip extends Ruta_Vip{
    boolean Television;
    boolean Internet;
    boolean Comida;
    boolean Dulces;

    public ServicioVip(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr, boolean television, boolean dulces, boolean comida, boolean internet) {
        super(normal, vip, qg, qt, qp, qr);
        Television = television;
        Dulces = dulces;
        Comida = comida;
        Internet = internet;
    }

    public ServicioVip(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr) {
        super(normal, vip, qg, qt, qp, qr);
    }

    public ServicioVip() {
    }

    public boolean isTelevision() {
        return Television;
    }

    public void setTelevision(boolean television) {
        Television = television;
    }

    public boolean isInternet() {
        return Internet;
    }

    public void setInternet(boolean internet) {
        Internet = internet;
    }

    public boolean isComida() {
        return Comida;
    }

    public void setComida(boolean comida) {
        Comida = comida;
    }

    public boolean isDulces() {
        return Dulces;
    }

    public void setDulces(boolean dulces) {
        Dulces = dulces;
    }

    @Override
    public void tipovip() {
        super.tipovip();
        System.out.println("Television: " + Television);
        System.out.println("Dulces: " + Dulces);
        System.out.println("Comida: " + Comida);
        System.out.println("Internet: " + Internet);
    }
}
