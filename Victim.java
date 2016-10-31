
/**
 * import-Liste 
 * ggf. weiter von Hand anpassen 
 */

public class Victim {

    private int dessert;
    private int food;

    public Victim(){
        generateFood();
    }

    /********* getDessert (public) *****************************************/
    public int getDessert()
    {
        return dessert;
    }

    public void generateFood(){
        //generiert eine Zufällige Zahl zwischen 1 bis 4 und convertiert sie zu dem Integer food
        double fd= Math.random()*10;
        while(fd>4||fd<1){
            fd= Math.random()*10;
        }
        fd=Math.round(fd);
        food=(int)fd;
        //generiert eine Zufällige Zahl zwischen 1 bis 4 und convertiert sie zu dem Integer dessert
        double ds= Math.random()*10;
        while(ds>4||ds<1){
            ds= Math.random()*10;
        }
        ds=Math.round(ds);
        dessert=(int)ds;
    }

    /********* getFood (public) ********************************************/
    public int getFood()
    {
        return food;
    }

    /********* Order (public) **********************************************/
    public String Order()
    {
        String fd=""; //String fürs Hauptgericht
        String ds=""; //String fürs Dessert

        //generiert strings aus den integern

        switch(getFood()){
            case 1: fd="das Schnitzel mit Pommes";
                break;
            case 2: fd="die Bratkartoffeln mit Speck";
                break;
            case 3: fd="den Salat mit Croutons";
                break;
            case 4: fd="das Omlette mit Tomaten und Speck";
                break;
        }
        switch(getDessert()){
            case 1: ds="Eis mit Karamellsauce";
                break;
            case 2: ds="Joghurt";
                break;
            case 3: ds="Fruchtquark";
                break;
            case 4: ds="Vla! Denn Wir nehmen den Pudding und Schieben ihn woanders hin!";
                break;
        }
        return "Ich hätte gerne einmal "+fd+" und etwas von dem "+ds;
    }

}
