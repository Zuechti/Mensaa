/**
 * import-Liste 
 * ggf. weiter von Hand anpassen 
 */

public class Cafeteria {

    private int dessertStorage[]=new int[4];
    private int storage[]= new int[4];
    private Queue<Victim> schlingedischlange= new Queue();
    gui g;

    
    public Cafeteria(){
        for(int i=0;i!=5;i++){
            addVictim();
        }
        g=new gui(this);
    }

    /********* addVictim (public) ******************************************/
    public void addVictim()
    {
        schlingedischlange.enqueue(new Victim());
    }

    /********* getDesserStorage (public) ***********************************/
    public int getDessertStorage(int i)
    {
        return dessertStorage[i];
    }

    /********* getStorage (public) *****************************************/
    public int getStorage(int i)
    {
        return storage[i];
    }

    /********* giveDessert (public) ****************************************/
    public boolean giveDessert(int i)
    {
        return i==getNextVictim().getFood()[1];
    }

    /********* giveFood (public) *******************************************/
    public boolean giveFood(int i)
    {
        return i==getNextVictim().getFood()[0];
    }

    /********* nextPlease (public) *****************************************/
    public void nextPlease()
    {
        schlingedischlange.dequeue();
    }

    /********* getNextVictim (public) **************************************/
    public Victim getNextVictim()
    {
        return schlingedischlange.front();
    }

}
