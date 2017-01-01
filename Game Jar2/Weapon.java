import java.util.*;
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Item
{
    /**Basic Starting Equipment**/
    static Weapon fist = new Weapon ("Fist", 0, 0, 0, 0, 0, 0, 0, 0, 0, "Nothing beats a fist fight.");

    /**Generated Enemy Equipment**/
    static Weapon horns = new Weapon ("Horns", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon trotter = new Weapon ("Trotter", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon stinger = new Weapon ("Stinger", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon claws = new Weapon ("Claws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon rapier = new Weapon ("Rapier", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon beak = new Weapon ("Beak", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon vine = new Weapon ("Vine", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon ninjastar = new Weapon ("Stars", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon cudgel = new Weapon ("Cudgel", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon poison = new Weapon ("Poison", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon hydraskin = new Weapon ("Hydra skin", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon tusks = new Weapon ("Tusks", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon stool = new Weapon ("Stench", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon saddle = new Weapon ("Saddle", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon ironbeaks = new Weapon ("Iron beaks", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon spear = new Weapon ("Spear", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon club = new Weapon ("Club", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon firepoison = new Weapon ("Poisonous flames of Ladon", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon fireball = new Weapon ("Fireball", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon powerjaws = new Weapon ("Power jaws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon airblast =  new Weapon ("Air Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon waterblast =  new Weapon ("Water Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon earthblast =  new Weapon ("Earth Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon fireblast =  new Weapon ("Fire Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");        
    static Weapon bloodrage =  new Weapon ("Blood Rage", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon soulrage =  new Weapon ("Soul Rage", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon knowledge =  new Weapon ("Knowledge", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon lightblast =  new Weapon ("Light Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");    
    static Weapon demonclaws = new Weapon ("Demon Claws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon mirror =  new Weapon ("Mirror", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Weapon darkblast =  new Weapon ("Dark Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");

    /**Character Weapon**/
    //Staffs
    static Weapon woodstaff = new Weapon ("Wood Staff", 0, 0, 0, 5, 1, 1, 1, 1, 10, "Warning! For beginning mages or walking travelers only!");
    static Weapon ironstaff = new Weapon ("Iron Staff", 1, 3, 0, 10, 0, 2, 2, 0, 50, "Warning! This staff can give you an electric shock if your negatively charged!");
    static Weapon bigstaff = new Weapon ("Big Staff", 2, 5, 0, 10, 1, 3, 3, 0, 100, "It is a big staff, it takes alot of strength to carry it.");
    static Weapon powerstaff = new Weapon ("Power Staff", 3, 20, 0, 10, 1, 5, 2, 1, 400, "Warning! Don't use this for too long, you may just get too much power.");   
    static Weapon quickstaff = new Weapon ("Quick Staff", 4, 25, 0, 20, 1, 1, 2, 5, 400, "Warning! Speedy people will eventually get slower.");
    static Weapon defendstaff = new Weapon ("Defender Staff", 5, 30, 0, 50, 10, 5, 30, 5, 1000, "Warning! Using this too long may lead the opponents to finding ways to counter the effect.");
    static Weapon healthstaff = new Weapon ("Health Staff", 6, 35, 0, 150, 150, 8, 8, 8, 1000, "Warning! Using the healing power more than your limit can make even the healthiest feel sick.");
    static Weapon diamondstaff = new Weapon ("Diamond Staff", 7, 50, 0, 30, 30, 25, 25, 25, 10000, "Strongest of all the regular staffs. It is very bright and shiny, also deadly and painful.");
    static Weapon spiritstaff = new Weapon ("Spirit Staff", 8, 100, 0, 100, 100, 40, 40, 40, 120000, "Warning! It has a mind of it's own, do not let it overwhelm you, as even the greatest heroes can fall before the might of the Spirit that dwells within.");
    //Bows
    static Weapon oakbow = new Weapon ("Oak Bow", 10, 5, 0, 0, 1, 5, 1, 5, 50, "A standard bow used for game. Have fun hunting with this.");
    static Weapon willowbow = new Weapon ("Willow Bow", 11, 10, 0, 0, 1, 8, 1, 5, 100, "A willow bow is the standard bow used by yeomen for the army of the people. Be the proud citizen you are.");
    static Weapon maplebow = new Weapon ("Maple Bow", 12, 25, 0, 0, 2, 15, 2, 10, 300, "The bow standard for the city's archer army. Powerful and has a fast drawstring.");
    static Weapon yewbow = new Weapon ("Yew Bow", 13, 35, 0, 0, 2, 18, 2, 15, 700, "The bow standard for the city's elite archers. Very powerful and elegant. Gracefullness at it's best.");
    static Weapon powerbow = new Weapon ("Power Bow", 14, 60, 0, 0, 2, 35, 2, 15, 3500, "The bow forge by the greatest blacksmith in the city. Extremely powerful and dangerous to all.");
    static Weapon wingbow = new Weapon ("Winged Bow", 15, 100, 0, 0, 5, 40, 2, 50, 5000, "Bow has said to have been dropped by the angels of Heaven. Wield it with care, for the speed is tremendous, yet deathly.");
    static Weapon goldenbow = new Weapon ("Golden Bow", 16, 120, 0, 0, 5, 50, 5, 30, 10000, "The bow is said to have been given by Apollo himself. Forged from Olympus, this bow is precise and has a beautiful sound.");
    static Weapon dragonbow = new Weapon ("Dragon Bow", 17, 150, 0, 0, 10, 205, 0, 70, 800000, "The bow, uncovered in the ruins of the Sevanth War in Drakon's Front. Supposedly powered by the body of a Dragon, this bow has massive damage potential and rips armies to shreds");
    //Swords
    static Weapon stonesword = new Weapon ("Stone Sword", 20, 0, 0, 0, 0, 5, 5, 1, 70, "Blunt, but who ever said this wasn't handy?");
    static Weapon ironsword = new Weapon ("Iron Sword", 21, 5, 0, 0, 0, 15, 5, 2, 150, "A standard weapon used by the guards in the city.");
    static Weapon goldsword = new Weapon ("Gold Sword", 22, 10, 0, 0, 0, 10, 5, 5, 1000, "Shiny shiny sword, yet the blood doesn't stain.");
    static Weapon steelsword = new Weapon ("Steel Sword", 23, 15, 0, 0, 0, 20, 5, 3, 300, "A standard weapon used by the duelists in the city."); 
    static Weapon titaniumsword = new Weapon ("Titanium Sword", 24, 35, 0, 0, 0, 40, 5, 5, 800, "A superior weapon used by the upper class in the city."); 
    static Weapon diamondsword = new Weapon ("Diamond Sword", 25, 60, 0, 0, 0, 45, 10, 10, 1700, "A deadly weapon both exquisit and painful."); 
    static Weapon iridiumsword = new Weapon ("Iridium Sword", 26, 90, 0, 0, 0, 60, 10, 10, 4000, "A super weapon even greater than the diamond."); 
    static Weapon cometsword = new Weapon ("Comet Sword", 27, 120, 0, 0, 0, 75, 10, 30, 9500, "A weapon believed to be forged using the magic of a landed asteroid. The strength and durability is beyond the availiblity of Earth.");
    static Weapon shadowsword = new Weapon ("Shadow Sword", 28, 200, 0, 0, 0, 150, 50, 50, 600000, "The sword that encompasses the power of the shadows at night.");
    static Weapon spiritsword = new Weapon ("Spirit Sword", 29, 200, 0, 0, 0, 150, 50, 50, 700000, "A sword encompassing a great hero inside. Unlock the power and it could be yours."); 
    //Scimitars
    static Weapon ironscimitar = new Weapon ("Iron Scimitar", 30, 7, 0, 0, 0, 17, 3, 3, 100, "From the far middle east comes a common weapon that every belligerent bandit owns.");
    static Weapon silverscimitar = new Weapon ("Silver Scimitar", 31, 11, 0, 0, 0, 10, 3, 6, 900, "Shiny shiny scimitar, light, yet very durable.");
    static Weapon steelscimitar = new Weapon ("Steel Scimitar", 32, 25, 0, 0, 0, 22, 3, 3, 350, "A far superior weapon from those which one citizen uses everyday."); 
    static Weapon titaniumscimitar = new Weapon ("Titanium Scimitar", 33, 55, 0, 0, 0, 44, 4, 4, 1000, "A superior weapon used by the sheiks of the middle east."); 
    static Weapon diamondscimitar = new Weapon ("Diamond Scimitar", 34, 70, 0, 0, 0, 50, 7, 12, 2000, "A deadly weapon both exquisit and painful."); 
    static Weapon iridiumscimitar = new Weapon ("Iridium Scimitar", 35, 100, 0, 0, 0, 70, 8, 12, 5600, "A super weapon even greater than the diamond.");
    static Weapon cometscimitar = new Weapon ("Comet Scimitar", 36, 140, 0, 0, 0, 80, 5, 40, 12500, "A weapon believed to be forged using the magic of a landed asteroid. The strength and durability is beyond the availiblity of Earth.");
    static Weapon bloodscimitar = new Weapon ("Blood Scimitar", 37, 160, 0, 0, 0, 111, 20, 20, 340000, "The scimitar that encompasses the power of blood and feeds on pain.");
    static Weapon spiritscimitar = new Weapon ("Spirit Scimitar", 38, 205, 0, 0, 0, 160, 40, 60, 850000, "A scimitar encompassing a great hero inside. Unlock the power and it could be yours."); 
    //Axes
    static Weapon ironbattleaxe = new Weapon ("Iron Battle-axe", 40, 10, 0, 0, 0, 19, 6, 2, 150, "A heavy double bladed axe, only wielded by the strongest of the weak.");
    static Weapon steelbattleaxe = new Weapon ("Steel Battle-axe", 41, 35, 0, 0, 0, 25, 7, 2, 400, "A standard weapon used by the duelists in the city."); 
    static Weapon titaniumbattleaxe = new Weapon ("Titanium Battle-axe", 42, 60, 0, 0, 0, 46, 7, 3, 1200, "A superior weapon used by the upper class in the city."); 
    static Weapon diamondbattleaxe = new Weapon ("Diamond Battle-axe", 43, 85, 0, 0, 0, 55, 11, 5, 2300, "A deadly weapon both exquisit and painful."); 
    static Weapon iridiumbattleaxe = new Weapon ("Iridium Battle-axe", 44, 110, 0, 0, 0, 80, 15, 5, 8000, "A super weapon even greater than the diamond."); 
    static Weapon relentlessbattleaxe = new Weapon ("Relentless Battle-axe", 45, 150, 0, 0, 0, 100, 16, 7, 40000, "The axe that encompasses the power of fury.");
    static Weapon elementalbattleaxe = new Weapon ("Elemental Battle-axe", 46, 175, 0, 0, 0, 115, 18, 7, 420000, "The battle axe possessing the power of all the elements. Do good with it.");
    static Weapon spiritbattleaxe = new Weapon ("Spirit Battle-axe", 47, 210, 0, 0, 0, 175, 50, 35, 900000, "A battleaxe encompassing a great hero inside. Unlock the power and it could be yours."); 
    //2-hand
    static Weapon irontwohand = new Weapon ("Iron 2h", 50, 12, 0, 0, 0, 20, 4, 0, 200, "A giant weapon used by the guards near the castle, these are powerful, but take great skill to wield.");
    static Weapon steeltwohand = new Weapon ("Steel 2h", 51, 50, 0, 0, 0, 28, 5, 0, 500, "A weapon used consistantly by the guards near the city's important figures.");
    static Weapon titaniumtwohand = new Weapon ("Titanium 2h", 52, 70, 0, 0, 0, 50, 5, 0, 1500, "The strongest of the earth made items. It really packs a punch."); 
    static Weapon iridiumtwohand = new Weapon ("Iridium 2h", 53, 120, 0, 0, 0, 85, 15, 0, 10000, "A super weapon even greater than the diamond. It can cut diamond into pieces."); 
    static Weapon speedtwohand = new Weapon ("Speedy 2h", 54, 125, 0, 0, 0, 90, 10, 50, 60000, "The weapon has the agility that can almost double your speed.");
    static Weapon flamingtwohand = new Weapon ("Flaming 2h", 55, 155, 0, 0, 0, 100, 30, 20, 200000, "Remarkably unusual weapon that never goes out.");
    static Weapon gildedtwohand = new Weapon ("Gilded 2h", 56, 175, 0, 0, 0, 150, 40, 40, 950000, "Forged by the Elves of Light, this 2h has unknown powers that glistens in daylight.");
    //Halebard
    static Weapon ironhalebard = new Weapon ("Iron Halebard", 60, 14, 0, 0, 0, 22, 2, 5, 250, "A standard weapon by the guards in the city near outposts.");
    static Weapon steelhalebard = new Weapon ("Steel Halebard", 61, 65, 0, 0, 0, 30, 3, 10, 600, "A weapon used consistantly by the superior forces of the inner walls.");
    static Weapon titaniumhalebard = new Weapon ("Titanium Halebard", 62, 72, 0, 0, 0, 55, 5, 0, 1900, "The strongest of the earth made items. Delicate and rings to your ears."); 
    static Weapon iridiumhalebard = new Weapon ("Iridium Halebard",63, 125, 0, 0, 0, 90, 6, 0, 13400, "A super weapon even greater than the diamond. Makes this weapon deadly beyond belief."); 
    static Weapon powerhalebard = new Weapon ("Power Halebard", 64, 140, 0, 0, 0, 110, 8, 0, 58000, "The halebard here has the power to cut through anything.");
    static Weapon balancedhalebard = new Weapon ("Balanced Halebard", 65, 141, 0, 0, 0, 105, 10, 25, 90000, "Halebard with balance, what more could you get?");
    static Weapon darkhalebard = new Weapon ("Dark Halebard", 66, 195, 0, 0, 0, 125, 20, 45, 250000, "Supposedly dropped by the Reaper's Lieutenant himself in the Sevanth War in Diablo's Corneath, beware how often you use this for it could end your life.");
    static Weapon greaterhalebard = new Weapon ("Greater Halebard", 67, 215, 0, 0, 0, 180, 25, 60, 1000000, "Combined with the heroes and goodly spirits, this halebard can suppress the evil thoughts and keep you pure in the blackets of days");
    //Unlockables UNFINISHED
    static Weapon bishopgold = new Weapon ("Bishop's Gold", 80, 0, 4, 100, 0, 1, 1, 1, 10000, "Just like a bishop would, it is being charged a hefty and unreasonable sum.");
    static Weapon robinbow = new Weapon ("Robin Hood's Bow", 81, 0, 6, 50, 50, 35, 10, 35, 12000, "The very famous bow from Robin Hood, himself!");
    static Weapon goblinmace = new Weapon ("Goblin's Mace", 82, 0, 8, 30, 0, 20, 15, 30, 17000, "The goblin mace that was taken from the chief.");
    static Weapon bonesword = new Weapon ("Bone Sword", 84, 0, 11, 0, 30, 50, -10, 15, 250000, "The bone sword is the great sword wielded by the king of the skeletons.");
    static Weapon poisonbow = new Weapon ("Poisoned Bow of the Hydra", 85, 0, 12, 0, 0, 100, 50, 20, 500000, "The great poison from the hydra proves to be an extreme weapon of mass destruction.");
    static Weapon silverbow = new Weapon ("Silver Bow", 86, 0, 14, 50, 50, 50, 50, 50, 600000, "The great Dianan Power rests in this bow.");
    static Weapon amazonspear = new Weapon ("Hippolyte Spear", 87, 0, 22, 10, 10, 75, 70, 50, 700000, "For a heavy spear, this can give you alot of agility. Just another great weapon.");
    static Weapon powerfist = new Weapon ("Power fists", 88, 0, 24, 0, 0, 100, 50, 100, 1000000, "DANG NATURE, YOU SCARRYYYYY.");
    static Weapon bident = new Weapon ("Bident", 89, 0, 31, 200, 200, 150, 150, 10, 1250000, "The weapon of Pluto is a dangerous one. Though extrememly powerful, \nyou do not have the agility, because the God does not need it.");
    static Weapon morningaxe = new Weapon ("Morning Axe", 90, 0, 38, 500, 0, 200, 40, 40, 1350000, "The weapon is extremely powerful, has a dark side from Mordred.");
    static Weapon holygrail = new Weapon ("Holy Grail", 91, 0, 39, 1000, 1000, 5, 5, 5, 1400000, "The holy grail is the greatest benefactor for a weapon type.");
    static Weapon merlinstaff = new Weapon ("Merlin's staff", 92, 0, 41, 100, 100, 80, 80, 80, 1500000, "The powerful staff of Merlin's is a questionable one.");
    static Weapon excalibur = new Weapon ("Excalibur", 93, 0, 42, 200, 200, 100, 100, 100, 2222222, "The sword that saved King Arthur countless times."); 
    static Weapon scythe = new Weapon ("Scythe", 94, 0, 53, 100, 50, 200, 10, 150, 2500000, "The scythe held by the Reaper before the end of his era.");
    static Weapon holycross = new Weapon ("Holy Cross", 95, 0, 54, 250, 250, 20, 100, 20, 2600000, "The cross that the angel's held in the Battle of Guarda. As a upside, it can defend you from attacks.");
    static Weapon dragonsword = new Weapon ("Sword of the Unified Dragons", 96, 0, 56, 500, 500, 300, 300, 300, 2700000, "The Dragon Master wields the most terrifying weapon, combined with the spirits of all the dragons.");
    static Weapon demonsword = new Weapon ("Broadsword of the Demons", 97, 0, 57, 300, 300, 500, 200, 200, 3000000, "Demons have fused their strength into this horrific weapon.");
    static Weapon trident = new Weapon ("Trident of Diablo", 98, 0, 59, 200, 200, 400, 400, 400, 5000000, "The trident that Diablo holdes is powered by the souls of the ones he captures.");
    static Weapon swordoflight = new Weapon ("Sword of Light", 99, 0, 64, 500, 600, 500, 500, 550, 10000000, "The all powerful sword in which legend has it that Constantus lives within the blade.");

    public Weapon (String name, int ID, int minLevel, int questNumber, int hpbenefit, int healbenefit, int strbenefit, int defbenefit, int agilbenefit, int price, String description)
    {
        super(name,ID,minLevel,questNumber,hpbenefit,healbenefit,strbenefit,defbenefit,agilbenefit,price,description);
    }
    
    /**
     * The weapon displays the weapons to the player and the player can use that to buy equipments
     * and what not to improve his character.
     * Precondition - Hero is a created object with actual value
     * Postcondition - The hero ends up with a different weapon or has the same weapon
     */
    public static void buying(MC hero)
    {      
        Scanner scan = new Scanner (System.in);
        boolean loop = true;
        while (loop == true) //while you are still in the shop, will loop until you wish to stop shopping
        {
            ArrayList <Weapon> weapons = new ArrayList <Weapon> ();
            Weapon [ ] storage = {woodstaff,ironstaff,bigstaff,powerstaff,quickstaff,defendstaff,healthstaff,
                    diamondstaff,spiritstaff,oakbow,willowbow,maplebow,yewbow,powerbow,wingbow,goldenbow,dragonbow,
                    stonesword,ironsword,goldsword,steelsword,titaniumsword,diamondsword,iridiumsword,cometsword,
                    shadowsword,spiritsword,ironscimitar,silverscimitar,steelscimitar,diamondscimitar,iridiumscimitar,
                    cometscimitar,bloodscimitar,spiritscimitar,ironbattleaxe,steelbattleaxe,titaniumbattleaxe,diamondbattleaxe,
                    iridiumbattleaxe,relentlessbattleaxe,elementalbattleaxe,spiritbattleaxe,irontwohand,steeltwohand,titaniumtwohand,
                    iridiumtwohand,speedtwohand,flamingtwohand,gildedtwohand,ironhalebard,steelhalebard,titaniumhalebard,
                    iridiumhalebard,powerhalebard,balancedhalebard,darkhalebard,greaterhalebard}; //puts all the weapons into a list
            for (Weapon w : storage) //for loop
            {
                if (hero.getLevel() >= w.getMinLevel())
                {
                    weapons.add(w); //puts the weapon in the arraylist of possible weapons to buy
                    System.out.println(w.getID() + ". " + w.getName()); //prints out the name, and ID
                }
            }
            Weapon [ ] queststorage = {bishopgold,robinbow,goblinmace,bonesword,poisonbow,silverbow,amazonspear,powerfist,bident,
                    morningaxe,holygrail,merlinstaff,excalibur,scythe,holycross,dragonsword,demonsword,trident,swordoflight}; //puts all quest weapons into a list
            System.out.println("\nQuest Weapons:\n");
            for (Weapon w : queststorage) //for loop
            {
                if (hero.getQuestNumber() > w.getQuestNumber())
                {   
                    weapons.add(w); //puts the weapon in the arraylist of possible weapons to buy
                    System.out.println(w.getID() + ". " + w.getName()); //prints out the name, and ID
                }
            }
            System.out.println("999. Leave shop\n\n"); //prints out the quit
            System.out.println("You currently have:     " + hero.getMoney() + " coins. \nYou own a(n):      " + hero.getWeapon().getName() + "."); //prints out what you are carrying with you
            System.out.println("Type in the serial number to see information and buy.");
            int serialnumber = scan.nextInt();
            Weapon DC = new Weapon ("Null", 0, 0, 0, 0, 0, 0, 0, 0, 0, "The front window"); //display case
            if (serialnumber == 999)
            {
                return;
            }
            for (Weapon w : weapons) //checks to see if the one you picked matches any of the weapons
            {
                if (w.getID() == serialnumber)
                {
                    DC = w;
                }
            }
            if (DC.getName().equals("Null")) //if you did not pick any, then prints that out
            {
                System.out.println("You did not pick out a weapon.");
            }
            else //displays what you chose
            {
                System.out.println("\n"
                    + "Display Weapon: " + DC.getName() + "          Carried Weapon: " + hero.getWeapon().getName() + "\n" 
                    + "Serial Number:      " + DC.getID() + "                    " + hero.getWeapon().getID() + "\n"
                    + "Minimum Level:      " + DC.getMinLevel() + "                    " + hero.getWeapon().getMinLevel() + "\n"
                    + "Quest number:       " + DC.getQuestNumber() + "                    " + hero.getWeapon().getQuestNumber() + "\n"
                    + "HP benefit:         " + DC.getHPBenefit() + "                    " + hero.getWeapon().getHPBenefit() + "\n" 
                    + "Heal Benefit:       " + DC.getHealBenefit() + "                    " + hero.getWeapon().getHealBenefit() + "\n"
                    + "Strength Benefit:   " + DC.getStrBenefit() + "                    " + hero.getWeapon().getStrBenefit() + "\n"
                    + "Defense Benefit:    " + DC.getDefBenefit() + "                    " + hero.getWeapon().getDefBenefit() + "\n"
                    + "Agility Benefit:    " + DC.getAgilBenefit() + "                    " + hero.getWeapon().getAgilBenefit() + "\n" 
                    + "\n\nPrice:              " + DC.getPrice() + "\n"
                    + "Description: \n" + DC.getDescription()
                    + "\n\n"); //the weapon wish to purchase stats

                System.out.println("Hero: " + hero.getName() + "     current money: " + hero.getMoney() + "\n<press any key to continue>");

                scan.nextLine();
                String response = scan.nextLine();
                System.out.println("Do you wish to purchase this? (Y / N)" ); //asks if you wish to purchase
                response = scan.nextLine();
                if (response.equalsIgnoreCase("Y") &&hero.getMoney() >= DC.getPrice()) //yes, you buy it and it deducts money from you
                {
                    itemSwap(DC,hero);
                }
                else if (response.equalsIgnoreCase("N")) //you dont want to buy it, it takes to decision point
                {
                    System.out.println("You politely decline the offer.\n");
                }
                else if (response.equalsIgnoreCase("Y") && hero.getMoney() < DC.getPrice()) //you say yes, but don't have enough money
                {
                    System.out.println("You do not have enough money to buy.\n");
                }
                else
                {
                    System.out.println("CPU does not understand the command.\n");
                }
            }
            System.out.print("Do you wish to continue looking at WEAPONS? (Y / N)\nResponse: " + "\n" + "Response: "); //decision point for whether to continue to shop
            String response = scan.nextLine();
            int idk = Methods.simpleAction(response);
            if (idk == 1) //returns if you want to keep shopping
            {
                loop = true; //yes
            }
            else
            {
                loop = false; //no, quits the loop
            }
        }
    }

    /**
     * Precondition - Weapon i is an actual Weapon and is a weapon
     * Postcondition - The weapons are swapped
     */
    public static void itemSwap(Weapon w, MC hero)
    {
        hero.setMaxHP(hero.getMaxHP() - hero.getWeapon().getHPBenefit());
        hero.setMinHeal(hero.getMinHeal() - hero.getWeapon().getHealBenefit());
        hero.setMaxHeal(hero.getMaxHeal() - hero.getWeapon().getHealBenefit());
        hero.setStrength(hero.getStrength() - hero.getWeapon().getStrBenefit());   
        hero.setDefence(hero.getDefence() - hero.getWeapon().getDefBenefit());
        hero.setAgility(hero.getAgility() - hero.getWeapon().getAgilBenefit());
        hero.setMoney(hero.getMoney() + hero.getWeapon().getPrice());

        hero.setWeapon(w);

        hero.setMaxHP(hero.getMaxHP() + hero.getWeapon().getHPBenefit());
        hero.setMinHeal(hero.getMinHeal() + hero.getWeapon().getHealBenefit());
        hero.setMaxHeal(hero.getMaxHeal() + hero.getWeapon().getHealBenefit());
        hero.setStrength(hero.getStrength() + hero.getWeapon().getStrBenefit());
        hero.setDefence(hero.getDefence() + hero.getWeapon().getDefBenefit());
        hero.setAgility(hero.getAgility() + hero.getWeapon().getAgilBenefit());
        hero.setMoney(hero.getMoney() - hero.getWeapon().getPrice());
    }
}
