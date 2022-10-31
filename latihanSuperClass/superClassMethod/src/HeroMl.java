public class HeroMl {
    String nama;
    int health,jumlahSkill;
    public String name;

    HeroMl(String name,int health,int skill){
       nama = name;
       this.health = health;
       jumlahSkill = skill; 
    }
    HeroMl(String name){
        nama = name;
    }

    void display(){
        System.out.println("nama hero : "+nama);
        System.out.println("Health : "+this.health);
        System.out.println("Jumlah skill : "+jumlahSkill+" \n");
    }
    void displayName(){
        System.out.println("Nama hero : "+nama);
    }
}
