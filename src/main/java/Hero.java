/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
// HERO CONFIGURATION
public class Hero {
    private String name;
    private int  hp;
    private int mana;
    private int power;
    
    public Hero(String name, int hp, int mana, int power) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.power = power;
              
    }
       public void attack(Enemy enemy) {
           // Example logic
           int damage = power;
           System.out.println(name + " attacks " + enemy.getName() + " for " + damage + " damage!");
        enemy.takeDamage(damage);
    }
       
      public void heal() {
          int healamount = 50;
          hp += healamount;
                  System.out.println( healamount + " HP restored!");
    }
      
       public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    void takeDamage(int power) {
        
    }
}


      
       
    

