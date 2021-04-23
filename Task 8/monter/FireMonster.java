package monter;

public class FireMonster extends Monster{
    public FireMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "This is fire";
    }
}
