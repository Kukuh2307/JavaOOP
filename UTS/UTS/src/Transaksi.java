public class Transaksi extends KafeKopi {
    int nomorMeja,harga;
    String pesan;
    Transaksi(int nomorMeja){
        this.nomorMeja = nomorMeja;
    }
    public void infoTransaksi(){
        super.tampilPisangCoklat();
        super.tampilPukisKeju();
        super.tampilMocacino();
        hitungTotalHarga();
    }
    public void hitungTotalHarga(){
        harga = super.pisangCoklat(3) + super.pukisKeju(2) + super.mocacino(3);
        System.out.println(harga);

    }

    
}