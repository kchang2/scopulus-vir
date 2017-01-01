import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Quest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task
{
    private String objective, beginword, midword, endword, setting;
    private Champion c = new Champion("", 0, 0, 0, 0, 0, 0, Weapon.fist, Armor.clothes, 0, 0, 0);
    
    //robinhood
/*1*/    static Task task1 = new Task ("Your first task in the Robin Hood tale, \nis to defeat the prince, need in jail. \nQuest: Defeat Prince John", "Road by Carriage", "You know who I am? I am soon to be King, I'm Prince John!", CharQ.princejohn, "You cannot beat me. I am rich and the best.", "You have beaten me, just like Constantus.");
/*2*/    static Task task2 = new Task ("The next task is to take care of the Sheriff, \nbeware as the he is far more cunning.\nQuest: Defeat the Sheriff", "Town Jail", "You wish to challenge me? I will lock you up along with the merry men.", CharQ.sheriff, "You think you're better than me? I'll show you.", "By star, I am no match. I will vow to find Robin Hood, if it the last step I make.");
/*3*/    static Task task3 = new Task ("Beating the sheriff was brave no doubt, \nbut test your skill with a yonder knight the lout.\nQuest: Defeat Sir Guy", "Plains of the Forest", "Come at me, I'm the best I tell you!", CharQ.sirguy, "I will now unleash my true potential on you, you have been warned!", "I spit on you, just like I did with stantus, losing to you is a horrible loss.");
/*4*/    static Task task4 = new Task ("A bishop is your next task, beware of his gold. \nHe will take you out, winter cold\nQuest:Set the Bishop straight", "Holy Church of the Bishop", "Have you come to pay me some money?", CharQ.bishop, "You will not beat me! I will exocommunicate!", "God is on my side, even though you have won! Am I right?");
/*6*/    static Task task5 = new Task ("A noble quest must come to an end, \nas training with Sir Robin, will make you win.\nQuest: Prove yourself worthy to Robhin Hood by beating him", "Sherwood Forest", "Hello, young lad, be strong you must!", CharQ.robinhood, "Constantus has been better, you must not lose!", "You have won, I am proud. Just like Constantus.");
/*7*/    static Task task6 = new Task ("A quick fight you must have, \nor not so fast, as Little John is the lad.\nQuest:Prove your readiness by besting little John", "The Log over the Pond", "Ho ho ho, Robin hood may be good, but I am better.", CharQ.hermitjohn, "You sure you can win this. I have a trick up my sleeve.", "Great job, you have bested us both. It is an honor.");
    
    //break from group
/*8*/    static Task task7 = new Task ("Just as Constantus had done, beat the Goblin. \nFor he is a meanacing figure, no doubt hes a goblin. \nQuest: Defeat the Goblin King", "Goblin Village", "NIW TON LLIW UOY DNA ,LLAHS UOY EM THGIF.", CharQ.kinggoblin, "NOOS UOY DNE LLIW I !TON ERA UOY SUTNATSNOC", ".ESRUC YM D'EERF .ARUCSBO EHT FO HTARW EHT MORF EM DEVAS EVAH UOY");
/*9*/    static Task task8 = new Task ("Take down the werewolf as he may have a clue, \nto why Aberrtus gone evil, once through. \nQuest: Take out the werewolf as it is ravaging all land", "The wooded forest of the Moonlight", "AROOOOOOOOOOO", CharQ.werewolf, "HAWRRRL", "UHRUUUUUUUUUUUUUU");
/*11*/    static Task task9 = new Task ("The skeleton is a great force to be dealt with, \ntake out the leader as Constantus was no myth.\nQuest: Free the Skeleton King from his bond of pain", "the Graveyard", "-.-- --- ..- / -.-. .- -. -. --- - / ..- -. -.. . .-. ... - .- -. -.. / -- . / .. / .- -- / -.-. . .-. - .- .. -. / --- ..-. / - .... .. ... .-.-.- / .... --- .-- . ...- . .-. --..-- / -.-- --- ..- .-. / ..-. --- .-. -.-. . ... / .- .-. . / .-- . .- -.- / .- -. -.. / .. / .-- .. .-.. .-.. / . -. -.. / -.-- --- ..- / --.- ..- .. -.-. -.- .-.-.-", CharQ.kingskeleton, "-... . / --. --- -. . / .-.. . .- ...- . / -- . / -... . .-.-.- / - .... . / ... -.- . .-.. . - --- -. / - .-. .. -... . / .-- .. .-.. .-.. / -. . ...- . .-. / -... . / ..-. .-. . . -..", "- .-. ..- .-.. -.-- / .- / .... . .-. --- --..-- / -.-- --- ..- / .... .- ...- . / ... .- ...- . -.. / - .... . / - .-. .. -... . .-.-.- / . -. -.. / -- . / -. --- .-- --..-- / .- ... / ..-. .- - . / -.. . -.-. .. -.. . ... .-.-.-");
    
    //hercules tasks
/*12*/    static Task task10 = new Task ("The first of the Herculean Tasks, you must face, \nfor the Nemean Lion has a date.\nQuest: Defeat the Nemean Lion", "the City of Nemea", "ROARRRRRRRRRRRRRR", CharQ.nemeanlion, "RAAAAAAAAAAAR", "MMMMMWWWWWWWWWW");
/*13*/    static Task task11 = new Task ("The second labor is just as tough, \nfor the Hydra is a creature with no bounds, go at dusk.\nQuest: Like Hercules, defeat the Hydra", "the City of Lerna", "SSSSSSSSSSSSSSS", CharQ.hydra, "HSSSSSSSSSSSSSSSSS","sssssssssssssss");
/*14*/    static Task task12 = new Task ("Hunting a stag may be tough, \njust as Constantus fought the rough\nQuest: Defeat the guardian of the Deer", "Diana's Providence", "Halt! In the name of Diana, come forth.", CharQ.deerguard, "The sacred deer shall be protected. You will not succeed.", "Congratulations fair warrior. You follow Constantus footsteps.");
/*16*/    static Task task13 = new Task ("The Erymanthian Boar is crazy enough, \ntake him out for the this task has tusks.\nQuest: Slay the terrible boar", "the Mountain of Erymanthus", "SQUEAL", CharQ.eryboar, "SQUEAL", "SQUEAL");
/*17*/    static Task task14 = new Task ("Take out the horse, the king of horses, \nas he is stinky, as well as his courses. \nQuest: Clean the dirty horses", "The Stable of Augeas", "NEEEEEEEIGH", CharQ.augeanhorse, "NNEEIIGHH", "NEIGH");
/*18*/    static Task task15 = new Task ("To test your worthiness and your cause, \nfollow the footsteps and beat those cawks. \nQuest: Cease the annoyance of the flying danger.", "Lake Stymphalia", "caw caw caw", CharQ.stymphbird, "hhhhhhhhhhhhh", "aaaaaaaaaaaaaaa");
/*19*/    static Task task16 = new Task ("Another tormentor runs amuck, \ndo your duty and protect with luck. \nQuest: Drive out the Crete Bull", "The Fort of Crete", "HRRRRRRRRR", CharQ.cretebull, "HHHHHHHHHHHHHHR", "HHHHHHHHHHRRRRRRRRRRR");
/*21*/    static Task task17 = new Task ("Protect the people, as this king is bad. \nHe feeds meat, he's the horses' dad.\nQuest: Defeat wicked Diomedes", "Kingdom of Diomedes", "You think you can storm in here. I will beat you quick then feed you to the horses.", CharQ.diomedehorses, "You are tougher than you seem. No matter, the horses will get you.", "Don't feed me to my children. I taste bad.");
/*22*/    static Task task18 = new Task ("The Amazon queen is the next task, \nas she is fair but strong when she's mad.\nQuest: Proove your strength against the Amazonian Tribe", "The Amazonian tribal grounds", "Who is there, are you Constantus, I will no longer give my girdle. Make sure of it!", CharQ.amazonqueen, "You cannot best me, for I am the queen of the Amazon, let us finish this.", "You are just as great as Constantus, you are truly ready. You may even be as strong as my Hercules.");
/*23*/    static Task task19 = new Task ("A formidable foe, the Geyron is. \nTake him out as he has hurt many. \nQuest: Take on Geyron, the relentless foe", "Erytheia, the Mystical Island", "Come near me; I will not bite.", CharQ.geyron, "You have hurt me, I will take no pity.", "Impossible! My three bodies do not fail.");
/*24*/    static Task task20 = new Task ("The Antaeus, a man of great strength, \nhis foot is powerful, go to great length.\nQuest: Prove your intelligence against Antaeus", "Antaeus's Hut", "Let us wrestle, like real men. Unless you want to fight like a fool", CharQ.antaeus, "Reheal me, mother Gaia.", "My mother, you have failed me.");
/*26*/    static Task task21 = new Task ("A man who you look up to is enchained by Gods, \nlighten his load and defeat the devourer of cod \nQuest: Lessen the pain of Prometheus and set the Eagle to the skies", "Prometheus's Rock", "NEAWWWWWWW", CharQ.eagle, "EEEEEEK", "EEEEEEEEEEEEEEEEEYEEEEEYEEEE");
/*27*/    static Task task22 = new Task ("Go to the garden, find the apple, \ndo what Hercules did, and try to use a grapple.\nQuest: Retrieve the Golden apple, fight Ladon at all cost.", "Garden of Hesperides", "zzzzzzzzzz", CharQ.ladon, "zzzzzzzzzzz", "zzzzza");
/*28*/    static Task task23 = new Task ("Fight the great titan, \nit's Constantus's most similar foe.\nQuest: Prove your dominance by beating Atlas.", "Mountain of Hesperides", "Help me hold the earth, I will help you out.", CharQ.atlas, "Don't be mean, I am stronger and better than you.", "Don't trap me back in that task, dont make me hold the skies.");
/*29*/    static Task task24 = new Task ("Go to the underworld, \nthis is almost your last task. Find the god, and get past his lask\nQuest:Train Cerberus by force.", "Entrance to the Underworld", "RUFFFF", CharQ.cerberus, "GRRRRRRR", "HMMEM");
/*31*/    static Task task25 = new Task ("The last part of these quests is to win your approval from Hades, \nbeware though, as he's the king of his bees.\nQuest:Prove your legacy with Hades.", "Underworld Kingdom", "Come, Constantus, the chosen one you are? find out", CharQ.hades, "You are tough, but you are not Constantus", "My approval is positive as I will aid the legacy.");
    
    //king arthur tasks
/*32*/    static Task task26 = new Task ("Take out the first of five knights. He is wearing black armor.\nQuest: Fight the Black Knight", "Black Knight's Field", "Joust me! I am but one of the weakest", CharQ.blackknightC, "Come towards me! Feel my green sword", "Ohohoho, you are really good.");
/*33*/    static Task task27 = new Task ("The first of the Medieval Quests is always easy, \nbeat the Green Knight for he is weasy.\nQuest: Joust the Green Knight", "Green Knight's Tree", "Joust me! I am but one of the weakest", CharQ.greenknight, "Come towards me! Feel my green sword", "Good Knight, you are truly great! But watch out for my brothers, \nthey may not have the same fate.");
/*34*/    static Task task28 = new Task ("As you finish your first quest, you may think this is not rough, \njust wait for blue knight, it may be pretty tough. \nQuest: Lance the Blue Knight", "Blue Knight's Tent", "Ah, you have beaten my green brother. Come towards me if you can!", CharQ.blueknight, "Blue Knights are tough, as I am the toughest!", "Congratulations, take heed, as the Red Knight is most cunning.");
/*36*/    static Task task29 = new Task ("The Yellow knight is a strong one, for he has a legion of men, \n1 for each battle, 1 for each win.\nQuest: Duel the Yellow Knight", "Yellow Knight's Lawn", "Do you see my yellow armor, it is gleaming with pride!", CharQ.yellowknight, "Begone, I am the best, my yellow shall prevail!", "Take heed, my brother, as you have defeated the three. \nThe fourth is the greatest, beyond his fast steed.");
/*37*/    static Task task30 = new Task ("The final task is the dreaded Red Knight, \nHis power is immense as you will feel is horrible might\nQuest: Smite the Red Knight", "Red Knight's Fortress", "Why do you come to my castle alone? Do you not know that you need an army; go home.", CharQ.redknight, "When I win this battle, I will taste bittersweet blood, that is from you my friend, not so safe you flust.", "You have beaten me well, and beaten me fair, come again soon, with it take care.");
/*38*/    static Task task31 = new Task ("An evil force has dwelled on Earth. \nHis name is sir Mordred, not a sir too morse.\nQuest: Defeat Mordred", "Mordred's Camp", "Hahaha, you think you can challenge me. \nI will end you quick and then drink my tea.", CharQ.mordred, "You cannot best me, I am the greatest. Far superior to King Arthur to say the latest.", "Death on you I say, Death on you! \nI have lost and it is no exception, I vow on my dues.");
/*39*/    static Task task32 = new Task ("The druids are tough, for their magic is strong. Fight well my friend, go on go along.\nQuest: Defeat the Druid King for the holy grail", "Druid Palace", "Test out my magic on this mortal fool", CharQ.druidchief, "You will not beat me, I will heal with my tools", "You beat me up.");
/*41*/    static Task task33 = new Task ("Come to the castle and face on a true magician, his power is immense.\nQuest: Beat the intuitive magician", "Merlin's Hut", "Hoo hoo hoo Hoo HOo!", CharQ.merlin, "Hahah ahahaA HAHha H", "Noo Noo Noo NO NoO!");
/*42*/    static Task task34 = new Task ("Here comes the true test of the Medieval World,\nTake on Sir Arthur, the king that a lord.\nQuest: Beat King Arthur", "The Round Table", "Your final test is very near, I am the king, you must come here.", CharQ.kingarthur, "We are evenly matched, but I will be superior.", "Congratulations, you have defeated me and my knights. \nGood luck, I wish you well!");
    
    //dragon tasks
/*43*/    static Task task35 = new Task ("As you venture outwards, great one yonder, \na new task is formed, with wondering wonder.\nYou must free the Dragons, who are under an evil spell. The first of the Dragons you must conquer is one known as Puff the Magic Wonder.\nQuest: Defeat Puff the Magic Dragon", "Puff's Territory.", "Yo come here foo!", CharQ.puffdragon, "You best not be ruining my house, I will rip you!", "What, foo, you tough, man you toug'.");    
/*44*/    static Task task36 = new Task ("As you 'smoke' puff, there is another dragon lurking,\nhe is the Air Dragon the first of the Elements.\nQuest: Defeat the Air Dragon", "Air Sanctuary", "WOOOSHHHHH", CharQ.airdragon, "WOOOOOSHHH", "WOOOOOSH");
/*46*/    static Task task37 = new Task ("The air dragon is defeated, but the next one is away. Free the Water Dragon and prove your strength.\nQuest: Defeat the Water Dragon", "Water Kingdom", "PWWWHWHWHWHHHH", CharQ.waterdragon, "PWWWHWHWHWH", "PWHHWHHHH");
/*47*/    static Task task38 = new Task ("Water may be a splash, but this next task is not.\nBeat the Earth Dragon.", "Earth Realm\nQuest: Defeat the Earth Dragon", "BOOOOM", CharQ.earthdragon, "BOOOM", "BOOOOOOOOOOM");
/*48*/    static Task task39 = new Task ("The Volcano is erupting as the cap will burst, the Fire Dragon, in pain, will come out to be cured.\nQuest: Defeat the Fire Dragon", "Volcanic Pit", "Crackle", CharQ.firedragon, "CKRKRKCKCKL", "CKLRLCLEKE");
/*49*/    static Task task40 = new Task ("A wave of blood is a horrid site, free the Dragon with all your might.\nQuest: Defeat the Blood Dragon", "Blooded Hill", "RAWWWWWWWWWWR", CharQ.blooddragon, "RAWWWR", "ROWWRRRRR");
/*51*/    static Task task41 = new Task ("When all the dead dragons have gone to waste, their soul remains with this Dragon.\nQuest: Defeat the Soul Dragon", "Soul Valley", "APGMASKDMBAOSIGMAS", CharQ.souldragon, "WAMGKASK", "AWEGASDGAWEHAN");
/*52*/    static Task task42 = new Task ("Dragons are tough, because the creatures are fierce.\nTake on a wise one this time.\nQuest: Defeat Ketzel the Intellectual Dragon","Stone Hall","E=MC^2 is the key to everything!",CharQ.olddragon,"HAHA I am CHOLERIC. C/2¹   10^-10 m   r?   8.314 joule kelvin^-1 * mole^-1 !!","kg*m / s^2   OH^-1");
/*53*/    static Task task43 = new Task ("A legendary dragon is awakening, hurry and save him before he becomes a dark dragon.\nQuest: Defeat the Black Dragon", "Black Isle", "AWWWWWWRAAAAAAAR", CharQ.blackdragon, "WWWAEAGRRRRRR", "AAAAAAAAAAWWWWWWWWWWWWWRRRRRRAAAAA");
/*54*/    static Task task44 = new Task ("Freeing the black dragon has awakened the white dragon. \nProve yourself worthy be defeating this mythical beast.\nQuest: Win the consent of the White Dragon", "White Isle", "AWWWWWWRAAAAAAAR", CharQ.whitedragon, "WWWAEAGRRRRRR", "AAAAAAAAAAWWWWWWWWWWWWWRRRRRRAAAAA");
/*56*/    static Task task45 = new Task ("The dragon quest is not over yet, as the toughest is yet to come. \nYour final quest is to beat the master of controlling dragons.\nQuest: Win the consent of the DragonMaster", "Dragon Castle", "Defeat my dragons, I will summon!", CharQ.dragonmaster, "Come forth white and black dragon!", "You are the true dragon wielder, use my chariot wisely.");
    
/*57*/    static Task task46 = new Task ("A new breed of monsters are forming, \nbeat the Demons and their Demon King.\nQuest: Defeat the dreaded Demon King", "Demon Temple", "AWWWWRRRHEEEEEEEEEE", CharQ.princedemon, "My power is invincible.", "You will never beat the mighty Diablo!");
/*58*/    static Task task47 = new Task ("Go forth, set out past the fields of pain, \nfind the drakon, but be in vain, he is a great force to deal.\nQuest: Slay the Drakon", "Drakon's Front", "HHHHHHHHHSSSSSSSH", CharQ.drakon, "COME TO ME MY ARMY", "NOOOOOOOOOOO!");
/*59*/    static Task task48 = new Task ("The right hand of Aberrtus is the next you seek. \nFight my hero, see your feat\nQuest: Prevent Diablo from taking any more creatures", "Diablo's Domain", "HSSS. YOU think you can beat the powerful me.", CharQ.diablo, "Hahaha, I will wound you much harder!", "Aberrtus is too powerful, you cannot beat him as easily.");
/*61*/    static Task task49 = new Task ("A horrible force threatens to stop you at once. \nGo and finish him off, do it at once!\nQuest: End the Shadow Beast", "Dark Cave of Mystery", "Who goes there? You disturb me.", CharQ.shadowbeast, "I am much more powerful then you, watch me disappear.", "You cannot take me, I am too great to be dealt with.");
/*62*/    static Task task50 = new Task ("The shadow beast may have been tough, but this one is harder. \nHe uses yourself against one another.\nQuest: Conquer 'yourself'", "Empty Mirror House", "I see you! Do you see, yourself?", CharQ.shadowmirror, "Here comes the true test of strength, watch out!", "Do not shatter my mirrors, they are all I have left.");
/*63*/    static Task task51 = new Task ("It is time you face Aberrtus, for you have take on all of Constantus's Quest. \nYou must beat him and the rest.\nQuest: Finally it is time for you to take on Aberrtus", "Mill of Disguise", "Who sent you here? Are you Constantus??", CharQ.aberrtus, "Just like my brother, you are outmatched.", "He's coming out, save me, defeat it!!");
/*64*/    static Task task52 = new Task ("It is the dark one, the immortal enemy, \nstrike him down and bring peace to the universe.\nQuest: End the Obscura and finish the Prophecy and aid Constantus in being free", "7th Dimension", "When you lose, I shall be the host!", CharQ.obscura, "Give up, just let me take over.", "What..NO..NO!!!!!!!!!!!!!!!!!!!!!!!?");
    static Task [ ] tasks = {task1,task2,task3,task4,task5,task6,task7,task8,task9,task10,
    task11,task12,task13,task14,task15,task16,task17,task18,task19,task20,task21,task22,task23,task24,
    task25,task26,task27,task28,task29,task30,task31,task32,task33,task34,task35,task36,task37,task38,
    task39,task40,task41,task42,task43,task44,task45,task46,task47,task48,task49,task50,task51,task52};
    
    /**
     * Constructor for objects of class Quest
     */
    public Task (String objective, String setting, String beginword, Champion c, String midword, String endword)
    {   
        this.objective = objective;
        this.setting = setting;
        this.beginword = beginword;
        this.c = c;
        this.midword = midword;
        this.endword = endword;
    }
    
    public String getObjective() //get objective of quest
    {
        return objective;
    }
    
    public void setObjective(String x) //set objective of quest
    {
        objective = x;
    }
    
    public String getSetting() //get the setting of the fight
    {
        return setting;
    }
    
    public void setSetting(String x) //set the setting of fight
    {
        setting = x;
    }
    
    public String getBeginWord() //get beginning opponent words
    {
        return beginword;
    }
    
    public void setBeginWord(String x) //set beginning opponent words
    {
        beginword = x;
    }
    
    public String getMidWord() //get middle words during battle
    {
        return midword;
    }
    
    public void setMidWord(String x) //set middle words during battle
    {
        midword = x;
    }
    
    public String getEndWord() //return final words of opponent
    {
        return endword;
    }

    public void setEndWord(String x) //get final words of opponent
    {
        endword = x;
    }
    
    public Champion getChampion() //get Champion, the fighter
    {
        return c;
    }
    
    public void setChampion(Champion x) //set Champion, the fighter
    {
        c = x;
    }
    
    /**
     * The player's choice changes the value returned.
     * @returns 1,2,0
     */
    public static int decision (String str)
    {
        Scanner scan = new Scanner (System.in);
        if (str.equalsIgnoreCase("Fight") || str.equalsIgnoreCase("F"))
        {
            return 0;
        }
        else if (Methods.complexAction(str) == 2)
        {
            System.out.println("Game paused. \nPRESS ANY KEY TO CONTINUE");
            scan.nextLine();
            return 1;
        }
        else
        {
            System.out.println("Come back to fight when your ready.");
            return 2;
        }
    }
    
    /**
     * When you finish a quest, this method calculates the bonuses you recieve
     */
    public static void setCompletion(MC hero, Champion c)
    {
        hero.setMoney(hero.getMoney() + c.getMoney());
        hero.setExperience(hero.getExperience() + c.getExperience());
        hero.setTotalExperience(hero.getTotalExperience() + c.getExperience()); 
        hero.setTotalCurrentExperience(hero.getTotalCurrentExperience() + c.getExperience());
        hero.setTotalMoney(hero.getTotalMoney() + c.getMoney());
        Game.taskList.remove(0);
        Conversion.levelCheck(hero);
    }
    
    /**
     * Add the task of the quests into an arraylist. Changes with every battle.
     */
    public static void addTasks(MC hero, ArrayList <Task> t)
    {
        for (int i = hero.getQuestNumber(); i < tasks.length; i++)
        {
            t.add(tasks [i]);
        }
    }
}