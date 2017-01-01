import java.util.*;
/**
 * Items has all the items (weapon or armor) that ANY character can use. Some have ID's and benefits, some do not.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    String name = "", description;
    int ID = 0, primarybenefit = 0, benefit = 0, price = 0, minLevel = 0, questNumber = 0, hpbenefit = 0, healbenefit = 0, strbenefit = 0, defbenefit = 0, agilbenefit = 0;
    //armor mainly benefits defense/agility, weapon mainly benefits attack/defense
    
    /** name, ID, min level, quest numb, hp benefit, heal benefit, str benefit, def benefit, agil benefit, price, description**/
    
    /**Basic Starting Equipment**/
    static Item fist = new Item ("Fist", 0, 0, 0, 0, 0, 0, 0, 0, 0, "Nothing beats a fist fight.");
    static Item clothes = new Item ("Clothes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "Clothes.");
    
    /**Generated Enemy Equipment**/
    static Item trotter = new Item ("Trotter", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item stinger = new Item ("Stinger", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item claws = new Item ("Claws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item rapier = new Item ("Rapier", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item beak = new Item ("Beak", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item vine = new Item ("Vine", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item ninjastar = new Item ("Stars", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item cudgel = new Item ("Cudgel", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item poison = new Item ("Poison", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item hydraskin = new Item ("Hydra skin", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item tusks = new Item ("Tusks", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item stool = new Item ("Stench", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item saddle = new Item ("Saddle", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item ironbeaks = new Item ("Iron beaks", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item bighorns = new Item ("Big Horns", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item leatherhide = new Item ("Leather hide", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item spear = new Item ("Spear", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item club = new Item ("Club", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item firepoison = new Item ("Poisonous flames of Ladon", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item fireball = new Item ("Fireball", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item dragonskin = new Item ("Dragon skin", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item powerjaws = new Item ("Power jaws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item hadescollar = new Item ("Hade's Collar", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item flyingwings = new Item ("Eagle's Wings", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item robes =  new Item ("Robes", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item moon = new Item ("Moon of the Werewolf", 54, 0, 0, 61, 61, -5, -5, -5, 2000, "The moon that makes this creatures so deadly.");
    static Item airblast =  new Item ("Air Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item waterblast =  new Item ("Water Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item earthblast =  new Item ("Earth Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item fireblast =  new Item ("Fire Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");        
    static Item bloodrage =  new Item ("Blood Rage", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item soulrage =  new Item ("Soul Rage", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item knowledge =  new Item ("Knowledge", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item lightblast =  new Item ("Light Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");    
    static Item wateraura =  new Item ("Water Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item earthaura =  new Item ("Earth Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item fireaura =  new Item ("Fire Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item bloodaura =  new Item ("Blood Aura", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item bookcover =  new Item ("Bookcover", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item demonclaws = new Item ("Demon Claws", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item shadow =  new Item ("Shadow", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item mirror =  new Item ("Mirror", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    static Item darkblast =  new Item ("Dark Blast", 0, 0, 0, 0, 0, 0, 0, 0, 0, "");
    
    /**Character Equipment**/
        /**Weapon**/    
            //Staffs
            static Item woodstaff = new Item ("Wood Staff", 0, 0, 0, 5, 1, 1, 1, 1, 10, "Warning! For beginning mages or walking travelers only!");
            static Item ironstaff = new Item ("Iron Staff", 1, 3, 0, 10, 0, 2, 2, 0, 50, "Warning! This staff can give you an electric shock if your negatively charged!");
            static Item bigstaff = new Item ("Big Staff", 2, 5, 0, 10, 1, 3, 3, 0, 100, "It is a big staff, it takes alot of strength to carry it.");
            static Item powerstaff = new Item ("Power Staff", 3, 20, 0, 10, 1, 5, 2, 1, 400, "Warning! Don't use this for too long, you may just get too much power.");   
            static Item quickstaff = new Item ("Quick Staff", 4, 25, 0, 20, 1, 1, 2, 5, 400, "Warning! Speedy people will eventually get slower.");
            static Item defendstaff = new Item ("Defender Staff", 5, 30, 0, 50, 10, 5, 30, 5, 1000, "Warning! Using this too long may lead the opponents to finding ways to counter the effect.");
            static Item healthstaff = new Item ("Health Staff", 6, 35, 0, 150, 150, 8, 8, 8, 1000, "Warning! Using the healing power more than your limit can make even the healthiest feel sick.");
            static Item diamondstaff = new Item ("Diamond Staff", 7, 50, 0, 30, 30, 25, 25, 25, 10000, "Strongest of all the regular staffs. It is very bright and shiny, also deadly and painful.");
            static Item spiritstaff = new Item ("Spirit Staff", 8, 100, 0, 100, 100, 40, 40, 40, 120000, "Warning! It has a mind of it's own, do not let it overwhelm you, as even the greatest heroes can fall before the might of the Spirit that dwells within.");
            //Bows
            static Item oakbow = new Item ("Oak Bow", 10, 5, 0, 0, 1, 5, 1, 5, 50, "A standard bow used for game. Have fun hunting with this.");
            static Item willowbow = new Item ("Willow Bow", 11, 10, 0, 0, 1, 8, 1, 5, 100, "A willow bow is the standard bow used by yeomen for the army of the people. Be the proud citizen you are.");
            static Item maplebow = new Item ("Maple Bow", 12, 25, 0, 0, 2, 15, 2, 10, 300, "The bow standard for the city's archer army. Powerful and has a fast drawstring.");
            static Item yewbow = new Item ("Yew Bow", 13, 35, 0, 0, 2, 18, 2, 15, 700, "The bow standard for the city's elite archers. Very powerful and elegant. Gracefullness at it's best.");
            static Item powerbow = new Item ("Power Bow", 14, 60, 0, 0, 2, 35, 2, 15, 3500, "The bow forge by the greatest blacksmith in the city. Extremely powerful and dangerous to all.");
            static Item wingbow = new Item ("Winged Bow", 15, 100, 0, 0, 5, 40, 2, 50, 5000, "Bow has said to have been dropped by the angels of Heaven. Wield it with care, for the speed is tremendous, yet deathly.");
            static Item goldenbow = new Item ("Golden Bow", 16, 120, 0, 0, 5, 50, 5, 30, 10000, "The bow is said to have been given by Apollo himself. Forged from Olympus, this bow is precise and has a beautiful sound.");
            static Item dragonbow = new Item ("Dragon Bow", 17, 150, 0, 0, 10, 205, 0, 70, 800000, "The bow, uncovered in the ruins of the Sevanth War in Drakon's Front. Supposedly powered by the body of a Dragon, this bow has massive damage potential and rips armies to shreds");
            //Swords
            static Item stonesword = new Item ("Stone Sword", 20, 0, 0, 0, 0, 5, 5, 1, 70, "Blunt, but who ever said this wasn't handy?");
            static Item ironsword = new Item ("Iron Sword", 21, 5, 0, 0, 0, 15, 5, 2, 150, "A standard weapon used by the guards in the city.");
            static Item goldsword = new Item ("Gold Sword", 22, 10, 0, 0, 0, 10, 5, 5, 1000, "Shiny shiny sword, yet the blood doesn't stain.");
            static Item steelsword = new Item ("Steel Sword", 23, 15, 0, 0, 0, 20, 5, 3, 300, "A standard weapon used by the duelists in the city."); 
            static Item titaniumsword = new Item ("Titanium Sword", 24, 35, 0, 0, 0, 40, 5, 5, 800, "A superior weapon used by the upper class in the city."); 
            static Item diamondsword = new Item ("Diamond Sword", 25, 60, 0, 0, 0, 45, 10, 10, 1700, "A deadly weapon both exquisit and painful."); 
            static Item iridiumsword = new Item ("Iridium Sword", 26, 90, 0, 0, 0, 60, 10, 10, 4000, "A super weapon even greater than the diamond."); 
            static Item cometsword = new Item ("Comet Sword", 27, 120, 0, 0, 0, 75, 10, 30, 9500, "A weapon believed to be forged using the magic of a landed asteroid. The strength and durability is beyond the availiblity of Earth.");
            static Item shadowsword = new Item ("Shadow Sword", 28, 200, 0, 0, 0, 150, 50, 50, 600000, "The sword that encompasses the power of the shadows at night.");
            static Item spiritsword = new Item ("Spirit Sword", 29, 200, 0, 0, 0, 150, 50, 50, 700000, "A sword encompassing a great hero inside. Unlock the power and it could be yours."); 
            //Scimitars
            static Item ironscimitar = new Item ("Iron Scimitar", 30, 7, 0, 0, 0, 17, 3, 3, 100, "From the far middle east comes a common weapon that every belligerent bandit owns.");
            static Item silverscimitar = new Item ("Silver Scimitar", 31, 11, 0, 0, 0, 10, 3, 6, 900, "Shiny shiny scimitar, light, yet very durable.");
            static Item steelscimitar = new Item ("Steel Scimitar", 32, 25, 0, 0, 0, 22, 3, 3, 350, "A far superior weapon from those which one citizen uses everyday."); 
            static Item titaniumscimitar = new Item ("Titanium Scimitar", 33, 55, 0, 0, 0, 44, 4, 4, 1000, "A superior weapon used by the sheiks of the middle east."); 
            static Item diamondscimitar = new Item ("Diamond Scimitar", 34, 70, 0, 0, 0, 50, 7, 12, 2000, "A deadly weapon both exquisit and painful."); 
            static Item iridiumscimitar = new Item ("Iridium Scimitar", 35, 100, 0, 0, 0, 70, 8, 12, 5600, "A super weapon even greater than the diamond."); 
            static Item cometscimitar = new Item ("Comet Scimitar", 36, 140, 0, 0, 0, 80, 5, 40, 12500, "A weapon believed to be forged using the magic of a landed asteroid. The strength and durability is beyond the availiblity of Earth.");
            static Item bloodscimitar = new Item ("Blood Scimitar", 37, 160, 0, 0, 0, 111, 20, 20, 340000, "The scimitar that encompasses the power of blood and feeds on pain.");
            static Item spiritscimitar = new Item ("Spirit Scimitar", 38, 205, 0, 0, 0, 160, 40, 60, 850000, "A scimitar encompassing a great hero inside. Unlock the power and it could be yours."); 
            //Axes
            static Item ironbattleaxe = new Item ("Iron Battle-axe", 40, 10, 0, 0, 0, 19, 6, 2, 150, "A heavy double bladed axe, only wielded by the strongest of the weak.");
            static Item steelbattleaxe = new Item ("Steel Battle-axe", 41, 35, 0, 0, 0, 25, 7, 2, 400, "A standard weapon used by the duelists in the city."); 
            static Item titaniumbattleaxe = new Item ("Titanium Battle-axe", 42, 60, 0, 0, 0, 46, 7, 3, 1200, "A superior weapon used by the upper class in the city."); 
            static Item diamondbattleaxe = new Item ("Diamond Battle-axe", 43, 85, 0, 0, 0, 55, 11, 5, 2300, "A deadly weapon both exquisit and painful."); 
            static Item iridiumbattleaxe = new Item ("Iridium Battle-axe", 44, 110, 0, 0, 0, 80, 15, 5, 8000, "A super weapon even greater than the diamond."); 
            static Item relentlessbattleaxe = new Item ("Relentless Battle-axe", 45, 150, 0, 0, 0, 100, 16, 7, 40000, "The axe that encompasses the power of fury.");
            static Item elementalbattleaxe = new Item ("Elemental Battle-axe", 46, 175, 0, 0, 0, 115, 18, 7, 420000, "The battle axe possessing the power of all the elements. Do good with it.");
            static Item spiritbattleaxe = new Item ("Spirit Battle-axe", 47, 210, 0, 0, 0, 175, 50, 35, 900000, "A battleaxe encompassing a great hero inside. Unlock the power and it could be yours."); 
            //2-hand
            static Item irontwohand = new Item ("Iron 2h", 50, 12, 0, 0, 0, 20, 4, 0, 200, "A giant weapon used by the guards near the castle, these are powerful, but take great skill to wield.");
            static Item steeltwohand = new Item ("Steel 2h", 51, 50, 0, 0, 0, 28, 5, 0, 500, "A weapon used consistantly by the guards near the city's important figures.");
            static Item titaniumtwohand = new Item ("Titanium 2h", 52, 70, 0, 0, 0, 50, 5, 0, 1500, "The strongest of the earth made items. It really packs a punch."); 
            static Item iridiumtwohand = new Item ("Iridium 2h", 53, 120, 0, 0, 0, 85, 15, 0, 10000, "A super weapon even greater than the diamond. It can cut diamond into pieces."); 
            static Item speedtwohand = new Item ("Speedy 2h", 54, 125, 0, 0, 0, 90, 10, 50, 60000, "The weapon has the agility that can almost double your speed.");
            static Item flamingtwohand = new Item ("Flaming 2h", 55, 155, 0, 0, 0, 100, 30, 20, 200000, "Remarkably unusual weapon that never goes out.");
            static Item gildedtwohand = new Item ("Gilded 2h", 56, 175, 0, 0, 0, 150, 40, 40, 950000, "Forged by the Elves of Light, this 2h has unknown powers that glistens in daylight.");
            //Halebard
            static Item ironhalebard = new Item ("Iron Halebard", 60, 14, 0, 0, 0, 22, 2, 5, 250, "A standard weapon by the guards in the city near outposts.");
            static Item steelhalebard = new Item ("Steel Halebard", 61, 65, 0, 0, 0, 30, 3, 10, 600, "A weapon used consistantly by the superior forces of the inner walls.");
            static Item titaniumhalebard = new Item ("Titanium Halebard", 62, 72, 0, 0, 0, 55, 5, 0, 1900, "The strongest of the earth made items. Delicate and rings to your ears."); 
            static Item iridiumhalebard = new Item ("Iridium Halebard",63, 125, 0, 0, 0, 90, 6, 0, 13400, "A super weapon even greater than the diamond. Makes this weapon deadly beyond belief."); 
            static Item powerhalebard = new Item ("Power Halebard", 64, 140, 0, 0, 0, 110, 8, 0, 58000, "The halebard here has the power to cut through anything.");
            static Item balancedhalebard = new Item ("Balanced Halebard", 65, 141, 0, 0, 0, 105, 10, 25, 90000, "Halebard with balance, what more could you get?");
            static Item darkhalebard = new Item ("Dark Halebard", 66, 195, 0, 0, 0, 125, 20, 45, 250000, "Supposedly dropped by the Reaper's Lieutenant himself in the Sevanth War in Diablo's Corneath, beware how often you use this for it could end your life.");
            static Item greaterhalebard = new Item ("Greater Halebard", 67, 215, 0, 0, 0, 180, 25, 60, 1000000, "Combined with the heroes and goodly spirits, this halebard can suppress the evil thoughts and keep you pure in the blackets of days");
            //Unlockables UNFINISHED
            static Item bishopgold = new Item ("Bishop's Gold", 80, 0, 4, 100, 0, 1, 1, 1, 10000, "Just like a bishop would, it is being charged a hefty and unreasonable sum.");
            static Item robinbow = new Item ("Robin Hood's Bow", 81, 0, 6, 50, 50, 35, 10, 35, 12000, "The very famous bow from Robin Hood, himself!");
            static Item goblinmace = new Item ("Goblin's Mace", 82, 0, 8, 30, 0, 20, 15, 30, 17000, "The goblin mace that was taken from the chief.");
            static Item bonesword = new Item ("Bone Sword", 84, 0, 11, 0, 30, 50, -10, 15, 250000, "The bone sword is the great sword wielded by the king of the skeletons.");
            static Item poisonbow = new Item ("Poisoned Bow of the Hydra", 85, 0, 12, 0, 0, 100, 50, 20, 500000, "The great poison from the hydra proves to be an extreme weapon of mass destruction.");
            static Item silverbow = new Item ("Silver Bow", 86, 0, 14, 50, 50, 50, 50, 50, 600000, "The great Dianan Power rests in this bow.");
            static Item amazonspear = new Item ("Hippolyte Spear", 87, 0, 22, 10, 10, 75, 70, 50, 700000, "For a heavy spear, this can give you alot of agility. Just another great weapon.");
            static Item powerfist = new Item ("Power fists", 88, 0, 24, 0, 0, 100, 50, 100, 1000000, "DANG NATURE, YOU SCARRYYYYY.");
            static Item bident = new Item ("Bident", 89, 0, 31, 200, 200, 150, 150, 10, 1250000, "The weapon of Pluto is a dangerous one. Though extrememly powerful, \nyou do not have the agility, because the God does not need it.");
            static Item morningaxe = new Item ("Morning Axe", 90, 0, 38, 500, 0, 200, 40, 40, 1350000, "The weapon is extremely powerful, has a dark side from Mordred.");
            static Item holygrail = new Item ("Holy Grail", 91, 0, 39, 1000, 1000, 5, 5, 5, 1400000, "The holy grail is the greatest benefactor for a weapon type.");
            static Item merlinstaff = new Item ("Merlin's staff", 92, 0, 41, 100, 100, 80, 80, 80, 1500000, "The powerful staff of Merlin's is a questionable one.");
            static Item excalibur = new Item ("Excalibur", 93, 0, 42, 200, 200, 100, 100, 100, 2222222, "The sword that saved King Arthur countless times."); 
            static Item scythe = new Item ("Scythe", 94, 0, 53, 100, 50, 200, 10, 150, 2500000, "The scythe held by the Reaper before the end of his era.");
            static Item holycross = new Item ("Holy Cross", 95, 0, 54, 250, 250, 20, 100, 20, 2600000, "The cross that the angel's held in the Battle of Guarda. As a upside, it can defend you from attacks.");
            static Item dragonsword =  new Item ("Sword of the Unified Dragons", 96, 0, 56, 500, 500, 300, 300, 300, 2700000, "The Dragon Master wields the most terrifying weapon, combined with the spirits of all the dragons.");
            static Item demonsword = new Item ("Broadsword of the Demons", 97, 0, 57, 300, 300, 500, 200, 200, 3000000, "Demons have fused their strength into this horrific weapon.");
            static Item trident = new Item ("Trident of Diablo", 98, 0, 59, 200, 200, 400, 400, 400, 5000000, "The trident that Diablo holdes is powered by the souls of the ones he captures.");
            static Item swordoflight = new Item ("Sword of Light", 99, 0, 64, 500, 600, 500, 500, 550, 10000000, "The all powerful sword in which legend has it that Constantus lives within the blade.");
            
        /**Character Armour**/
            //Shields
            static Item woodshield = new Item ("Wood Shield", 0, 0, 0, 5, 0, 5, 40, 10, 10, "A sturdy wood shield can protect you from the most basic weapons.");
            static Item bronzeshield = new Item ("Bronze Shield", 1, 5, 0, 15, 0, 10, 50, 20, 50, "It may be soft, but it's better than splinters.");
            static Item ironshield = new Item ("Iron Shield", 2, 10, 0, 25, 0, 15, 60, 25, 200, "A wraught iron shield can protect you from the metal weapons effectively.");
            static Item steelshield = new Item ("Steel Shield", 3, 20, 0, 35, 0, 20, 70, 30, 1000, "A steel shield is much stronger than an iron shield, and less heavy.");
            static Item goldshield = new Item ("Golden Shield", 4, 50, 0, 45, 0, 25, 90, 35, 10000, "A golden shield can lead you through even the darkest days.");
            static Item spiritshield = new Item ("Spirit Shield", 5, 100, 0, 105, 0, 30, 150, 50, 300000, "A spirit hides in the shield, either protecting you or waiting for the right time to hurt you.");
            //Chainmail
            static Item bronzemail = new Item ("Bronze Mail", 10, 6, 0, 20, 0, 20, 55, 20, 90, "It offers the simplest of protection with its brown links.");
            static Item ironmail = new Item ("Iron Mail", 11, 16, 0, 25, 0, 30, 70, 30, 400, "One of the standard armors from the guards in the city.");
            static Item steelmail = new Item ("Steel Mail", 12, 26, 0, 30, 0, 35, 75, 35, 1200, "One of the standard armors from the elite guards in the city.");
            static Item titaniummail = new Item ("Titanium Mail", 13, 50, 0, 35, 0, 40, 90, 40, 5000, "A strong chain links of armor, able to withstand some of the strongest attacks.");
            static Item goldmail = new Item ("Gold Mail", 14, 75, 0, 40, 0, 45, 80, 45, 7000, "Not really the best choice of armor, but hey, maybe the enemies will be blinded to death.");
            static Item shellmail = new Item ("Shells of Mail", 15, 95, 0, 50, 0, 50, 100, 50, 200000, "Made from shells found in the ocean, on land, basically anywhere, this can be worn as protection or as a moveable home.");
            //Big helmets
            static Item woodbighelm = new Item("Wood Big Helm", 20, 0, 0, 0, 5, 30, 50, 10, 20, "This looks more like a giant pot if you ask me.");
            static Item ironbighelm = new Item("Iron Big Helm", 21, 15, 0, 0, 10, 35, 55, 15, 200, "These huge a$& helmets somehow effectively protect you just as well, maybe even better than armor.");
            static Item goldbighelm = new Item ("Gold Big Helm", 22, 50, 0, 0, 15, 40, 60, 20, 5000, "A gianormous bobblesize head of a helm, even better because it comes with grills yoo.");
            static Item steelbighelm = new Item ("Steel Big Helm", 23, 60, 0, 0, 20, 45, 65, 25, 4000, "One of the standard helmets for the big headed people in the city.");
            static Item titaniumbighelm = new Item ("Titanium Big Helm", 24, 70, 0, 0, 25, 50, 70, 30, 9000, "A strong binding of helmet pieces, able to withstand the strongest attacks.");
            static Item plummetbighelm = new Item ("Plummeted Big Helm", 25, 80, 0, 0, 30, 60, 75, 35, 50000, "These helmets were worn by the enormously sized domed leaders of war.");
            static Item talkingbighelm = new Item ("Talking Big Helm", 26, 90, 0, 0, 35, 100, 100, 35, 220000, "It's like having a second body and a second face.");
            static Item lavabighelm = new Item ("Lava Big Helm", 27, 110, 0, 0, 40, 70, 120, 40, 400000, "Why would anyone touch this helmet, even wear this helmet. Its basically made from lava that has not been cooled completely.");
            //Armor Set
            static Item leatherarmor = new Item ("Leather Armor", 30, 10, 0, 30, 0, 10, 60, 10, 110, "This is the most basic of armors. It will keep you with minimal protection.");
            static Item stonearmor = new Item ("Stone Armor", 31, 15, 0, 40, 0, 15, 70, 15, 400, "Having a stone armor can really make you feel like living in a cave.");
            static Item ironarmor = new Item ("Iron Armor", 32, 20, 0, 50, 0, 20, 80, 20, 600, "Having a Iron armor can really make you feel like being protected by a metal wall.");
            static Item goldarmor = new Item ("Gold Armor", 33, 55, 0, 60, 0, 25, 90, 25, 10000, "Worn by the rich elites, this suits more as a bragging right than a defensive armor.");
            static Item steelarmor = new Item ("Steel Armor", 34, 70, 0, 80, 0, 30, 100, 30, 2000, "This steel armor is a great economic package, its defensive and its conveniently in stock. The price? Who cares about the price. Buy this right now.");
            static Item muddiedarmor = new Item ("Muddied Armor", 75, 90, 0, 100, 0, 50, 140, 10, 10000, "This armor is so Muddy it literally absorbs the force of impact from the opponent.");
            static Item glassarmor = new Item ("Glass Armor", 36, 95, 0, 0, 0, 100, 20, 20, 25000, "This is a see through armor, not that effective considering it's glass. For insanely bold heros, just remember to wear clothes underneath.");
            //Tiered Set
            static Item zirconarmor = new Item ("Zircon Armor", 40, 100, 0, 150, 25, 25, 150, 25, 400000, "The first of the seven tiered armor set, forged in the zone itself.");
            static Item sapphirearmor = new Item ("Sapphire Armor", 41, 125, 0, 200, 50, 50, 200, 50, 500000, "The second of the seven tiered armor set, forged in the zone itself.");
            static Item emeraldarmor = new Item ("Emarld Armor", 42, 150, 0, 250, 75, 75, 250, 75, 700000, "The third of the seven tiered armor set, forged in the zone itself.");
            static Item rubyarmor = new Item ("Ruby Armor", 43, 175, 0, 300, 100, 100, 300, 100, 850000, "The fourth of the seven tiered armor set, forged in the zone itself.");
            static Item diamondarmor = new Item ("Diamond Armor", 44, 200, 0, 350, 125, 125, 350, 125, 1200000, "The fifth of the seven tiered armor set, forged in the zone itself.");
            static Item jeremejevitearmor = new Item ("Jeremejevite Armor", 45, 225, 0, 400, 200, 150, 400, 150, 1650000, "The sixth of the seven tiered armor set, forged in the zone itself.");
            static Item meteoraarmor = new Item ("Meteora Armor", 46, 250, 0, 1000, 1000, 300, 500, 300, 2500000, "The treasure of the seven tiered armor set, forged from the fallen meteor in the sevanth war.");
            //Unlockables UNFINISHED
            static Item princejohncrown = new Item ("Prince John's Crown", 50, 0, 1, 20, 0, 15, 10, -2, 5000, "Prince John's Crown is the key to the prince's arrogance and pride. \nWhat he lacks in agility makes up for in strength");
            static Item sheriffbadge = new Item ("Sheriff's Deputy Star", 51, 0, 2, 10, 10, 5, 10, 0, 10000, "The Sheriff of Nottingham's Badge. It gives you a sense of protection and fear from others.");
            static Item sirguyarmor = new Item ("Armour of Sir Guy", 52, 0, 3, 50, 0, 10, 30, 10, 20000, "The infamous armor of Sir Guy. Surely to protect you from harm, but can it protect you from yourself?");
            static Item hermitcloak = new Item ("Hermit Cloak", 53, 0, 7, 10, 10, 0, 30, 0, 25000, "The hermit cloak suprisingly keeps you away from opponents and evades potential attacks.");
            static Item skeletonarmor = new Item ("Skeleton Armor", 54, 0, 11, 0, 0, 0, -5, 50, 30000, "The skeleton armor that keeps the king protected from harms.");
            static Item lionfur = new Item ("Nemean Lion's Coat", 55, 0, 12, 500, 0, -5, 300, -5, 35000, "The legendary skin of the Nemean Lion is sure to protect you from the greatest of dangers");
            static Item hunterarmor = new Item ("Hunter's Armor", 56, 0, 14, 100, 50, 25, 25, 25, 40000, "The hunter of the Guardian of Artemis.");
            static Item bronzearmor = new Item ("Bronze Armor", 57, 0, 18, 150, 40, 40, 40, 20, 45000, "The bodies of the Stymphalian Birds smelted into this divine armor.");
            static Item beastshield = new Item ("Protector of Beasts", 58, 0, 21, 100, 50, 60, 80, 20, 50000, "This can protect you from all evil with it's incredible power.");
            static Item greatgirdle = new Item ("Heroic Girdle of the Amazon", 59, 0, 22, 150, 150, 70, 70, 70, 60000, "A mystical girdle from Hippolyte.");
            static Item rehealingfeet = new Item ("Rehealing Feet", 60, 0, 24, 200, 200, 0, 100, 0, 75000, "The rehealing feet of Antaeus, the almost invincible.");
            static Item dragonarmor = new Item ("Dragon Armor", 61, 0, 27, 250, 75, 80, 100, 80, 100000, "Fashioned from a grandeur dragon.");
            static Item powerskin = new Item ("Power skin", 62, 0, 28, 300, 90, 100, 150, 100, 140000, "Extreme skin, Atlas the Titan's superior organ.");
            static Item shadowhelm = new Item ("Shadow Helm", 63, 0, 31, 500, 100, 50, 200, 100, 150000, "Hades presents to the fabled hero");
            static Item blackarmor = new Item ("Armor of the Black Knight", 64, 0, 32, 300, 25, 25, 25, 25, 160000, "The black Knight's armor - the prize earned.");
            static Item greenarmor = new Item ("Armor of the Green Knight", 64, 0, 33, 400, 50, 25, 100, 25, 200000, "The green Knight's armor - the prize earned.");
            static Item bluearmor = new Item ("Armor of the Blue Knight", 65, 0, 34, 500, 100, 75, 150, 75, 250000, "The blue Knight's armor - the prize earned.");
            static Item yellowarmor = new Item ("Armor of the Yellow Knight", 66, 0, 36, 600, 150, 125, 200, 125, 300000, "The yellow Knight's armor - the prize earned.");
            static Item redarmor = new Item ("Armor of the Red Knight", 67, 0, 37, 700, 200, 175, 250, 175, 350000, "The red Knight's armor - the prize earned.");
            static Item airaura =  new Item ("Air Aura", 68, 0, 46, 1000, 300, 200, 200, 200, 500000, "The air aura from the Air Dragon, it will protect you with a shield of air.");
            static Item soulaura =  new Item ("Soul Aura", 69, 0, 51, 1200, 500, 300, 300, 300, 750000, "The soul aura from the Soul Dragon, it will protect you with a shield of dragon spirits.");
            static Item dragonchariot =  new Item ("Dragon Unity Chariot", 70, 0, 56, 1000, 1000, 500, 500, 500, 1000000, "The Grandmaster's Chariot of unity. It encompasses all the dragon's powers into one.");
            static Item fearhelm = new Item ("Helm of fear", 71, 0, 57, 1200, 1200, 600, 600, 600, 3000000, "The helm of fear forged from the souls of the demons, is heavily guarded yet recieved.");
            static Item darkarmor = new Item ("Dark Armor of Drakon", 72, 0, 58, 10, 1000, 1000, 1000, 200, 5000000, "Drakon's inpenatrable skin!");
            static Item mirrorshield =  new Item ("Mirror Shield", 73, 0, 62, 1500, 1500, 1200, 1200, 10, 10000000, "The mirror shield that would reflect and absorb damage back. Painful results.");
            static Item darkaura = new Item ("Dark Aura", 74, 0, 63, 2000, 2000, 2000, 1500, 1500, 15000000, "The evil force, strong and powerful.");
            static Item lightaura = new Item ("Light Aura", 75, 0, 64, 2500, 2500, 1800, 1800, 1800, 25000000, "The light force, one to conquer all.");            
            
    /**
     * Constructo to create an item
     */
    public Item(String name, int ID, int minLevel, int questNumber, int hpbenefit, int healbenefit, int strbenefit, int defbenefit, int agilbenefit, int price, String description)
    {
        this.name = name;
        this.ID = ID;
        this.minLevel = minLevel;
        this.questNumber = questNumber;
        this.hpbenefit = hpbenefit;
        this.healbenefit = healbenefit;
        this.strbenefit = strbenefit;
        this.defbenefit = defbenefit;
        this.agilbenefit = agilbenefit;
        this.price = price;
        this.description = description;
    }

    /**
     * The weapon displays the weapons to the player and the player can use that to buy equipments
     * and what not to improve his character.
     * Precondition - Hero is a created object with actual value
     * Postcondition - The hero ends up with a different weapon or has the same weapon
     */
    public static void weapons(MC hero)
    {      
        Scanner scan = new Scanner (System.in);
        boolean loop = true;
        while (loop == true) //while you are still in the shop, will loop until you wish to stop shopping
        {
            ArrayList <Item> items = new ArrayList <Item> ();
            Item [ ] storage = {woodstaff,ironstaff,bigstaff,powerstaff,quickstaff,defendstaff,healthstaff,
                diamondstaff,spiritstaff,oakbow,willowbow,maplebow,yewbow,powerbow,wingbow,goldenbow,dragonbow,
                stonesword,ironsword,goldsword,steelsword,titaniumsword,diamondsword,iridiumsword,cometsword,
                shadowsword,spiritsword,ironscimitar,silverscimitar,steelscimitar,diamondscimitar,iridiumscimitar,
                cometscimitar,bloodscimitar,spiritscimitar,ironbattleaxe,steelbattleaxe,titaniumbattleaxe,diamondbattleaxe,
                iridiumbattleaxe,relentlessbattleaxe,elementalbattleaxe,spiritbattleaxe,irontwohand,steeltwohand,titaniumtwohand,
                iridiumtwohand,speedtwohand,flamingtwohand,gildedtwohand,ironhalebard,steelhalebard,titaniumhalebard,
                iridiumhalebard,powerhalebard,balancedhalebard,darkhalebard,greaterhalebard}; //puts all the items into a list
                for (Item i : storage) //for loop
                {
                    if (hero.getLevel() >= i.getMinLevel())
                    {
                        items.add(i); //puts the item in the arraylist of possible items to buy
                        System.out.println(i.getID() + ". " + i.getName()); //prints out the name, and ID
                    }
                }
            Item [ ] queststorage = {bishopgold,robinbow,goblinmace,bonesword,poisonbow,silverbow,amazonspear,powerfist,bident,
                morningaxe,holygrail,merlinstaff,excalibur,scythe,holycross,dragonsword,demonsword,trident,swordoflight}; //puts all quest items into a list
                System.out.println("\nQuest Items:\n");
                for (Item i : queststorage) //for loop
                {
                    if (hero.getQuestNumber() > i.getQuestNumber())
                    {   
                        items.add(i); //puts the item in the arraylist of possible items to buy
                        System.out.println(i.getID() + ". " + i.getName()); //prints out the name, and ID
                    }
                }
            System.out.println("999. Leave shop\n\n"); //prints out the quit
            System.out.println("You currently have:     " + hero.getMoney() + " coins. \nYou own a(n):      " + hero.getWeapon().getName() + "."); //prints out what you are carrying with you
            System.out.println("Type in the serial number to see information and buy.");
            int serialnumber = scan.nextInt();
            Item DC = new Item ("Null", 0, 0, 0, 0, 0, 0, 0, 0, 0, "The front window"); //display case
            if (serialnumber == 999)
            {
                return;
            }
            for (Item i : items) //checks to see if the one you picked matches any of the items
            {
                if (i.getID() == serialnumber)
                {
                    DC = i;
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
                + "\n\n"); //the item wish to purchase stats
                
                System.out.println("Hero: " + hero.getName() + "     current money: " + hero.getMoney() + "\n<press any key to continue>");
                
                scan.nextLine();
                String response = scan.nextLine();
                System.out.println("Do you wish to purchase this? (Y / N)" ); //asks if you wish to purchase
                response = scan.nextLine();
                if (response.equalsIgnoreCase("Y") &&hero.getMoney() >= DC.getPrice()) //yes, you buy it and it deducts money from you
                {
                    itemSwapW(DC,hero);
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
     * The armor displays the armors to the player and the player can use that to buy equipments
     * and what not to improve his character.
     * 
     * Precondition - The hero is already instanciated and has value in it
     * Postcondition - The hero carries a new armor or has the same armor
     */
    public static void armor(MC hero) //increases health, defence
    {
        Scanner scan = new Scanner (System.in);
        boolean loop = true;
        while (loop == true)
        {
            ArrayList <Item> items = new ArrayList <Item> ();
            Item [ ] storage = {woodshield,bronzeshield,ironshield,steelshield,goldshield,spiritshield,
                bronzemail,ironmail,steelmail,titaniummail,goldmail,shellmail,woodbighelm,ironbighelm,
                goldbighelm,steelbighelm,titaniumbighelm,plummetbighelm,talkingbighelm,lavabighelm,
                leatherarmor,stonearmor,ironarmor,goldarmor,steelarmor,muddiedarmor,glassarmor};  
            for (Item i : storage)
            {
                if (hero.getLevel() >= i.getMinLevel())
                {
                    items.add(i);
                    System.out.println(i.getID() + ". " + i.getName());
                }
            }
            Item [ ] tierstorage = {zirconarmor,sapphirearmor,emeraldarmor,rubyarmor,diamondarmor,jeremejevitearmor,meteoraarmor};  
            System.out.println("\nTiered Armor Set:\n");
            for (Item i : tierstorage)
            {
                if (hero.getLevel() >= i.getMinLevel())
                {
                    items.add(i);
                    System.out.println(i.getID() + ". " + i.getName());
                }
            }
            
            Item [ ] queststorage = {princejohncrown,sheriffbadge,sirguyarmor,hermitcloak,skeletonarmor,lionfur,hunterarmor,bronzearmor,
            beastshield,greatgirdle,rehealingfeet,dragonarmor,powerskin,shadowhelm,blackarmor,greenarmor,bluearmor,yellowarmor,redarmor,
            airaura,soulaura,dragonchariot,fearhelm,darkarmor,mirrorshield,darkaura,lightaura};
            
            System.out.println("\nQuest Items:\n");
                for (Item i : queststorage) //for loop
                {
                    if (hero.getQuestNumber() > i.getQuestNumber())
                    {   
                        items.add(i); //puts the item in the arraylist of possible items to buy
                        System.out.println(i.getID() + ". " + i.getName()); //prints out the name, and ID
                    }
                }
            System.out.println("999. Leave shop\n\n"); //prints out the quit
            System.out.println("You currently have:     " + hero.getMoney() + " coins. \nYou own a(n):      " + hero.getArmor().getName() + ".");
            System.out.println("Type in the serial number to see information and buy.");
            int serialnumber = scan.nextInt(); //prompting a serial number
            Item DC = new Item ("Null", 0, 0, 0, 0, 0, 0, 0, 0, 0, "The front window"); //display case  
            if (serialnumber == 999)
            {
                return;
            }
            for (Item i : items) //checks to see if the one you picked matches any of the items
            {
                if (i.getID() == serialnumber)
                {
                    DC = i;
                }
            }
            if (DC.getName().equals("Null"))
            {
                System.out.println("You did not pick an item.");
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
                + "\n\n"); //the item wish to purchase stats
                
                System.out.println("Hero: " + hero.getName() + "     current money: " + hero.getMoney() + "\n<press any key to continue>");
                
                scan.nextLine();
                String response = scan.nextLine();
                System.out.println("Do you wish to purchase this? (Y / N \nResponse:)" ); //asks if you wish to purchase
                response = scan.nextLine();
                if (response.equalsIgnoreCase("Y") &&hero.getMoney() >= DC.getPrice()) //yes and you have enough money, you buy it and it deducts money from you
                {
                    itemSwapA(DC,hero);
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
     * Precondition - Item i is an actual Item and is a weapon
     * Postcondition - The weapons are swapped
     */
    public static void itemSwapW(Item i, MC hero)
    {
         hero.setMaxHP(hero.getMaxHP() - hero.getWeapon().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() - hero.getWeapon().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() - hero.getWeapon().getHealBenefit());
         hero.setStrength(hero.getStrength() - hero.getWeapon().getStrBenefit());   
         hero.setDefence(hero.getDefence() - hero.getWeapon().getDefBenefit());
         hero.setAgility(hero.getAgility() - hero.getWeapon().getAgilBenefit());
         hero.setMoney(hero.getMoney() + hero.getWeapon().getPrice());
         
         hero.setWeapon(i);
         
         hero.setMaxHP(hero.getMaxHP() + hero.getWeapon().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() + hero.getWeapon().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() + hero.getWeapon().getHealBenefit());
         hero.setStrength(hero.getStrength() + hero.getWeapon().getStrBenefit());
         hero.setDefence(hero.getDefence() + hero.getWeapon().getDefBenefit());
         hero.setAgility(hero.getAgility() + hero.getWeapon().getAgilBenefit());
         hero.setMoney(hero.getMoney() - hero.getWeapon().getPrice());
    }
    
    /**
     * Precondition - The Item i is an actual Item and is of type armor
     * Postcondition - The armors are swapped
     */
    public static void itemSwapA(Item i, MC hero)
    {
         hero.setMaxHP(hero.getMaxHP() - hero.getArmor().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() - hero.getArmor().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() - hero.getArmor().getHealBenefit());
         hero.setStrength(hero.getStrength() - hero.getArmor().getStrBenefit());   
         hero.setDefence(hero.getDefence() - hero.getArmor().getDefBenefit());
         hero.setAgility(hero.getAgility() - hero.getArmor().getAgilBenefit());
         hero.setMoney(hero.getMoney() + hero.getArmor().getPrice());
         
         hero.setArmor(i);
         
         hero.setMaxHP(hero.getMaxHP() + hero.getArmor().getHPBenefit());
         hero.setMinHeal(hero.getMinHeal() + hero.getArmor().getHealBenefit());
         hero.setMaxHeal(hero.getMaxHeal() + hero.getArmor().getHealBenefit());
         hero.setStrength(hero.getStrength() + hero.getArmor().getStrBenefit());
         hero.setDefence(hero.getDefence() + hero.getArmor().getDefBenefit());
         hero.setAgility(hero.getAgility() + hero.getArmor().getAgilBenefit());
         hero.setMoney(hero.getMoney() - hero.getArmor().getPrice());
    }
    
    /**
     * Postcondition: returns name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Postcondition: returns quest number
     */
    public int getQuestNumber()
    {
        return questNumber;
    }

    /**
     * Postcondition: returns hp benefit
     */
    public int getHPBenefit()
    {
        return hpbenefit;
    }
    
    /**
     * Postcondition: returns heal benefit
     */
    public int getHealBenefit()
    {
        return healbenefit;
    }
    
    /**
     * Postcondition: returns strength benefit
     */
    public int getStrBenefit()
    {
        return strbenefit;
    }
    
    /**
     * Postcondition: returns defence benefit
     */
    public int getDefBenefit()
    {
        return defbenefit;
    }
    
    /**
     * Postcondition: returns agility benefit
     */
    public int getAgilBenefit()
    {
        return agilbenefit;
    }
    
    /**
     * Postcondition: returns ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * Postcondition: returns price
     */    
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Postcondition: returns minimum level
     */
    public int getMinLevel()
    {
        return minLevel;
    }
    
    /**
     * Postcondition: returns description of an Item
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Precondition: name must be an entry
     * Postcondition: sets name of item to this
     */
    public void setName(String x)
    {
        name = x;
    }

    /**
     * Precondition: name must be an entry
     * Postcondition: sets name of item to this
     */
    public void setID(int x)
    {
        ID = x;
    }

    /**
     * Precondition: price must be a number
     * Postcondition: sets price of item to this
     */
    public void setPrice(int x)
    {
        price = x;
    }
    
    /**
     * Precondition: String must be a valid entry
     * Postcondition: sets description to this
     */   
    public void setDescription (String x)
    {
        description = x;
    }
}
