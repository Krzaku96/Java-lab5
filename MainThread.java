


public class MainThread {

    public static void main(String[] args) {

        Lawn[] lawn = new Lawn[5];
        Thread startlawn = new Thread(new LawnStart(lawn));
        Thread snail = new Thread(new Snails(lawn));

        startlawn.start();
        try {
            startlawn.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwane wykonywanie programu");
        }

        snail.start();

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

