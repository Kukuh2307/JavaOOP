package KukhuhAgung_UTS_PRAKTIKUM.UTS.src;

public class UTSP020 {

    public static void main(String[] args) {   
        Transaksi pembeli1 = new Transaksi(2);
        pembeli1.infoKafe("Kafe Remaja", "Tulungagung");
        pembeli1.setPisangCoklat(3);
        pembeli1.setPukisKeju(2);
        pembeli1.setMocacino(3);
        pembeli1.infoTransaksi();
    }

}
