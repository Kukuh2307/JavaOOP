public class Overriding {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Superman";
        hero2.defencePower = 250;
        hero2.display();
    }
}
