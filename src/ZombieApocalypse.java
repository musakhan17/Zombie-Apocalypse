import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ZombieApocalypse {
    private static Scanner input;
    public HashMap<String, String> Zombies = new HashMap<>();

    public boolean addZombie(String zombie, String weak) {
        if(Zombies.containsKey(zombie) != true){
            Zombies.put(zombie, weak);
            return true;
        } else
            return false;
    }

    public void removeZombie(String zombie) {
        if (Zombies.containsKey(zombie)) {
            Zombies.remove(zombie);
        } else {
            throw new NoSuchElementException();
        }
    }

    public String getZombie(String zombie) {
        if(Zombies.containsKey(zombie)) {
            return Zombies.get(zombie);
        } else
            throw new NoSuchElementException();
    }

    public static void main(String args[]) {
        input = new Scanner(System.in);
        ZombieApocalypse stem = new ZombieApocalypse();

        while (true){
            System.out.println("Enter the number to choose from the following options");
            System.out.println("1) To get weakness of a zombie");
            System.out.println("2) To add a new Zombie and weakness to the list");
            System.out.println("3) To remove zombies from the list");
            System.out.println("4) To exit program");

            String option = input.nextLine();

            if(option.equals("1")){
                System.out.println("Enter type of zombie:");
                String zombie = input.nextLine();
                stem.getZombie(zombie);
            }
            else if(option.equals("2")) {
                System.out.println("Enter type and weakness of zombie");
                String zombie = input.nextLine();
                String weakness = input.nextLine();
                stem.addZombie(zombie, weakness);
            }
            else if(option.equals("3")) {
                System.out.println("Enter type of zombie:");
                String zombie = input.nextLine();
                stem.removeZombie(zombie);
            }
            else if(option.equals("4")) {
                input.close();
                break;
            }
            else {
                System.out.println("Choose a valid option.");
            }
        }
    }


}
