package practice11;

import java.util.LinkedList;

public class Teacher {
    private String name;
    private LinkedList<Klass> klass;
    private int age;
    private int id;

    public Teacher(int id, String name, int age, LinkedList<Klass> klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
        this.id = id;
    }
    public Teacher(int id, String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public LinkedList<Klass> getClasses(){
        return klass;
    }
    public String introduce(){
        if (klass == null || klass.size()==0) {
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach No Class.";
        }
        String className = "";
        for(int i = 0;i<klass.size();i++){
            if(i != 0){
                className += ", ";
            }
            className += klass.get(i).getNumber();
        }
        return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach Class " + className + ".";
    }

    public String introduceWith(Student student) {
        if (isTeaching(student))
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I teach " + student.getName() + ".";
        else
            return "My name is " + name + ". I am " + age + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }
    public boolean isTeaching(Student student){
        if (klass.contains(student.getKlass())){
            return true;
        }
        else
            return false;
    }
}
