class BarangElektronik{
    String nama;
    Double harga;
    String warna;

    // constructor
    BarangElektronik(String nama,double harga,String warna){
        this.nama = nama;
        this.harga = harga;
        this.warna = warna;
    }
    void infoDasar(){
        System.out.println("Keterangan barang");
        System.out.println("Nama barang = "+this.nama);
        System.out.println("Harga barang = "+this.harga+" K");
        System.out.println("Warna barang = "+this.warna);
    }
}
class Televisi extends BarangElektronik{
    String tipeLayar;
    int ukuranLayar;
    Televisi(String tipeLayar,int ukuranLayar){
        super("Televisi Sharp",3.00,"Hitam");
        this.tipeLayar = tipeLayar;
        this.ukuranLayar = ukuranLayar;
    }
    void infoTV(){
        System.out.println("Memiliki tipe layar = "+this.tipeLayar);
        System.out.println("Memiliki ukuran layar = "+ukuranLayar+" Inch\n");
    }
}

class Kulkas extends BarangElektronik{
    String model;
    Kulkas(String model){
        super("Kulkas LG",4.55,"Silver");
        this.model = model;
    }
    void infoKulkas(){
        System.out.println("Memiliki model = "+this.model);
    }
}
public class tugasPraktikumInheritance {
    public static void main(String[] args) {
        BarangElektronik Panasonic = new BarangElektronik("AC Panasonic", 2.9500, "Putih");
        Panasonic.infoDasar();
        System.out.println("\n");

        Televisi sharp = new Televisi("IPS", 35);
        sharp.infoDasar();
        sharp.infoTV();

        Kulkas lg = new Kulkas("GN-B185SQBB");
        lg.infoDasar();
        lg.infoKulkas();
    }
}