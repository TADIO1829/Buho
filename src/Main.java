
public class Main {
    public static void main(String[] args) {
        PasajeroNormal p1=new PasajeroNormal(true,false,true,false,false,false,"Atras","Ventana",false,"TADEO","0941077984");
        p1.tipo();
        PasajeroNormal p2=new PasajeroNormal(true,false,false,true,false,false,"Adelante","Pasillo",true,"Madeline","0941077978");
        p2.tipo();
        Psajero_VIP p3=new Psajero_VIP(false,true,false,false,true,false,true,true,true,true,"Sofia","1720559684");
        p3.tipovip();
        Psajero_VIP p4=new Psajero_VIP(false,true,false,false,false,true,false,true,false,true,"Amaralis","12125478963");
        p4.tipovip();
        Psajero_VIP p5=new Psajero_VIP(false,true,false,false,true,false,true,true,true,true,"Ambar","17265989684");
        p5.tipovip();






    }
}