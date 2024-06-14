
public class Ruta extends Normal{
    boolean qg ;
    double precioqg=20;
    double precioggvip=26;
    boolean qt;
    double precioqt=17.50;
    double precioqtvip=22.75;
    boolean qp ;
    double precioqp=15;
    double precioqpvip=19.5;
    boolean qr;
    double precioqr=17.50;
    double precioqrvip=22.75;

    public Ruta(Boolean normal, Boolean vip, boolean qg, boolean qt, boolean qp, boolean qr) {
        super(normal, vip);
        this.qg = qg;
        this.qt = qt;
        this.qp = qp;
        this.qr = qr;
    }

    public Ruta() {
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
