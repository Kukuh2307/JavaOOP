public class Assasin extends HeroMl{
    private String keterangan;

    // jadi ketika menggunakan super maka otomatis akan mengikuti dari construktor kelas induknya.
    // namun di sini ada overloading yaitu assasin
    Assasin(String name,int health,int skill){
        // atribut akan di kirim ke kelas super
        super(name,health,skill);
    }
    Assasin(String name){
        // atribut akan di kirim ke kelas super
        super(name);
    }

    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    public String getKeterangan(){
        return this.keterangan;
    }
    void keterangan(){
        // akan mengambil method yang ada di kelas super
        super.displayName();
        System.out.println(getKeterangan());
    }
}
