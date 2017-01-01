import java.util.*;
/**
 * Champion is currently DISABLED . We are working hard to patch this in a later update.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Champion extends Opponent
{
    int max_hp = 10;
    static Armor a = new Armor ("Clothes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    int min_heal = 0;
    int max_heal = 0;
    
    /**
     * The constructor for the champion
     */
    public Champion(String name, double experience, int current_hp, int agility, int defence, int strength, int money, Weapon w, Armor a, int max_hp,  int min_heal, int max_heal)
    {
        super(name,experience,current_hp,agility,defence,strength,money,w);
        this.a = a;
        this.max_hp = max_hp;
        this.min_heal = min_heal;
        this.max_heal = max_heal;
    }
    
    public Item getArmor() //gets armor of character
    {
        return a;
    }
    
    public void setArmor(Armor x) //sets armor of character
    {
        a = x;
    }
    
    public int getMaxHP() //gets max health of character
    {
        return max_hp;
    }
    
    public void setMaxHP(int x) //sets max health of character
    {
        max_hp = x;
    }
    
    public int getMinHeal() //gets minimum heal of character
    {
        return min_heal;
    }
    
    public void setMinHeal(int x) //sets minimum healing of character
    {
        min_heal = x;
    }
    
    public int getMaxHeal() //gets most heal character can get
    { 
        return max_heal;
    }
    
    public void setMaxHeal(int x) //sets most heal character can recieve
    {
        max_heal = x;
    }
    
    /**
     * The heal amount method. It takes a random integer using your max - your min + your min
     * to get a heal amount ranging from your min_heal to your max_heal
     */
    public static int getHealAmount(int max_heal, int min_heal)
    {
        Random n = new Random();
        int i = n.nextInt( max_heal - min_heal + 1 ) + min_heal;
        return i;
    }

    /**
     * The damage amount method. It computes your damage amount and returns an integer
     * comprising of your damage.
     */
    public static int damageAmount(int strength, int agility)
    {
        Random n = new Random();
        int number = n.nextInt((int)(0.8 *strength + 0.7*agility) + 1); //unbalanced amount, 1.1 / 1.0  in total
        if (n.nextInt(agility+10) <= agility)
        {
            return number;
        }
        else
        {
            return 0;
        }     
    } 
    
    /**
     * This is the decision maker. This randomly decides if the creature will attack, defend, do nothing, or heal.
     */
    public static int decision(Champion creature)
    {
        Random generator = new Random();
        int number = generator.nextInt(20);
        if (number > 15) //defends
        {
            return 2;
        }
        else if (number <=15 && number > 11) //nothing
        {
            return 4;
        }
        else if (number <=11 && number >=7) //heal
        {
            return 3;
        }
        else //attack
        {
            return 1;
        }
    }
}
