package model;

public class AksiStoreTelpon {
    public static void main (String [] args){

        //object class 1
        StoreTelpon StoreTelpon = new StoreTelpon();
        StoreTelpon.idtelpon = 00135;
        StoreTelpon.typetelpon = "J7 Prime";
        StoreTelpon.namatelpon = "Samsung";
        StoreTelpon.emaitelpon = "xxqz884467254";
        StoreTelpon.warnatelpon = "Hitam";
        StoreTelpon.tahunkluar = "2018";
        StoreTelpon.sepesifikasitelpon= "Ram 3 internal 31 ";
        StoreTelpon.statustelpon= "Baru";
        StoreTelpon.tampilkanAtribut();
        StoreTelpon.create();
        StoreTelpon.create()("Handphone Android")

        //object class 2
        PembeliTelpon pembeli = new pembeli();
        pembeli.idtelpon = 00145;
        pembeli.typetelpon = "S6+";
        pembeli.namatelpon = "IPHONE";
        pembeli.emaitelpon = "xxqz888712";
        pembeli.warnatelpon = "Gold";
        pembeli.tahunkluar = "2020";
        pembeli.sepesifikasitelpon= "Ram 3 internal 31 ";
        pembeli.statustelpon= "Baru";
        pembeli.tampilkanAtribut();
        pembeli.create();
        pembeli.create()("Handphone IOS")

    }
}
