// membuat class kendaraan dengan beberapa atribut
class kendaraan {
    String merek;
    String kecepatan;
    int jumlah_roda;
    String tahun_produksi;
}
// membuat class mahasiswa dengan beberapa atribut
class mahasiswa {
    String nama;
    String npm;
    String jurusan;
    String fakultas;
}
// membuat class binatang dengan beberapa atribut
class binatang {
    String nama;
    String makanan;
    String habitat;

    // constructor
    binatang(String inputnama,String inputmakanan,String inputhabitat){
        nama = inputnama;
        makanan = inputmakanan;
        habitat = inputhabitat;
        
        System.out.println(nama);
        System.out.println(makanan);
        System.out.println(habitat);
    }
}

public class tugas1{ 
    // membuat method untuk mencetak isian dari object motor
    static void cetakkendaraan(){
        kendaraan motor = new kendaraan();
        motor.merek = "Honda";
        motor.kecepatan = "80km/jam";
        motor.jumlah_roda = 4;
        motor.tahun_produksi = "2015";
        System.out.println("Nomor 1");
        System.out.println(motor.merek);
        System.out.println(motor.kecepatan);
        System.out.println(motor.jumlah_roda);
        System.out.println(motor.tahun_produksi);
    }

    public static void main(String[] args) {
        // soal nomor 1
        cetakkendaraan();

        // soal nomor 2
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "Kukhuh Agung Prasetyo";
        mhs1.npm = "21130281";
        mhs1.jurusan = "Teknik Informatika";
        mhs1.fakultas = "Teknik";
        System.out.println("\nNomor 2");
        System.out.println(mhs1.nama);
        System.out.println(mhs1.npm);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.fakultas);

        // soal nomor 3
        binatang kaki4 = new binatang("harimau","daging","hutan");
        System.out.println("\nNomor 3");
        System.out.println(kaki4.nama);
        System.out.println(kaki4.makanan);
        System.out.println(kaki4.habitat);
    }
}