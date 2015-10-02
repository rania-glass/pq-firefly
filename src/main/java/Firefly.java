import java.util.Scanner;

public class Firefly {

    private static Spaceship[] ships = new Spaceship[2];

    public static void main(String[] args) {

        Scanner nameThings = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Please name this ship.");
            String shipName = nameThings.next();
            ships[i] = new Spaceship(shipName);
            System.out.println("You now have a ship named " + ships[i].getName());
        }

        for (int i = 0; i < ships.length; i++) {
            System.out.println("Beginning to populate " + ships[i].getName());
            ships[i].populateCrew();
        }

        Spaceship.EngageEnemy(ships[0], ships[1]);
        System.out.println("Battle begun.");
    }
}
