/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CharacterSelection {
     
    public static Hero selectHero() {
        
          Scanner scanner = new Scanner(System.in);
    
       System.out.println("=== Select Your Heroes ===");
       System.out.println("=== 1. Dash - Dagger Specialist ===");
       System.out.println("=== 2. Zane - Spear Phantom ===");
       System.out.println("=== 3. Back to Main Menu ===");
       System.out.println("=== Select Heroes ===");
       
       int choice = scanner.nextInt();
       Hero hero = null;
       
       
       
       
   switch (choice) {
       
       case 1:
           hero = new Hero("Dash", 250, 500, 80);
            System.out.println("You selected: Dash");
                System.out.println("HP: 250 | Mana: 500 | Power: 80");
           break;
       case 2:
           hero = new Hero("Zane", 350, 300, 110);
            System.out.println("You selected: Zane");
                System.out.println("HP: 350 | Mana: 300 | Power: 110");
           break;
       case 3:
           System.out.println("Returning to Main Menu...");
           break;
       default:
           System.out.println("Invalid selection. Returning to Main Menu.");
           return hero;
   }
   
   
 // Selection Confirmation
            System.out.print("Confirm selection? (y/n): ");
            String confirm = scanner.nextLine().toLowerCase();
            if (!confirm.equals("y")) {
                hero = null;
                System.out.println("Re-select your hero...");
            }
        

        return hero;
    }
}











