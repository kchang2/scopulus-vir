import java.util.*;
/**
 * The game class is where all the magic happens. Every method comes together in the game class.
 * This is an awesome experience.
 * 
 * @author (Chang) 
 * @version (V.1.0.2)
 */
public class Game
{    
    static Scanner scan = new Scanner (System.in);        
    static boolean main_checkpoint = true;
    static boolean inner_checkpoint = true;
    static String response;
    static int dm1 = 0;
    static int dm2 = 0; //decision makers
    /**
     * name, stage, experience, current_hp, agility, defence, strength, money, weapon, armor
     * level, max_hp, min_heal, max_heal, ppoints, totalexperience, totalcurrentexperience,totalmoney
     **/ 
    static MC hero = new MC ("player", 0, 0, 100, 10, 10, 10, 100, Item.fist, Item.clothes, 0, 100, 1, 10, 5, 0, 0, 20); //account current

    static ArrayList <Task> taskList = new ArrayList <Task> ();
    static ArrayList <Puzzle> puzzleList = new ArrayList <Puzzle> ();
    
    /**
     * Combines all the methods together in a fantastic game
     * This game encorporates all the methods from beginning to end.
     */
    public static void main (String args []) //the main method
    {
        Conversion.setExperience(Conversion.experience);
        Conversion.setHealth(Conversion.health);
        Task.addTasks(hero, taskList);
        Puzzle.addPuzzles(hero, puzzleList);
        main_checkpoint = true; //your main checkpoint
        while (main_checkpoint) //this keeps the whole game running
        {
            inner_checkpoint = Methods.beginning(hero); //this is the beginning method, asks you if you wish to play.
            while (inner_checkpoint) //loop for from town center to actions
            {
                System.out.println("\n\n"+ "\n" + "\n" + "\n" + "\n");
                Stages.town_center(); 
                response = scan.nextLine();
                dm1 = Methods.actions(response);
                if (dm1 == 0) //to shop
                {
                    System.out.println("Arriving at shop..." + "\n<press any key to continue>");
                    scan.nextLine();
                    System.out.print("Weapons (W) or Armor (A) ?" + "\n" + "Action: ");
                    response = scan.nextLine();
                    if (Methods.equipmentAction(response) == 1) //to the armor shop
                    {
                        System.out.println("Walking to Panople's Coats of Arms..." + "\n<press any key to continue>");
                        scan.nextLine();
                        Stages.defenceShop(hero);
                    }
                    else //to the weapon shop
                    {
                        System.out.println("Walking to Arsenus's Shack of Hurts..." + "\n<press any key to continue>");
                        scan.nextLine();
                        Stages.weaponShop(hero);
                    }
                }
                else if (dm1 == 1) //to the colloseum
                {
                    System.out.println("Arriving at Arena..." + "\n<press any key to continue>");
                    scan.nextLine();
                    Stages.arena(hero);                        
                }
                else if (dm1 == 2) //Inn
                {
                    System.out.println("Arriving at Inn..." + "\n<press any key to continue>");
                    scan.nextLine();
                    if (hero.getMoney() >= 15) //checks if you have enough money
                    {
                        System.out.print("Would you like to stay, recover full health for 15 coins? (Y/N)" + "\n" + "Action: ");
                        response = scan.nextLine();
                        if (Methods.simpleAction(response) == 1) //asks if you want to stay, if you say yes, then you stay
                        {
                            System.out.println("You rest for the night." + "\n");
                            hero.setCurrentHP(hero.getMaxHP());
                            hero.setMoney(hero.getMoney() - 15);
                        }
                        else //you don't want to stay
                        {
                            System.out.println("You leave the inn." + "\n<press any key to continue>");
                            scan.nextLine();
                            System.out.println("\n\n");
                        }
                    }
                    else //some reason that you failed to pass the test. Mainly because you do not have enough money.
                    {
                        System.out.println("The innkeeper caught you causing trouble. He kicks you out.     "
                        + "(you have not enough money)" + "\n<press any key to continue>");
                        scan.nextLine();
                    }
                }
                else if (dm1 == 3) //Casino
                {
                    System.out.println("Arriving at Dealer's Den..." + "\n<press any key to continue>");
                    scan.nextLine();
                    System.out.print("Would you like to play Coin Toss and Number Guessing? (Y/N)" + "\n" + "Action: ");
                    response = scan.nextLine();
                    if (Methods.simpleAction(response) == 1) //asks if youw ant to play the coin toss.
                    {
                        Stages.casino(hero);
                    }
                    else if (Methods.simpleAction(response) == 2) //if you do not then prints out this.
                    {
                        System.out.println("You decided that gambling is not the best for your growing status." + "\n<press any key to continue>");
                        scan.nextLine();
                    }
                    else //you did not press either Yes or No, so we made the situation that you are too drunk, so as any person would, they would kick you from harming anyone
                    {
                        System.out.println("You are too intoxicated. The staff boots your butt." + "\n<press any key to continue>");
                        scan.nextLine();
                    }
                }
                else if (dm1 == 4) //profile
                {
                    System.out.println("Entering account continuum..." + "\n" + "\n" + "\n" + "\n<press any key to continue>");
                    scan.nextLine(); //profile
                    Stages.profile(hero);
                }
                else if (dm1 == 5) //museum
                {
                    System.out.println("Arriving at the Museum...\n<press any key to continue>");
                    scan.nextLine();
                    Stages.museum();
                }
                else if (dm1 == 6) //quest
                {
                    System.out.println("Entering the House of the Oracles...\n<press any key to continue>");
                    scan.nextLine();
                    Stages.quest(hero);
                }
                else if (dm1 == 7) //submitting game
                {
                    System.out.println("Entering Submission Form...\n<press any key to continue>");
                    scan.nextLine();
                    Stages.submit(hero);
                    return;
                }
                else //checks other methods such as quit
                {
                    dm2 = Methods.complexAction(response);
                    if (dm2 == 2) //pausing game
                    {
                        System.out.println("Game Paused... \n<press any key to continue>");
                        scan.nextLine();
                        System.out.println("\n" + "\n" + "\n" + "\n");
                    }
                    else if (dm2 == 3) //quit
                    {
                        System.out.println("Game terminated." + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
                        return;
                    }
                    else //if all else fails, just say that it really doesnt recognize the command
                    {
                        System.out.println("CPU does not know that command." + "\n");
                    }
                }
            }
            System.out.print("Game terminated." + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"); //quit game
            main_checkpoint = inner_checkpoint;
        }
    }
}