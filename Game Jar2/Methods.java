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
            System.out.println();
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
        Random r = new Random();
        int nonFile = r.nextInt(10000);
        String nonFileS = "" + nonFile;
        System.out.print("\nIf you have an exisiting file you would like to open, please type in the file name.\nOtherwise, Please type in the following numbers: " + nonFile + "\nRemember, universal commands are always available. That is why they are dubbed universal.\nA: ");
        while (!temp_checkpoint) //while you do not give one of the options: yes or no
        {
            response = scan.nextLine();
            if (response.equals(nonFileS)) //no, then start a new game
            {
                temp_checkpoint = true;
                System.out.println("Generating new game..." + "\n" +" \n" + "\n" + "\n" + "\n" + "\n" + "\n");
                setup(hero);
            }
            else
            {
                boolean validFile = Serialize.loadAccount(response, hero);
                if (validFile)
                {
                    System.out.println("File Verified. Teleporting to TS (Town Square).\n<press any key to continue>");
                    scan.nextLine();
                    System.out.println();
                }
                else
                {
                    System.out.print("File Denied. Please try again. Remember to start a new game, type in " + nonFile + "\nA: ");
                }
            }
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
            System.out.print("A: ");
            String action = scan.nextLine();
            loop = Methods.pointDistribute(action, hero);
        }
        System.out.println("You, " + hero.getName() + ", now have  " + hero.getMaxHP() + " hp, " + hero.getMaxHeal() + " max heal, " + hero.getStrength() + " strength, "
            + hero.getAgility() + " agility, " + hero.getDefence() + " defence." + "\n");            
        System.out.println("\n" + "Congratulations, you have leveled up!" + "\n");
        MC.levelUp(hero);
        System.out.println("As you progress with quests and battles, you will earn enough experience to 'level up' and become stronger.\n<press any key to continue>");
        scan.nextLine();
        System.out.println("Teleporting to town square...\n\nThere may be extra spaces for Java's line eating fault\nIf this happens, retype your action again.\n\nPlease refer to the manuals if you have any confusions before emailing questions." + "\n" + "\n<press any key to continue>");
        scan.nextLine();
    }
}
