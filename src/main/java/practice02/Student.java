package practice02;

public class Student{
    private String name;
    private int classNumber;
    private int age;

    public Student(String name, int age, int classNumber){
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getKlass(){
        return classNumber;
    }
    public String introduce(){
        return "I am a Student. I am at Class " + classNumber + ".";
    }
}

