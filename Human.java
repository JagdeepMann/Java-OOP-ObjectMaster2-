
public class Human {
    Integer strength = 3;
    Integer stealth = 3;
    Integer intelligence = 3;
    Integer health = 100;

    // constructor

    public Human(){
        this.health =100;
    }

    // getters and setters
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStealth(){
        return stealth;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }


    public void attack(Human opponent){
        opponent.health-=this.strength;
        System.out.println("Health down by 3");
    }

    public int displayHealth(){
        System.out.println("Health is :" + this.health);
        return this.health;
    }
}
