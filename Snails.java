import java.util.Random;

public class Snails implements Runnable{

    Thread s;
    Lawn[] lawn;
    Random rnd = new Random();
    
    Snails(String name, Lawn[] lawn) {
        s = new Thread(this);
        this.lawn = lawn;
        s = new Thread(name);
        s.start();
        System.out.println("Slimak: " + s.getName());
    }

    @Override
    public void run()
    {

        if (s.getName().contains("snail"))
            eat(lawn);
        if (s.getName().contains("create"))
            create(lawn);
    
    }
    
    void eat(Lawn[] lawn) {
        while (true) {
            int i = rnd.nextInt(5);

            synchronized (lawn[i]) {
                lawn[i].fall();
            }
        }
    }

    void create(Lawn[] lawn) {
        while (true) {
            int i = rnd.nextInt(5);

            synchronized (lawn[i]) {
                lawn[i].grow();
            }
        }
    }


}
