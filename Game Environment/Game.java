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
    Scanner scan = new Scanner (System.in);        
    boolean main_checkpoint = true, temp_checkpoint = true, inner_checkpoint = true;
    String response;
    int dm1 = 0, dm2 = 0; //decision makers
    /**
     * name, stage, experience, current_hp, agility, defence, strength, money, weapon, armor
     * level, max_hp, min_heal, max_heal, ppoints, totalexperience, totalcurrentexperience,totalmoney
     **/ 
    MC hero = new MC ("player", 0, 0, 100, 10, 10, 10, 100, Item.fist, Item.clothes, 0, 100, 1, 10, 5, 0, 0, 20); //account current
    MC hero1 = new MC ("player", 0, 0, 100, 10, 10, 10, 100, Item.fist, Item.clothes, 0, 100, 1, 10, 5, 0, 0, 20); //account 1
    MC hero2 = new MC ("player", 0, 0, 100, 10, 10, 10, 100, Item.fist, Item.clothes, 0, 100, 1, 10, 5, 0, 0, 20); //account 2
    MC heroSD = new MC ("null", 0, 0, 0, 0, 0, 0, 0, Item.fist, Item.clothes, 0, 0, 0, 0, 0, 0, 0, 0); //reset account
    MC heroR = new MC ("player", 0, 0, 100, 10, 10, 10, 100, Item.fist, Item.clothes, 0, 100, 1, 10, 5, 0, 0, 20); //starting account, so each time you run it, it does not run the previous method
    
    static ArrayList <Task> taskList = new ArrayList <Task> ();
    static ArrayList <Puzzle> puzzleList = new ArrayList <Puzzle> ();
    
    /**
     * Combines all the methods together in a fantastic game
     * This game encorporates all the methods from beginning to end.
     */
    public void main (String [] args) //the main method
    {
        Task.addTasks(hero, taskList);
        Puzzle.addPuzzles(hero, puzzleList);
        main_checkpoint = true; //your main checkpoint
        hero = heroR;
        while (main_checkpoint) //this keeps the whole game running
        {
            inner_checkpoint = beginning(); //this is the beginning method, asks you if you wish to play.
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
                    Stages.profile(hero1,hero2,hero);
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
                        System.out.print("Do you want to save? (Y / N)" + "\n" + "Response: ");
                        response = scan.nextLine();
                        if (Methods.simpleAction(response) == 1) //yes for save, brings you to save method
                        {
                            Methods.saveAccount(hero1,hero2,hero);
                        }
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

    /**
     * starts the game, and then sees if there is account.
     * if there are accounts, then it asks, if not, then not then start new account
     */
    public boolean beginning() //the beginning method
    {
        temp_checkpoint = true;
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
        if (Methods.storageCheck(hero1,hero2)) //sees if you have any accounts already stored in these file savers
        {
            System.out.print("\n" + "Would you like to continue where you left off?" + "\n" + "Response: ");
            response = scan.nextLine();
            while (!temp_checkpoint) //while you do not give one of the options: yes or no
            {
                if (Methods.simpleAction(response) == 1) //yes, then continue last where left off
                {
                    temp_checkpoint = true;
                    hero = Methods.getAccounts(hero1,hero2,hero); //puts account to what ever account is available.
                }
                else if (Methods.simpleAction(response) == 0) //no restarts at level 1
                {
                    temp_checkpoint = true;
                    setup();
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
            setup(); //this is the setup method, where it sets you up for a new player
        }
        return true;
    }

    /**
     * Setting up new accounts if there are no accounts or if you want to
     * This sets up a new account which you can save to one of the two given slots.
     */
    public void setup() 
    {
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
        System.out.println("Save this in a slot.");
        Methods.saveAccount(hero1,hero2,hero);
        System.out.println("\n" + "Congratulations, you have leveled up!" + "\n");
        MC.levelUp(hero);
        System.out.println("As you progress with quests and battles, you will earn enough experience to 'level up' and become stronger.\n<press any key to continue>");
        scan.nextLine();
        System.out.println("Teleporting to town square...\n**Note: Sometimes the original save will not work, \n please save again when you get to town square.\n\nAlso, there may be extra spaces for Java's line eating fault\nIf this happens, retype your action again.\n\nPlease refer to the manuals if you have any confusions before emailing questions." + "\n" + "\n<press any key to continue>");
        scan.nextLine();
    }
}
