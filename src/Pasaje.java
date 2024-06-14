public class Pasaje {
    double QG=20.0;
    double QT=17.50;
    double QP=15.0;
    double QR=17.50;


    public Pasaje() {
    }

    public double getQG() {
        return QG;
    }

    public void setQG() {
        this.QG = QG;
    }

    public double getQR() {
        return QR;
    }

    public void setQR(double QR) {
        this.QR = QR;
    }

    public double getQP() {
        return QP;
    }

    public void setQP(double QP) {
        this.QP = QP;
    }

    public double getQT() {
        return QT;
    }

    public void setQT(double QT) {
        this.QT = QT;
    }

    public void mostrarPasaje() {
        System.out.println("QG: " + QG);
        System.out.println("QT: " + QT);
        System.out.println("QP: " + QP);
        System.out.println("QT: " + QT);
    }
}
