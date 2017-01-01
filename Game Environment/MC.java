import java.util.*;
import java.util.Random;
/**
 * Mc is the main character. It is you hero. It has the most complicated parameters because the main character
 * is unique in many ways.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MC extends Character
{
    int questNumber = 0;
    int level = 1;
    int max_hp = 10;
    int min_heal = 0;
    int max_heal = 0;
    int ppoints = 5;
    int totalMoney = 0;
    double totalExperience = 0;
    double totalCurrentExperience = 0;
    
    Item armor = new Item ("Clothes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "basic armor");
    
    /**
     * Constructor class
     */
    public MC (String name, int questNumber, double experience, int current_hp, int agility, int defence, int strength, int money, Item weapon, Item armor, int level, int max_hp, int min_heal, int max_heal, int ppoints, double totalExperience, double totalCurrentExperience, int totalMoney)
    {
        super(name,experience,current_hp,agility,defence,strength,money,weapon);
        this.questNumber = questNumber;
        this.armor = armor;
        this.level = level;
        this.max_hp = max_hp;
        this.ppoints = ppoints;
        this.min_heal = min_heal;
        this.max_heal = max_heal;
        this.totalExperience = totalExperience;
        this.totalMoney = totalMoney;
    }
   
    /**
     * The method to level up the hero. 
     * Precondition: hero must be valid and everything must be defined;
     */
    public static void levelUp(MC hero)
    {
        hero.setLevel();
        hero.setMaxHP(hero.getMaxHP() + Conversion.upMaxHP(hero));
        hero.setCurrentHP(hero.getMaxHP());
        hero.setPoints(hero.getPoints()+5);
        hero.setAgility(hero.getAgility() + 1);
        hero.setDefence(hero.getDefence()+ 1);
        hero.setStrength(hero.getStrength() + 1);
        hero.setExperience(0);
    }
    
    public void setArmor(Item x) //set armor of character
    {
        armor = x;
    }
    
    public Item getArmor() //gets the armor of character
    {
        return armor;
    }
    
    public int getQuestNumber() //gets questNumber of the character
    {
        return questNumber;
    }
    
    public void setQuestNumber(int x) //sets the questNumber of the character
    {
        questNumber = x;
    }

    public int getLevel() //gets the level of the character
    {
        return level;
    }
    
    public void setLevel() //sets the level of the character
    {
        level++;
    }
    
    public void setLevel0() //resets level to 0 for the character
    {
        level = 0;
    }
    
    public int getMaxHP() //get the max health of the character
    {
        return max_hp;
    }
    
    public void setMaxHP(int x) //sets the max health of the character
    {
        max_hp = x;
    }
    
    public int getPoints() //gets the points of the character
    {
        return ppoints;
    }
    
    public void setPoints(int x) //sets the points of the character
    {
        ppoints = x;
    }
    
    public int getMinHeal() //gets the minimum health of character
    {
        return min_heal;
    }
    
    public void setMinHeal(int x) //sets minimum health of character
    {
        min_heal = x;
    }
    
    public int getMaxHeal() //gets max health of character
    {
        return max_heal;
    }
    
    public void setMaxHeal(int x) //sets max health of character
    {
        max_heal = x;
    }
    
    public int getTotalMoney() //gest the total amount of money gained by character
    {
        return totalMoney;
    }
    
    public void setTotalMoney(int x) //set the total amount of money gained by character
    {
        totalMoney = x;
    }
    
    public double getTotalExperience() //get the total experience that the character has earned
    {
        return totalExperience;
    }
    
    public void setTotalExperience(double x) //sets the total experience the character earned
    {
        totalExperience = x;
    }
    
    public double getTotalCurrentExperience() //sets the total experience character including deductions
    {
        return totalCurrentExperience;
    }
    
    public void setTotalCurrentExperience(double x) //sets the total experience character earns includeing deductions
    {
        totalCurrentExperience = x;
    }
    
    /**
     * The heal amount method. It takes a random integer using your max - your min + your min
     * to get a heal amount ranging from your min_heal to your max_heal
     */
    public static int healAmount(int max_heal, int min_heal)
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
        int amount = n.nextInt( (int)(0.7*strength + 0.5*agility) + 1 ); //imbalanced, 1.2 / 1.0 total
        int pass = n.nextInt(strength * 2 - agility);
        if (agility > pass)
        {
            return amount;
        }
        else
        {
            return 0;
        }
    }
}
