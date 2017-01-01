import java.util.*;
/**
 * Write a description of class Conversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conversion
{
    private static ArrayList <Double> experience = setExperience();
    private static ArrayList <Integer> health = setHealth();
    
    /**
     * Sets the experience chart for each level. 
     */
    public static ArrayList setExperience() //sets the experience to level up. Example: to level up to lvl 2:
                                            //you need that much experience.
    {
        ArrayList <Double> experienceTable = new ArrayList <Double>();
        double beginning = 10;
        for (int i=2; i<=30; i++)
        {
            experienceTable.add(10 * Math.pow(1.2,i) - 10 * Math.pow(1.2,(i-1)) );
        }
        for (int i=31; i<150; i++)
        {
            experienceTable.add(10 * Math.pow(1.15,i) - 10 * Math.pow(1.15,(i-1)) );
        }
        for (int i=150; i<300; i++)
        {
            experienceTable.add(10 * Math.pow(1.11,i) - 10 * Math.pow(1.11,(i-1)) );
        }
        for (int i=300; i<1000; i++)
        {
            experienceTable.add(10 * Math.pow(1.10,i) - 10 * Math.pow(1.10, (i-1)) );
        }
        return experienceTable;
    }
    
    /**
     * Sets the health chart in the arraylist. That way you can level.
     */
    public static ArrayList setHealth()
    {
        ArrayList <Integer> healthTable = new ArrayList <Integer>();
        double beginning = 20;
        for (int i=2; i<1000; i++)
        {
            healthTable.add((int)(10 * Math.pow(1.01,i)) );
        }
        return healthTable;
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
