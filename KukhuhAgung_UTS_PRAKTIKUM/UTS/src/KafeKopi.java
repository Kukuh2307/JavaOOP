package KukhuhAgung_UTS_PRAKTIKUM.UTS.src;

public class KafeKopi {
    String namaKafe,alamatKafe;
    private int banyak,jumlah;
    
    
    public void infoKafe(String namaKafe,String alamatKafe){
        this.namaKafe = namaKafe;
        this.alamatKafe = alamatKafe;
    }
    public void tampilInfoKafe(){
        System.out.println("------------------------------");
        System.out.println("Nama Kafe \t: "+this.namaKafe);
        System.out.println("Alamat Kafe \t: "+this.alamatKafe);
    }

    public int pisangCoklat(){
        int harga = 8500;
        int hargatotal = getPisangCoklat() * harga;
        return hargatotal;
    }
    public void setPisangCoklat(int banyak){
        this.banyak = banyak;
    }
    public int getPisangCoklat(){
        return this.banyak;
    }
    public void tampilPisangCoklat(){
        System.out.println(getPisangCoklat()+" pisang coklat : "+pisangCoklat());
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
    public int pukisKeju(){
        int harga = 10000;
        int hargatotal = getPukisKeju() * harga;
        return hargatotal;
    }
    public void setPukisKeju(int banyak){
        this.jumlah = banyak;
    }
    public int getPukisKeju(){
        return this.jumlah;
    }
    public void setPisangKeju(int banyak){
        this.banyak = banyak;
    }
    public int getPisangKeju(){
        return this.banyak;
    }
    public void tampilPukisKeju(){
        System.out.println(getPukisKeju()+" pukis keju \t: "+pukisKeju());
    }
    public int kopiHitam(int banyak){
        int harga = 15000;
        int hargatotal = banyak * harga;
        return hargatotal;
    }
    public int mocacino(){
        int harga = 13000;
        int hargatotal = getMocacino()* harga;
        return hargatotal;
    }
    public void setMocacino(int banyak){
        this.banyak = banyak;
    }
    public int getMocacino(){
        return this.banyak;
    }
    public void tampilMocacino(){
        System.out.println(getMocacino()+" mocacino \t: "+mocacino());
    }
}
