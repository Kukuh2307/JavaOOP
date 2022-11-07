public class Merge {
    public String judul,pemain,publisher,kategori;
    public int stok;

    // constructor
    Merge(String judul,String pemain,String publisher,String kategori,int stok){
        this.judul = judul;
        this.pemain = pemain;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }
    // getter judul 
    public String getjudul(){
        return judul;
    }
    // getter pemain
    public String getpemain(){
        return pemain;
    }
    // getter publisher
    public String getpublisher(){
        return publisher;
    }
    // getter stok
    public int getstok(){
        return stok;
    }
    // keterangan per kategori vcd
    public String getketeranganKategoriVCD(){
        if(this.kategori == "S"){
            return "Semua umur";
        } else if(this.kategori == "D"){
            return "Dewasa";
        } else if(this.kategori == "R"){
            return "Remaja";
        } else {
            return "Anak";
        }
    }
    // keterangan per kategori cd music
    public String getketeranganKategoriCDMusic(){
        if(this.kategori == "C"){
            return "Classic";
        } else if(this.kategori == "J"){
            return "Jazz";
        } else if(this.kategori == "P"){
            return "Pop";
        } else if(this.kategori == "R"){
            return "Rock";
        } else {
            return "Other";
        }
    }
}
