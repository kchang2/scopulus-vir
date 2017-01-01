import java.util.*;
import java.lang.Object.*;
/**
 * Write a description of class CharList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharList
{
    /**Regular Opponent: name, experience, current_hp
     * agility, defence, strength, money, weapon, heal, level, tier**/
    ArrayList <Regular> actors = new ArrayList <Regular> ();
    
    /**Level 1-10**/
    static Regular bug = new Regular ("Bug", 0, 0, 0, 0, 0, 0, Item.stinger, 0, 0, 1); //fast
    static Regular pig = new Regular ("Pig", 0, 0, 0, 0, 0, 0, Item.trotter, 0, 0, 1); //Slow
    static Regular wolf = new Regular ("Wolf", 0, 0, 0, 0, 0, 0, Item.claws, 0, 0, 1); //strong
    static Regular theif = new Regular ("Theif", 0, 0, 0, 0, 0, 0, Item.rapier, 0, 0, 1); //fast
    static Regular troll = new Regular ("Troll", 0, 0, 0, 0, 0, 0, Item.cudgel, 0, 0, 1); //slow and strong
    static Regular soldier = new Regular ("Soldier", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 1); //balanced
    static Regular serpent = new Regular ("Serpent", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 1);  
    
    /**Level 11-30**/
    static Regular twaddle = new Regular ("Twaddle", 0, 0, 0, 0, 0, 0, Item.beak, 0, 0, 2); //slow, strong - half turtle, half duck
    static Regular goblin = new Regular ("Goblin", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 2);
    static Regular skeleton = new Regular ("Skeleton", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 2);
    static Regular mage = new Regular ("Mage", 0, 0, 0, 0, 0, 0, Item.woodstaff, 0, 0, 2); //no agility
    static Regular knight = new Regular ("Knight", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 2); //big defence, strenght
    static Regular priest = new Regular ("Priest", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 2);
    static Regular duelist = new Regular ("Duelist", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 2);

    /**Level 31-100**/
    static Regular bear =  new Regular ("Bear", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 3);
    static Regular ninja = new Regular ("Ninja", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 3);
    static Regular samurai = new Regular ("Samurai", 0, 0, 0, 0, 0, 0, Item.ninjastar, 0, 0, 3);
    static Regular ogre = new Regular ("Ogre", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 3);
    static Regular darkmage = new Regular ("Dark Magician", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 3);
    static Regular blackknight = new Regular ("Black Knight", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 3);
    
    /**Level 101-200**/
    static Regular giantplant = new Regular ("Giant Plant", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 4); //no agility
    static Regular holypriest = new Regular ("Holy Priest", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    static Regular holymage = new Regular ("Holy Magician", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    static Regular holyknight = new Regular ("Holy Knight", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    static Regular masterduelist = new Regular ("Master Duelist", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    static Regular giantrock = new Regular ("Giant Rock", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    static Regular mirror = new Regular ("Mimic Mirror", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 4);
    
    /**Level 201+  **/
    static Regular stoneguard = new Regular ("Stone Guardian", 0, 0, 0, 0, 0, 0, Item.stonesword, 0, 0, 6);
    static Regular kingwolf = new Regular ("King Wolf", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 6);
    static Regular golem = new Regular ("Golem", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 6);
    static Regular demon = new Regular ("Demon", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 6); 
    static Regular lesserdragon = new Regular ("Lesser Dragon", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 6);
    static Regular blob = new Regular ("Blob", 0, 0, 0, 0, 0, 0, Item.vine, 0, 0, 6); 
    static Regular evilking = new Regular ("Evil King", 0, 0, 0, 0, 0, 0, Item.ironsword, 0, 0, 6);
    
    /**Champions, aka Quests: name, experience, current_hp, agility,
     * defence, strength, money, weapon, armor, max_hp, min_heal, max_heal**/
    
   static Champion princejohn = new Champion ("Prince John", 100, 100, 10, 10, 10, 100, Item.goldsword, Item.princejohncrown, 100, 15, 40);
   static Champion sheriff = new Champion ("Sheriff of Nottingham", 150, 200, 0, 15, 20, 55, Item.ironsword, Item.sheriffbadge, 200, 25, 25);
   static Champion sirguy = new Champion ("Sir Guy of Gisborne", 200, 350, 15, 20, 20, 60, Item.irontwohand, Item.sirguyarmor, 350, 33, 41);
   static Champion bishop = new Champion ("Bishop of Hereford", 100, 200, 30, 5, 5, 200, Item.bishopgold, Item.clothes, 200, 0, 200);
   static Champion robinhood = new Champion ("Robin Hood", 500, 300, 50, 20, 30, 25, Item.robinbow, Item.leatherarmor, 300, 0, 95);
   static Champion hermitjohn = new Champion ("Hermit John", 500, 500, 0, 50, 5, 0, Item.woodstaff, Item.hermitcloak, 500, 0, 1);  
   
   static Champion kinggoblin = new Champion ("Tzhuchuw the King of the Goblins", 600, 300, 20, 20, 20, 150, Item.goblinmace, Item.leatherarmor, 300, 0, 50);
   static Champion werewolf = new Champion ("Werewolf", 1000, 1000, 60, 30, 60, 200, Item.claws, Item.moon, 1000, 0, 100);
   static Champion kingskeleton = new Champion ("Xeborenes the King Skeleton", 1200, 500, 20, 20, 100, 500, Item.bonesword, Item.skeletonarmor, 1000, 0, 300);
   static Champion nemeanlion = new Champion ("Nemean Lion", 2000, 1000, 100, 500, 100, 1000, Item.claws, Item.lionfur, 2000, 0, 500);
   static Champion hydra = new Champion ("Lernean Hydra", 2000, 800, 0, 300, 300, 1000, Item.poison, Item.hydraskin, 10000, 0, 800);
   static Champion deerguard = new Champion ("Guardian of the Deer", 2000, 1000, 100, 100, 100, 1000, Item.silverbow, Item.hunterarmor, 1000, 0, 200);
   static Champion eryboar = new Champion  ("Erymanthian Boar", 2000, 1100, 100, 120, 90, 1000, Item.tusks, Item.leatherarmor, 1200, 0, 300);
   static Champion augeanhorse = new Champion ("Alpha Augean Horse", 2000, 1000, 20, 120, 20, 1000, Item.stool, Item.saddle, 1400, 0, 500);
   static Champion stymphbird = new Champion ("Stymphalian Birds", 2000, 1200, 150, 150, 100, 1000, Item.ironbeaks, Item.bronzearmor, 1200, 0, 400);
   static Champion cretebull = new Champion ("Cretan Bull", 2000, 1600, 120, 80, 100, 1000, Item.bighorns, Item.leatherhide, 1700, 0, 200);
   static Champion diomedehorses = new Champion ("Diomede the Feeder", 2000, 1500, 20, 70, 100, 1000, Item.ironsword, Item.beastshield, 2500, 0, 300);
   static Champion amazonqueen = new Champion ("Hippolyte, The Queen of the Amazon", 2000, 1400, 150, 150, 150, 10000, Item.spear, Item.greatgirdle, 2000, 100, 400);
   static Champion geyron = new Champion ("Geyron the Barbarian", 2000, 1600, 30, 50, 100, 5000, Item.club, Item.woodshield, 1800, 0, 300);
   static Champion antaeus = new Champion ("Antaeus the Rebirth", 2000, 1300, 20, 100, 150, 5000, Item.fist, Item.rehealingfeet, 1800, 0, 500);
   static Champion eagle = new Champion ("Tormenting Eagle", 1500, 900, 50, 50, 50, 1000, Item.beak, Item.flyingwings, 1000, 0, 100);
   static Champion ladon = new Champion ("Ladon the Guardian", 2000, 1000, 0, 150, 180, 2000, Item.firepoison, Item.dragonskin, 1000, 500, 950);
   static Champion atlas = new Champion ("Atlas the Titan", 5000, 1600, 50, 200, 210, 15000, Item.powerfist, Item.powerskin, 2000, 300, 600);
   static Champion cerberus = new Champion ("Cerberus the Three Headed Dog", 5000, 3000, 0, 300, 300, 20000, Item.powerjaws, Item.hadescollar, 6000, 1000, 3000);
   static Champion hades = new Champion ("Hades the God of the Underworld", 10000, 9000, 500, 500, 500, 100000, Item.bident, Item.shadowhelm, 100000, 0, 10000);
   
   static Champion blackknightC = new Champion ("Black Knight", 300, 300, 30, 30, 30, 200, Item.steelsword, Item.blackarmor, 500, 0, 50);
   static Champion greenknight = new Champion ("Green Knight", 500, 500, 40, 40, 40, 300, Item.steelsword, Item.greenarmor, 600, 0, 100);
   static Champion blueknight = new Champion ("Blue Knight", 700, 700, 50, 50, 50, 600, Item.steelsword, Item.bluearmor, 800, 0, 100);
   static Champion yellowknight = new Champion ("Yellow Knight", 800, 800, 45, 45, 45, 900, Item.steelsword, Item.yellowarmor, 900, 0, 100);
   static Champion redknight = new Champion ("Red Knight", 900, 900, 60, 60, 60, 1000, Item.steelsword, Item.redarmor, 1000, 0, 50);
   static Champion mordred = new Champion ("Mordred the Evil", 1100, 1500, 5, 5, 120, 1000, Item.morningaxe, Item.ironarmor, 1500, 0, 200);
   static Champion druidchief = new Champion ("Chief of the Druids", 1000, 500, 1, 1, 1, 1000, Item.holygrail, Item.clothes, 5000, 0, 500);
   static Champion merlin = new Champion ("Merlin", 1200, 700, 0, 80, 75, 400, Item.merlinstaff, Item.robes, 1400, 0, 350);
   static Champion kingarthur = new Champion ("King Arthur", 1500, 1000, 50, 75, 75, 1600, Item.excalibur, Item.ironmail, 1000, 0, 200);

   static Champion puffdragon = new Champion ("Puff the Magic Dragon", 1000, 1, 0, 0, 500, 1, Item.stool, Item.stool, 2, 0, 0);
   static Champion airdragon = new Champion ("Air Dragon", 2000, 1000, 200, 50, 120, 1000, Item.airblast, Item.airaura, 1500, 0, 300);
   static Champion waterdragon = new Champion ("Water Dragon", 3000, 1500, 110, 110, 110, 1250, Item.waterblast, Item.wateraura, 2000, 0, 500);
   static Champion earthdragon = new Champion ("Earth Dragon", 4000, 1750, 50, 135, 135, 1500, Item.earthblast, Item.earthaura, 2150, 0, 600);
   static Champion firedragon = new Champion ("Fire Dragon", 5000, 2000, 80, 80, 160, 1700, Item.fireblast, Item.fireaura, 2500, 0, 750);
   static Champion blooddragon = new Champion ("Blood Dragon", 7000, 2500, 10, 20, 250, 1750, Item.bloodrage, Item.bloodaura, 2650, 100, 200);
   static Champion souldragon = new Champion ("Soul Dragon", 10000, 4000, 50, 150, 150, 2000, Item.soulrage, Item.soulaura, 4000, 100, 950);
   static Champion olddragon = new Champion ("Ketzel - The Yellow Ol' Bull", 12000, 4500, 0, 150, 150, 3000, Item.knowledge, Item.bookcover, 4500, 100, 800);
   static Champion blackdragon = new Champion ("Black Dragon", 14000, 500, 150, 180, 270, 3500, Item.darkblast, Item.darkaura, 5000, 0, 950);
   static Champion whitedragon = new Champion ("White Dragon", 15000, 5000, 200, 200, 200, 3500, Item.lightblast, Item.lightaura, 5000, 0, 1000);
   static Champion dragonmaster = new Champion ("DragonMaster", 17250, 10000, 150, 400, 300, 5000, Item.dragonsword, Item.dragonchariot, 12500, 350, 2500);
   
   static Champion princedemon = new Champion ("Prince of Demons", 2000, 5000, 100, 100, 150, 3000, Item.demonclaws, Item.fearhelm, 9000, 0, 1500);
   static Champion drakon = new Champion ("Drakon of Destruction", 5000, 10000, 80, 200, 200, 5000, Item.fireball, Item.darkarmor, 10000, 20, 1000);
   static Champion diablo = new Champion ("El Diablo", 6000, 10000, 200, 200, 200, 5000, Item.trident, Item.bighorns, 15000, 100, 3000);
   static Champion shadowbeast = new Champion ("Shadow Beast", 10000, 1, 500, 500, 500, 9999, Item.claws, Item.shadow, 1, 0, 0);
   static Champion shadowmirror = new Champion ("Greater Shadow Mirror", 15000, 100, 750, 750, 700, 15000, Item.mirror, Item.mirror, 100, 0, 0);
   static Champion aberrtus = new Champion ("Aberrtus the Fallen One", 50000, 15000, 1000, 1000, 1000, 25000, Item.fist, Item.clothes, 25000, 0, 10000);
   static Champion obscura = new Champion ("The Obscura Spirit", 100000, 99999, 0, 0, 10000, 0, Item.darkblast, Item.darkaura, 99999, 0, 0);
    
    /**
     * Chooses the opponent based on level
     * returns a monster
     */
    public static Regular chooseOpponent(MC hero) //chooses opponent for the main character
    {
        if (hero.getLevel() > 200) //if level is 10, picks a certain amount
        {
            Regular [ ] storage = {pig,wolf,theif,troll,soldier,serpent,goblin,skeleton,mage,knight,priest,bear,ninja,samurai,ogre,darkmage,blackknight,holypriest,holymage,holyknight,masterduelist,giantrock,mirror,stoneguard,kingwolf,golem,demon,lesserdragon,blob,evilking};
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 31 && hero.getLevel() > 10) //a class system for ranges
                                                                //of monsters
        {
            Regular [ ] storage = {pig,wolf,theif,troll,soldier,serpent,twaddle,goblin,skeleton,mage,knight,priest,duelist}; 
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 100 && hero.getLevel() > 31)
        {   
            Regular [ ] storage = {pig,wolf,theif,troll,soldier,serpent,goblin,skeleton,mage,knight,priest,duelist,bear,ninja,samurai,ogre,darkmage,blackknight}; 
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 200 && hero.getLevel() > 100)
        {
            Regular [ ] storage = {pig,wolf,theif,troll,soldier,serpent,goblin,skeleton,mage,knight,priest,duelist,bear,ninja,samurai,ogre,darkmage,blackknight,giantplant,holypriest,holymage,holyknight,masterduelist,giantrock,mirror};
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else
        {
            Regular [ ] storage = {bug,pig,wolf,theif,troll,soldier,serpent}; 
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
    }
    
    /**
     * Assigns the statistics in relativity to your hero, then returns the regular
     * monster
     */
    public static Regular levelAssign (Regular creature, MC hero)
    {
        Random generator = new Random ();
        if (creature.getTier() == 2) //level 11-30
        {
            creature.setExperience(hero.getLevel() * Math.random() * 10);
            creature.setLevel(generator.nextInt(hero.getLevel())  +  5);
            creature.setMoney(generator.nextInt(creature.getLevel()*3));
        }
        else if (creature.getTier() == 3) //level 31-100
        {
            creature.setExperience(hero.getLevel() * Math.random() * 20);
            creature.setLevel(generator.nextInt(hero.getLevel())  + 25);
            creature.setMoney(generator.nextInt(creature.getLevel()*5));
        }
        else if (creature.getTier() == 4) //level 101-200
        {
            creature.setExperience(hero.getLevel() * Math.random() * 35);
            creature.setLevel( generator.nextInt(hero.getLevel())  + 90);
            creature.setMoney(generator.nextInt(creature.getLevel()*10));
        }
        else if (creature.getTier() == 5) //200 and up
        {
            creature.setExperience(hero.getLevel() * Math.random() * 50);
            creature.setLevel(generator.nextInt(hero.getLevel()) + 100);
            creature.setMoney(generator.nextInt(creature.getLevel()*17));   
        }
        else //level 1 - 10
        {
            creature.setExperience(hero.getLevel() * Math.random() * 5);
            creature.setLevel(generator.nextInt(hero.getLevel()) + 3);
            creature.setMoney(generator.nextInt(creature.getLevel()*2));
        }
        if (creature.getCurrentHP() == 0)
        {
            creature.setCurrentHP(0);
            creature.setCurrentHP((int)(generator.nextInt(hero.getMaxHP()) * Math.random()*2) + 10);
        }
        creature.setHeal(generator.nextInt(hero.getMaxHeal()) + creature.getHeal());
        creature.setAgility(generator.nextInt(hero.getAgility()) + creature.getAgility());
        creature.setDefence(generator.nextInt(hero.getDefence()) + creature.getDefence());
        creature.setStrength(generator.nextInt(hero.getStrength()) + creature.getStrength());
        return creature;
    }
}
 