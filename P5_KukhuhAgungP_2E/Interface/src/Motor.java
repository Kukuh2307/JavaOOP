public class Motor implements Speedometer{
    public void tambahKecepatan(){
        System.out.println("Cara tambah kecepatan motor: ");
        System.out.println(" \t pindah ke gear yang lebih tinggi\n" + " \t dan gas motornya");
    }

    public void kurangKecepatan(){
        System.out.println("Cara mengurangi kecepatan motor: ");
        System.out.println("\t rem motor \n" + " \t pindah ke gear yang lebih rendah\n");        
    }
}
