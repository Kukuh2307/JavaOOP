// Class netbook extends komputer
public class Notebook extends Komputer {

    //  method untuk keterangan menghidupkan os
    public void hidupkan_os() {
        System.out.println("Cara mwenghidupkan Operating System pada Notebook");
    }
    // method untuk keterangan mematikan os
    public void matikan_os() {
        System.out.println("Cara mematikan Operating System pada Notebook");
        System.out.println("- Cari icon power di window");
    }
    // method untuk aksi tombol power
    public void tombol_power(){
        System.out.println("- Tekan tombol power pada Notebook");
        System.out.println("- Tunggu hingga beberapa menit sampai Notebook selesai booting");
    }
    // method untuk keterangan aksi saat mouse di klik kanan
    public void klik_kanan() {
        System.out.println("- Klik kanan pada mouse");
        System.out.println("- Pilih opsi shutdown");
    }
    // method untuk keterangan aksi saat mouse di klik kiri
    public void klik_kiri() {
        System.out.println("- Klik kiri pada mouse");
    }
    // method untuk keterangan aksi saat laptop di klik enter
    public void tekan_enter() {
        System.out.println("Tekan enter pada netbook");
    }
    // method untuk mencetak data yaitu cara untuk mematikan dan menghidupkan os pada Notebook
    public void cetak_data() {
        hidupkan_os();
        tombol_power();

        matikan_os();
        klik_kanan();
    }
}
