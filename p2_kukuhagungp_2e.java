class persegipanjang {
    private double panjang;
    private double lebar;
    

    public persegipanjang(){
        panjang = 0;
        lebar =  0;
    }
    private double luas(double p,double l){
        return p*l;
    }
    public void setpanjang(double panjang){
        this.panjang = panjang;
    }
    public void setlebar(double lebar){
        this.lebar = lebar;
    }
    public double getpanjang(){
        return panjang;
    }
    public double lebar(){
        return lebar;
    }
    public double getluas(){
        return luas(panjang,lebar);
    }
}
public class p2_kukuhagungp_2e {
    public static void main(String[] args) {
        persegipanjang balok = new persegipanjang();
        balok.setpanjang(10);
        balok.setlebar(20);
        System.out.println("panjang :" + balok.getpanjang());
        System.out.println("lebar :" + balok.getluas());
        System.out.println("luas :" + balok.getluas());   
       }   
}
