public class CDMusic extends Merge {
    String produser,topHit;

    // constructor
    CDMusic(String judul,String penyanyi,String produser,String publisher,String topHit,String kategori,int stok){
        super(judul,penyanyi,publisher,kategori,stok);
        this.produser = produser;
        this.topHit = topHit;
    }
    // method untuk menampilkan output
    public void tampil(){
        System.out.println("===================================");
        System.out.println("Judul album music : "+super.getjudul());
        System.out.println("Nama penyanyi : "+super.getpemain());
        System.out.println("Nama produser album music : "+this.produser);
        System.out.println("Nama publisher music : "+super.getpublisher());
        System.out.println("Top Hit : "+this.topHit);
        System.out.println("Kategori film : "+super.getketeranganKategoriCDMusic());
        System.out.println("Stok album music : "+super.getstok());
        System.out.println("===================================\n");
    }
}
