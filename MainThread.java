


public class MainThread {

    public static void main(String[] args) {

        Lawn[] lawn = new Lawn[5];
        Thread startlawn = new Thread(new LawnStart(lawn));
        Thread snail = new Thread(new Snails("snail1",lawn));
        Thread create = new Thread(new Snails("create1", lawn));
        
        startlawn.start();
        
        try {
            startlawn.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwane tworzenie trawnika");
        }
        create.start();
        snail.start();

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        while (true) {
            for (int i = 0; i<5; i++) {
                    System.out.print(lawn[i] + "\t");
            }
            System.out.println("\n");
            try {
                Thread.sleep(1500);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
    }
}

