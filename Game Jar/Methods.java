import java.util.*;
import java.lang.*;
import java.lang.Object;

/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Methods
{
    /**
     * This method takes in the players resonse and sorts it as yes, no, or other answers
     */
    public static int simpleAction(String str)
    {
        if (str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("Yes")) //your actions are yes
        {
            return 1;
        }
        else if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("No")) // your actions are no
        {
            return 0;
        }
        else
        {
            return 2;
        }
    }

    /**
     * This method takes the user's input and checks if they want to play, pause, or quit depending on their
     * string. It is used in the beginning of the game and in the middle only for the pause and quit methods
     * They return an int signaling different actions.
     */
    public static int complexAction(String str)
    {
        if (str.equalsIgnoreCase("Play") || str.equalsIgnoreCase("Start") || str.equalsIgnoreCase("Begin"))
        {
            return 1;
        }
        else if (str.equalsIgnoreCase("Pause"))
        {
            return 2;
        }
        else if (str.equalsIgnoreCase("QUIT"))
        {
            return 3;
        }
        else
        { return 0;}    
    }
    
    /**
     * This method is for combat. It checks to see if the player wishes to attack, run, heal, or stand there
     * and do nothing. It also returns ints to lock into different methods.
     * 
     * Precondition: There must be something that is inputed
     */
    public static int returnAction(String str)
    {
        if (str.equalsIgnoreCase("Attack") || str.equalsIgnoreCase("A"))
        {
            return 1;
        }
        else if (str.equalsIgnoreCase("Run") || str.equalsIgnoreCase("Relinquish") || str.equalsIgnoreCase("R"))
        {
            return 2;
        }
        else if (str.equalsIgnoreCase("Heal") || str.equalsIgnoreCase("H"))
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * This method distributes the points used in the beginning or middle of the game.
     * In the beginning, it takes the hero and their response. It then checks to see
     * if the string is equal to any part of its profile (health, strength, yada yada)
     * It checks to see if you enough points to do the action and if true, then it does it
     * else, then it just returns too much (string) and returns false;
     */
    public static boolean pointDistribute(String str, MC hero) 
    {
        Scanner scan = new Scanner (System.in);        
        if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("None") || str.equalsIgnoreCase("Done"))
        {
            return false; //if hero doesn't want to use points, he can just say none and method returns false to end
        }
        else if (str.equalsIgnoreCase("H") || str.equalsIgnoreCase("Health"))
        {
            System.out.print("Points to add on to health: ");
            int i = scan.nextInt();
            if (i <= hero.getPoints()) //if their points is greater or equal to how much they want to use
            {
                hero.setMaxHP(10*i + hero.getMaxHP()); //if so then the computer performs the action
                hero.setCurrentHP(hero.getMaxHP());
                hero.setPoints(hero.getPoints()-i);
            }
            else
            {System.out.println("Error. Limit to points." + "\n");} //if not return that they have too little points
        }
        else if (str.equalsIgnoreCase("HL") || str.equalsIgnoreCase("Heal"))
        {
            System.out.print("Points to add on to raise heal: ");
            int i = scan.nextInt();
            if (i <= hero.getPoints()) //if their points is greater or equal to how much they want to use
            {
                hero.setMaxHeal(i + hero.getMaxHeal()); //if so then the computer performs the action
                hero.setMinHeal(i + hero.getMinHeal());
                hero.setPoints(hero.getPoints()-i);
            }
            else
            {System.out.println("Error. Limit to points." + "\n");} //if not return that they have too little points
        }
        else if (str.equalsIgnoreCase("s") || str.equalsIgnoreCase("strength")) //same as health but with strength
        {
            System.out.print("Points to add on to strength: ");
            int i = scan.nextInt();
            if (i <= hero.getPoints())
            {
                hero.setStrength(hero.getStrength() + i);
                hero.setPoints(hero.getPoints()-i);
            }
            else
            {System.out.println("Error. Limit to points." + "\n");}         
        }
        else if (str.equalsIgnoreCase("a") || str.equalsIgnoreCase("agility"))
        {
            System.out.print("Points to add on to agility: ");
            int i = scan.nextInt();
            if (i <= hero.getPoints())
            {
                hero.setAgility(hero.getAgility() + i);
                hero.setPoints(hero.getPoints()-i);
            }
            else
            {System.out.println("Error. Limit to points." + "\n");}          
        }
        else if (str.equalsIgnoreCase("d") || str.equalsIgnoreCase("defence"))
        {
            System.out.print("Points to add on to defence: ");
            int i = scan.nextInt();
            if (i <= hero.getPoints())
            {
                hero.setDefence(hero.getDefence() + i);
                hero.setPoints(hero.getPoints()-i);
            }
            else
            {System.out.println("Error. Limit to points." + "\n");}
        }
        else {return false;}
        if (hero.getPoints() == 0) //checks if they have 0 points, no more to use.
        {
            return false; //returns false if true
        }
        else
        {return true;} //else returns that they can use points again.
    }
    
    /**
     * This method is used during the town square when you get to pick places to go to, such as the shop,
     * the arena, the resting area, the casion, or checking your account.
     * All other inputs will be returned as an int which will signal command error.
     * Precondition: There must be something that is inputed
     */
    public static int actions(String str)
    {
        if (str.equalsIgnoreCase("Shop") || str.equalsIgnoreCase("S"))
        {
            return 0;
        }
        else if (str.equalsIgnoreCase("Fight") || str.equalsIgnoreCase("F"))
        {
            return 1;
        }
        else if (str.equalsIgnoreCase("Rest") || str.equalsIgnoreCase("R"))
        {
            return 2;
        }
        else if (str.equalsIgnoreCase("Gamble") || str.equalsIgnoreCase("G"))
        {
            return 3;
        }
        else if (str.equalsIgnoreCase("Account") || str.equalsIgnoreCase("A"))
        {
            return 4;
        }
        else if (str.equalsIgnoreCase("Museum") || str.equalsIgnoreCase("M"))
        {
            return 5;
        }
        else if (str.equalsIgnoreCase("Quest") || str.equalsIgnoreCase("Q"))
        {
            return 6;
        }
        else if (str.equalsIgnoreCase("SumbitScore") || str.equalsIgnoreCase("submit") || str.equalsIgnoreCase("submit score") || str.equalsIgnoreCase("SS")) 
        {
            return 7;
        }
        else 
        {
            return 8;
        }
    }

    /**
     * Chccks to see if the person wishes to go to Armor shop or Weapon's shop or Quest Item Shop
     *
     *Precondition: There must be something that is inputed
     */
    public static int equipmentAction(String str)
    {
        if (str.equalsIgnoreCase("A") || str.equalsIgnoreCase("Armor"))
        {
            return 1;
        }
        else 
        {
            return 2;
        }
    }

    /**
     * This method will do the saving for accounts, moving your current hero into a backup hero.
     * It takes in all possible heros to save and the current hero you are playing with.
     * 
     * Precondition: There must be something that is inputed
     */
    public static void saveAccount(MC x, MC y, MC z)
    {
        Scanner scan = new Scanner (System.in);        
        int i=0;
        System.out.print("The accounts stored are: " + "\n\n");
        System.out.println("Hero: " + x.getName() + "   Level: " + x.getLevel());
        System.out.println("Hero: " + y.getName() + "   Level: " + y.getLevel());
        System.out.print("Which hero would you like to override? (1 / 2)" + "\n" + "Response: ");
        int response = scan.nextInt();
        if (response == 1) //if you want to save on account 1, it does that for you
        {
            x.setName(z.getName());
            x.setQuestNumber(z.getQuestNumber());
            x.setExperience(z.getExperience());
            x.setCurrentHP(z.getCurrentHP());
            x.setAgility(z.getAgility());
            x.setDefence(z.getDefence());
            x.setStrength(z.getStrength());
            x.setMoney(z.getMoney());
            x.setWeapon(z.getWeapon());
            x.setArmor(z.getArmor());
            x.setMaxHP(z.getMaxHP());
            x.setMinHeal(z.getMinHeal());
            x.setMaxHeal(z.getMaxHeal());
            x.setPoints(z.getPoints());
            x.setTotalExperience(z.getTotalExperience());
            x.setTotalCurrentExperience(z.getTotalCurrentExperience());
            x.setTotalMoney(z.getTotalMoney());
            x.setLevel0();
            for (i=x.getLevel(); i<z.getLevel(); i++) //to set the right level since setLevel() is only  ++;
            {
                x.setLevel();
            }
        }
        else    //for account 2
        { 
            y.setName(z.getName());
            y.setQuestNumber(z.getQuestNumber());
            y.setExperience(z.getExperience());
            y.setCurrentHP(z.getCurrentHP());
            y.setAgility(z.getAgility());
            y.setDefence(z.getDefence());
            y.setStrength(z.getStrength());
            y.setMoney(z.getMoney());
            y.setWeapon(z.getWeapon());
            y.setArmor(z.getArmor());
            y.setMaxHP(z.getMaxHP());
            y.setMinHeal(z.getMinHeal());
            y.setMaxHeal(z.getMaxHeal());
            y.setPoints(z.getPoints());
            y.setTotalExperience(z.getTotalExperience());
            y.setTotalCurrentExperience(z.getTotalCurrentExperience());
            y.setTotalMoney(z.getTotalMoney());
            y.setLevel0();
            for (i=y.getLevel(); i<z.getLevel(); i++) 
            {
                y.setLevel();
            }
        }
    }
    
    /**
     * This method does the get accounts. Takes a recently backed up account
     * and then resurfaces it as your current account to use.
     * Returns the account you are going to use.
     * 
     * Precondition: There must be a hero with statistics in x or y
     */
    public static MC getAccounts(MC x, MC y, MC z)
    {
        Scanner scan = new Scanner (System.in);        
        int i=0;
        System.out.print("The accounts stored are: ");
        if (x.getLevel() != 0) //checks to see if there are any data in first slot
        {
            System.out.println("Hero: " + x.getName() + "   Level: " + x.getLevel());
            i++;
        }
        if (y.getLevel() != 0) //checks to see if there are any data saved on second slot
        {
            System.out.println("Hero: " + y.getName() + "   Level: " + y.getLevel());
            i++;
        }
        if (i == 2) //if both slots have accounts, it asks which one you want
        {
            System.out.print("Which hero would you like to acquire? (1 / 2)" + "\n" + "Response: ");
            int response = scan.nextInt();
            if (response == 1)
            {return x;}
            else
            {return y;}
        }
        else if (i == 1) //finds the one that you have account on and just revives it
                        //because the reason you are here is to revive an account, no need to ask
        {
            if (x.getLevel() !=0)
            {
                System.out.println("Reviving Hero: " + x.getName() + "   Level: " + x.getLevel() + "\n" + "\n");
                return x;
            }
            else
            {
                System.out.println("Reviving Hero: " + y.getName() + "   Level: " + y.getLevel() + "\n" + "\n");
                return y;
            }
        }
        else //returns same account
        {
            System.out.println("There are no files stored in the game." + "\n" + "\n");
            return z;
        }
    }

    /**
     * Checks to see if you want to erase which accounts
     * 
     * Precondition: Hero must be valid
     */
    public static void eraseAccount(MC x, MC y)
    {
        MC resetHero = new MC ("player", 0, 0, 20, 5, 5, 5, 20, null, null, 1, 20, 1, 5, 5, 0, 20, 0); //this is orignal settings
        if (x.getLevel() != 0 || y.getLevel() != 0)
        {
            System.out.print("Would you like to override your account to create a new one? (Y/N)" + "\n" + "Response:");
            Scanner scan = new Scanner (System.in);
            scan.nextLine();
            String response = scan.nextLine();
            if (response.equals("Y")) //asks if you want to delete
            {
                System.out.println("Account 1: " + "\n" + "Hero: " + x.getName() + "   Level: " + x.getLevel());
                System.out.println("Account 1: " + "\n" + "Hero: " + y.getName() + "   Level: " + y.getLevel());
                System.out.print("What account would you like to delete? (1 / 2 / All)" + "\n" + "Response:");
                response = scan.nextLine();
                if (response.equals("1")) //delete first one
                {
                    x.setName(resetHero.getName()); //makes all of variables same
                    x.setQuestNumber(resetHero.getQuestNumber());
                    x.setExperience(resetHero.getExperience());
                    x.setCurrentHP(resetHero.getCurrentHP());
                    x.setAgility(resetHero.getAgility());
                    x.setDefence(resetHero.getDefence());
                    x.setStrength(resetHero.getStrength());
                    x.setMoney(resetHero.getMoney());
                    x.setWeapon(resetHero.getWeapon());
                    x.setArmor(resetHero.getArmor());
                    x.setMaxHP(resetHero.getMaxHP());
                    x.setMinHeal(resetHero.getMinHeal());
                    x.setMaxHeal(resetHero.getMaxHeal());
                    x.setPoints(resetHero.getPoints());
                    x.setTotalExperience(resetHero.getTotalExperience());
                    x.setTotalCurrentExperience(resetHero.getTotalCurrentExperience());
                    x.setTotalMoney(resetHero.getTotalMoney());
                    x.setLevel0();
                }
                else if (response.equals("2"))//deletes account 2
                {
                    y.setName(resetHero.getName());
                    y.setQuestNumber(resetHero.getQuestNumber());
                    y.setExperience(resetHero.getExperience());
                    y.setCurrentHP(resetHero.getCurrentHP());
                    y.setAgility(resetHero.getAgility());
                    y.setDefence(resetHero.getDefence());
                    y.setStrength(resetHero.getStrength());
                    y.setMoney(resetHero.getMoney());
                    y.setWeapon(resetHero.getWeapon());
                    y.setArmor(resetHero.getArmor());
                    y.setMaxHP(resetHero.getMaxHP());
                    y.setMinHeal(resetHero.getMinHeal());
                    y.setMaxHeal(resetHero.getMaxHeal());
                    y.setPoints(resetHero.getPoints());
                    y.setTotalExperience(resetHero.getTotalExperience());
                    y.setTotalCurrentExperience(resetHero.getTotalCurrentExperience());
                    y.setTotalMoney(resetHero.getTotalMoney());
                    y.setLevel0();
                }
                else if (response.equalsIgnoreCase("All")) //deletes them both;
                {
                    y.setName(resetHero.getName());
                    y.setQuestNumber(resetHero.getQuestNumber());
                    y.setExperience(resetHero.getExperience());
                    y.setCurrentHP(resetHero.getCurrentHP());
                    y.setAgility(resetHero.getAgility());
                    y.setDefence(resetHero.getDefence());
                    y.setStrength(resetHero.getStrength());
                    y.setMoney(resetHero.getMoney());
                    y.setWeapon(resetHero.getWeapon());
                    y.setArmor(resetHero.getArmor());
                    y.setMaxHP(resetHero.getMaxHP());
                    y.setMinHeal(resetHero.getMinHeal());
                    y.setMaxHeal(resetHero.getMaxHeal());
                    y.setPoints(resetHero.getPoints());
                    y.setTotalExperience(resetHero.getTotalExperience());
                    y.setTotalCurrentExperience(resetHero.getTotalCurrentExperience());
                    y.setTotalMoney(resetHero.getTotalMoney());
                    y.setLevel0();
                    
                    x.setName(resetHero.getName());
                    x.setQuestNumber(resetHero.getQuestNumber());
                    x.setExperience(resetHero.getExperience());
                    x.setCurrentHP(resetHero.getCurrentHP());
                    x.setAgility(resetHero.getAgility());
                    x.setDefence(resetHero.getDefence());
                    x.setStrength(resetHero.getStrength());
                    x.setMoney(resetHero.getMoney());
                    x.setWeapon(resetHero.getWeapon());
                    x.setArmor(resetHero.getArmor());
                    x.setMaxHP(resetHero.getMaxHP());
                    x.setMinHeal(resetHero.getMinHeal());
                    x.setMaxHeal(resetHero.getMaxHeal());
                    x.setPoints(resetHero.getPoints());
                    x.setTotalExperience(resetHero.getTotalExperience());
                    x.setTotalCurrentExperience(resetHero.getTotalCurrentExperience());
                    x.setTotalMoney(resetHero.getTotalMoney());
                    x.setLevel0();
                }
                else
                {System.out.println("Error. Unknown command." + "\n" + "\n");} //returns no idea what you are typing
            }
            else
            {return;} //breaks from the erase, ends method
        }
        else//breaks from the erase, ends method
        {return;}
    }
    
        /**
     * starts the game, and then sees if there is account.
     * if there are accounts, then it asks, if not, then not then start new account
     */
    public static boolean beginning(MC hero) //the beginning method
    {
        boolean temp_checkpoint = true;
        String response;
        Scanner scan = new Scanner (System.in);        
        System.out.println("\nWelcome to Scopulus Vir!" + "\n" + "\n" + "\n" + "'Play' to play" + "\n" 
            + "'Pause' to Pause" + "\n" + "'Quit' to Quit" + "\n" + "\n" + "Input: "); // original line, hello lets play
        while (temp_checkpoint) //while you do not type in the one of the given three options
        {
            response = scan.nextLine();
            if (Methods.complexAction(response) == 1) //yes, so checkpoint one becomes false, so it can play
            {
                temp_checkpoint = false;
            }
            else if (Methods.complexAction(response) == 2) //pause means quits
            {
                System.out.println("Game paused. <press any key to continue>");
                scan.nextLine();
            }
            else if (Methods.complexAction(response) == 3) //quits means quits
            {
                return false;
            }
            else if (Methods.complexAction(response) == 0) //you did not type in any of the given commands, therefore it returns an error
            {
                System.out.println("Error: Unknown command." + "\n");
            }
        }
        if (hero.getLevel() != 0) //sees if you have any accounts already stored in these file savers
        {
            System.out.print("\n" + "Would you like to continue where you left off?" + "\n" + "Response: ");
            response = scan.nextLine();
            while (!temp_checkpoint) //while you do not give one of the options: yes or no
            {
                if (Methods.simpleAction(response) == 1) //yes, then continue last where left off
                {
                    temp_checkpoint = true;
                }
                else if (Methods.simpleAction(response) == 0) //no restarts at level 1
                {
                    temp_checkpoint = true;
                    setup(hero);
                }
                else //does not know the command
                {
                    System.out.print("Error: Unknown command." + "\n" +  "Would you like to continue where you left off?" + "\n" + "Response: ");
                    response = scan.nextLine();
                }
            }
        }
        else //a new game, generates a new game.
        {
            System.out.println("Generating new game..." + "\n" +" \n" + "\n" + "\n" + "\n" + "\n" + "\n");
            setup(hero); //this is the setup method, where it sets you up for a new player
        }
        return true;
    }

    /**
     * Setting up new accounts if there are no accounts or if you want to
     * This sets up a new account which you can save to one of the two given slots.
     */
    public static void setup(MC hero) 
    {   
        Scanner scan = new Scanner (System.in);   
        String response;
        StoryLine.history();
        boolean nameLoop = false;
        while (!nameLoop) //while you do not choose or like the name you picked.
        {
            System.out.print("I see you are the chosen one. I am fate, the decider." + "\n" + "What is your name?" + "\n" + "\n"
                + "Name: ");
            hero.setName(scan.nextLine());
            System.out.println("Confirming " + hero.getName() + " as your name (Y / N)?");
            response = scan.nextLine();
            nameLoop = (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes"));
        }
        System.out.println("\n" + "\n" +"My " + hero.getName() + ", your current attributes are - Health: " + hero.getMaxHP() + "   Strength: " + hero.getMaxHeal() + "   Strength: " + hero.getStrength() + "    Agility: "
            + hero.getAgility() + "  Defence: "+ hero.getDefence() + "\n\n<press any key to continue>");
        scan.nextLine();
        System.out.println("\n" + "Right now you have " + hero.getPoints() + " power-points in storage. You may add them to any of your stats. \n\n"
            + "Type in these options [health (h), heal (hl), strength (s), agility (a), defence (d), or None(N)]" + 
            "\n" + "The increase is as follows [health (+10), heal(+1), strength (+1), agility (+1), defence (+1), None(saves points)]" +
            "\n" + "When you are complete, please type in done" + 
            "\n" + "Please choose wisely because you are unable to reset." + "\n" + "\n" + "\n<press any key to continue>");
        scan.nextLine();
        boolean loop = true;
        while (loop) //while you still have points or want to use your points
        {
            System.out.print("Action: ");
            String action = scan.nextLine();
            loop = Methods.pointDistribute(action, hero);
        }
        System.out.println("You, " + hero.getName() + ", now have  " + hero.getMaxHP() + " hp, " + hero.getMaxHeal() + " max heal, " + hero.getStrength() + " strength, "
            + hero.getAgility() + " agility, " + hero.getDefence() + " defence." + "\n");            
        System.out.println("\n" + "Congratulations, you have leveled up!" + "\n");
        MC.levelUp(hero);
        System.out.println("As you progress with quests and battles, you will earn enough experience to 'level up' and become stronger.\n<press any key to continue>");
        scan.nextLine();
        System.out.println("Teleporting to town square...\n**Note: This is the limited edition, the LITE version. You cannot save and have multiple accounts per game. \nIf you want the full version, it is only accessible on BlueJ and Eclipse, which you can download both the game and the IDE online. \n\n\nAlso, there may be extra spaces for Java's line eating fault\nIf this happens, retype your action again.\n\nPlease refer to the manuals if you have any confusions before emailing questions." + "\n" + "\n<press any key to continue>");
        scan.nextLine();
    }
}
