public class TesKendaraan {
    public static void main(String[] args) {
        Mobil bmw = new Mobil();
        Motor mio = new Motor();

        bmw.tambahKecepatan();
        bmw.kurangKecepatan();

        mio.tambahKecepatan();
        mio.kurangKecepatan();
    }
}
