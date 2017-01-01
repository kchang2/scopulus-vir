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
    /**ArrayList to store all of the creatures**/
    ArrayList <Regular> actors = new ArrayList <Regular> ();

    /**
     * Chooses the opponent based on level
     * returns a monster
     */
    public static Regular chooseOpponent(MC hero) //chooses opponent for the main character
    {
        if (hero.getLevel() > 200) //if level is 10, picks a certain amount
        {
            Regular [ ] storage = {CharNQ.pig,CharNQ.wolf,CharNQ.theif,CharNQ.troll,CharNQ.soldier,CharNQ.serpent,CharNQ.goblin,
                CharNQ.skeleton,CharNQ.mage,CharNQ.knight,CharNQ.priest,CharNQ.bear,CharNQ.ninja,CharNQ.samurai,CharNQ.ogre,
                CharNQ.darkmage,CharNQ.blackknight,CharNQ.holypriest,CharNQ.holymage,CharNQ.holyknight,CharNQ.masterduelist,
                CharNQ.giantrock,CharNQ.mirror,CharNQ.stoneguard,CharNQ.kingwolf,CharNQ.golem,CharNQ.demon,CharNQ.lesserdragon,
                CharNQ.blob,CharNQ.evilking};
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 31 && hero.getLevel() > 10) //a class system for ranges
                                                                //of monsters
        {
            Regular [ ] storage = {CharNQ.pig,CharNQ.wolf,CharNQ.theif,CharNQ.troll,CharNQ.soldier,CharNQ.serpent,CharNQ.twaddle,
                CharNQ.goblin,CharNQ.skeleton,CharNQ.mage,CharNQ.knight,CharNQ.priest,CharNQ.duelist}; 
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 100 && hero.getLevel() > 31)
        {   
            Regular [ ] storage = {CharNQ.pig,CharNQ.wolf,CharNQ.theif,CharNQ.troll,CharNQ.soldier,CharNQ.serpent,CharNQ.goblin,
                CharNQ.skeleton,CharNQ.mage,CharNQ.knight,CharNQ.priest,CharNQ.duelist,CharNQ.bear,CharNQ.ninja,CharNQ.samurai,
                CharNQ.ogre,CharNQ.darkmage,CharNQ.blackknight}; 
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else if (hero.getLevel() <= 200 && hero.getLevel() > 100)
        {
            Regular [ ] storage = {CharNQ.pig,CharNQ.wolf,CharNQ.theif,CharNQ.troll,CharNQ.soldier,CharNQ.serpent,CharNQ.goblin,
                CharNQ.skeleton,CharNQ.mage,CharNQ.knight,CharNQ.priest,CharNQ.duelist,CharNQ.bear,CharNQ.ninja,CharNQ.samurai,
                CharNQ.ogre,CharNQ.darkmage,CharNQ.blackknight,CharNQ.giantplant,CharNQ.holypriest,CharNQ.holymage,CharNQ.holyknight,
                CharNQ.masterduelist,CharNQ.giantrock,CharNQ.mirror};
            Random generator = new Random();
            return storage [generator.nextInt(storage.length)];
        }
        else
        {
            Regular [ ] storage = {CharNQ.bug,CharNQ.pig,CharNQ.wolf,CharNQ.theif,CharNQ.troll,CharNQ.soldier,CharNQ.serpent}; 
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
 