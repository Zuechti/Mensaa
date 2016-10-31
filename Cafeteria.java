/**
 * import-Liste 
 * ggf. weiter von Hand anpassen 
 */

public class Cafeteria {

    private int dessertStorage[]=new int[4];
    private int storage[]= new int[4];
    private Queue<Victim> schlingedischlange;
    private Victim nextVictim;

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
    public void giveDessert(int i)
    {

    }

    /********* giveFood (public) *******************************************/
    public void giveFood(int i)
    {

    }

    /********* nextPlease (public) *****************************************/
    public void nextPlease()
    {

    }

    /********* getNextVictim (public) **************************************/
    public Victim getNextVictim()
    {
        return schlingedischlange.front();
    }

}
