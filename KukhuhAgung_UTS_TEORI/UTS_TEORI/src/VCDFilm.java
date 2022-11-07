public class VCDFilm extends Merge {
    String sutradara;

    // constructor
    VCDFilm(String judul,String pemain,String sutradara,String publisher,String kategori,int stok){
        super(judul,pemain,publisher,kategori,stok);
        this.sutradara = sutradara;
    }

    // method untuk menampilkan output
    public void tampil(){
        System.out.println("===================================");
        System.out.println("Judul film : "+super.getjudul());
        System.out.println("Nama aktor pemain dalam film : \n"+super.getpemain());
        System.out.println("Nama sutradara film : "+this.sutradara);
        System.out.println("Nama publisher film : "+super.getpublisher());
        System.out.println("Kategori film : "+super.getketeranganKategoriVCD());
        System.out.println("Stok VCD film : "+super.getstok());
        System.out.println("===================================\n");
    }
}
