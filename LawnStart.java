
class Lawn {
    int tmp;

    Lawn()
    {
        tmp=0;
    }
}


public class LawnStart implements Runnable{

    Thread l;
    Lawn[] lawn;

    LawnStart(Lawn[] lawn) {
        l = new Thread(this);
        this.lawn = lawn;
        System.out.println("Trawnik: " + l);
    }

    public void run()
    {
        try {
            for(int i=0; i<5; i++)
            {
                lawn[i] = new Lawn();
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