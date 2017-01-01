import java.util.*;
/**
 * Write a description of class StoryLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryLine
{
    /**
     * Tell's you the plot or storyline, the purpose of this game.
     * 
     * Precondition - Game starts
     * Postcondition - tells the story of the game
     */
    public static void history()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("\nIn the era of the Sevanth War, the struggle between Good and Evil, "
        + "monsters and demons fought against angels and guardians. \n\nPRESS ANY KEY TO CONTINUE");
        scan.nextLine();
        System.out.println("\nBefore the prehistoric war of fate, there was peace. \n"
        + "The two brothers, Constantus and Aberrtus, both the equal in the domain of the light, " 
        + "ruled the world with kindness and trust. \nAt a young age, Constantus was told by the oracles "
        + "of betrayal and catastrophe from his younger brother. \nConstantus kept this in his heart and "
        + "as the years passed by, looked out for Aberrtus and kept him out of trouble."
        + "\nConstantus promised his brother that no harm would come to him and would do anything to save him."
        + "\nHowever, as the days grew more prosperous and the brothers grew older, Aberrtus, "
        + "the younger one, began to question the other's loyalty. \nSecrecy developed, "
        + "Aberrtus burst out in anger, demanding that his brother, Constantus, "
        + "was planning to end the peace with the end of the era. \n\nPRESS ANY KEY TO CONTINUE");
        scan.nextLine();
        System.out.println("\nConstantus, however, had been warned of this and tried to persuade his brother "
        + "out of the idea. \nThis only created distrust within the board of divine souls. "
        + "\nThe oracles inevitably knew that a major war would begin, but to what scale was undetermined. "
        + "\nAs Constantus grew more concerned of his brother and his sickly state, "
        + "Aberrtus fell deeper into his fears and anger.\n"
        + "He broke his connection with Constantus and joined a secret group known as the "
        + "Nefarium Decurae, the status in which only the most violent and dark people of the world carried. "
        + "\n\nPRESS ANY KEY TO CONTINUE");
        scan.nextLine();
        System.out.println("\nIt was here that Aberrtus was possessed by a dark spirit known as the Obscura, and "
        + "in his days at the meetings, he spent countless hours preparing his overthrow of his brother. "
        + "\nThis had devastated Constantus, as he wept every night, regretting his failures. "
        + "\nThe Obscura had engulfted Aberrtus's soul, and forced his mind to think only on destroy the light domain. "
        + "\nFrom then on, Aberrtus took the name Mortis Dator and took over the Kingdom of Darkness. "
        + "\n\nPRESS ANY KEY TO CONTINUE");
        scan.nextLine();
        System.out.println("With a new leader in the dark empire, they flourished and set a formidable threat "
        + "to the light. \nThe balance of the world was tipped and both sides gathered arms."
        + "\nConstantus keeping his promise, declared war on the Obscura, which engulfed his brother. "
        + "\nConstantus, with his angelic forces, took on the darkness army led "
        + "by his brother Aberrtus and the right and left hand Diablo and Drakonus. "
        + "\nThe great war, known as the Sevanth War lasted for hundreds of years, "
        + "and would not cease until Constantus had saved his brother. "
        + "\n\nPRESS ANY KEY TO CONTINUE");
        scan.nextLine();
        System.out.println("Constantus needed to take on many heroic tasks to save Aberrtus. "
        + "\nLittle had he known that the Oracles predicted the victories not within this lifetime. "
        + "\nThe final task was the battle between both Constantus, Aberrtus, and their commanding officers fought. "
        + "\nConstantus had vowed to save his brother, and knew that this battle determined the fate. "
        + "However in midst of battle, Constantus had been brutally beaten, and had failed, or so he thought. "
        + "\nAs the oracles predicted, a giant Meteore fell from the sky and smashed the battlefield, encasing the brothers and the armies in time. "
        + "\nEven though Constantus had failed in returning Aberrtus to his normal state, he was given a chance in the future "
        + " as the Meteore encased their souls in the weapons. "
        + "\n560 Millennia later, stories of these great beings reappeared, people having to "
        + "see or hear the spirits, calling them to the bidding. \nThese spirits were not just a fable, "
        + "as Oracles predicted that they would return and another war would ensue, far more "
        + "devastating than the last. \nApparently, you good warrior, have a powerful spirit guarding you, "
        + "meaning that you are the chosen one. \nThat powerful spirit is Constantus. "
        + "\nThe oracle also mentioned that you, once able to unlock your true potential, would "
        + "be able to set the spirits to rest, finish what Constantus had started, and bring peace to the world.\n\n"
        + "PRESS ANY KEY TO CONTINUE"); 
        scan.nextLine();
    }
    
    /**
     * At the great history center, you can learn about the history of the timeline
     * 
     * Postcondition - It displays the history in chronological order
     */
    public static void timeLine()
    {
        System.out.println( "\n" +
        "Year:  Event:" + "\n\n\n" +
        "0 - peak of Constantus and Aberrtus share in Domain of Light.\n\n" +
        "39 - Aberrtus loses his connection with Constantus.\n\n" + 
        "45 - Aberrtus joins the Nefarium Decurae.\n\n" + 
        "45.2 - Aberrtus becomes possessed by the Obscursus (Spirit of the Darkness).\n\n" + 
        "57 - Aberrtus becomes the guardian of darkness in the Kingdom of Darkness.\n\n" +
        "59 - Aberrtus becomes the ruler of the Kingdom of Darkness and takes up the name Mortis Dator.\n\n" + 
        "65 - World starting to fall, tensions begin. Oracle percieves the Sevanth War.\n\n" +
        "72 - The Sevanth War begins.\n\n" +
        "73 - The Goblins surrender to the darkness. An newbred army is born.\n\n" + 
        "79 - Constantus takes on the first task and defeats the forces of John and the Sheriff.\n\n" +
        "80 - The Skeleton tribes join forces with the Darkness.\n\n" + 
        "82 - Constantus find the King of Goblins and slays the goblin.\n\n" + 
        "82.75 - The goblins assemble a new legion under Aberrtus.\n\n" + 
        "83 - The battle on Samuel's Hill occurs. It lasts for 20 days. Saint Samuel suffers a painful defeat.\n\n" +
        "85 - Constantus searches for the werewolf, the lead flank in the Darkness.\n\n" +
        "95 - The Werewolf is slain by Constantus. Darkness loses its frontal attack.\n\n" + 
        "102 - The blob kings are split up, a third of the tribe joins the dark, a two thirds join the light.\n\n" +
        "104 - Constantus takes on the task to defeat the King Skeleton\n\n" + 
        "105 - Constantus slays the skeleton, the skeleton forces disband and become bounded to Drakonus." +
        "115 - Constantus is forced to complete the Labors of Hercules. \n\n" + 
        "127 - He finishes Labors of Hercules.\n\n" +
        "141 - Constantus starts King Arthur's quests. \n\n" +
        "142 - The white knights hold of a decisive victory against the darkness.\n\n" + 
        "142.5 - Constantus slays Mordred and ends the evil of the knights, however the victory is short." +
        "144 - The white knights suffer a fatal defeat from the massive dark forces, they are either slain or transformed into the dark knights.\n\n" +
        "160 - The demons join the dark army to improve their incredible strength power. The king of demons is now Diablo.\n\n" +
        "172 - The battle at Drakon's Front leads to the annilation of the dragons. Both sides take hits as it lasts for 5.5 years.\n\n" + 
        "179 - Constantus defeats all evil lead dragons.\n\n" +
        "180 - The elven race are beaten back by the Demons. The oracle warns of a devestating revenge." +
        "190 - At the battle of Diablo's Corneath, the reaper is slain by the angels. The dwarves damage the dark army.\n\n" +
        "191 - Constantus goes on a hunt to defeat the Prince of Demons.\n\n" +
        "197 - Constantus, after six years, slays the Prince of Demons and learns about the King.\n\n" + 
        "202 - At the Deciding Highlands, Constantus slays the drakon during battle.\n\n" + 
        "205 - Apollo, the Olympian god of light, is wounded by Diablo in the Field of SorrowSung.\n\n" +
        "206 - Diablo is scarred by Constantus in the historical battle of Devepilth.\n\n" +
        "210 - Constantus slays the shadow beast." + 
        "211 - Constantus slays the greater shadow mirror." + 
        "217 - In the great battle at the Bridge of Fate, all the forces are frozen in time, infused with their belongings.\n\n" +
        "277 - The seven tiered armors are made by the greatest crafters that ever lived.\n\n" +
        "560000 - You are selected as the chosen one to save Aberrtus and keep Constantus's promise.\n\n");
    }
    
    /**
     * Gives each character and their pros and cons and interesting fact
     */
    public static void analyze()
    {
        System.out.println("\nThe current case is being shown in another city, please be patient until it returns." + 
        "\nThe information you are looking for is unavailable.\n\n");
    }
}
