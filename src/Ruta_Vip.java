public class Ruta_Vip extends Vip {
    boolean qg;
    double precioqgvip = 26;
    boolean qt;
    double precioqtvip = 22.75;
    boolean qp;
    double precioqpvip = 19.5;
    boolean qr;
    double precioqrvip = 22.75;

    public Ruta_Vip(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr) {
        super(normal, vip);
        this.qg = qg;
        this.qt = qt;
        this.qp = qp;
        this.qr = qr;
    }

    public boolean isQg() {
        return qg;
    }

    public void setQg(boolean qg) {
        this.qg = qg;
    }

    public double getPrecioqgvip() {
        return precioqgvip;
    }

    public void setPrecioqgvip(double precioqgvip) {
        this.precioqgvip = precioqgvip;
    }

    public boolean isQt() {
        return qt;
    }

    public void setQt(boolean qt) {
        this.qt = qt;
    }

    public double getPrecioqtvip() {
        return precioqtvip;
    }

    public void setPrecioqtvip(double precioqtvip) {
        this.precioqtvip = precioqtvip;
    }

    public boolean isQp() {
        return qp;
    }

    public void setQp(boolean qp) {
        this.qp = qp;
    }

    public double getPrecioqpvip() {
        return precioqpvip;
    }

    public void setPrecioqpvip(double precioqpvip) {
        this.precioqpvip = precioqpvip;
    }

    public boolean isQr() {
        return qr;
    }

    public void setQr(boolean qr) {
        this.qr = qr;
    }

    public double getPrecioqrvip() {
        return precioqrvip;
    }

    public void setPrecioqrvip(double precioqrvip) {
        this.precioqrvip = precioqrvip;
    }

    public Ruta_Vip() {
    }

    @Override
    public void tipovip() {
        super.tipovip();
        if (qg == true) {
            System.out.println("Destino: Quito-Guayaquil");
            System.out.println("Precio: " + precioqgvip);
        }
        if (qt == true) {
            System.out.println("Destino: Quito-Tulcan");
            System.out.println("Precio: " + precioqtvip);
        }
        if (qp == true) {
            System.out.println("Destino: Quito-Puyo");
            System.out.println("Precio: " + precioqpvip);
        }
        if (qr == true) {
            System.out.println("Destino: Quito-Riobamba");
            System.out.println("Precio: " + precioqrvip);
        }
    }
}
