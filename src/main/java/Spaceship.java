import java.util.Scanner;

public class Spaceship {

    private String name;
    private int attack;
    private int defense;
    private CrewMember[] crew = new CrewMember[2];
    private int attackValue;
    private int defenseValue;


    public CrewMember[] populateCrew() {
        int defenseStrength;
        int attackStrength;
        String memberName;
        System.out.println("You are now adding crew members to " + name);
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < crew.length; i++) {
            System.out.println("Please enter the name of this crew member.");
            memberName = input.next();
            System.out.println("Please enter the initial attack strength of this crew member.");
            attackStrength = Integer.parseInt(input.next());
            System.out.println("Please enter the initial defense strength of this crew member.");
            defenseStrength = Integer.parseInt(input.next());
            crew[i] = new CrewMember(memberName, attackStrength, defenseStrength);
            System.out.println("You have added " + crew[i].getName() + " to your crew. "
                + crew[i].toString());
        }
        return crew;
    }

    public int attackStats() {
        for (int i = 0; i < crew.length; i++) {
            attackValue += crew[i].attackPower;
        }
    return attackValue;
    }

    public int defenseStats() {
        for (int i = 0; i < crew.length; i++) {
            defenseValue += crew[i].defensePower;
        }
    return defenseValue;
    }

    public Spaceship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String EngageEnemy(Spaceship alliance, Spaceship rebel) {
        int rebelDamageReceived = alliance.attackStats() - rebel.defenseStats();//-9
        int allianceDamageReceived = rebel.attackStats() - alliance.defenseStats();//9
        Spaceship winningShip;
        String battleStats = "";


        if (rebelDamageReceived < allianceDamageReceived) {
            winningShip = rebel;
        } else if (allianceDamageReceived < rebelDamageReceived) {
            winningShip = alliance;
        } else {
          System.out.println("It was a draw!");
          return "";
        }
        battleStats = winningShip.getName() + " has won!";
        System.out.println(battleStats);

        return battleStats;
    }
}
