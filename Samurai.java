public class Samurai extends Human{
    public static int numOfSamurai = 0;
    public Samurai(){
        this.setHealth(200);
        numOfSamurai++;
    }

    public void deathBlow(Human opponent){
        //kills the other human, but reduces the Samurai's health by half
        opponent.health=0;
        health-=50;
        System.out.println("killed oppenent but Samurai health decreased by 50");
    }

    public void meditate(){
        //heals the Samurai for half of their current health.
        health = (health/2)+health;
    }

    public static int howMany(){
        // returns the total current number of Samurai.
        return numOfSamurai;
    }
}
