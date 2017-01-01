import java.util.*;
/**
 * Write a description of class Armor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armor extends Item
{
    /**Basic Starting Equipment**/
    static Armor clothes = new Armor ("Clothes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "Clothes.");
                
    /**Generated Enemy Equipment**/
       
    static Armor robes =  new Armor ("Robes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor moon = new Armor ("Moon of the Werewolf", 54, 0, 0, 61, 61, -5, -5, -5, 2000, "The moon that makes this creatures so deadly.");
    static Armor hydraskin = new Armor ("Hydra skin", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor saddle = new Armor ("Saddle", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor leatherhide = new Armor ("Leather hide", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor flyingwings = new Armor ("Eagle's Wings", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor dragonskin = new Armor ("Dragon skin", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor hadescollar = new Armor ("Hade's Collar", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor stoolcase = new Armor ("Pile of Stools", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor wateraura =  new Armor ("Water Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor earthaura =  new Armor ("Earth Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor fireaura =  new Armor ("Fire Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor bloodaura =  new Armor ("Blood Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor bookcover =  new Armor ("Bookcover", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor bighorns =  new Armor ("El Diablo's Horns of Fear", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Armor shadow =  new Armor ("Shadow", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");

        /**Character Armour**/
            //Shields
            static Armor woodshield = new Armor ("Wood Shield", 0, 0, 0, 5, 0, 5, 40, 10, 10, "A sturdy wood shield can protect you from the most basic weapons.");
            static Armor bronzeshield = new Armor ("Bronze Shield", 1, 5, 0, 15, 0, 10, 50, 20, 50, "It may be soft, but it's better than splinters.");
            static Armor ironshield = new Armor ("Iron Shield", 2, 10, 0, 25, 0, 15, 60, 25, 200, "A wraught iron shield can protect you from the metal weapons effectively.");
            static Armor steelshield = new Armor ("Steel Shield", 3, 20, 0, 35, 0, 20, 70, 30, 1000, "A steel shield is much stronger than an iron shield, and less heavy.");
            static Armor goldshield = new Armor ("Golden Shield", 4, 50, 0, 45, 0, 25, 90, 35, 10000, "A golden shield can lead you through even the darkest days.");
            static Armor spiritshield = new Armor ("Spirit Shield", 5, 100, 0, 105, 0, 30, 150, 50, 300000, "A spirit hides in the shield, either protecting you or waiting for the right time to hurt you.");
            //Chainmail
            static Armor bronzemail = new Armor ("Bronze Mail", 10, 6, 0, 20, 0, 20, 55, 20, 90, "It offers the simplest of protection with its brown links.");
            static Armor ironmail = new Armor ("Iron Mail", 11, 16, 0, 25, 0, 30, 70, 30, 400, "One of the standard armors from the guards in the city.");
            static Armor steelmail = new Armor ("Steel Mail", 12, 26, 0, 30, 0, 35, 75, 35, 1200, "One of the standard armors from the elite guards in the city.");
            static Armor titaniummail = new Armor ("Titanium Mail", 13, 50, 0, 35, 0, 40, 90, 40, 5000, "A strong chain links of armor, able to withstand some of the strongest attacks.");
            static Armor goldmail = new Armor ("Gold Mail", 14, 75, 0, 40, 0, 45, 80, 45, 7000, "Not really the best choice of armor, but hey, maybe the enemies will be blinded to death.");
            static Armor shellmail = new Armor ("Shells of Mail", 15, 95, 0, 50, 0, 50, 100, 50, 200000, "Made from shells found in the ocean, on land, basically anywhere, this can be worn as protection or as a moveable home.");
            //Big helmets
            static Armor woodbighelm = new Armor("Wood Big Helm", 20, 0, 0, 0, 5, 30, 50, 10, 20, "This looks more like a giant pot if you ask me.");
            static Armor ironbighelm = new Armor("Iron Big Helm", 21, 15, 0, 0, 10, 35, 55, 15, 200, "These huge a$& helmets somehow effectively protect you just as well, maybe even better than armor.");
            static Armor goldbighelm = new Armor ("Gold Big Helm", 22, 50, 0, 0, 15, 40, 60, 20, 5000, "A gianormous bobblesize head of a helm, even better because it comes with grills yoo.");
            static Armor steelbighelm = new Armor ("Steel Big Helm", 23, 60, 0, 0, 20, 45, 65, 25, 4000, "One of the standard helmets for the big headed people in the city.");
            static Armor titaniumbighelm = new Armor ("Titanium Big Helm", 24, 70, 0, 0, 25, 50, 70, 30, 9000, "A strong binding of helmet pieces, able to withstand the strongest attacks.");
            static Armor plummetbighelm = new Armor ("Plummeted Big Helm", 25, 80, 0, 0, 30, 60, 75, 35, 50000, "These helmets were worn by the enormously sized domed leaders of war.");
            static Armor talkingbighelm = new Armor ("Talking Big Helm", 26, 90, 0, 0, 35, 100, 100, 35, 220000, "It's like having a second body and a second face.");
            static Armor lavabighelm = new Armor ("Lava Big Helm", 27, 110, 0, 0, 40, 70, 120, 40, 400000, "Why would anyone touch this helmet, even wear this helmet. Its basically made from lava that has not been cooled completely.");
            //Armor Set
            static Armor leatherarmor = new Armor ("Leather Armor", 30, 10, 0, 30, 0, 10, 60, 10, 110, "This is the most basic of armors. It will keep you with minimal protection.");
            static Armor stonearmor = new Armor ("Stone Armor", 31, 15, 0, 40, 0, 15, 70, 15, 400, "Having a stone armor can really make you feel like living in a cave.");
            static Armor ironarmor = new Armor ("Iron Armor", 32, 20, 0, 50, 0, 20, 80, 20, 600, "Having a Iron armor can really make you feel like being protected by a metal wall.");
            static Armor goldarmor = new Armor ("Gold Armor", 33, 55, 0, 60, 0, 25, 90, 25, 10000, "Worn by the rich elites, this suits more as a bragging right than a defensive armor.");
            static Armor steelarmor = new Armor ("Steel Armor", 34, 70, 0, 80, 0, 30, 100, 30, 2000, "This steel armor is a great economic package, its defensive and its conveniently in stock. The price? Who cares about the price. Buy this right now.");
            static Armor muddiedarmor = new Armor ("Muddied Armor", 75, 90, 0, 100, 0, 50, 140, 10, 10000, "This armor is so Muddy it literally absorbs the force of impact from the opponent.");
            static Armor glassarmor = new Armor ("Glass Armor", 36, 95, 0, 0, 0, 100, 20, 20, 25000, "This is a see through armor, not that effective considering it's glass. For insanely bold heros, just remember to wear clothes underneath.");
            //Tiered Set
            static Armor zirconarmor = new Armor ("Zircon Armor", 40, 100, 0, 150, 25, 25, 150, 25, 400000, "The first of the seven tiered armor set, forged in the zone itself.");
            static Armor sapphirearmor = new Armor ("Sapphire Armor", 41, 125, 0, 200, 50, 50, 200, 50, 500000, "The second of the seven tiered armor set, forged in the zone itself.");
            static Armor emeraldarmor = new Armor ("Emarld Armor", 42, 150, 0, 250, 75, 75, 250, 75, 700000, "The third of the seven tiered armor set, forged in the zone itself.");
            static Armor rubyarmor = new Armor ("Ruby Armor", 43, 175, 0, 300, 100, 100, 300, 100, 850000, "The fourth of the seven tiered armor set, forged in the zone itself.");
            static Armor diamondarmor = new Armor ("Diamond Armor", 44, 200, 0, 350, 125, 125, 350, 125, 1200000, "The fifth of the seven tiered armor set, forged in the zone itself.");
            static Armor jeremejevitearmor = new Armor ("Jeremejevite Armor", 45, 225, 0, 400, 200, 150, 400, 150, 1650000, "The sixth of the seven tiered armor set, forged in the zone itself.");
            static Armor meteoraarmor = new Armor ("Meteora Armor", 46, 250, 0, 1000, 1000, 300, 500, 300, 2500000, "The treasure of the seven tiered armor set, forged from the fallen meteor in the sevanth war.");
            //Unlockables UNFINISHED
            static Armor princejohncrown = new Armor ("Prince John's Crown", 50, 0, 1, 20, 0, 15, 10, -2, 5000, "Prince John's Crown is the key to the prince's arrogance and pride. \nWhat he lacks in agility makes up for in strength");
            static Armor sheriffbadge = new Armor ("Sheriff's Deputy Star", 51, 0, 2, 10, 10, 5, 10, 0, 10000, "The Sheriff of Nottingham's Badge. It gives you a sense of protection and fear from others.");
            static Armor sirguyarmor = new Armor ("Armour of Sir Guy", 52, 0, 3, 50, 0, 10, 30, 10, 20000, "The infamous armor of Sir Guy. Surely to protect you from harm, but can it protect you from yourself?");
            static Armor hermitcloak = new Armor ("Hermit Cloak", 53, 0, 7, 10, 10, 0, 30, 0, 25000, "The hermit cloak suprisingly keeps you away from opponents and evades potential attacks.");
            static Armor skeletonarmor = new Armor ("Skeleton Armor", 54, 0, 11, 0, 0, 0, -5, 50, 30000, "The skeleton armor that keeps the king protected from harms.");
            static Armor lionfur = new Armor ("Nemean Lion's Coat", 55, 0, 12, 500, 0, -5, 300, -5, 35000, "The legendary skin of the Nemean Lion is sure to protect you from the greatest of dangers");
            static Armor hunterarmor = new Armor ("Hunter's Armor", 56, 0, 14, 100, 50, 25, 25, 25, 40000, "The hunter of the Guardian of Artemis.");
            static Armor bronzearmor = new Armor ("Bronze Armor", 57, 0, 18, 150, 40, 40, 40, 20, 45000, "The bodies of the Stymphalian Birds smelted into this divine armor.");
            static Armor beastshield = new Armor ("Protector of Beasts", 58, 0, 21, 100, 50, 60, 80, 20, 50000, "This can protect you from all evil with it's incredible power.");
            static Armor greatgirdle = new Armor ("Heroic Girdle of the Amazon", 59, 0, 22, 150, 150, 70, 70, 70, 60000, "A mystical girdle from Hippolyte.");
            static Armor rehealingfeet = new Armor ("Rehealing Feet", 60, 0, 24, 200, 200, 0, 100, 0, 75000, "The rehealing feet of Antaeus, the almost invincible.");
            static Armor dragonarmor = new Armor ("Dragon Armor", 61, 0, 27, 250, 75, 80, 100, 80, 100000, "Fashioned from a grandeur dragon.");
            static Armor powerskin = new Armor ("Power skin", 62, 0, 28, 300, 90, 100, 150, 100, 140000, "Extreme skin, Atlas the Titan's superior organ.");
            static Armor shadowhelm = new Armor ("Shadow Helm", 63, 0, 31, 500, 100, 50, 200, 100, 150000, "Hades presents to the fabled hero");
            static Armor blackarmor = new Armor ("Armor of the Black Knight", 64, 0, 32, 300, 25, 25, 25, 25, 160000, "The black Knight's armor - the prize earned.");
            static Armor greenarmor = new Armor ("Armor of the Green Knight", 64, 0, 33, 400, 50, 25, 100, 25, 200000, "The green Knight's armor - the prize earned.");
            static Armor bluearmor = new Armor ("Armor of the Blue Knight", 65, 0, 34, 500, 100, 75, 150, 75, 250000, "The blue Knight's armor - the prize earned.");
            static Armor yellowarmor = new Armor ("Armor of the Yellow Knight", 66, 0, 36, 600, 150, 125, 200, 125, 300000, "The yellow Knight's armor - the prize earned.");
            static Armor redarmor = new Armor ("Armor of the Red Knight", 67, 0, 37, 700, 200, 175, 250, 175, 350000, "The red Knight's armor - the prize earned.");
            static Armor airaura =  new Armor ("Air Aura", 68, 0, 46, 1000, 300, 200, 200, 200, 500000, "The air aura from the Air Dragon, it will protect you with a shield of air.");
            static Armor soulaura =  new Armor ("Soul Aura", 69, 0, 51, 1200, 500, 300, 300, 300, 750000, "The soul aura from the Soul Dragon, it will protect you with a shield of dragon spirits.");
            static Armor dragonchariot =  new Armor ("Dragon Unity Chariot", 70, 0, 56, 1000, 1000, 500, 500, 500, 1000000, "The Grandmaster's Chariot of unity. It encompasses all the dragon's powers into one.");
            static Armor fearhelm = new Armor ("Helm of fear", 71, 0, 57, 1200, 1200, 600, 600, 600, 3000000, "The helm of fear forged from the souls of the demons, is heavily guarded yet recieved.");
            static Armor darkarmor = new Armor ("Dark Armor of Drakon", 72, 0, 58, 10, 1000, 1000, 1000, 200, 5000000, "Drakon's inpenatrable skin!");
            static Armor mirrorshield =  new Armor ("Mirror Shield", 73, 0, 62, 1500, 1500, 1200, 1200, 10, 10000000, "The mirror shield that would reflect and absorb damage back. Painful results.");
            static Armor darkaura = new Armor ("Dark Aura", 74, 0, 63, 2000, 2000, 2000, 1500, 1500, 15000000, "The evil force, strong and powerful.");
            static Armor lightaura = new Armor ("Light Aura", 75, 0, 64, 2500, 2500, 1800, 1800, 1800, 25000000, "The light force, one to conquer all.");            
            
    public Armor (String name, int ID, int minLevel, int questNumber, int hpbenefit, int healbenefit, int strbenefit, int defbenefit, int agilbenefit, int price, String description)
    {
        super(name,ID,minLevel,questNumber,hpbenefit,healbenefit,strbenefit,defbenefit,agilbenefit,price,description);
    }
    
    /**
     * The armor displays the armors to the player and the player can use that to buy equipments
     * and what not to improve his character.
     * 
     * Precondition - The hero is already instanciated and has value in it
     * Postcondition - The hero carries a new armor or has the same armor
     */
    public static void buying(MC hero) //increases health, defence
    {
        Scanner scan = new Scanner (System.in);
        boolean loop = true;
        while (loop == true)
        {
            ArrayList <Armor> armors = new ArrayList <Armor> ();
            Armor [ ] storage = {woodshield,bronzeshield,ironshield,steelshield,goldshield,spiritshield,
                bronzemail,ironmail,steelmail,titaniummail,goldmail,shellmail,woodbighelm,ironbighelm,
                goldbighelm,steelbighelm,titaniumbighelm,plummetbighelm,talkingbighelm,lavabighelm,
                leatherarmor,stonearmor,ironarmor,goldarmor,steelarmor,muddiedarmor,glassarmor};  
            for (Armor a : storage)
            {
                if (hero.getLevel() >= a.getMinLevel())
                {
                    armors.add(a);
                    System.out.println(a.getID() + ". " + a.getName());
                }
            }
            Armor [ ] tierstorage = {zirconarmor,sapphirearmor,emeraldarmor,rubyarmor,diamondarmor,jeremejevitearmor,meteoraarmor};  
            System.out.println("\nTiered Armour Set:\n");
            for (Armor a : tierstorage)
            {
                if (hero.getLevel() >= a.getMinLevel())
                {
                    armors.add(a);
                    System.out.println(a.getID() + ". " + a.getName());
                }
            }
            
            Armor [ ] queststorage = {princejohncrown,sheriffbadge,sirguyarmor,hermitcloak,skeletonarmor,lionfur,hunterarmor,bronzearmor,
            beastshield,greatgirdle,rehealingfeet,dragonarmor,powerskin,shadowhelm,blackarmor,greenarmor,bluearmor,yellowarmor,redarmor,
            airaura,soulaura,dragonchariot,fearhelm,darkarmor,mirrorshield,darkaura,lightaura};
            
            System.out.println("\nQuest Armours:\n");
                for (Armor a : queststorage) //for loop
                {
                    if (hero.getQuestNumber() > a.getQuestNumber())
                    {   
                        armors.add(a); //puts the armor in the arraylist of possible armors to buy
                        System.out.println(a.getID() + ". " + a.getName()); //prints out the name, and ID
                    }
                }
            System.out.println("999. Leave shop\n\n"); //prints out the quit
            System.out.println("You currently have:     " + hero.getMoney() + " coins. \nYou own a(n):      " + hero.getArmor().getName() + ".");
            System.out.println("Type in the serial number to see information and buy.");
            int serialnumber = scan.nextInt(); //prompting a serial number
            Armor DC = new Armor ("Null", 0, 0, 0, 0, 0, 0, 0, 0, 0, "The front window"); //display case  
            if (serialnumber == 999)
            {
                return;
            }
            for (Armor i : armors) //checks to see if the one you picked matches any of the armors
            {
                if (i.getID() == serialnumber)
                {
                    DC = i;
                }
            }
            if (DC.getName().equals("Null"))
            {
                System.out.println("You did not pick an armour.");
            }
            else
            {
                System.out.println("\n"
                + "Display Weapon: " + DC.getName() + "          Carried Weapon: " + hero.getArmor().getName() + "\n" 
                + "Serial Number:      " + DC.getID() + "                    " + hero.getArmor().getID() + "\n"
                + "Minimum Level:      " + DC.getMinLevel() + "                    " + hero.getArmor().getMinLevel() + "\n"
                + "Quest number:       " + DC.getQuestNumber() + "                    " + hero.getArmor().getQuestNumber() + "\n"
                + "HP benefit:         " + DC.getHPBenefit() + "                    " + hero.getArmor().getHPBenefit() + "\n" 
                + "Heal Benefit:       " + DC.getHealBenefit() + "                    " + hero.getArmor().getHealBenefit() + "\n"
                + "Strength Benefit:   " + DC.getStrBenefit() + "                    " + hero.getArmor().getStrBenefit() + "\n"
                + "Defense Benefit:    " + DC.getDefBenefit() + "                    " + hero.getArmor().getDefBenefit() + "\n"
                + "Agility Benefit:    " + DC.getAgilBenefit() + "                    " + hero.getArmor().getAgilBenefit() + "\n" 
                + "\n\nPrice:              " + DC.getPrice() + "\n"
                + "Description: \n" + DC.getDescription()
                + "\n\n"); //the armor wish to purchase stats
                
                System.out.println("Hero: " + hero.getName() + "     current money: " + hero.getMoney() + "\n<press any key to continue>");
                
                scan.nextLine();
                String response = scan.nextLine();
                System.out.println("Do you wish to purchase this? (Y / N \nResponse:)" ); //asks if you wish to purchase
                response = scan.nextLine();
                if (response.equalsIgnoreCase("Y") &&hero.getMoney() >= DC.getPrice()) //yes and you have enough money, you buy it and it deducts money from you
                {
                    itemSwap(DC,hero);
                }
                else if (response.equalsIgnoreCase("N"))
                {
                    System.out.println("You politely decline the offer.\n");
                }
                else
                {
                    System.out.println("You do not have enough money to buy.\n");
                }
            }
            System.out.print("Do you wish to continue looking at ARMOURS? (Y / N)" + "\n" + "Response: ");
            scan.nextLine();
            String response = scan.nextLine();
            int idk = Methods.simpleAction(response);
            if (idk == 1)
            {
                loop = true; //yes continue shopping in ARMOUR
            }
            else
            {
                loop = false; //no discontinue shopping
            }
        }
    }
    
    /**
     * Precondition - The Armor a is an actual armor and is of type Armor
     * Postcondition - The armors are swapped
     */
    public static void itemSwap(Armor a, MC hero)
    {
         hero.setMaxHP(hero.getMaxHP() - hero.getArmor().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() - hero.getArmor().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() - hero.getArmor().getHealBenefit());
         hero.setStrength(hero.getStrength() - hero.getArmor().getStrBenefit());   
         hero.setDefence(hero.getDefence() - hero.getArmor().getDefBenefit());
         hero.setAgility(hero.getAgility() - hero.getArmor().getAgilBenefit());
         hero.setMoney(hero.getMoney() + hero.getArmor().getPrice());
         
         hero.setArmor(a);
         
         hero.setMaxHP(hero.getMaxHP() + hero.getArmor().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() + hero.getArmor().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() + hero.getArmor().getHealBenefit());
         hero.setStrength(hero.getStrength() + hero.getArmor().getStrBenefit());
         hero.setDefence(hero.getDefence() + hero.getArmor().getDefBenefit());
         hero.setAgility(hero.getAgility() + hero.getArmor().getAgilBenefit());
         hero.setMoney(hero.getMoney() - hero.getArmor().getPrice());
    }
    
}
