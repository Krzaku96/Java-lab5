


public class MainThread {

    public static void main(String[] args) {
        new Lawn();
        new Snails();

        try {
            Thread.sleep(20000);

        } catch (InterruptedException e) {
            System.out.println("Przerwane wykonywanie programu");
        }
        System.out.println("Koniec programu");
    }
}

