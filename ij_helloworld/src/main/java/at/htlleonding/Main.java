package at.htlleonding;

public class Main {
    public static void main(String[] args) {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.exit(-1);
            }
        }

        // System.out.println("Hello World!");
    }
}
