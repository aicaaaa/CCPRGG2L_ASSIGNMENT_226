public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Weapon Sword = new Weapon ();

        Sword.name = "Freedom Sworn";
        Sword.damage = 80;
        Sword.rarity = "legendary";

        Sword.AddDamage(5);
        Sword.AddDamage(10);

        Weapon Bow = new Weapon();

        Bow.name = "Jordan's pana";
        Bow.damage = 10;
        Bow.rarity = "legendary";

        System.out.println(Bow.showNameRarity());

        Character Archer = new Character();
        Archer.strength = 7;
        Archer.agility = 5;
        Archer.intelligence = 10;
        Archer.name = "Sage";
        Archer.sayMyName();
        Archer.attack();
        
    }
}
