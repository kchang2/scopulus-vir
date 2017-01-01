import java.util.*;
/**
 * Write a description of class Stages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages
{
    static final int TOTALLEVELS = Game.taskList.size() + Game.puzzleList.size();

    /**
     * Gives information on town center, the stage where town center is set
     * 
     * Postcondition: Prints out the actions taht you can do in the town square
     */
    public static void town_center()
    {
        Scanner scan = new Scanner (System.in);        
        System.out.print("You are in the town square." + "\n" + "What do you want to do?" + "\n"
            + "Shop (S)   |   Fight (F)   |   Rest (R)   |   Gamble (G)   |   Museum (M)   |   Quest (Q)   |   Account (A) |   SubmitScore (SS)" + "\n"  + "\n"
            + "Action: ");
    }

    /**
     * Gives information about weapon shop, stage where weapon shop is set and then asks you to purchase
     * 
     * Precondition: your hero must be at least level 1
     * Postcondition: does the weapon shop method, transfers you to the weapon shop
     */
    public static void weaponShop(MC hero)
    {
        Scanner scan = new Scanner (System.in);        
        System.out.println("Hello! Welcome to my weapon shop. You can purchase all of your things here." + "\n<press any key to continue>");
        scan.nextLine();
        if (hero.getLevel() >= 231)
        {
            System.out.println("Can it be? Do my eyes decieve me? The great god of combat, " + hero.getName() + 
                " himself!" + "\n" + "I have saved my most ancient and heroic arms for you. I pray to you" + "\n");
        }
        else if (hero.getLevel() >= 102 && hero.getLevel() <= 230)
        {
            System.out.println("All hail the legendary ! This is a once in a lifetime opportunity!" + 
                "\n" + "A figure this celebrated deserves the greatest of weapons. Come, to my attic!" + "\n");
        }
        else if (hero.getLevel() >= 50 && hero.getLevel() < 102)
        {
            System.out.println("It is an honor to see you, great warrior, and also one to sell to." +
                "\n" + "I will give you my elite arsenal to sell. You know..they are not even on display!" + "\n");
        }
        else if (hero.getLevel() >=20 && hero.getLevel() < 50)
        {
            System.out.println("I've heard of you, knight! You are a warrior in the making, a good one too."
                + "\n" + "Let me bring out my advanced weapons for you." + "\n");
        }
        else if (hero.getLevel() >=10 && hero.getLevel() < 20)
        {
            System.out.println("I see you have improved. You are a great soldier no doubt, but not a hero yet."
                + "\n" + "On the counter are some good equipment suited for you. Feel free to look." + "\n");
        }
        else
        {
            System.out.println("I smell a fresh meat for fighters to BEAT on..." + 
                "\n" + "What makes you think you can join the ranks of the elite?" + "\n" +
                "Just buy your equipment and go please, anything by the wood table, just take" + "\n");
        }
        System.out.println("\n<press any key to continue>\n");
        scan.nextLine();
        System.out.println("\n" + "The current inventory in the shop: ");
        Weapon.buying(hero);
    }

    /**
     * Sets Defence Shop stage, then asks using other method if you want to buy
     * 
     * Precondition: your hero must be at least level 1
     * Postcondition: does the armor shop method, transfers you to the armor shop
     */
    public static void defenceShop(MC hero)
    {   
        Scanner scan = new Scanner (System.in);        
        System.out.println("Hello! Welcome to my armor shop. You can purchase all of your things here." + "\n<press any key to continue>");
        scan.nextLine();
        if (hero.getLevel() >= 231)
        {
            System.out.println("Can it be? Do my eyes decieve me? The great god of combat, " + hero.getName() + 
                " himself!" + "\n" + "I have saved my most ancient and heroic armor for you. I pray to you" + "\n");
        }
        else if (hero.getLevel() >= 102 && hero.getLevel() <= 230)
        {
            System.out.println("All hail the legendary hero! This is a once in a lifetime opportunity!" + 
                "\n" + "A figure this celebrated deserves the greatest of arms. Come, to my attic!" + "\n");
        }
        else if (hero.getLevel() >= 50 && hero.getLevel() < 102)
        {
            System.out.println("It is an honor to see you, great warrior, and also one to sell to." +
                "\n" + "I will give you my elite shields to sell. You know..they are not even on display!" + "\n");
        }
        else if (hero.getLevel() >=20 && hero.getLevel() < 50)
        {
            System.out.println("I've heard of you, knight! You are a warrior in the making, a good one too."
                + "\n" + "Let me bring out my advanced armor for you." + "\n");
        }
        else if (hero.getLevel() >=10 && hero.getLevel() < 20)
        {
            System.out.println("I see you have improved. You are a great soldier no doubt, but not a hero yet."
                + "\n" + "On the counter are some good equipment suited for you. Feel free to look." + "\n");
        }
        else
        {
            System.out.println("I smell a fresh meat for fighters to BEAT on..." + 
                "\n" + "What makes you think you can join the ranks of the elite?" + "\n" +
                "Just buy your equipment and go please, anything by the wood table, just take" + "\n");
        }
        System.out.println("<press any key to continue>");
        scan.nextLine();
        System.out.println("\n" + "You find in the shop: ");
        Armor.buying(hero);
    }

    /**
     * Game for casino, sets stage, then allows you play with a minigame built in
     * 
     * Precondition: Your hero must be valid and he must have statistics
     * Postcondition: Your hero either gains money or loses money, or none.
     */
    public static void casino(MC hero)
    {
        Scanner scan = new Scanner (System.in);        
        boolean loop = true; 
        int originalamount = hero.getMoney();
        System.out.println("Welcome to GUESS THIS _______!" + "\n"
            + "If you guess a randomly generated value right, you can double, even triple your wager!" +"\n\n<press any key to continue>");
        scan.nextLine();
        System.out.println("\n\n");
        System.out.print("Would you like to play? (Y / N) \nResponse:");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes"))
        {
            while (loop && hero.getMoney() != 0) //while you wish to play and your hero has money
            {
                boolean betloop = true;
                int amount = 0;
                while (betloop == true)
                {
                    System.out.println("What is your wager?" + "\n" + "\n" + "Money left: " + hero.getMoney() + " coins");
                    System.out.print("Net Change: " + (hero.getMoney() - originalamount) + " coins." + "\n" + "Bet: ");
                    amount = scan.nextInt();
                    if (amount < 0)
                    {
                        System.out.print("You sneakily underwager. The dealer catches your mistake.\nHe asks if you want to re-bet (Y / N) \nResponse:");
                        response = scan.nextLine();
                        if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes"))
                        {
                            System.out.print("");
                        }
                        else
                        {
                            System.out.println("The dealer hears the word no. He pushes you out the Casino.");
                            return;
                        }
                    }
                    betloop = false;
                }
                if (amount <= hero.getMoney()) //if you hero wagers less or equal to it's amount, you can gamble
                {
                    System.out.print("Do you wish to gamble in double or triple bracket? (D / T)" + "\n" + "Input: ");
                    scan.nextLine();
                    response = scan.nextLine();
                    if (response.equalsIgnoreCase("D") || response.equalsIgnoreCase("Double")) //double head or tails
                    {
                        hero.setMoney(hero.getMoney()-amount);  //generates heads or tails based on randomly
                        Random generator = new Random();
                        int randomIndex = generator.nextInt(1);
                        if (randomIndex == 1)
                        {
                            response = "H";
                        }
                        else
                        {
                            response = "T";
                        }
                        System.out.print("A coin is flipped...Heads or tails? (H / T)" + "\n" + "Input: ");
                        if(scan.nextLine().equalsIgnoreCase(response)) //checks to see if your head or tails = it.
                        {
                            System.out.println("As the coin settles, you see that the coin has landed in your favor." + "\n" + "\n"
                                + "Results:\nMoney gained: " + amount*2);
                            hero.setMoney(hero.getMoney()+(amount*2));
                            hero.setTotalMoney(hero.getTotalMoney() + (amount * 2));
                        }
                        else //you lose money
                        {
                            System.out.println("The coin lands with your host taking your money." + "\n" + "\n"
                                + "Results:\nMoney gained: " + -amount);
                        }
                    }
                    else if (response.equalsIgnoreCase("T") || response.equalsIgnoreCase("Triple")) //assuming you wish to wager higher.
                    {
                        hero.setMoney(hero.getMoney()-amount);
                        Random generator = new Random();
                        int randomIndex = generator.nextInt(2); //randomly generates a number from 0-2
                        System.out.print("A magical three sided die is rolled...What number does it land on? (0 / 1 / 2)" + "\n" + "Input: ");
                        if (scan.nextInt() == randomIndex) //if your number is correct, you gain money.
                        {
                            System.out.println("As the die immediately halts, your number is the one shown!" + "\n" + "\n"
                                + "Results:\nMoney gained: " + amount*3);
                            hero.setMoney(hero.getMoney()+ (amount*3));
                            hero.setTotalMoney(hero.getTotalMoney() + (amount * 3));
                        }
                        else // you do not guess the right number so you lose money
                        {
                            System.out.println("The die falls short of your number and the dealer takes all." + "\n" + "\n"
                                + "Result:\nMoney gained: " + -amount);
                        }
                    }
                }
                else //your wager is more than your budget
                {
                    System.out.println("You have wagered too high!" + "\n" + "\n");
                }
                System.out.println("\n<press any key to continue>");
                scan.nextLine();
                System.out.print("\nDo you wish to quit? (Y / N)" + "\n" + "Input: ");
                scan.nextLine();
                response = scan.nextLine();
                if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("Y")) //asks if you want to play again. 
                { 
                    loop = false;
                }
            }
            System.out.println("You do not have any money!\nReturning to Town Square...\n\n<press any key to continue>");
            scan.nextLine();
            System.out.println("\n\n");
        }
        else
        {
            System.out.println("You wish not to bet and leave the casino. Returning to Town Square... \n<press any key to continue>");
            scan.nextLine();
            System.out.println("\n\n");
            return;
        }
    }

    /**
     * Arena, sets stage, randomly pairs you up with a creature,
     * then whatever you input results in the fight
     * 
     * Precondition: Hero has statistics and is at least level 1.
     * Postcondition: Hero either wins experience and money or loses some.
     */
    public static void arena(MC hero)
    {   
        System.out.println("\n\n\n\n");
        Scanner scan = new Scanner (System.in);
        int effect = 0;
        Regular opponent = CharList.chooseOpponent(hero); //randomly picks an opponent.
        opponent = CharList.levelAssign(opponent, hero);
        opponent.setCurrentHP(Math.abs(opponent.getCurrentHP()));
        System.out.println("You see a Level " + opponent.getLevel() + "  " + opponent.getName() + ". A fight has erupted and you face him. \n");
        System.out.println("<Press any key to continue>");
        scan.nextLine();
        System.out.println("\n\n");
        while (opponent.getCurrentHP() > 0 && hero.getCurrentHP() > 0) //while both healths are above zero, meaning while both are alive
        {
            System.out.println("Opponent: " + opponent.getName() + "    Level: " + opponent.getLevel() + "  HP: " + opponent.getCurrentHP());
            System.out.println("Hero: " + hero.getName() + "    Level: " + hero.getLevel() + "  HP: " + hero.getCurrentHP());
            System.out.println("Attack (A)   |   Heal (H)   |   Defend (D)   |   Run (R) " + "\n");
            System.out.print("Action: ");
            String action = scan.nextLine();
            int choice = Methods.returnAction(action);
            if (choice == 1) //attack opponent
            {
                int damage = MC.damageAmount(hero.getStrength(), hero.getAgility());
                if (effect == 1) //the opponent is defending
                {
                    damage -= opponent.getDefence();
                }
                else if(effect == 2) //the opponent has healed
                {
                    damage += (int)(damage * 1.2);
                }
                else if (effect == 3) //the opponent is doing nothing
                {
                    damage = (int)(damage * 1.6);
                }
                if (damage > 0) //checks if you damaged your opponent
                {
                    System.out.println("You attack with your " + hero.getWeapon().getName() + " and inflict " + damage + " damage in HP." + "\n");
                    opponent.setCurrentHP(opponent.getCurrentHP() - damage);
                }
                else //did not damage opponenet
                {
                    System.out.println("In disbelief, the " + opponent.getName() + " withstood your onslaught." + "\n");
                }
            }
            else if (choice == 2) //run
            {
                System.out.println("You run away from the " + opponent.getName() + "." + "\n");
                Random generator = new Random();
                int randomIndex = generator.nextInt(150);
                if (hero.getAgility() > randomIndex - 1) //your agility must be fast enough to run away
                {
                    System.out.println("You escape successfully to fight another day." + "\n");
                    return;
                }
                else
                {
                    System.out.println("You try to run away but the " + opponent.getName() + " snatches you before your 'almost' successful attempt." + "\n");
                }
            }
            else if (choice == 3) //heal yourself
            {
                int heal = MC.healAmount(hero.getMaxHeal(), hero.getMinHeal());
                if (heal == 0)
                {
                    System.out.println("Just as you perform your spell, you feel power drain from you. You perform an incomplete healing." + "\n");
                }
                else
                {
                    System.out.println("You strike the air with electrical powers and rejuvinate your heart.");
                    System.out.println("You heal " + heal + " HP." + "\n");
                    if ( (heal + hero.getCurrentHP()) <= hero.getMaxHP() )
                    {
                        hero.setCurrentHP(hero.getCurrentHP() + heal);
                    }
                }
            }
            else //defend yourself
            {
                choice = 10;
                System.out.println("You place yourself in defence, lifting your guard, preparing for the coming attack." + "\n");
            }
            if (Regular.decision(opponent) == 1) //if their decision is to attack
            {
                if (choice == 10) //if you are shielding
                {
                    Random n = new Random();
                    int storage = (int)(Regular.damageAmount(opponent.getStrength(), opponent.getAgility())) - (int)(0.5 * hero.getDefence());
                    if (storage > 0)
                    {
                        System.out.println("You absorb most of the damage from hurting you but the " + opponent.getName() + " manages to take " + storage  + " HP." + "\n");
                        hero.setCurrentHP(hero.getCurrentHP() - storage);
                    }
                    else
                    {
                        System.out.println("You successfully reflect the " + opponent.getName() + " damage." + "\n");
                    }
                }
                else //if you do not shield
                {
                    Random n = new Random();
                    int storage = ((int)(Regular.damageAmount(opponent.getStrength(), opponent.getAgility())) * 2);
                    if (storage > 0)
                    {
                        System.out.println("The  " + opponent.getName() + " deals " + storage + " damage on you with his " + opponent.getWeapon().getName() + ".\n");
                        hero.setCurrentHP(hero.getCurrentHP() - storage);
                    }
                    else
                    {
                        System.out.println(opponent.getName() + " misses." + "\n");
                    }
                }
                effect = 0;
            }
            else if (Regular.decision(opponent) == 2) //if he defends
            {
                System.out.println("The " + opponent.getName() + " defends." + "\n");
                effect = 1;
            }
            else if (Regular.decision(opponent) == 3) //if he heals
            {
                System.out.println("The " + opponent.getName() + " heals " + opponent.getHeal() + "." + "\n");
                opponent.setCurrentHP(opponent.getCurrentHP() + opponent.getHeal());
                effect = 2;
            }
            else //if he does nothing
            {
                System.out.println("As in some trance the " + opponent.getName() + " stands with the guard at rest." + "\n");
                effect = 3;
            }
        }
        if (opponent.getCurrentHP() <= 0) // if your opponent dies
        {
            System.out.println("You have successfully defeated the " + opponent.getName() + "." + "\n" );
            System.out.println("You have gained " + opponent.getExperience() + " experience and looted " + opponent.getMoney() + " coins." + "\n" + "\n");
            System.out.println("<press any key to continue>");
            scan.nextLine();
            hero.setExperience(opponent.getExperience() + hero.getExperience());
            hero.setMoney(opponent.getMoney() + hero.getMoney());
            hero.setTotalExperience(hero.getTotalExperience() + opponent.getExperience());
            hero.setTotalMoney(hero.getTotalMoney() + opponent.getMoney());
            hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() + opponent.getExperience());
            Conversion.levelCheck(hero);
            System.out.println("Returning to town square...\n\n<press any key to continue>");
            scan.nextLine();
            System.out.println("\n\n");
        }
        else //if you die
        {
            System.out.println("As you are hit by your opponent, you suffer a fatal blow and perish. Someone comes to pick you up.");
            System.out.println("Returning to town square..." + "\n" + "\n" + "\n<press any key to continue>");
            scan.nextLine();
            System.out.println("\n\n");
            hero.setCurrentHP(hero.getMaxHP());
            hero.setMoney((int)(hero.getMoney() * (double)(2/3)));
            hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() - (hero.getExperience() * (double)(1/10)));
            hero.setExperience(hero.getExperience() * (double)(9/10));
        }
    }

    /**
     * This method sets up the profile inputs for the user,
     * takes all possible accounts and asks what you wish to do with them,
     * whether it is to transfer or restart
     * 
     * Precondition: Hero has stats and Hero has no errors.
     * Postcondition: Prints out character's stats, saves the account, deletes accounts, changes stats, or loads another account
     */
    public static void profile(MC z)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome. What would you like to do?");
        System.out.println("\nProfile (P)   |   Power Points (PP)   \n\n");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("PP")) //power points on to character
        {
            System.out.println("Processing..." + "\n");
            System.out.print("\n" + "\n" + z.getName() + ", your current stats are - Health: " +  z.getMaxHP() + "   Strength: " + z.getStrength()
                + "    Agility: " + z.getAgility() + "  Defence: "+ z.getDefence() + "\n" + "\n");
            System.out.println("\n" + "Right now you have " + z.getPoints() + " power-points in storage. You may add them to any of your stats. \n\n"
                + "Type in these options [health (h), heal (hl), strength (s), agility (a), defence (d), or None(N)]" + 
                "\n" + "The increase is as follows [health (+10), heal(+1), strength (+1), agility (+1), defence (+1), None(saves points)]" +
                "\n" + "When you are complete, please type in done" + "\n");
            boolean loop = true;
            while (loop) // while there are still powerpoints and you want to set points
            {
                System.out.print("Action: ");
                String action = scan.nextLine();
                loop = Methods.pointDistribute(action, z);
            }
            System.out.println("\nHero " + z.getName() + " has " + z.getMaxHP() + " hp, " + z.getStrength() + " strength, "
                + z.getAgility() + " agility, " + z.getDefence() + " defence." + "\n");            
        }
        else if (response.equalsIgnoreCase("P")) //show profile
        {
            System.out.println("Account Name: " + z.getName() + "   Quest Number: " + z.getQuestNumber() + "     Experience: " + z.getExperience() + "   Current HP: " +  z.getCurrentHP()
                + "\n" + "      Agility: " + z.getAgility() + "     Strength: " + z.getStrength() +  "      Defence: "+ z.getDefence() + "      Money: " + z.getMoney()
                + "\n" + "  Weapon: " + z.getWeapon().getName() + "        Armor: " + z.getArmor().getName() + "     Level: " + z.getLevel()
                + "\n" + "  Max HP: " + z.getMaxHP() + "        Min Heal: " + z.getMinHeal() + "        Max Heal: " + z.getMaxHeal() + "        Power Points: " + z.getPoints() 
                + "\n" + "  Total Experience Earned: " + z.getTotalExperience() + "        Total Coins Gained: " + z.getTotalMoney() + "\n" +"\n" + "\n<press any key to continue>");
            scan.nextLine();
        }
        else //nothing, leaves the account
        {
            System.out.println("\n" + "Leaving haven." + "\n" + "\n" + "\n");
            return;
        }
    }

    /**
     * The musuem is where you can learn about the history
     * or anyone/anything that you have encountered.
     * 
     * Preconditon: There are monsters;
     * Postcondition: Information is printed
     */
    public static void museum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Museum. What would you like to see?\n\n1. Storyline (paragraph form) \n2. TimeLine (bulleted form) \n3. In depth analysis of creatures / actors\n4. Leave Museum\nResponse: ");
        int decision = scan.nextInt();
        if (decision == 1)
        {
            StoryLine.history();
        }
        else if (decision == 2)
        {
            StoryLine.timeLine();
        }
        else if (decision == 3)
        {
            StoryLine.analyze();
        }
        else
        {
            System.out.println("Nothing is appealing to you, so you leave.\n<press any key to continue>");
            scan.nextLine();
            return;
        }
        System.out.println("As you finish looking at the exhibit, you notice the museum is closing.\n Retuning to Town Square\n\n <press any key to continue>");
        scan.nextLine();
        System.out.println("\n\n");
    }

    /**
     * The quest section is where you will find all the quests
     * you need to complete and unlease the power
     * of the great 5.
     * 
     * Precondition: Hero exisits and has stats.
     * Postcondition: Hero either wins a quest or loses one, or does not participat.
     */
    public static void quest(MC hero)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("As you approach the door, it opens.");
        if (hero.getQuestNumber() == 0) //if you just started the quests
        {
            System.out.println("The oracle speaks: \n\nHello my hero. It is time for you to unlock the true potential inside of you."
                + "\nConstantus is alive, I can feel it, and so is everything else from millenias ago."
                + "\nHe seeks your help, you are the one to free Aberrtus from the grasps of evil,\n"
                + "you are the one to set him to rest, you are the one to keep the promise \n"
                + "you are the only one in destiny. So follow his footsteps, \n"
                + "do what he could not succeed, as you can bring balance to the world,\n"
                + "truly indeed. Are you ready to begin and forfill the fate? (Y / N)\n\nResponse: ");
            String response = scan.nextLine();
            if (Methods.simpleAction(response) == 1) //if you accept challenge
            {
                System.out.println("You have completed the first task, as this was it.\nBegin on the journey seems just and fit.");
                hero.setQuestNumber(1);
            }
            else //if you decline challenge
            { 
                System.out.println("I knew you would not accept. Come again when you are ready to take on the tasks.\n<press any key to continue>");  
                scan.nextLine();
                System.out.println("\n");
                return;
            }
        }
        else if (hero.getQuestNumber() < TOTALLEVELS)
        {
            System.out.println("The oracle welcomes you back, already prepared to give the next quest.");
        }
        for (int i=hero.getQuestNumber(); i <= TOTALLEVELS; i++) //for where you started, you add1 until all tasks are completed.
        {
            System.out.println("\n<press any key to continue>");  
            scan.nextLine();
            System.out.println("\n\nOracle:\n\n");
            if (i % 5 == 0 && Game.puzzleList.size() > 0) // if divisible by 5, then that means it is a puzzle.
            {
                boolean puzzleloop = false;
                Puzzle currentPuzzle = Game.puzzleList.get(0);
                System.out.println(currentPuzzle.getBackground() + "\n<press any key to continue>");
                scan.nextLine();
                while (puzzleloop == false) //WHILE you cannot solve the puzzle
                {
                    System.out.println("\n\n\n" + "The Puzzle\n\n" + currentPuzzle.getRiddle());
                    System.out.print("\n\n\n" + "What would you like to do? \nSolve (S)   |   Pause (P)   |   Leave (L)\nAction: ");
                    String response = scan.nextLine();
                    int action = Puzzle.decision(response);
                    if (action == 0) //if you want to solve
                    {
                        System.out.print("\n\nThe answer is: ");
                        if (Puzzle.checkAnswer(scan.nextLine(), currentPuzzle)) //checks if you are correct
                        {
                            System.out.println("\nYou are correct. Congratulations, you are one step closer to completing the prophecy.\n");
                            currentPuzzle.setCompletion(hero, currentPuzzle);
                            puzzleloop = true;
                        }
                        else
                        {
                            System.out.println("\nYou are incorrect. Please think more carefully.\n");
                        }
                    }
                    else if (action == 2) //anything else like you do not want to solve
                    {
                        return;
                    }

                }
            }
            else  //a monster quest, fighting and defeating a monster
            {
                Task currentTask = Game.taskList.get(0);
                System.out.println(currentTask.getObjective() + "\n<press any key to continue>");
                scan.nextLine();
                System.out.println("\n\n\n" + "The Champion: " + currentTask.getChampion().getName() + "\n\nHis Stats:\n\n"
                    + "Max Health: " + currentTask.getChampion().getMaxHP() + "          Max Heal Power: " + currentTask.getChampion().getMaxHeal() + "          Experience: " + currentTask.getChampion().getExperience() + "          Money: " + currentTask.getChampion().getMoney()
                    + "\nAgility: " + currentTask.getChampion().getAgility() + "          Defence: " + currentTask.getChampion().getDefence() + "          Strength: " + currentTask.getChampion().getStrength()
                    + "\nWeapon carried: " + currentTask.getChampion().getWeapon().getName() + "          Armor worn: " + currentTask.getChampion().getArmor().getName());
                System.out.print("\n\n\n" + "What would you like to do? \nFight (F)   |   Pause (P)   |   Decline (D)\nAction: ");
                int action = Task.decision(scan.nextLine());
                if (action == 0) //same thing as a regular monster fight, instead with hreoes.
                {
                    System.out.print("\n\nGo forth my friend, set out and forfill your destiny.\nEntering " + currentTask.getSetting() + "...\n\n<press any key to continue>");
                    scan.nextLine();
                    int effect = 0;
                    Champion opponent = currentTask.getChampion();
                    System.out.println("\n" + currentTask.getBeginWord() + "\n\n");
                    while (opponent.getCurrentHP() > 0 && hero.getCurrentHP() > 0)
                    {
                        System.out.println("Champion: " + opponent.getName() + "    HP: " + opponent.getCurrentHP());
                        System.out.println("Hero: " + hero.getName() + "    HP: " + hero.getCurrentHP());
                        System.out.println("Decisions:      Attack (A)   |   Heal (H)   |   Defend (D)   |   Relinquish Quest (R) " + "\n");
                        System.out.print("Action: ");
                        String act = scan.nextLine();
                        int choice = Methods.returnAction(act);
                        if (choice == 1) //attack
                        {
                            int damage = MC.damageAmount(hero.getStrength(), hero.getAgility());
                            if (effect == 1)
                            {
                                damage -= opponent.getDefence();
                            }
                            else if(effect == 2)
                            {
                                damage += 3;
                            }
                            else if (effect == 3)
                            {
                                damage = (int)(damage * 1.6);
                            }
                            if (damage > 0)
                            {
                                System.out.println("You attack with your " + hero.getWeapon().getName() + " and inflict " + damage + " damage in HP." + "\n");
                                opponent.setCurrentHP(opponent.getCurrentHP() - damage);
                            }
                            else
                            {
                                System.out.println(opponent.getName() + " withstood your assault." + "\n");
                            }
                        }
                        else if (choice == 3) //heal
                        {
                            int heal = MC.healAmount(hero.getMaxHeal(), hero.getMinHeal());
                            if (heal == 0)
                            {
                                System.out.println("Just as you perform your spell, you feel power drain from you. You perform an incomplete healing." + "\n");
                            }
                            else
                            {
                                System.out.println("You strike the air with electrical powers and rejuvinate your heart.");
                                System.out.println("You heal " + heal + " HP." + "\n");
                                if ( (heal + hero.getCurrentHP()) <= hero.getMaxHP() )
                                {
                                    hero.setCurrentHP(hero.getCurrentHP() + heal);
                                }
                            }
                        }
                        else if (choice == 2)//relinquish
                        {
                            System.out.println("Do you wish to relinquish your quest? There is a penalty but you may live to see another day."+
                                "\nYes, I wish for the Oracle to save me. (Y)   |   No, I want to continue to fight. (N)\nResponse:");
                            if (Methods.simpleAction(scan.nextLine()) == 1)
                            {
                                hero.setMoney((int)(0.75 * hero.getMoney()));
                                System.out.println("With the Oracle's great power, you are shifted back to your dimension.\n<press any key to continue>");
                                scan.nextLine();
                                return;
                            }
                            else
                            {
                                System.out.println("You bravely stand and continue your quest.\n<press any key to continue>");
                                scan.nextLine();
                            }
                        }
                        else //defend
                        {
                            choice = 10;
                            System.out.println("You place yourself in defence, lifting your guard, preparing for the coming attack." + "\n");
                        }
                        if (Champion.decision(opponent) == 1) //champion decides to attack
                        {
                            if (choice == 10) //if you are dending
                            {
                                Random n = new Random();
                                int storage = (int)(Regular.damageAmount(opponent.getStrength(), opponent.getAgility())) - (int)(0.5 * hero.getDefence());
                                if (storage > 0)
                                {
                                    System.out.println("You absorb most of the damage from hurting you but " + opponent.getName() + " manages to take " + storage  + " HP." + "\n");
                                    hero.setCurrentHP(hero.getCurrentHP() - storage);
                                }
                                else
                                {
                                    System.out.println("You successfully reflect " + opponent.getName() + " damage." + "\n");
                                }
                            }
                            else //wide open for attack
                            {
                                Random n = new Random();
                                int storage = (int)(Regular.damageAmount(opponent.getStrength(), opponent.getAgility())) * 2;
                                if (storage > 0)
                                {
                                    System.out.println(opponent.getName() + " deals " + storage + " damage on you with his " + opponent.getWeapon().getName() + ".\n");
                                    hero.setCurrentHP(hero.getCurrentHP() - storage);
                                }
                                else
                                {
                                    System.out.println(opponent.getName() + " misses." + "\n");
                                }
                            }
                            effect = 0;
                        }
                        else if (Champion.decision(opponent) == 2) //defending
                        {
                            System.out.println(opponent.getName() + " defends." + "\n");
                            effect = 1;
                        }
                        else if (Champion.decision(opponent) == 3) //healing
                        {
                            int healingamount = opponent.getHealAmount(opponent.getMaxHeal(), opponent.getMinHeal());
                            System.out.println(opponent.getName() + " heals " + healingamount + "." + "\n");
                            opponent.setCurrentHP(opponent.getCurrentHP() + healingamount);
                            effect = 2;
                        }
                        else //remaining numbers are the champion does nothing. This rarely happens
                        {
                            System.out.println("As in some trance " + opponent.getName() + " stands with the guard at rest." + "\n");
                            effect = 3;
                        }
                        if (opponent.getCurrentHP() < opponent.getCurrentHP()/2 + 20 && opponent.getCurrentHP() > opponent.getCurrentHP()/2 - 20)
                        {
                            currentTask.getMidWord();
                        }
                    }
                    if (opponent.getCurrentHP() <= 0) //if opponent has lost
                    {
                        System.out.println("You have successfully defeated " + opponent.getName() + "." + "\n" );
                        System.out.println("You have gained " + opponent.getExperience() + " experience and given " + opponent.getMoney() + " coins." + "\n" 
                            + "The " + opponent.getName() + " says to you: " + currentTask.getEndWord() + "\n" + "\n");
                        Task.setCompletion(hero, currentTask.getChampion());
                        if (opponent.getWeapon().getQuestNumber()!= 0)
                        {
                            System.out.println("You have unlocked a Quest weapon!\n\n");
                        }
                        if (opponent.getArmor().getQuestNumber()!= 0)
                        {
                            System.out.println("You have unlocked a Quest armor!\n\n");
                        }
                        Conversion.levelCheck(hero);
                    }
                    else // if you have lost
                    {
                        System.out.println("As you are hit by an all powerful attack, you suffer a fatal blow and perish. You are brought back to your dimension.");
                        System.out.println("The Oracle returns you to town square..." + "\n" + "\n<press any key to continue>");
                        scan.nextLine();
                        System.out.println("\n" + "\n" + "\n");
                        hero.setCurrentHP(hero.getMaxHP());
                        hero.setMoney((int)(hero.getMoney() * (double) (2 / 3)));
                        hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() - (double)(hero.getExperience() * (1/10)));
                        hero.setExperience(hero.getExperience() * (double)(9/10));
                        return;
                    }
                }
                else if (action == 2)
                {
                    return;
                }
                System.out.println("Congratulations! You have completed a quest! The Oracle is pleased and Constantus is proud.");
            }
            System.out.println("Would you like to continue on to the next quest? \nYes (Y)   |   No (N)\nAction: ");
            String response = scan.nextLine();
            if (Methods.simpleAction(response) == 0)
            {
                System.out.println("Please come again. You fall into a spell and end up in town square.\n<press any key to continue>");
                hero.setQuestNumber(i+1);
                scan.nextLine();
                return;
            }
            hero.setQuestNumber(i+1);
        }
        System.out.println("You have followed the footsteps of Constantus and done what no man has done before\n"
            + "You have helped save Aberrtus, defeated the Obscura, and release Constantus from his promise.\n"
            + "The world is safer now because of you! The Oracle is proud.\n **You have completed all the quest. \nCongratulations, you have gained 1,000,000 experience for completing all the quests and 500,000 coins.\n"
            + "You may now sumbit to high scores or level up more.");
        hero.setExperience(hero.getExperience() + 1000000);
        hero.setMoney(hero.getMoney() + 500000);
        hero.setTotalExperience(hero.getTotalExperience() + 1000000);
        hero.setTotalMoney(hero.getTotalMoney() + 500000);
        hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() + 1000000); //when you win and beat all quests
        hero.setQuestNumber(Game.puzzleList.size() + Game.taskList.size());
        Conversion.levelCheck(hero);
        System.out.println("\n\n<press any key to continue>");
        scan.nextLine();       
        scan.nextLine();
    }

    public static void submit(MC hero) //submit form. This calculates your score and then prints it out.
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Thanks for playing the game. Your hero had done very well. \n"
            + "In about a minute, your ticket will be printed, and you can screen shot it for a chance at the high scores.\n\n<press any key to continue>");
        scan.nextLine();
        System.out.println("Your scores are almost about ready. Remember, you can always play on this character and submit a new ticket anytime. \nThanks again.\n\n<press any key to continue>");
        scan.nextLine();
        System.out.print("What do you want your ticket to be written under? (your name or user you wish to be called)\nTicketHolder: ");
        String name = scan.nextLine();
        System.out.println("\n" +
            "-------------------------------------------------------------------------------------------------------------------------------\n\n" +
            "                                                TICKET FOR " + name + "\n" +
            "\n\n" +
            "            Name of Hero:                   Level:                   Experience:                   Quest Number: \n" + 
            "            " + hero.getName() + "                         " + hero.getLevel() + "                         " + hero.getExperience() + "                         " + hero.getQuestNumber() + "\n\n" +
            "            Max Health Reached:                                      Max Heal Reached: " + "\n" + 
            "            " + hero.getMaxHP() + "                                                              " + hero.getMaxHeal() + "\n\n" +
            "            Strength Points:                Agility Points:          Defence Points: " + "\n" +
            "            " + hero.getStrength() + "                         " + hero.getAgility() + "                         " + hero.getDefence() + "\n\n" +
            "            Total Experience:                                        Total Money Gained:" + "\n" +
            "            " + hero.getTotalExperience() + "                                                  " + hero.getTotalMoney() + "\n\n" +
            "            Final Score: " + "\n" +
            "            " + Conversion.calculateScore(hero));
        return;
    }
}
