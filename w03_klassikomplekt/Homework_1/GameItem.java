public class GameItem {
    public int x;
    public int y;
    public String name;
    private char symbol;
    public boolean isVisible = true;

    public GameItem(String name, int x, int y, char symbol){
        this.name = name;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
    }

    public char getSymbol(){
        return symbol;
    }

    @Override
    public String toString(){
        return "";
    }
}
