
public class Ruta extends Normal{
    boolean qg ;
    double precioqg=20;

    boolean qt;
    double precioqt=17.50;

    boolean qp ;
    double precioqp=15;

    boolean qr;
    double precioqr=17.50;


    public Ruta(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr) {
        super(normal, vip);
        this.qg = qg;
        this.qt = qt;
        this.qp = qp;
        this.qr = qr;
    }

    public Ruta() {
    }

    public boolean isQg() {
        return qg;
    }

    public void setQg(boolean qg) {
        this.qg = qg;
    }

    public double getPrecioqg() {
        return precioqg;
    }

    public void setPrecioqg(double precioqg) {
        this.precioqg = precioqg;
    }

    public boolean isQt() {
        return qt;
    }

    public void setQt(boolean qt) {
        this.qt = qt;
    }

    public double getPrecioqt() {
        return precioqt;
    }

    public void setPrecioqt(double precioqt) {
        this.precioqt = precioqt;
    }

    public boolean isQp() {
        return qp;
    }

    public void setQp(boolean qp) {
        this.qp = qp;
    }

    public double getPrecioqp() {
        return precioqp;
    }

    public void setPrecioqp(double precioqp) {
        this.precioqp = precioqp;
    }

    public boolean isQr() {
        return qr;
    }

    public void setQr(boolean qr) {
        this.qr = qr;
    }

    public double getPrecioqr() {
        return precioqr;
    }

    public void setPrecioqr(double precioqr) {
        this.precioqr = precioqr;
    }

    @Override
    public void tipo() {
        super.tipo();
        if(qg==true){
            System.out.println("Destino: Quito-Guayaquil");
            System.out.println("Precio: "+precioqg);
        }
        if(qt==true){
            System.out.println("Destino: Quito-Tulcan");
            System.out.println("Precio: "+precioqt);
        }
        if(qp==true){
            System.out.println("Destino: Quito-Puyo");
            System.out.println("Precio: "+precioqp);
        }
        if(qr==true){
            System.out.println("Destino: Quito-Riobamba");
            System.out.println("Precio: "+precioqr);
        }
    }
}
