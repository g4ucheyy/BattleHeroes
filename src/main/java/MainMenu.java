/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
// PROTOTYPE BY FARIS/GAUCHEYY 
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==== Main Menu ====");
            System.out.println("== 1. Start Game ==");
            System.out.println("== 2. Exit Game ==");
            System.out.println("== Select your choice ==");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Starting Game...");
                    int subChoice;
                    do {
                        System.out.println("== Start Game Menu ==");
                        System.out.println("== 1. New Game ==");
                        System.out.println("== 2. Load Game ==");
                        System.out.println("== 3. Back to Main Menu ==");
                        System.out.print("== Select your option: ");
                        subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1 -> {
                                System.out.println("Starting New Game...");
                                Hero selectedHero = CharacterSelection.selectHero();
                                // Proceed to Character Selection Class
                            }
                            case 2 -> {
                                System.out.println("Loading Saved Game...");
                                // TODO: Add logic to load a game
                            }
                            case 3 -> System.out.println("Returning to Main Menu...");
                            default -> {
                                if (subChoice < 1 || subChoice > 3)
                                    System.out.println("Invalid option. Try again.");
                            }
                        }
                    } while (subChoice != 3);
                }
                case 2 -> System.out.println("Exiting Game...");
                default -> {
                    if (choice < 1 || choice > 2)
                        System.out.println("Invalid option. Try again.");
                }
            }
        } while (choice != 2);

        scanner.close();
    }
    
  
    
}
