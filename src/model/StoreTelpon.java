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

        //construktor
    public StoreTelpon(){
        System.out.println("===================");
        namatelpon = "please isi Nama Telpon";
        typetelpon = "please isi Type Telpon";
        namatelpon = "please isi nama telpon";
        warnatelpon= "please isi warna telpon";
    }
    public StoreTelpon(String namatelpon, String warnatelpon){
        this.namatelpon = namatelpon;
        this.warnatelpon = warnatelpon;
    }
    public StoreTelpon(String typetelpon, String emaitelpon, String tahunkluar){
        this.typetelpon = typetelpon;
        this.emaitelpon = emaitelpon;
        this.tahunkluar = tahunkluar;
    }

    //Getter And Setter

    public int getIdtelpon() {
        return idtelpon;
    }

    public void setIdtelpon(int idtelpon) {
        this.idtelpon = idtelpon;
    }

    public String getTypetelpon() {
        return typetelpon;
    }

    public void setTypetelpon(String typetelpon) {
        this.typetelpon = typetelpon;
    }

    public String getNamatelpon() {
        return namatelpon;
    }

    public void setNamatelpon(String namatelpon) {
        this.namatelpon = namatelpon;
    }

    public String getEmaitelpon() {
        return emaitelpon;
    }

    public void setEmaitelpon(String emaitelpon) {
        this.emaitelpon = emaitelpon;
    }

    public String getWarnatelpon() {
        return warnatelpon;
    }

    public void setWarnatelpon(String warnatelpon) {
        this.warnatelpon = warnatelpon;
    }

    public String getTahunkluar() {
        return tahunkluar;
    }

    public void setTahunkluar(String tahunkluar) {
        this.tahunkluar = tahunkluar;
    }

    public String getSepesifikasitelpon() {
        return sepesifikasitelpon;
    }

    public void setSepesifikasitelpon(String sepesifikasitelpon) {
        this.sepesifikasitelpon = sepesifikasitelpon;
    }

    public String getStatustelpon() {
        return statustelpon;
    }

    public void setStatustelpon(String statustelpon) {
        this.statustelpon = statustelpon;
    }
}
