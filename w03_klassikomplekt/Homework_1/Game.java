import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int width = 20;
        int height = 10;
        World world = new World(width, height);
// ----------------------------------------------------------------------------------------------------------
// Character adding
        GameCharacter player = new GameCharacter("Oliver", 7, 7, 'C', GameCharacterType.WARRIOR);
        GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WARRIOR);
        GameCharacter witch = new GameCharacter("Witch", 8, 9, 'W', GameCharacterType.WARRIOR);
// ----------------------------------------------------------------------------------------------------------        
// Item adding
        GameItem sword = new GameItem("Magical Sapphire LONGSWORD", 17, 7, 'l');
        GameItem axe = new GameItem("Medieval BATTLEAXE", 15, 5, 'b');
        GameItem gauntlet = new GameItem("Chainmail GAUNTLET", 3, 1, 'g');
        GameItem crown = new GameItem("Gold chiseled CROWN", 1, 8, 'c');
        GameItem shield = new GameItem("Battle-worn wooden SHIELD", 10, 2, 's');
// ----------------------------------------------------------------------------------------------------------
// Character list & adding characters into list
        ArrayList<GameCharacter> characters = new ArrayList<>();
        characters.add(player);
        characters.add(dummy);
        characters.add(witch);
// ----------------------------------------------------------------------------------------------------------
// Item list & adding items into list
        ArrayList<GameItem> items = new ArrayList<>();
        items.add(sword);
        items.add(axe);
        items.add(gauntlet);
        items.add(crown);
        items.add(shield);
// ----------------------------------------------------------------------------------------------------------
// Inventory item list
        ArrayList<String> inventoryItems = new ArrayList<>();
// ----------------------------------------------------------------------------------------------------------
// Adding symbols to game & rendering the world
        world.addCharacters(characters);
        world.addItems(items);
        world.render();
        System.out.println(player);
// ----------------------------------------------------------------------------------------------------------
// Input-sentences & moving around the world
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("end")){
            input = scanner.nextLine().toLowerCase();
            if(input.equals("")){
                player.move();
            } else if (input.equals("l")){
                player.setDirection(Direction.LEFT);
            } else if (input.equals("u")){
                player.setDirection(Direction.UP);
            } else if (input.equals("d")){
                player.setDirection(Direction.DOWN);
            } else if (input.equals("r")){
                player.setDirection(Direction.RIGHT);
            } else if (input.equals("inv")){
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Current items in inventory: ");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println(inventoryItems);
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
            }
// ----------------------------------------------------------------------------------------------------------
// Making DUMMY invisible when WITCH is touched
            if (player.x == witch.x && player.y == witch.y){
                player.x = (int)(Math.random() * width - 1) + 1;
                player.y = (int)(Math.random() * height - 1) + 1;
                dummy.isVisible = dummy.isVisible == true ? false : true;
            }
// ----------------------------------------------------------------------------------------------------------
// Making items invisible, teleporting PLAYER to original position & printing out found items
            if (player.x == sword.x && player.y == sword.y){
                sword.isVisible = false;
                player.x = 7;
                player.y = 7;
                inventoryItems.add(sword.name);
                System.out.println("------------------------------------------------------");
                System.out.println("Player just found:" + " " + sword.name);
                System.out.println("------------------------------------------------------");
            }

            if (player.x == axe.x && player.y == axe.y){
                axe.isVisible = false;
                player.x = 7;
                player.y = 7;
                inventoryItems.add(axe.name);
                System.out.println("--------------------------------------------");
                System.out.println("Player just found:" + " " + axe.name);
                System.out.println("--------------------------------------------");
            }

            if (player.x == gauntlet.x && player.y == gauntlet.y){
                gauntlet.isVisible = false;
                player.x = 7;
                player.y = 7;
                inventoryItems.add(gauntlet.name);
                System.out.println("--------------------------------------------");
                System.out.println("Player just found:" + " " + gauntlet.name);
                System.out.println("--------------------------------------------");
            }

            if (player.x == crown.x && player.y == crown.y){
                crown.isVisible = false;
                player.x = 7;
                player.y = 7;
                inventoryItems.add(crown.name);
                System.out.println("--------------------------------------------");
                System.out.println("Player just found:" + " " + crown.name);
                System.out.println("--------------------------------------------");
            }

            if (player.x == shield.x && player.y == shield.y){
                shield.isVisible = false;
                player.x = 7;
                player.y = 7;
                inventoryItems.add(shield.name);
                System.out.println("---------------------------------------------------");
                System.out.println("Player just found:" + " " + shield.name);
                System.out.println("---------------------------------------------------");
            }
// ----------------------------------------------------------------------------------------------------------
            world.render();
            System.out.println(player);
        }
    }
}
