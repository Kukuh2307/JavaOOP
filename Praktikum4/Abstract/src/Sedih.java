public class Sedih extends EkspresiWajah{
    String suara;
    String suasanaHati;

    Sedih(String suara,String suasanaHati){
        this.suara = suara;
        this.suasanaHati = suasanaHati;
    }

    public String getKeterangan(){
        return this.suasanaHati;
    }

    public String bersuara(){
        String menangis = "Ketika menangis suasana hati anda akan : "+this.suasanaHati+" dan saat menangis suaranya :"+this.suara;
        return menangis;
    }

    public String mata(){
        return "Ketika menangis "+this.suara+ " mata mereka akan mengeluarkan air mata";
    }

    public String mulut(){
        return "Ketika menangis "+this.suara+" maka mulut mereka akan cemberut";
    }
}

