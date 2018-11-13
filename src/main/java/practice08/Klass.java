package practice08;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

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

    public void assignLeader(Student leader){
        this.leader = leader;
    }
    public Student getLeader(){
        return leader;
    }
}

