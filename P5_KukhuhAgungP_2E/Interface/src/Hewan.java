// membuat kelas induk abstract dengan nama hewan 
// yang di dalamnya terdapat 2 variable protected yang hanya dapat di akses oleh kelas di bawahnya
// selain itu juga ada konstruktor dan juga fungsi untuk mencetak suara dan mencetak keterangan dari objet
public abstract class Hewan{
    protected String nama;
    protected int jummlahKaki;

    public Hewan(String nama,int jumlahKaki){
        this.nama = nama;
        this.jummlahKaki = jumlahKaki;
    }

    public abstract void bersuara();
    public void makan(){
        System.out.println("makan \t\t: nyam,nyam,nyam");
    }

    public void cetakKeterangan(){
        System.out.println("nama \t\t: "+this.nama);
        System.out.println("jumlah kaki \t: "+this.jummlahKaki);
    }
}
