class kendaraan{
    String merek;
    String kecepatan;
    int jumlah_roda;
    String tahun_produksi;
}

class Mahasiswa {
    String nama;
    String npm;
    String jurusan;
    String fakultas;
}

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


public class Constructor{
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

    public static void main(String[] args) throws Exception {
        cetakkendaraan();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Kukhuh Agung Prasetyo";
        mhs1.npm = "21130281";
        mhs1.jurusan = "Teknik Informatika";
        mhs1.fakultas = "Teknik";
        System.out.println("\nNomor 2");
        System.out.println(mhs1.nama);
        System.out.println(mhs1.npm);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.fakultas);

        binatang kaki4 = new binatang("harimau","daging","hutan");
        System.out.println("\nNomor 3");
        System.out.println(kaki4.nama);
        System.out.println(kaki4.makanan);
        System.out.println(kaki4.habitat);
    }
}
