import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TryCatch {
    public static void main(String[] args) {
        int gameRequiredSpace = 80;
        int gameLauncherVersion = 15;
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(TryCatch.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();
        
        System.out.println("Enter Your drive free disk space (GB): ");
        int driveFree = scanner.nextInt();

        if(driveFree >= gameRequiredSpace){
            System.out.println("Enter Your current Launcher version: ");
            int userLauncherVersion = scanner.nextInt();
            try {
                fh = new FileHandler("gamelog.txt");
                fh.setFormatter(sf);
                logger.addHandler(fh);
                if(gameLauncherVersion > userLauncherVersion) {
                    throw new Exception("Recommended Launcher version is " + gameLauncherVersion + ", but Your current version is " + userLauncherVersion + ".");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                logger.warning(e.getMessage());
            }
            System.out.println("");
            System.out.println("Game is successfully downloading!");
        } else {
            System.out.println("");
            System.out.println("You do not have required free disk space!");
        }

        scanner.close();
    }
}
