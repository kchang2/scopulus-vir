import java.util.*;
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conversion
{
    public static ArrayList <Double> experience = new ArrayList <Double> ();
    public static ArrayList <Integer> health = new ArrayList <Integer> ();
    
    /**
     * Sets the experience chart for each level. 
     */
    public static void setExperience(ArrayList <Double> e) //sets the experience to level up. Example: to level up to lvl 2:
                                            //you need that much experience.
    {
        double beginning = 10;
        for (int i=2; i<=30; i++)
        {
            e.add(10 * Math.pow(1.2,i) - 10 * Math.pow(1.2,(i-1)) );
        }
        for (int i=31; i<150; i++)
        {
            e.add(10 * Math.pow(1.15,i) - 10 * Math.pow(1.15,(i-1)) );
        }
        for (int i=150; i<300; i++)
        {
            e.add(10 * Math.pow(1.11,i) - 10 * Math.pow(1.11,(i-1)) );
        }
        for (int i=300; i<1000; i++)
        {
            e.add(10 * Math.pow(1.10,i) - 10 * Math.pow(1.10, (i-1)) );
        }
    }
    
    /**
     * Sets the health chart in the arraylist. That way you can level.
     */
    public static void setHealth(ArrayList <Integer> h)
    {
        double beginning = 20;
        for (int i=2; i<1000; i++)
        {
            h.add((int)(10 * Math.pow(1.01,i)) );
        }
    }

    /**
     * Checks if the your experience is enough to level up.
     */
    public static void levelCheck(MC hero)
    {
        Scanner scan = new Scanner (System.in);
        while (hero.getExperience() > experience.get(hero.getLevel()+1) ) //must be level+1 because to get to level 2,
                                                                        //and you are currently on level 1, so add 1
                                                                        //to get to desired level.
        {
            System.out.println("\nYou leveled up!");
            double remainExp = hero.getExperience() - experience.get(hero.getLevel()+1);
            hero.levelUp(hero);
            hero.setExperience(remainExp);
            System.out.println("\n<press any key to continue>");
            scan.nextLine();
        }
    }
    
    /**
     * Method returns amount of hp the player gets
     */
    public static int upMaxHP(MC hero)
    {
        return health.get(hero.getLevel() + 1);
    }
    
    /**
     * Calculates your score based on your current statistics.
     */
    public static double calculateScore(MC hero)
    {
        double totalScore = 0;
        totalScore += (1/hero.getLevel()) * 100;
        totalScore += 1.1 * (hero.getMaxHP() + hero.getMaxHeal());
        totalScore += hero.getTotalCurrentExperience();
        totalScore += (hero.getTotalMoney() / 2);
        totalScore += hero.getStrength() + hero.getAgility() + hero.getDefence();
        return totalScore;
    }
}
