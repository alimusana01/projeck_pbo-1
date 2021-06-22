package model;
// superClas/parent-Clas
public class StoreTelpon {
    //    8 atribut clas StoreTelpon

    public int idtelpon;
    public String typetelpon;
    public String namatelpon;
    public String emaitelpon;
    public String warnatelpon;
    public String tahunkluar;
    public String sepesifikasitelpon;
    public String statustelpon;

   // 4 method class storetelpon//


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
        String insertCreate = "INSERT INTO StoreTelpon VALUES ('"+idtelpon"','"+namatelpon"','"+typetelpon"','"+warnatelpon"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if (berhasil){
            return true;
        }else {
            return false;
        }

    }
    public boolean create(String typetelpon){
        String insertCreate ="INSERT INTO StoreTelpon VALUES Type Telpon "+typetelpon;
        System.out.println(insertCreate);
        return false;
    }
}
