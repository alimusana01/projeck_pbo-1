package model;

public class StoreTelpon {
    //    8 atribut clas StoreTelpon

    public int idtelpon;
    public string typetelpon;
    public string namatelpon;
    public string emaitelpon;
    public string warnatelpon;
    public string tahunkluar;
    public string sepesifikasitelpon;
    public string statustelpon;

   // 4 method class storetelpon


    public void tampilkanAtribut(){
        System.out.println("================");
        System.out.println("ID Telpon : "+idtelpon);
        System.out.println("Type Telpon : "+typetelpon);
        System.out.println("Nama Telpon : "+namatelpon);
        System.out.println("Emai Telpon : "+emaitelpon);
        System.out.println("Warna Telpon : "+warnatelpon);
        System.out.println("Tahun Kluar  : "+tahunkluar);
        System.out.println("Sepesifikasi Telpon : "+sepesifikasitelpon);
        System.out.println("Status Telpon : "+statustelpon);

    }
    public void tampilkaninfotelpon(){
        System.out.println("=====================");
        System.out.println("Nama Telpon : "+namatelpon);
        System.out.println("Emai Telpon : "+emaitelpon);
        System.out.println("Type Telpon : "+typetelpon);
        System.out.println("Warna Telpon : "+warnatelpon);
        System.out.println("Tahun Kluar  : "+tahunkluar);
        System.out.println("Status Telpon : "+statustelpon);
    }
    public boolean create (){
        string insertCreate = "INSERT INTO StoreTelpon VALUES ('"+idtelpon"','"+namatelpon"','"+typetelpon"','"+warnatelpon"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if (berhasil){
            return true;
        }else {
            return false;
        }

    }
    public boolean create(String typetelpon){
        string insertCreate ="INSERT INTO StoreTelpon VALUES Type Telpon "+typetelpon;
        System.out.println(insertCreate);
        return false;
    }
}