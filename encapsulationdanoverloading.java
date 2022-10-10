class mahasiswa {
    // membuat beberapa variable public dan private
    public String nama;
    private int npm;
    public String prodi;
  
    // constructor mahasiswa untuk menginputkan nama
    public mahasiswa(String nama, String prodi) {
      this.nama = nama;
      this.prodi = prodi;
    }
  
    // overloading untuk mahasiswa tanpa atribut prodi maka nilai default nya adalah sistem informasi
    public mahasiswa(String nama) {
      this.nama = nama;
      this.prodi = "Sistem Informasi";
    }
    
    // setter npm digunakan untuk menginputkan npm
    public void setNPM(int npm) {
      this.npm = npm;
    }
  
    // getter npm untuk menegah pengguna mengubah nilai dari npm
    public int getNPM(int npm) {
      return this.npm = npm;
    }
    
    // menampilkan data mahasiswa
    void tampil() {
      System.out.println("Nama = " + this.nama);
      System.out.println("NPM = " + this.npm);
      System.out.println("Prodi = " + this.prodi);
      System.out.println("");
    }
  }
  
  public class encapsulationdanoverloading {
    public static void main(String[] args) {
      mahasiswa mhs1 = new mahasiswa("Kukhuh Agung Prasetyo", "Teknik Informatika");
      mhs1.setNPM(2113020281);
      mhs1.tampil();
  
      mahasiswa mhs2 = new mahasiswa("Sandhika Galih");
      mhs2.getNPM(2113020282);
      mhs2.tampil();
    }
  }

