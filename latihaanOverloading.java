class pemain{
    private String nama;
    private static int jumlahPlayer;

    // overloading constructor opsi 1
    pemain(String nama){
        pemain.jumlahPlayer++;
        this.nama = nama;     
    }
    // overloading constructor opsi 2
    pemain(){
        pemain.jumlahPlayer++;
        this.nama = "player"+pemain.jumlahPlayer;
    }
    void tampil(){
        System.out.println("Nama : "+this.nama);
    }
}
public class latihaanOverloading {
    public static void main(String[] args) {
        pemain pemain1 = new pemain("mail");
        pemain pemain2 = new pemain();
        pemain1.tampil();
        pemain2.tampil();
    }
}
