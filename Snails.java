public class Snails implements Runnable{

    Thread s;

    Snails() {
        s = new Thread(this);
        System.out.println("Slimak: " + s);
        s.start();
    }

    public void run()
    {
        try {
            for(int i=10; i>0; i--)
            {
                System.out.println("Slimak: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Tworzenie slimakow zostało przerwane");
        }
        System.out.println("Koniec tworzenia slimakow");
    }

}
