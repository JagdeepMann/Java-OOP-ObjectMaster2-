

public class HumanTest {
    public static void main(String[] args) {
        
        Human h = new Human();
        Wizard w = new Wizard();
        Ninja n = new Ninja();
        Samurai s = new Samurai();
        Samurai s2 = new Samurai();
        Samurai s3 = new Samurai();
        Samurai s4 = new Samurai();
        Samurai s5 = new Samurai();

        // w.heal(h);
        // h2.attack(h);
        // n.runAway();
        // n.steal(h);
        // n.steal(h);
        // s.displayHealth();
        // h.displayHealth();
        // s.deathBlow(h);

        // s.displayHealth();
        // h.displayHealth();
        s.displayHealth();
        s.meditate();
        s.displayHealth();
        System.out.println(Samurai.howMany());

    }
}
