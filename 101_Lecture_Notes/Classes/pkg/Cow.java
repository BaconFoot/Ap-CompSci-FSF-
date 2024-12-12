package pkg;

public class Cow{
    //Global Variables
    int numSpots;
    String flavor;
    boolean isBeef;
    int moosPerHour;
    
    public Cow(){
        numSpots = 17;
        flavor = "waygu";
        isBeef = false;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
    }
    public Cow(int n, String f, boolean b){
        numSpots = n;
        flavor = f;
        isBeef = b;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
    }
    public String getFlavor(){
        return flavor;
    }
    public void moo(){
        if(!isBeef){
            int c = 0;
            while(c < moosPerHour){
                System.out.println("MOOOOOOOOOo");
                c++;
            }
        }
        else{
            System.out.println("I think bro is beef");
        }
            
    }
    
}