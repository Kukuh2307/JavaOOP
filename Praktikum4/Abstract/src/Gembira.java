public class Gembira extends EkspresiWajah {
    String suara;
    String suasanaHati;

    Gembira(String suara,String suasanaHati){
        this.suara = suara;
        this.suasanaHati = suasanaHati;
    }
    public String bersuara(){
        String tawa = "Ketika gembira  suasana hati anda akan : "+this.suasanaHati+" dan saat tertawa suaranya :"+this.suara;
        return tawa;
    }
    public String mata(){
        return "Ketika tertawa "+this.suara+" untuk sebagian orang mata mereka cenderung terpejam";
    }
    public String mulut(){
        return "Ketika tertawa "+this.suara+" maka mulut mereka terbuka";
    }
}
