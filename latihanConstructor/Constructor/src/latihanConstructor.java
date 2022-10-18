class Binatang {
    String nama;
    String makanan;
    String habitat;

    // constructor
    Binatang(String nama,String makanan,String habitat){
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
    }
    // method tanpa return dan tanpa parameter
    void tampil(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Makanan : " + this.makanan);
        System.out.println("Habitat : " + this.habitat);
    }
    // method tanpa return dengan parameter
    void aturNama(String nama){
        this.nama = nama;
    }
}
public class latihanConstructor {
    public static void main(String[] args) {
        Binatang kaki2 = new Binatang("bebek", "omnivora", "sungai");
        kaki2.tampil();
        kaki2.aturNama("elang");
        kaki2.tampil();
    }
}