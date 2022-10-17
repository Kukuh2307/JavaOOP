class hewan{
    int berat;
    String makanan;
    String jumlahKaki;

    public hewan(int berat,String makanan,String jumlahKaki){
        this.berat = berat;
        this.makanan = makanan;
        this.jumlahKaki = jumlahKaki;
    }

    public void caraMakan(){
        System.out.println("Untuk cara memakan "+makanan+" hewan ini menggunakan mulut");
    }
    void caraGerak(String gerak){
        System.out.println("Untuk cara berjalan hewan ini menggunakan  "+gerak);
    }
    void caraBersuara(String suara){
        System.out.println("Suara : "+suara);
    }

    public void tampil(){
        System.out.println("Berat : "+this.berat);
        System.out.println("makanan : "+this.makanan);
        System.out.println("jumlah kaki : "+this.jumlahKaki);
    }
}
class karnivora extends hewan{
    String kategori;
    karnivora(String makanan, String kategori){
        super(150,"Daging","4");
        this.makanan = makanan;
        this.kategori = kategori;
        
    }
    void deskripsi(){
        System.out.println("oleh karena itu di kategorikan sebagai "+kategori+"\n");
    }
}
class herbivora extends hewan{
    String kategori;
    herbivora(String makanan, String kategori){
        super(190,"Rumput","4");
        this.makanan = makanan;
        this.kategori = kategori;
        
    }
    void deskripsi(){
        System.out.println("oleh karena itu di kategorikan sebagai "+kategori+"\n");
    }
}


public class inheritance {
    public static void main(String[] args) { 
        hewan Singa = new hewan(160,"Daging","4");
        Singa.tampil();
        Singa.caraBersuara("Mengaum");
        Singa.caraGerak("kaki");
        Singa.caraMakan();
        System.out.println("\n");

        karnivora macan = new karnivora("Daging","Karnivora");
        macan.tampil();
        macan.caraMakan();
        macan.deskripsi();

        herbivora gajah = new herbivora("Rumput", "herbivora");
        gajah.tampil();
        gajah.caraMakan();
        gajah.deskripsi();
    }
}
