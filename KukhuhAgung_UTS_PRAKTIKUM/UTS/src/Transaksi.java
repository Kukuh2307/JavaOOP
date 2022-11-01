package KukhuhAgung_UTS_PRAKTIKUM.UTS.src;

public class Transaksi extends KafeKopi {
    int nomorMeja,harga;
    String pesan;
    Transaksi(int nomorMeja){
        this.nomorMeja = nomorMeja;
    }
    public void infoTransaksi(){
        super.tampilInfoKafe();
        System.out.println("Nomor meja \t: "+this.nomorMeja);
        hitungTotalHarga();
        System.out.println("------------------------------");
        super.tampilPisangCoklat();
        super.tampilPukisKeju();
        super.tampilMocacino();
        System.out.println("------------------------------");
        System.out.println("Total harga \t: "+hitungTotalHarga());
        System.out.println("------------------------------");
    }
    public int hitungTotalHarga(){
        harga = super.pisangCoklat() + super.pukisKeju() + super.mocacino();
        return harga;
    }

}


