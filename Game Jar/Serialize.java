import java.io.*;
import java.util.*;
/**
 * Serializing the files, much easier than putting it in TEXT.
 * 
 */
public class Serialize
{
    Scanner scan = new Scanner(System.in);
    public boolean saveAccountM(MC hero)
    {
        System.out.print("Name of File to be saved as: ");
        String fileName = scan.nextLine(); //change so that Main Character has a file name.
        if (!fileName.endsWith(".ser"))
        {
          fileName += ".ser";
        }
        try
        {
            FileOutputStream FS = new FileOutputStream (fileName);
            ObjectOutputStream OS = new ObjectOutputStream (FS);
            OS.writeObject(hero);
            OS.close();
            return true;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean loadAccount (MC hero)
    {
        System.out.print("Name of the file to load: ");
        String fileName = scan.nextLine();
        if (!fileName.endsWith(".ser"))
        {
          fileName += ".ser";
        }
        try
        {
            FileInputStream FS = new FileInputStream (fileName);
            ObjectInputStream OS = new ObjectInputStream (FS);
            hero = (MC) OS.readObject();
            OS.close();
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
}