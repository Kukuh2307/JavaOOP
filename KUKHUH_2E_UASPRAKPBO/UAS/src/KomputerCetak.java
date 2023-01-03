public class KomputerCetak {
    // Method cetak yang di dalamnya berisi bebereapa object untuk mencetak data
    public void cetak() {
        Laptop laptop = new Laptop();
        laptop.cetak_data();
        System.out.println("\n");
        
        Notebook Notebook = new Notebook();
        Notebook.cetak_data();
    }
}