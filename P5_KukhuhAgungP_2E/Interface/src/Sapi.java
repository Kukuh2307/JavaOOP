// terdapat kelas sapi yang extends dengan kelas abstract hewan
// di dalamnya terdapat konstruktor sapi yang menggunakan super untuk mengirim value ke keals induk yaitu hewan
// di dalamnya terdapat fungsi untuk mencetak suara dan juga pembuatan objectnya
public class Sapi extends Hewan {
    public Sapi(){
        super("Khidir Karawita",4);
    }

    public void bersuara(){
        System.out.println("suara \t\t: mmmmoooohhhhh, emmoouuhh");
    }
    public static void main(String[] args) {
        Sapi sapi2 = new Sapi();
        sapi2.cetakKeterangan();
        sapi2.makan();
        sapi2.bersuara();
    }
}
