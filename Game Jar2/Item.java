import java.util.*;
/**
 * Items has all the items (weapon or armor) that ANY character can use. Some have ID's and benefits, some do not.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Item
{
    String name = "", description;
    int ID = 0, primarybenefit = 0, benefit = 0, price = 0, minLevel = 0, questNumber = 0, hpbenefit = 0, healbenefit = 0, strbenefit = 0, defbenefit = 0, agilbenefit = 0;
    //armor mainly benefits defense/agility, weapon mainly benefits attack/defense
    
    /** name, ID, min level, quest numb, hp benefit, heal benefit, str benefit, def benefit, agil benefit, price, description**/

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

    public static void buying (Object o, MC hero)
    {
        
    }
    
    public static void itemSwap(Object o, MC hero)
    {
        
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
