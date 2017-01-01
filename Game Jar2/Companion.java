import java.util.*;
import java.util.Random;
/**
 * Companion is currently DISABLED . We are working hard to patch this in a later update.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//public class Companion extends Character
//{
   // int max_hp = 20;                                                                                                                                                                                                                                                                                
    //int min_heal = 0;
    //int max_heal = 0;
   // int level = 1;
    /**public Companion (String name, double experience, int current_hp, int agility, int defence, int strength, int money, Item weapon, int level, int max_hp, int min_heal, int max_heal)
    {
        super(name,experience,current_hp,agility,defence,strength,money,weapon);
        this.max_hp = max_hp;
        this.min_heal = min_heal;
        this.max_heal = max_heal;
        this.level = level;
    }   
        
    public int getLevel() //gets level of character
    {
        return level;
    }
    
    public void setLevel() //sets level of character
    {
        level++;
    }
    
    public int getMaxHP() //gets max health of character
    {
        return max_hp;
    }
    
    public void setMaxHP(int x) //sets max health of character
    {
        max_hp = x;
    }**/

    /**
     * The heal amount method. It takes a random integer using your max - your min + your min
     * to get a heal amount ranging from your min_heal to your max_heal
     */
    /**public static int healAmount(int max_heal, int min_heal)
    {
        Random n = new Random();
        int i = n.nextInt(max_heal) + min_heal;
        return i;
    }**/

    /**
     * The damage amount method. It computes your damage amount and returns an integer
     * comprising of your damage.
     */
    /**public static int damageAmount(int strength, int agility)
    {
        Random n = new Random();
        int i = (int)(n.nextDouble()*100);
        if (i < agility)
        {
            int j = (int)(n.nextDouble()*100) + 5;
            if (j <= strength)
            {
                i+=1;
                int z = (int)(n.nextDouble()*100) + 10;
                if (z <= agility)
                {
                    i+=2;
                    int x = (int)(n.nextDouble()*100) + 15;
                    if (x <= strength && x < agility)
                    {
                        //do second attack
                    }
                    else if (x <= strength - 1)
                    {
                        i+=5;
                    }
                }
            }
        }
        return i;
    }**/    
//}
