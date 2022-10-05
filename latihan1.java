// player
class player {
    String nama;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    // constructor
    player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void tampil(){
        System.out.println("Nama ;" + this.nama);
        System.out.println("Health :" + this.health);
        this.weapon.tampil();
        this.armor.tampil();
    }
}

// senjata
class Weapon {
    double attackPower;
    String namaSenjata;

    // constructor
    Weapon(double attackPower, String namaSenjata) {
        this.attackPower = attackPower;
        this.namaSenjata = namaSenjata;
    }
    void tampil(){
        System.out.println("Weapon :" + this.namaSenjata + ", power :" + this.attackPower);
    }
}

// armor
class Armor {
    double defencePower;
    String namaArmor;

    // constructor
    Armor(double defencePower,String namaArmor){
        this.defencePower = defencePower;
        this.namaArmor = namaArmor;
    }
    void tampil(){
        System.out.println("Armor :" + this.namaArmor + ", defence :" + this.defencePower);
    }
}

public class latihan1{
    public static void main(String[] args) {
        // object player
        player player1 = new player("kukuh",100);

        // object senjata
        Weapon sword = new Weapon(15,"sword");

        // object armor
        Armor bajuBesi = new Armor(10,"cristal");

        // equip weapon dan armor
        player1.equipWeapon(sword);
        player1.equipArmor(bajuBesi);
        player1.tampil();
    }
}