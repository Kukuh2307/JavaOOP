package example;
public class MyApp {
    String name = "Mark";
    int nilai[] = {100,0};

    void getNilai(){
        System.out.println("Nilai rata-rata : "+(nilai[1]+nilai[2]/2));
    }
    public static void main(String[] args) {
        try{
            MyApp app1 = new MyApp();
            System.out.println(app1.name);
            app1.getNilai();
            MyApp app2;
        }
        catch(ArithmeticException obj){
            System.out.println("Error, Ada pembagian dengan 0");
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Error, Ada pengakses array di luar batas");
        }
        finally{
            System.out.println("Finally here");
        }
    }
}

