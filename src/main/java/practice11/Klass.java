package practice11;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;


    public Klass (int number){
        this.displayName = "Class " + number;
        this.number = number;

    }
    public int getNumber(){
        return number;
    }
    public String getDisplayName(){
        return displayName;
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber() != number){
            System.out.print("It is not one of us.\n");
        }else{
            leader = student;
            System.out.print("I am Tom. I know " + student.getName() + " become Leader of " + student.getKlass().getDisplayName() + ".\n");

        }
    }
    public Student getLeader(){
        return leader;
    }

    public void appendMember (Student student){
        student.getKlass();
        System.out.print("I am Tom. I know " + student.getName() + " has joined " + student.getKlass().getDisplayName() + ".\n");
    }
}
