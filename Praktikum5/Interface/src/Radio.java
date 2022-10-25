public class Radio implements Kendali{
    String merek;
    public Radio(String merek){
        this.merek = merek;
    }
    public void on(){
        System.out.println("Radio "+ this.merek+" dalam keadaan menyala");
    }
    public void off(){
        System.out.println("Radio "+this.merek+" dalam keadaan mati");
    }
}
