package pkg;
import java.util.Scanner;

public class myCharacter{
    String role;
    int dexterity;
    int IQ;
    int speed;
    int charisma;
    
    public myCharacter(String r){
        role = r;
        if(role.equals("Rogue") || role.equals("rogue") || role.equals("wizard") || role.equals("Wizard") || role.equals("Warrior") || role.equals("warrior")){
            
        }
        else{
            role = "Non-role";
            System.out.println("You do not have a role due to either a spelling error or not inputing an applicable role. ");
        }
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
    public int rizz(){
        return charisma;
    }
    public int fastness(){
        return speed;
    }
}
    