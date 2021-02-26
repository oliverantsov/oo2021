import java.util.ArrayList;

public class World {
    private int width;
    private int height;

    private ArrayList<GameCharacter> characters;
    private ArrayList<GameItem> items;
    //private ArrayList<InventoryItems> inventoryItems;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void addCharacters(ArrayList<GameCharacter> c){
        this.characters = c;
    }

    public void addItems(ArrayList<GameItem> i){
        this.items = i;
    }

    public void render(){
        char symbol;
    
        for (int y = 0; y <= height; y++){
            for (int x = 0; x <= width; x++){
                if (y == 0 || y == height){
                symbol = '-';
            } else if (x == 0 || x == width){
                symbol = '|';
            } else {
                symbol = ' ';
            }
    
            for (GameCharacter c : characters){
                if (x == c.x && y == c.y && c.isVisible){
                symbol = c.getSymbol();
                }
            }

            for (GameItem i : items){
                if (x == i.x && y == i.y && i.isVisible){
                symbol = i.getSymbol();
                }
            }
    
            System.out.print(symbol);
            }
    
            System.out.println("");
        }
    }
}
