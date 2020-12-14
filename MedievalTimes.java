import java.util.Scanner;
import java.io.*;

public class MedievalTimes {
    public static void main(String[] args) throws IOException {
        Scanner userScan;
        File file;
        Scanner fileScan;
        PrintWriter output;

        System.out.println("Welcome to Medieval Times!");

        try {
            userScan = new Scanner(System.in);

            showMenu();
            int option = Integer.parseInt(userScan.nextLine());

            while (option < 4  && option > 0){
                // create new game
                if (option == 1){
                    System.out.println("Enter name of file you'd like to save to");
                    String fileName = userScan.nextLine();
                    file = new File(fileName);
                    output = new PrintWriter(new FileWriter(file, true));

                    System.out.println("Enter name of game");
                    String gameName = userScan.nextLine();
                    output.println(gameName);
                    for (int i = 1; i <= 4; i++){
                        System.out.println("Enter type of character #" + i + " (knight, peasant, cleric, mage, courtier)");
                        String type = userScan.nextLine();
                        MedChar character = new MedChar(type);
                        System.out.println("Enter name of character");
                        String name = userScan.nextLine();
                        output.println(name + "," + type + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getInfluence());
                    }
    
                    output.close();
                    showMenu();
                    option = userScan.nextInt();
                }
                
                // validate save file
                if (option == 2){
                    System.out.println("Enter name of file you'd like to check");
                    String fileName = userScan.nextLine();
                    file = new File(fileName);
                    fileScan = new Scanner(file);


                    fileScan.close();
                    showMenu();
                    option = userScan.nextInt();
                }

                // reroll/randomize existing character
                if (option == 3){
                    System.out.println("Enter game save file");
                    String fileName = userScan.nextLine();
                    file = new File(fileName);
                    fileScan = new Scanner(file);

                    if (file.length() == 0){
                        System.out.println("File is empty! Please try again.");
                        break;
                    } else if (file.length() > 0){
                        while (fileScan.hasNextLine()){
                            System.out.println(fileScan.nextLine());
                        }
                        System.out.println("Which character would you like to change?");

                    }

                    showMenu();
                    option = userScan.nextInt();
                }
            }

            userScan.close();

        } catch (FileNotFoundException e){
            System.out.println("File does not exist!");
            System.exit(0);
        }

    }

    public static void showMenu(){
        System.out.println("\n★ Create new game (1)\n★ Validate save file(2)\n★ Reroll existing character(3)\n★ Quit(4)");
    }
}