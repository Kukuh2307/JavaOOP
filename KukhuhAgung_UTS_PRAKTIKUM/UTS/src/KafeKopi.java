public class KafeKopi {
    String namaKafe,alamatKafe;
    
    public void infoKafe(String namaKafe,String alamatKafe){
        this.namaKafe = namaKafe;
        this.alamatKafe = alamatKafe;
    }
    public void tampilInfoKafe(){
        System.out.println("Nama Kafe : "+this.namaKafe);
        System.out.println("Alamat Kafe : "+this.alamatKafe);
    }

    public int pisangCoklat(int banyak){
        int harga = 8500;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public void tampilPisangCoklat(){
        System.out.println("pisang coklat : "+pisangCoklat(3));
    }
    public int pisangKeju(int banyak){
        int harga = 9500;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public int pukisCoklat(int banyak){
        int harga = 8500;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public int pukisKeju(int banyak){
        int harga = 10000;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public void tampilPukisKeju(){
        System.out.println("pukis keju : "+pukisKeju(3));
    }
    public int kopiHitam(int banyak){
        int harga = 15000;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public int mocacino(int banyak){
        int harga = 13000;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public void tampilMocacino(){
        System.out.println("mocacino : "+mocacino(3));
    }
}
