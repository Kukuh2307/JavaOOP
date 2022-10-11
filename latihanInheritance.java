class Hero{
    String name;

    // method
    void display(){
        System.out.println("Name : " + this.name);
    }
}
class HeroIntelligent extends Hero{
    // hampa
}
// subclass, child class, derived class
class HeroStrength extends Hero{
    // hampa
}
public class latihanInheritance{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "spiderman";
        hero1.display();
        
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "batman";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "superman";
        hero3.display();
    }
}