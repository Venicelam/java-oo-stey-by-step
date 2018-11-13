package practice11;

public class Student {
    private String name;
    private Klass klass;
    private int age;
    private int id;

    public Student(int id, String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass.getLeader() == this)
            return "My name is " + name + ". I am " + age + " years old. I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        else
            return "My name is " + name + ". I am " + age + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public boolean isInThisClass(Klass klass) {
        if (klass.getNumber() == klass.getNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
