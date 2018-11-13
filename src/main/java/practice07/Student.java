package practice07;

public class Student{
    private String name;
    private Klass klass;
    private int age;

    public Student(String name, int age, Klass klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Klass getKlass(){
        return klass;
    }
    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
