public class Ekspresi {
    static void keterangan(EkspresiWajah nama){
        // System.out.println("suara : "+nama.bersuara());
        System.out.println("mata : "+nama.mata());
        System.out.println("mulut : "+nama.mulut());
    }
    static void object(){
        Gembira bayu = new Gembira("'hahaha'", "senang");
        keterangan(bayu);

    }
    public static void main(String[] args) throws Exception {
        object();
    }
}
