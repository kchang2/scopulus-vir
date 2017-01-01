import java.util.*;
/**
 * The regular class is for opponents on a basis, not a challenge because this class
 * is only used for battles to level you up.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regular extends Opponent
{
    int heal = 0;
    int level = 0;
    int tier = 0;
    
    /**
     * Constructor of a regular opponent
     */
    public Regular(String name, double experience, int current_hp, int agility, int defence, int strength, int money, Item weapon, int heal, int level, int tier)
    {
        super(name,experience,current_hp,agility,defence,strength,money,weapon);
        this.heal = heal;
        this.level = level;
        this.tier = tier;
    }
    
    /**
     * This is the standard set heal for the character. It doesnt change or fluxuate because these
     * are regular opponents.
     */
    public int getHeal()
    {
        return heal;
    }
    
    public void setHeal(int x) //sets the heal amount for the opponent
    {
        heal = x;
    }
    
    public int getLevel() //returns level of the opponent
    {
        return level;
    }
    
    public void setLevel(int x) //sets the level of the opponent
    {
        level = x;
    }
    
    public int getTier() //returns the tier of the monster
    {
        return tier;
    }
    
    /**
     * the heal amount doesnt count for this character. It only uses a specific heal amount
     */
    public static int healAmount(int min_heal, int max_heal)
    {
        return 0;
    }

    /**
     * The damage amount method. It computes your damage armound and returns an integer
     * comprising of your damage.
     */
    public static int damageAmount(int strength, int agility)
    {
        Random n = new Random();
        int number = n.nextInt((int)(0.6 *strength + 0.5*agility) + 1); //unbalanced amount, 1.1 / 1.0  in total
        if (n.nextInt(agility+5) <= agility)
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
    public static int decision(Regular creature)
    {
        Random generator = new Random();
        int number = generator.nextInt(10);
        if (number == 6) //defends
        {
            return 2;
        }
        else if (number == 8) //nothing
        {
            return 4;
        }
        else if (number == 9) //heal
        {
            return 3;
        }
        else //attack
        {
            return 1;
        }
    }
}
