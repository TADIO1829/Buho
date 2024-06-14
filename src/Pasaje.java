public class Pasaje {
    Boolean Normal;
    Boolean Vip;

    public Pasaje() {
    }

    public Pasaje(Boolean normal, Boolean vip) {
        Normal = normal;
        Vip = vip;
    }

    public Boolean getNormal() {
        return Normal;
    }

    public void setNormal(Boolean normal) {
        Normal = normal;
    }

    public Boolean getVip() {
        return Vip;
    }

    public void setVip(Boolean vip) {
        Vip = vip;
    }
    public void tipo(){
        if (Normal==true && Vip==false){
            System.out.println("Normal");
        }
    }
    public void tipovip(){
        if (Normal==false && Vip==true){
            System.out.println("Vip");
        }
    }
}
