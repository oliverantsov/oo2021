import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MyHouse {
    public static void main(String[] args) throws IOException {
        int width = 100;
        int height = 100;

        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLACK);
        g.drawString("My House", 20, 20);

        /*g.drawLine(10, 10, 50, 50);*/

        // Joonistada maja, kasutades g.drawRect(), g.fillRect(), g.drawLine()
        g.setColor(Color.ORANGE);
        g.fillRect(10, 65, 80, 30);
        /*g.drawRect(x, y, width, height);*/
        g.setColor(Color.BLACK);
        g.drawLine(10, 65, 50, 45);
        g.drawLine(90, 65, 50, 45);

        ImageIO.write(picture, "png", new File("house.png"));
    }
}
