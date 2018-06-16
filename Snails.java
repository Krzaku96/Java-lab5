public class Snails implements Runnable{

    Thread s;
    Lawn[] lawn;

    Snails(Lawn[] lawn) {
        s = new Thread(this);
        this.lawn = lawn;
        System.out.println("Slimak: " + s);
    }

    public void run()
    {
        try {
            for(int i=0; i<5; i++)
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
