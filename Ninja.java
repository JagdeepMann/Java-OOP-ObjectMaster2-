public class Ninja extends Human {
    public Ninja(){
        this.setHealth(10);
    }

    public void steal(Human opponent){
        // takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
        opponent.health-=health;
        health+=health;
        System.out.println("Ninja gained and opponent lost health");
    }

    public void runAway(){
        //decreases Ninja's health by 10
        health-=10;
        System.out.println("ran away from battle, health minus 10");
    }
}
