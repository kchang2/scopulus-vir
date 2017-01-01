import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle
{
    private String background, riddle, answer1, answer2;
    private int exp, money;
    
  /*5*/  static Puzzle puzzle1 = new Puzzle ("Your first puzzle is always the easiest,\nsolve this simply or feel the sleazyest.","Year LXXII - Sevanth War began","seventy two","72", 100, 100);
  /*10*/  static Puzzle puzzle2 = new Puzzle ("This next puzzle is not as easy, \nas you must dig deeply into the midst of history.","The rival to prince john, the rival indeed, what is his name, the king that leads", "King Richard", "Richard", 1000, 1000);
  /*15*/  static Puzzle puzzle3 = new Puzzle ("The final task in the quest of Robin Hood, \nYou must be cautious, of the surrounding neighborhood.","Look at the puzzle 4 picture in the files. How many differences can you find?", "10", "ten", 1000, 1000);
  /*20*/  static Puzzle puzzle4 = new Puzzle ("Some language is this language spoken in, \nA true hero has no bounds that lowers his win.","Rei dos esqueletos, rei dos trasgos, que é o rei dos lobos?", "lobisomens", "werewolves", 2000, 1000);
  /*25*/  static Puzzle puzzle5 = new Puzzle ("The next reference refers to the modern work,\nDon't think its easy because the ancients lurk.","Look at puzzle 5 picture in the files. What country had this as the coat of arms?", "Greece", "Grèce", 2000, 2000);
  /*35*/  static Puzzle puzzle6 = new Puzzle ("This next puzzle refers to the Hydra, \nbut mark my script.","Hercule bora rafiki, inayojulikana kwa kumsaidia kuua hydra.", "Iolaus", "Iolaus", 2000, 2000);
  /*35*/  static Puzzle puzzle7 = new Puzzle ("Heroic actions come with heroic weapons, \nthis is not the same within","Who carried Hercules's bow and arrow when they killed their opponent cowardly?", "Paris", "Prince Paris", 2000, 2000);
  /*40*/  static Puzzle puzzle8 = new Puzzle ("The next reference refers to the medieval times,\nDon't think its easy because me rhymes.","Look at puzzle 8 picture in the files.\n26. Where does Gawain cut the Green Knight?", "Neck", "throat", 2000, 2000);
  /*45*/  static Puzzle puzzle9 = new Puzzle ("When you reach the dragon age, what will there be remaining.","A puzzle is refered from the puzzle 9 picture, Who is this great dragon?","Bubble","Bubbles", 5000, 5000);
  /*50*/  static Puzzle puzzle10 = new Puzzle ("Looking into the future, I see a clue, solve this riddle or be adue.","Look at puzzle 10 in pictures, what the name of this Lamborghini","Diablo","Lamborghini Diablo", 5000, 5000);
    
    static Puzzle [ ] puzzles = {Puzzle.puzzle1,Puzzle.puzzle2,Puzzle.puzzle3,Puzzle.puzzle4,Puzzle.puzzle5,Puzzle.puzzle6,Puzzle.puzzle7,
        Puzzle.puzzle8,Puzzle.puzzle9,Puzzle.puzzle10};
    
    /**
     * Constructor for objects of class Puzzle
     */
    public Puzzle(String background, String riddle, String answer1, String answer2, int exp, int money)
    {
        this.background = background;
        this.riddle = riddle;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.exp = exp;
        this.money = money;
    }
    
    /**
     * Checks if your answer is equal to puzzle answer. If yes, then return true
     * postcondition: returns true or false
     */
    public static boolean checkAnswer(String guess, Puzzle p)
    {
        if (guess.equalsIgnoreCase(p.getAnswer1()) || guess.equalsIgnoreCase(p.getAnswer2()))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Asks for decision and whatever player inputs, the computer returns a number
     * @returns 1,2,0
     */
    public static int decision(String action)
    {   
        Scanner scan = new Scanner (System.in);
        if (action.equalsIgnoreCase("Solve") || action.equalsIgnoreCase("S"))
        {
            return 0;
        }
        else if (Methods.complexAction(action) == 2)
        {
            System.out.println("Game paused. \nPRESS ANY KEY TO CONTINUE");
            scan.nextLine();
            return 1;
        }
        else
        {
            System.out.println("Come back to solve this question when your ready.");
            return 2;
        }
    }
    
    public String getBackground() //returns background, setting
    {
        return background;
    }
    
    public String getRiddle() //return riddle information
    {
        return riddle;
    }
    
    public int getMoney() //returns money gained
    {
        return money;
    }
    
    public int getExp() //returns experience earned
    {
        return exp;
    }
    
    public String getAnswer1() //return answer1
    {
        return answer1;
    }
    
    public String getAnswer2() //return answer2
    {
        return answer2;
    }
    
    /**
     * this is when a hero has completed the task, they then are given rewards and changes in statistics
     */
    public static void setCompletion(MC hero, Puzzle p)
    {
        hero.setMoney(hero.getMoney() + p.getMoney());
        hero.setExperience(hero.getExperience() + p.getExp());
        hero.setTotalExperience(hero.getTotalExperience() + p.getExp());
        hero.setTotalMoney(hero.getTotalMoney() + p.getMoney());
        hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() + p.getExp());
        Game.puzzleList.remove(0);
        Conversion.levelCheck(hero);
    }
    
    /**
     * This is when you add the puzzles into the arraylist, changes everytime you complete a puzzle
     */
    public static void addPuzzles(MC hero, ArrayList <Puzzle> p)
    {
        for (int i= hero.getQuestNumber(); i < puzzles.length; i++)
        {
            p.add(puzzles [i]);
        }
    }
}
