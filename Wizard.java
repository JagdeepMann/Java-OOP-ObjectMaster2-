public class Wizard extends Human{
    public Wizard(){
        this.setHealth(50);
        this.setIntelligence(8);
    }

    public void heal(Human opponent){
        //heals the other human by the wizard's intelligence
        opponent.health+=this.intelligence;        
        System.out.println("healed by Wizard");
    }

    public void fireball(Human opponent){
        //decreases the other human's health by the wizard's intelligence * 3
        opponent.health-=this.intelligence*3;
        System.out.println("decreased health by Wizard");
    }
}
