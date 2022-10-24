public class SquareToy extends GeometryToy {
    double side;

    SquareToy(double side){
        this.side = side;
    }
    
    public String getGeomeTry(){
        return "Persegi";
    }

    public double area(){
        return this.side * this.side;
    }

    public double circumference(){
        return 4 * this.side;
    }
}
