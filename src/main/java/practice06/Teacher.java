package practice06;

public class Teacher {
    private String name;
    private int classNumber;
    private int age;

    public Teacher(String name, int age, int classNumber){
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
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
        if (classNumber == 0)
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach No Class.";
        else
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach Class " + classNumber + ".";

    }
}
