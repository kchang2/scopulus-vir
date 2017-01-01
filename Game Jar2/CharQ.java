
/**
 * Write a description of class CharQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharQ
{
    
    /**Champions, aka Quests: name, experience, current_hp, agility,
     * defence, strength, money, weapon, armor, max_hp, min_heal, max_heal**/
     
     static Champion princejohn = new Champion ("Prince John", 100, 100, 10, 10, 10, 100, Weapon.goldsword, Armor.princejohncrown, 100, 15, 40);
     static Champion sheriff = new Champion ("Sheriff of Nottingham", 150, 200, 0, 15, 20, 55, Weapon.ironsword, Armor.sheriffbadge, 200, 25, 25);
     static Champion sirguy = new Champion ("Sir Guy of Gisborne", 200, 350, 15, 20, 20, 60, Weapon.irontwohand, Armor.sirguyarmor, 350, 33, 41);
     static Champion bishop = new Champion ("Bishop of Hereford", 100, 200, 30, 5, 5, 200, Weapon.bishopgold, Armor.robes, 200, 0, 200);
     static Champion robinhood = new Champion ("Robin Hood", 500, 300, 50, 20, 30, 25, Weapon.robinbow, Armor.leatherarmor, 300, 0, 95);
     static Champion hermitjohn = new Champion ("Hermit John", 500, 500, 0, 50, 5, 0, Weapon.woodstaff, Armor.hermitcloak, 500, 0, 1);  
   
     static Champion kinggoblin = new Champion ("Tzhuchuw the King of the Goblins", 600, 300, 20, 20, 20, 150, Weapon.goblinmace, Armor.leatherarmor, 300, 0, 50);
     static Champion werewolf = new Champion ("Werewolf", 1000, 1000, 60, 30, 60, 200, Weapon.claws, Armor.moon, 1000, 0, 100);
     static Champion kingskeleton = new Champion ("Xeborenes the King Skeleton", 1200, 500, 20, 20, 100, 500, Weapon.bonesword, Armor.skeletonarmor, 1000, 0, 300);
     static Champion nemeanlion = new Champion ("Nemean Lion", 2000, 1000, 100, 500, 100, 1000, Weapon.claws, Armor.lionfur, 2000, 0, 500);
     static Champion hydra = new Champion ("Lernean Hydra", 2000, 800, 0, 300, 300, 1000, Weapon.poison, Armor.hydraskin, 10000, 0, 800);
     static Champion deerguard = new Champion ("Guardian of the Deer", 2000, 1000, 100, 100, 100, 1000, Weapon.silverbow, Armor.hunterarmor, 1000, 0, 200);
     static Champion eryboar = new Champion  ("Erymanthian Boar", 2000, 1100, 100, 120, 90, 1000, Weapon.tusks, Armor.leatherarmor, 1200, 0, 300);
     static Champion augeanhorse = new Champion ("Alpha Augean Horse", 2000, 1000, 20, 120, 20, 1000, Weapon.stool, Armor.saddle, 1400, 0, 500);
     static Champion stymphbird = new Champion ("Stymphalian Birds", 2000, 1200, 150, 150, 100, 1000, Weapon.ironbeaks, Armor.bronzearmor, 1200, 0, 400);
     static Champion cretebull = new Champion ("Cretan Bull", 2000, 1600, 120, 80, 100, 1000, Weapon.horns, Armor.leatherhide, 1700, 0, 200);
     static Champion diomedehorses = new Champion ("Diomede the Feeder", 2000, 1500, 20, 70, 100, 1000, Weapon.ironsword, Armor.beastshield, 2500, 0, 300);
     static Champion amazonqueen = new Champion ("Hippolyte, The Queen of the Amazon", 2000, 1400, 150, 150, 150, 10000, Weapon.spear, Armor.greatgirdle, 2000, 100, 400);
     static Champion geyron = new Champion ("Geyron the Barbarian", 2000, 1600, 30, 50, 100, 5000, Weapon.club, Armor.woodshield, 1800, 0, 300);
     static Champion antaeus = new Champion ("Antaeus the Rebirth", 2000, 1300, 20, 100, 150, 5000, Weapon.fist, Armor.rehealingfeet, 1800, 0, 500);
     static Champion eagle = new Champion ("Tormenting Eagle", 1500, 900, 50, 50, 50, 1000, Weapon.beak, Armor.flyingwings, 1000, 0, 100);
     static Champion ladon = new Champion ("Ladon the Guardian", 2000, 1000, 0, 150, 180, 2000, Weapon.firepoison, Armor.dragonskin, 1000, 500, 950);
     static Champion atlas = new Champion ("Atlas the Titan", 5000, 1600, 50, 200, 210, 15000, Weapon.powerfist, Armor.powerskin, 2000, 300, 600);
     static Champion cerberus = new Champion ("Cerberus the Three Headed Dog", 5000, 3000, 0, 300, 300, 20000, Weapon.powerjaws, Armor.hadescollar, 6000, 1000, 3000);
     static Champion hades = new Champion ("Hades the God of the Underworld", 10000, 9000, 500, 500, 500, 100000, Weapon.bident, Armor.shadowhelm, 100000, 0, 10000);
   
     static Champion blackknightC = new Champion ("Black Knight", 300, 300, 30, 30, 30, 200, Weapon.steelsword, Armor.blackarmor, 500, 0, 50);
     static Champion greenknight = new Champion ("Green Knight", 500, 500, 40, 40, 40, 300, Weapon.steelsword, Armor.greenarmor, 600, 0, 100);
     static Champion blueknight = new Champion ("Blue Knight", 700, 700, 50, 50, 50, 600, Weapon.steelsword, Armor.bluearmor, 800, 0, 100);
     static Champion yellowknight = new Champion ("Yellow Knight", 800, 800, 45, 45, 45, 900, Weapon.steelsword, Armor.yellowarmor, 900, 0, 100);
     static Champion redknight = new Champion ("Red Knight", 900, 900, 60, 60, 60, 1000, Weapon.steelsword, Armor.redarmor, 1000, 0, 50);
     static Champion mordred = new Champion ("Mordred the Evil", 1100, 1500, 5, 5, 120, 1000, Weapon.morningaxe, Armor.ironarmor, 1500, 0, 200);
     static Champion druidchief = new Champion ("Chief of the Druids", 1000, 500, 1, 1, 1, 1000, Weapon.holygrail, Armor.clothes, 5000, 0, 500);
     static Champion merlin = new Champion ("Merlin", 1200, 700, 0, 80, 75, 400, Weapon.merlinstaff, Armor.robes, 1400, 0, 350);
     static Champion kingarthur = new Champion ("King Arthur", 1500, 1000, 50, 75, 75, 1600, Weapon.excalibur, Armor.ironmail, 1000, 0, 200);

     static Champion puffdragon = new Champion ("Puff the Magic Dragon", 1000, 1, 0, 0, 500, 1, Weapon.stool, Armor.stoolcase, 2, 0, 0);
     static Champion airdragon = new Champion ("Air Dragon", 2000, 1000, 200, 50, 120, 1000, Weapon.airblast, Armor.airaura, 1500, 0, 300);
     static Champion waterdragon = new Champion ("Water Dragon", 3000, 1500, 110, 110, 110, 1250, Weapon.waterblast, Armor.wateraura, 2000, 0, 500);
     static Champion earthdragon = new Champion ("Earth Dragon", 4000, 1750, 50, 135, 135, 1500, Weapon.earthblast, Armor.earthaura, 2150, 0, 600);
     static Champion firedragon = new Champion ("Fire Dragon", 5000, 2000, 80, 80, 160, 1700, Weapon.fireblast, Armor.fireaura, 2500, 0, 750);
     static Champion blooddragon = new Champion ("Blood Dragon", 7000, 2500, 10, 20, 250, 1750, Weapon.bloodrage, Armor.bloodaura, 2650, 100, 200);
     static Champion souldragon = new Champion ("Soul Dragon", 10000, 4000, 50, 150, 150, 2000, Weapon.soulrage, Armor.soulaura, 4000, 100, 950);
     static Champion olddragon = new Champion ("Ketzel - The Yellow Ol' Bull", 12000, 4500, 0, 150, 150, 3000, Weapon.knowledge, Armor.bookcover, 4500, 100, 800);
     static Champion blackdragon = new Champion ("Black Dragon", 14000, 500, 150, 180, 270, 3500, Weapon.darkblast, Armor.darkaura, 5000, 0, 950);
     static Champion whitedragon = new Champion ("White Dragon", 15000, 5000, 200, 200, 200, 3500, Weapon.lightblast, Armor.lightaura, 5000, 0, 1000);
     static Champion dragonmaster = new Champion ("DragonMaster", 17250, 10000, 150, 400, 300, 5000, Weapon.dragonsword, Armor.dragonchariot, 12500, 350, 2500);
   
     static Champion princedemon = new Champion ("Prince of Demons", 2000, 5000, 100, 100, 150, 3000, Weapon.demonclaws, Armor.fearhelm, 9000, 0, 1500);
     static Champion drakon = new Champion ("Drakon of Destruction", 5000, 10000, 80, 200, 200, 5000, Weapon.fireball, Armor.darkarmor, 10000, 20, 1000);
     static Champion diablo = new Champion ("El Diablo", 6000, 10000, 200, 200, 200, 5000, Weapon.trident, Armor.bighorns, 15000, 100, 3000);
     static Champion shadowbeast = new Champion ("Shadow Beast", 10000, 1, 500, 500, 500, 9999, Weapon.claws, Armor.shadow, 1, 0, 0);
     static Champion shadowmirror = new Champion ("Greater Shadow Mirror", 15000, 100, 750, 750, 700, 15000, Weapon.mirror, Armor.mirrorshield, 100, 0, 0);
        static Champion aberrtus = new Champion ("Aberrtus the Fallen One", 50000, 15000, 1000, 1000, 1000, 25000, Weapon.fist, Armor.clothes, 25000, 0, 10000);
     static Champion obscura = new Champion ("The Obscura Spirit", 100000, 99999, 0, 0, 10000, 0, Weapon.darkblast, Armor.darkaura, 99999, 0, 0);
    
}
