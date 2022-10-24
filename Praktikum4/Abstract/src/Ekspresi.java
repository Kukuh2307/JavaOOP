public class Ekspresi {
    static void keterangan(EkspresiWajah namaObject){
        System.out.println("=====================================");
        System.out.println("Keterangan \t: "+namaObject.getKeterangan());
        System.out.println("mata \t\t: "+namaObject.mata());
        System.out.println("mulut \t\t: "+namaObject.mulut());
        System.out.println("=====================================\n");
    }

    static void object(){
        Gembira bayu = new Gembira("'hahaha'", "senang");
        keterangan(bayu);
        Sedih jojo = new Sedih("'huhuhu'", "cemas");
        keterangan(jojo);
    }

    public static void main(String[] args) throws Exception {
        object();
    }
}
