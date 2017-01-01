
/**
 * Write a description of class CharNQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharNQ
{
    
    /**Regular Opponent: name, experience, current_hp
     * agility, defence, strength, money, weapon, heal, level, tier**/
     
    /**Level 1-10**/
    static Regular bug = new Regular ("Bug", 0, 0, 0, 0, 0, 0, Weapon.stinger, 0, 0, 1); //fast
    static Regular pig = new Regular ("Pig", 0, 0, 0, 0, 0, 0, Weapon.trotter, 0, 0, 1); //Slow
    static Regular wolf = new Regular ("Wolf", 0, 0, 0, 0, 0, 0, Weapon.claws, 0, 0, 1); //strong
    static Regular theif = new Regular ("Theif", 0, 0, 0, 0, 0, 0, Weapon.rapier, 0, 0, 1); //fast
    static Regular troll = new Regular ("Troll", 0, 0, 0, 0, 0, 0, Weapon.cudgel, 0, 0, 1); //slow and strong
    static Regular soldier = new Regular ("Soldier", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 1); //balanced
    static Regular serpent = new Regular ("Serpent", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 1);  
    
    /**Level 11-30**/
    static Regular twaddle = new Regular ("Twaddle", 0, 0, 0, 0, 0, 0, Weapon.beak, 0, 0, 2); //slow, strong - half turtle, half duck
    static Regular goblin = new Regular ("Goblin", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 2);
    static Regular skeleton = new Regular ("Skeleton", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 2);
    static Regular mage = new Regular ("Mage", 0, 0, 0, 0, 0, 0, Weapon.woodstaff, 0, 0, 2); //no agility
    static Regular knight = new Regular ("Knight", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 2); //big defence, strenght
    static Regular priest = new Regular ("Priest", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 2);
    static Regular duelist = new Regular ("Duelist", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 2);

    /**Level 31-100**/
    static Regular bear =  new Regular ("Bear", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 3);
    static Regular ninja = new Regular ("Ninja", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 3);
    static Regular samurai = new Regular ("Samurai", 0, 0, 0, 0, 0, 0, Weapon.ninjastar, 0, 0, 3);
    static Regular ogre = new Regular ("Ogre", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 3);
    static Regular darkmage = new Regular ("Dark Magician", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 3);
    static Regular blackknight = new Regular ("Black Knight", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 3);
    
    /**Level 101-200**/
    static Regular giantplant = new Regular ("Giant Plant", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 4); //no agility
    static Regular holypriest = new Regular ("Holy Priest", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    static Regular holymage = new Regular ("Holy Magician", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    static Regular holyknight = new Regular ("Holy Knight", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    static Regular masterduelist = new Regular ("Master Duelist", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    static Regular giantrock = new Regular ("Giant Rock", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    static Regular mirror = new Regular ("Mimic Mirror", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 4);
    
    /**Level 201+  **/
    static Regular stoneguard = new Regular ("Stone Guardian", 0, 0, 0, 0, 0, 0, Weapon.stonesword, 0, 0, 6);
    static Regular kingwolf = new Regular ("King Wolf", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 6);
    static Regular golem = new Regular ("Golem", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 6);
    static Regular demon = new Regular ("Demon", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 6); 
    static Regular lesserdragon = new Regular ("Lesser Dragon", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 6);
    static Regular blob = new Regular ("Blob", 0, 0, 0, 0, 0, 0, Weapon.vine, 0, 0, 6); 
    static Regular evilking = new Regular ("Evil King", 0, 0, 0, 0, 0, 0, Weapon.ironsword, 0, 0, 6);
}