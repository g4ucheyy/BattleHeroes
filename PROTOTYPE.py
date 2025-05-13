# Hero Class
class Hero:
     def __init__(self, name, role, hp, power, mana):
       self.name = name
       self.role = role
       self.hp = hp 
       self.power = power 
       self.mana = mana 
     
     def display_stats(self):
          print(f"You selected {self.name}!")
          print(f"Role: {self.role} | HP: {self.hp} | Power: {self.power} | Mana: {self.mana}")

def CharacterSelection():
    print("=== Character Selection ===")
    heroes = { 
        "1": Hero("Dash", "Assassin", "300", "150", "500"),
        "2": Hero("Zane", "Assassin/Fighter", "500", "120", "400"),
        "3": Hero("Ash", "Marksman", "400", "160", "500"),
        "4": Hero("Ryu", "Fighter", "600", "110", "400"),
        "5": Hero("Kai", "Fighter/Mage", "800", "90", "600"),
        "6": Hero("Xord", "Marksman/Mage", "300", "140", "600"),
    }

    choice = input("Select Your Character: ")
    if choice in heroes:
        heroes[choice].display_stats()
    else: 
        print("Invalid choice, please try again.")
        CharacterSelection()

# Character Selection Prototype
def MainMenu():
    print("=== Battle Heroes ===")
    print("=== 1. Start Game ===")
    print("=== 2. Exit Game ===")
    choice = input("Choose: ")
    if choice == "1":
        print("Starting Game...")
        input("Enter Your Name: ")
        CharacterSelection()
        
    elif choice == "2":
        print("Goodbye!")
        input("Press Enter to continue...")
    else: 
        print("Invalid choice, please try again.")
        MainMenu()  

def BattleScene():
    print("=== Battle Begin!=== ")

MainMenu()





# PROTOTYPE 1




