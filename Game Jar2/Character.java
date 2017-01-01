import java.util.*;
import java.util.Random;
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Character
{
    String name = ""; //the name of the character
    int current_hp = 100; //the current health of the character
    int strength = 5; //the strength of the character
    int agility = 5; //the agility of the character
    int defence = 5; //the defence of the character
    int money = 0; //the money the character has
    double experience = 0; //how much experience the character has
    Weapon w = new Weapon ("Fist", 0, 0, 0, 0, 0, 0, 0, 0, 0, "Basic weapon"); //orignal item they carry
    
    public Character(String name, double experience, int current_hp, int agility, int defence, int strength, int money, Weapon w)
    {
        this.name = name;
        this.experience = experience;
        this.current_hp = current_hp;
        this.agility = agility;
        this.defence = defence;
        this.strength = strength;
        this.money = money;
        this.w = w;
    }

    public String getName() //returns name of Character
    {
        return name;
    }
    
    public void setName(String x) //sets name of a character
    {
        name = x;
    }
    
    public double getExperience() //gets experience of a character
    {
        return experience;
    }
    
    public void setExperience(double x) //sets experience of a character
    {
        experience = x;
    }
    
    public int getCurrentHP() //gets the current health of character
    {
        return current_hp;
    }
    
    public void setCurrentHP(int x) //sets current health of character
    {
        current_hp = x;
    }

    public int getAgility() //gets current agility
    {
        return agility;
    }
    
    public void setAgility(int x) //sets current agility
    {
        agility = x;
    }

    public int getDefence() //gets defence
    {
        return defence;
    }
    
    public void setDefence(int x) //sets defence
    {
        defence = x;
    }
    
    public int getStrength() //gets strength
    {
        return strength;
    }
    
    public void setStrength(int x) //sets strength
    {
        strength = x;
    }
    
    public int getMoney() //gets money of character
    {
        return money;
    }

    public void setMoney(int x) //sets money of character
    {
        money = x;
    }    
        
    public Weapon getWeapon() //gets the weapon of character
    {
        return w;
    }
    
    public void setWeapon(Weapon x) //sets the weapon of character
    {
        w = x;
    }
}
