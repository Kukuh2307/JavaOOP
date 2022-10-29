public class Supermarket {
    int kodeBarang;
    String namaBarang,pabrik;
    private int harga,jumlahPembelian;

    Supermarket(int kodeBarang,String namaBarang,String pabrik){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.pabrik = pabrik;
    }
    public void setJumlahPembelian(int banyak){
        jumlahPembelian = banyak;
    }
    // public String getJumlahPembelian(){
    //     String keterangan = "Harga barang : "+jumlahPembelian;
    //     return keterangan;
    // }
    public void setHarga(int harga){
        this.harga = harga;
    }
    // public String getHarga(){
    //     String keterangan = "Harga barang : "+this.harga;
    //     return keterangan;
    // }
    public void tampil(){
        System.out.println("=========================");
        System.out.println("Kode barang : "+this.kodeBarang);
        System.out.println("Nama barang : "+this.namaBarang);
        System.out.println("Yang memproduksi : "+this.pabrik);
        // System.out.println("Jumlah pembelian : "+jumlahPembelian);   
    }
    public void ketentuanHarga() throws ExceptionHarga {
        if(this.harga <= 0){
            throw new ExceptionHarga("Harga tidak boleh kurang atau sama dengan 0, karena harga yang anda masukkan adalah "+this.harga);
        } else{
            System.out.println("harga barang adalah : "+this.harga);
        }
    }

    public void ketentuanJumlahPembelian() throws ExceptionJumlahPembelian{
        if(jumlahPembelian < 0){
            throw new ExceptionJumlahPembelian("Barang yang harus di beli minimal 1");
        } else{
            System.out.println("Anda membeli sebanyak : "+jumlahPembelian+" Buah");
        }
    }
}
