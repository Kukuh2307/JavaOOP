// Class laptop extends komputer
public class Laptop extends Komputer {

    //  method untuk keterangan menghidupkan os
    public void hidupkan_os() {
        System.out.println("Cara menghidupkan Operating System pada Laptop");
    }
    // method untuk aksi tombol power
    public void tombol_power(){
        System.out.println("- Tekan tombol power pada laptop");
        System.out.println("- Tunggu hingga beberapa saat sampai laptop selesai booting");
    }
    // method untuk keterangan mematikan os
    public void matikan_os() {
        System.out.println("Cara mematikan Operating System pada Laptop");
    }
    // method untuk keterangan aksi saat mouse di klik kanan
    public void klik_kanan() {
        System.out.println("- Klik kanan icon windows di pojok kiri bawah");
        System.out.println("- Pilih icon dengan nama power");
    }
    // method untuk keterangan aksi saat mouse di klik kiri
    public void klik_kiri() {
        System.out.println("- Klik kiri pada mouse");
    }
    // method untuk keterangan aksi saat laptop di klik enter
    public void tekan_enter() {
        System.out.println("- Lalu tekan enter");
    }

    // method untuk mencetak data yaitu cara untuk mematikan dan menghidupkan os pada windows
    public void cetak_data() {
        matikan_os();
        klik_kanan();
        tekan_enter();

        hidupkan_os();
        tombol_power();
    }
}