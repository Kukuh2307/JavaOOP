public class RectangleToy extends GeometryToy{
    double weight,height;

    RectangleToy(double weight,double height){
        this.weight = weight;
        this.height = height;
    }
    public String getGeomeTry(){
        return "Persegi panjang";
    }
    public double area(){
        return this.height * this.weight;
    }
    public double circumference(){
        return 2 * (this.height + this.weight);
    }
}
