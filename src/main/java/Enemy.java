/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Enemy {
    
    // Attributes
    
    private final String name;
    private int hp;
    private final int power;
    
        // Constructor
    public Enemy(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }
    
     // Method to attack a hero (or another entity)
    public void attack(Hero hero) {
        System.out.println(name + " attacks " + hero.getName() + " for " + power + " damage!");
        hero.takeDamage(power);
    }

    // Method to take damage
    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
        System.out.println(name + " takes " + amount + " damage. Remaining HP: " + hp);
    }
    
   
    // Getters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }
}