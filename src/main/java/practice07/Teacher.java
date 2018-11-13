package practice07;

public class Teacher {
    private String name;
    private Klass klass;
    private int age;

    public Teacher(String name, int age, Klass klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
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
    public Klass getKlass(){
        return klass;
    }
    public String introduce(){
        if (klass == null)
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach No Class.";
        else
            return "My name is " + name + ". I am " + age +" years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";

    }
    public String introduceWith(Student student) {
        if (klass.getNumber() != student.getKlass().getNumber())
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        else
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
    }

