

public class Lawn implements Runnable{

    Thread l;

    Lawn() {
        l = new Thread(this);
        System.out.println("Trawnik: " + l);
        l.start();
    }

    public void run()
    {
        try {
            for(int i=10; i>0; i--)
            {
                System.out.println("Trawnik: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Tworzenie trawnika zostało przerwane");
        }
        System.out.println("Koniec tworzenia trawnika");
    }



}
