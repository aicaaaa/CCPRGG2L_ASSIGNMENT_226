public class Weapon {
    String name;
    int damage;
    String rarity;


    public void sayMyName() {
        System.out.println("The Weapon is " + name);
    }
    
    public void sayMyDamage() {
        System.out.println("The strength is " + damage);

    }
    public void sayMyRarity() {
        System.out.println("The Rarity is" + rarity);
    }
    public void AddDamage(int AdditionalDamage) {
       int newDamage = damage + AdditionalDamage;
       System.out.println("Damage has been increased from " + this.damage + " to " + newDamage);
       
       this.damage = newDamage;
    }

       String showNameRarity() {
        return this.name + " " + this.rarity;
    }

    }
