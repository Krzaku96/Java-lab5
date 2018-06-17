
class Lawn {
    int h;

    Lawn()
    {
        h=0;
    }
    
    void grow() {
        while (h != 5) {
            h++;
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
            	System.out.println("Maksymalna wielkosc trawnika");
            }
        }
    }
    
    void fall() {
        while (h != 0) {
            h--;
            try {
                Thread.sleep(200);
            } catch (Exception ex) {
            	System.out.println("Nie mozna zjesc trawnika!");
            }
        }
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
        	for(int i=0; i<5; i++) {
            		lawn[i]= new Lawn();	
        		}
        	}      
    		Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("Tworzenie trawnika zostało przerwane");
        }
        System.out.println("Koniec tworzenia trawnika");
    }



}