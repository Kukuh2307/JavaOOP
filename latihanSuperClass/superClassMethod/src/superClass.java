public class superClass {
    public static void main(String[] args) {
        HeroMl alucard = new HeroMl("alucard", 100, 3);
        Assasin ling = new Assasin("ling");
        alucard.display();
        ling.setKeterangan("adalah hero dengan tipe assasin");
        ling.keterangan();
    }
}
