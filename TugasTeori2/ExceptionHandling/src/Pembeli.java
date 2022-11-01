<<<<<<< HEAD
public class Pembeli {
    public static void main(String[] args) throws ExceptionHarga,ExceptionJumlahPembelian{
=======
 public class Pembeli {
    public static void main(String[] args) throws ExceptionHarga, ExceptionJumlahPembelian {
>>>>>>> 487efd8a62524980063a09aae3264eecd06c401d
        Supermarket barang1 = new Supermarket(2131, "Coklat", "pabrik1");
        barang1.tampil();
        barang1.setHarga(15000);
        barang1.setJumlahPembelian(-2);
        try {
            barang1.ketentuanHarga();
            barang1.ketentuanJumlahPembelian();
        } catch (ExceptionHarga e) {
            System.err.println(e);
        } catch(ExceptionJumlahPembelian e){
            System.err.println(e);
        } finally{
            System.out.println("Termakasih sudah berbelanja....");
            System.out.println("=========================\n");
        }

    }
}
