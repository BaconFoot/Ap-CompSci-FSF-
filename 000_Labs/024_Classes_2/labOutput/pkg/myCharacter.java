package pkg;

public class myCharacter{
    String role;
    int dexterity;
    int IQ;
    int speed;
    int rizz;
    
    public myCharacter(){
        role = "wizard";
        dexterity = 5;
        IQ = 5;
        speed = 10;
        rizz = 0;
    }
     public String roles(){
        return role;
    }
    public int dext(){
        return dexterity;
    }
    public int smartness(){
        return IQ;
    }
    public int charisma(){
        return rizz;
    }
    public int fastness(){
        return speed;
    }
}