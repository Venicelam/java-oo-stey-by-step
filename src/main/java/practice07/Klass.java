package practice07;

public class Klass {
    private int number;
    private String displayName;

    public Klass (int number){
        this.displayName = "Class " + number;
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public String getDisplayName(){
        return displayName;
    }
}
