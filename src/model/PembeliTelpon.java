package model;

public class PembeliTelpon extends StoreTelpon{

    public String namapembeli;
    public int namapenjual;
    public String jumlahbeli;

    public void infopenjual(){
        System.out.println("=================");
        System.out.println("Nama Pembeli Telpon : "+namapembeli);
        System.out.println("Nama Penjual Telpon : "+namapenjual);
        System.out.println("Jumalah Beli        : "+jumlahbeli);

    }
    public void jumlahinfo(){
        String ji = "INSERT INTO StoreTelpon VALUES ('"+jumlahbeli+"')";
        System.out.println(ji);
    }

        //Getter And Setter

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public int getNamapenjual() {
        return namapenjual;
    }

    public void setNamapenjual(int namapenjual) {
        this.namapenjual = namapenjual;
    }

    public String getJumlahbeli() {
        return jumlahbeli;
    }

    public void setJumlahbeli(String jumlahbeli) {
        this.jumlahbeli = jumlahbeli;
    }
}
