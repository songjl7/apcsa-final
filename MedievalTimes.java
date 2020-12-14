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

                    int knightCount = 0;
                    int peasantCount = 0;
                    int clericCount = 0;
                    int mageCount = 0;
                    int courtierCount = 0;

                    System.out.println("Enter name of game");
                    String gameName = userScan.nextLine();
                    output.println(gameName);
                    
                    for (int i = 1; i <= 4; i++){
                        System.out.println("Enter type of character #" + i + " (knight, peasant, cleric, mage, courtier)");
                        String type = userScan.nextLine();
                        if (type.toLowerCase().equals("knight")){
                            knightCount++;
                            if(knightCount > 2){
                                System.out.println("Too many of that type! Please try again.");
                                i --;
                            } else {
                                MedChar character = new MedChar(type);
                                System.out.println("Enter name of character");
                                String name = userScan.nextLine();
                                output.println(name + "," + type.toLowerCase() + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getMagic() + "," + character.getInfluence());
                            }
                        } else if (type.toLowerCase().equals("peasant")){
                            peasantCount++;
                            if(peasantCount > 2){
                                System.out.println("Too many of that type! Please try again.");
                                i --;
                            } else {
                                MedChar character = new MedChar(type);
                                System.out.println("Enter name of character");
                                String name = userScan.nextLine();
                                output.println(name + "," + type.toLowerCase() + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getMagic() + "," + character.getInfluence());
                            }
                        } else if (type.toLowerCase().equals("cleric")){
                            clericCount++;
                            if(clericCount > 2){
                                System.out.println("Too many of that type! Please try again.");
                                i --;
                            } else {
                                MedChar character = new MedChar(type);
                                System.out.println("Enter name of character");
                                String name = userScan.nextLine();
                                output.println(name + "," + type.toLowerCase() + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getMagic() + "," + character.getInfluence());
                            }
                        } else if (type.toLowerCase().equals("mage")){
                            mageCount++;
                            if(mageCount > 2){
                                System.out.println("Too many of that type! Please try again.");
                                i --;
                            } else {
                                MedChar character = new MedChar(type);
                                System.out.println("Enter name of character");
                                String name = userScan.nextLine();
                                output.println(name + "," + type.toLowerCase() + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getMagic() + "," + character.getInfluence());
                            }
                        } else if (type.toLowerCase().equals("courtier")){
                            courtierCount++;
                            if(courtierCount > 2){
                                System.out.println("Too many of that type! Please try again.");
                                i --;
                            } else {
                                MedChar character = new MedChar(type);
                                System.out.println("Enter name of character");
                                String name = userScan.nextLine();
                                output.println(name + "," + type.toLowerCase() + "," + character.getStrength() + "," + character.getTough() + "," + character.getIntel() + "," + character.getMagic() + "," + character.getInfluence());
                            }
                        }
                    }
    
                    output.close();
                    showMenu();
                    option = Integer.parseInt(userScan.nextLine());
                }
                
                // validate/load save file
                if (option == 2){
                    System.out.println("Enter name of file you'd like to check");
                    String fileName = userScan.nextLine();
                    file = new File(fileName);
                    fileScan = new Scanner(file);
                    while (fileScan.hasNextLine()){
                        System.out.println(fileScan.nextLine());
                    }

                    fileScan.close();
                    showMenu();
                    option = Integer.parseInt(userScan.nextLine());
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
                    option = Integer.parseInt(userScan.nextLine());
                }
            }

            userScan.close();

        } catch (FileNotFoundException e){
            System.out.println("File does not exist!");
            System.exit(0);
        }

    }

    public static void showMenu(){
        System.out.println("\n★ Create new game (1)\n★ Validate/load save file(2)\n★ Reroll existing character(3)\n★ Quit(4)");
    }
}