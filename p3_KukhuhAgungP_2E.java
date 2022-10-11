class lingkarang{
    double radius;

    lingkarang(int data){
        radius = data;
    }
    double hitungLuas(){
        double luas;
        luas = Math.PI *radius*radius;
        return luas;
    }
    double hitungKeliling(){
        double keliling;
        keliling = Math.PI * radius;
        return keliling;
    }
}

class tabung extends lingkarang{
    int tinggi;
    tabung(int tinggi){
        super(10);
        this.tinggi = tinggi;
    }
     double luasSelimut(){
        double selimut;
        selimut = 2 * hitungLuas() + hitungKeliling() * tinggi;
        return selimut;
    }
    public void tampil(){
        System.out.println("Radius = "+ this.radius);
        System.out.println("Luas lingkaran = "+hitungLuas());
        System.out.println("hitung keliling = "+hitungKeliling());
        System.out.println("luas selimut tabung = "+luasSelimut());
        System.out.println("tinggi = "+this.tinggi);
    }
}

class KelasSuper{
    public void methodAsli(){
        System.out.println("method kelas super jalan");
    }
}
class Subclass extends KelasSuper{
    public void methodAsli(){
        System.out.println("method overided jalan");
    }
    public void methodPemanggil(){
        System.out.println("Pemanggil method jalan");
        super.methodAsli();
    }
}
public class p3_KukhuhAgungP_2E{
public static void main(String[] args) {
    tabung tabung1 = new tabung(10);
    tabung1.tampil();

    KelasSuper example1 = new KelasSuper();
    example1.methodAsli();
    
    Subclass example2 = new Subclass();
    example2.methodAsli();
    example2.methodPemanggil();
    }
}