import java.util.*;
import java.util.Random;
/**
 * This is where the methods of the opponent set. There is no such thing as an opponent.
 * Must be Regular or Champion
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Opponent extends Character
{
    /**
     * Constructor class for Opponent. Opponents must have these
     */
    public Opponent(String name, double experience, int current_hp, int agility, int defence, int strength, int money, Item weapon)
    {
        super(name,experience,current_hp,agility,defence,strength,money,weapon);
    }
}
