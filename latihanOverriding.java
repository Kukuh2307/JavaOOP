class Hero {
    String name;
    int defencePower;

    void display(){
        System.out.println("hero name: " + this.name);
    }
}

class HeroStrength extends Hero{
    HeroStrength(int defencePower,String name){
        this.defencePower = defencePower;
        this.name = name;

    }
    // overriding methods
    // public void display(){
    //     System.out.println("\nHero Strength");
    //     System.out.println("Hero Name : " + this.name);
    //     System.out.println("Defence Power : " + this.defencePower);
    // }
}


public class latihanOverriding {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        // hero1.defencePower = gak punya;
        hero1.display();

        HeroStrength hero2 = new HeroStrength(10,"Mountain Lady");
        hero2.display();
    }
}
