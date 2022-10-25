public class Doraemon extends Hewan implements Manusia{
    public Doraemon(){
        super("Doraemon",2);
    }
    // override dengan kelas induk hewan
    public void bersuara(){
        System.out.println("Hallo Doraemon.....");
    }
    public void bernyanyi(){
        System.out.println("la la la la lalalala....");
    }
    public void tertawa(){
        System.out.println("hehehe...heheheh");
    }

    // override dengan kelas induk hewan
    public void makan(){
        System.out.println("hmmm,Kue doriyaki");
    }
    public void makan2(){
        System.out.println("\ndiambil dari kelas induk Hewan");
        super.makan();
    }
}
