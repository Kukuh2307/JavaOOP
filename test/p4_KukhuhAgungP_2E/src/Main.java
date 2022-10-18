public class Main{
    static void object(){
        RectangleToy Rectangle1 = new RectangleToy(10, 20);
        SquareToy square1 = new SquareToy(30);
        printGeomery(Rectangle1);
        printGeomery(square1);
    }    
    static void printGeomery(GeometryToy theG){
        System.out.println("===========================");
        System.out.println("Geomety : "+theG.getGeomeTry());
        System.out.println("Luas Geomerty : "+theG.area());
        System.out.println("Keliling Geometry : "+theG.circumference());
    }
    public static void main(String[] args) {
        object();
    }
}
