public class ThreadHW {
    public static int[] myNumbers = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            try {
                new Thread(getRunnable()).start();
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Runnable getRunnable() {
        return () -> {
            for (int i = 5; i > 0; i--){
                try {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.sleep(1500);
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };
    }
}
