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
        pembeli.typetelpon = "S7+";
        pembeli.namatelpon = "IPHONE";
        pembeli.emaitelpon = "xxqz888712";
        pembeli.warnatelpon = "Gold";
        pembeli.tahunkluar = "2020";
        pembeli.sepesifikasitelpon= "Ram 3 internal 31 ";
        pembeli.statustelpon= "Baru";
        pembeli.tampilkanAtribut();
        pembeli.create();
        pembeli.create()("Handphone IOS")


        //construktor dengan method (obeject)
            StoreTelpon Store1 = new StoreTelpon();
            Store1.tampilkanAtribut();
            StoreTelpon Store2 = new StoreTelpon();
            Store2.tampilkaninfotelpon();

            StoreTelpon Store3 = new StoreTelpon("oppo","biru");
            Store3.tampilkaninfotelpon();
            StoreTelpon Store4 = new StoreTelpon("REDMI","pink");
            Store4.tampilkanAtribut();

            StoreTelpon Store5 = new StoreTelpon("A7","xxx1277783","2020");
            Store5.tampilkaninfotelpon();
            StoreTelpon Store6 = new StoreTelpon("NOTE7","xxxqp66723","2020");


            //overridding



        }

}


