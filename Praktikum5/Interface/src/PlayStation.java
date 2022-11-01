public class PlayStation implements Kendali {
    String jenis;

    public PlayStation(String jenis){
        this.jenis = jenis;
    }
    public void on(){
        System.out.println("PlayStation "+this.jenis+" Dalam keadaan menyala");
    }
    public void off(){
        System.out.println("PlayStation "+this.jenis+" Dalam keadaan");
    }
}
